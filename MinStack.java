import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        Stack<Integer> mi = new Stack<>();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            st.push(x)
            if(mi.isEmpty() || x <= mi.peek()){
                mi.push(x);
            }
        }
        System.out.println(mi.peek());
        int x = st.pop();
        if(x == mi.peek()){
            mi.pop();
        }
        System.out.println(mi.peek());
    }
}
