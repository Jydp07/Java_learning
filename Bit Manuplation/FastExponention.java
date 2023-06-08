public class FastExponention {
    public static int FastExpo(int n,int power){
        int ans = 1;

        while(power > 0){
            if((power & 1) == 1){
                ans = ans * n;
            }
            n = n*n;
            power = power>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(FastExpo(3, 5));
    }
}
