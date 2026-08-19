public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int [] stack = new int[20];
      int t =-1;
      while(n > 0){
        stack[++t] = n%2;
        n/=2;
      }
      while(t >= 0){
        System.out.print(stack[t--]);
      }
    }
}
