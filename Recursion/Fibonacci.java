public class Fibonacci {
    public static int fibo(int n){
        if(n == 1 || n == 0){
            return n;
        }
        n = fibo(n - 1) + fibo(n - 2);
        return n;
    }
    public static void main(String[] args) {
        int n = 5;
       System.out.println(fibo(n)); 
    }
}
