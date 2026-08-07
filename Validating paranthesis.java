import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<Character> st = new Stack<>();
        boolean b = true;
        for(char c : s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                st.push(c);
            }
            else{
                if(st.isEmpty()){
                    b = false;
                    break;
                }
            
            char t = st.pop();
            if((c == ')' && t != '(') || (c== '}' && t != '{') || (c == ']' && t != '[')){
                b = false;
            }
            }
        }
        if(!st.isEmpty()){
            b = false;
        }
        if(b) System.out.println("yes");
        else System.out.println("no");
    }
}
