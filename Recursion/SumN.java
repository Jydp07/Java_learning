public class SumN {
    public static int sumOfn(int n){
        if(n == 0){
            return 0;
        }
        n += sumOfn(n - 1);
        return n;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(sumOfn(n));
    }
}
