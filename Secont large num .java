import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int n = sc.nextInt();
        int [] a = new int[n];
        int [] an = new int[n];
        for(int i = 0;i< n; i++){
            a[i]= sc.nextInt();
        }
        for(int i = n; i>= 0; i--){
        while(!st.isEmpty() && st.peek()<=a[i]){
            st.pop();
            if(!st.isEmpty()){
                an[i] = -1;
            }
            else{
                an[i] = st.peek();
            }
          st.push(a[i);
        }
        for(int x : ans)
            System.out.println(x);
        }
    }
}
