public class GetIthBit {
    public static int getIthbit(int n, int i){
        int bitMask = 1<<i;
        if((bitMask & n) == 0){
            return 0;
        }else {
            return 1;
        }
    }
    public static void main(String[] args) {
        int n = 5;
        int i = 2;
        System.out.println(getIthbit(n, i));
    }
}
