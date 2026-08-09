// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sw = new Scanner(System.in);
        int n=sw.nextInt();
        for(int i=0;i<n;i++) push(sw.nextInt());
        gm();

    }
    static Stack<Integer> st = new Stack<>();
    static Stack <Integer> ms = new Stack<>();
    static void push(int n){
        if(st.isEmpty()){
            st.push(n);
            ms.push(n);
        }
        else{
            if(n <= ms.peek()){
                ms.pop();
            }
        }
    }
    static void pop(){
        int e = st.pop();
        if( e == ms.peek()) ms.pop();
    }
    static void gm(){
        if(ms.isEmpty()){
            System.out.println("Empty");
        }
        else{
            System.out.println(ms.peek());
        }
    }
}
