public class ClearIbit {
    public static int clearibit(int n, int i){
        int bitMask = -1<<i;
        return n & bitMask;
    }
    public static void main(String[] args) {
        System.out.println(clearibit(7, 2));
    }
}
