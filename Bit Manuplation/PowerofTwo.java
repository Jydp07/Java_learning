public class PowerofTwo {
    public static void powerofTwo(int n){
        if((n & n-1) == 0){
            System.out.println("Number is Power of 2");
        }else{
            System.out.println("Not Power of zero");
        }
    }
    public static void main(String[] args) {
        powerofTwo(7);
    }
}
