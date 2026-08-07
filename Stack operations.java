
class StackArray{
    int t = -1;
    int s = 5;
    int [] st = new int[s];
    void push(int x){
        if(t == s-1){
            System.out.println("overflow");
            return;
        }
        st[++t] = x;
    }
    void pop(){
        if(t == -1){
            System.out.println("underflow");
            return;
        }
        System.out.println(st[t--]);
    }
    void disp(){
        if(t == -1){
            System.out.println("empty");
            return;
        }
        for(int i = t; i >= s; i--){
            System.out.println(st[i]);
        }
    }
    public static void main(String[] args) {
        StackArray s = new StackArray();

        s.push(10);
        s.push(20);
        s.push(30);

        s.disp();

        s.pop();

        s.disp();
    }
}
