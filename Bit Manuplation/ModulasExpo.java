public class ModulasExpo {
    public static int modulasExpo(int number,int power,int modul){
        int ans = 1;

        while(power > 0){
            if((power & 1) == 1){
                ans = ans * number;
            }
            number = number * number;
            power = power>>1;
        }
        return ans % modul;
    }
    public static void main(String[] args) {
        System.out.println(modulasExpo(2, 5, 13)); 
    }
}