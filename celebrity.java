import java.util.*;
class Main {
    static void celeb(int [][] c , int n){
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i< n; i++){
            st.push(i);
        }
        while(st.size()>2){
            int a = st.pop();
            int b = st.pop();
            if(c[a][b] == 1) st.push(b);
            else st.push(a);
        }
        
        int d = st.pop();
        boolean f = true;
        for(int i = 0; i < n; i++){
            if(i != d){
                if(c[i][d] == 0 || c[d][i] == 1){
                    f = false;
                    break;
                }
            }
        }
        if(f){
            System.out.println("true" + d);
        }
        else{
            System.out.println("NO");
        }
    }
    public static void main(String ar[]){
        Scanner sw = new Scanner(System.in);            
        int n=sw.nextInt();
        int a[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sw.nextInt();
            }
        }
        celeb(a,n);
    }
}
