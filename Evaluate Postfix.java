import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        String s = sc.nextLine();
        for(char c : s.toCharArray()){
            if(Character.isDigit(c)){
                st.push(c-'0');
            }
            else{
                int b = st.pop();
                int a = st.pop();
                switch(c){
                    case '+':
                        st.push(a+b);
                        break;
                    case '-':
                        st.push(a-b);
                        break;
                    case '*':
                        st.push(a*b);
                        break;
                    case '/':
                        st.push(a/b);
                        break;
                }
            }
        }
        System.out.println(st.pop());
    }
}
