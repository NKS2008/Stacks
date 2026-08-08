import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        int [] a = new int[n];
        int [] sp = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            while(!st.isEmpty() && a[st.peek()] <= a[i]){
                st.pop();
            }
            if(st.isEmpty()){
                sp[i] = i+1;
            }
            else{
                sp[i] = i - st.peek();
            }
            st.push(i);
        }
        for(int x : sp){
            System.out.println(x);
        }
    }
}
