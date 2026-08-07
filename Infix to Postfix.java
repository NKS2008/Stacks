import java.util.*;

class Main {

    static int pre(char c) {
        if (c == '+' || c == '-')
            return 1;
        if (c == '*' || c == '/')
            return 2;
        if (c == '^')
            return 3;
        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String r = "";

        Stack<Character> st = new Stack<>();

        for (char c : s.toCharArray()) {

            if (Character.isLetterOrDigit(c)) {
                r += c;
            }

            else if (c == '(') {
                st.push(c);
            }

            else if (c == ')') {

                while (!st.isEmpty() && st.peek() != '(') {
                    r += st.pop();
                }

                st.pop();
            }

            else {

                while (!st.isEmpty() && pre(st.peek()) >= pre(c)) {
                    r += st.pop();
                }

                st.push(c);
            }
        }

        while (!st.isEmpty()) {
            r += st.pop();
        }

        System.out.println(r);
    }
}
