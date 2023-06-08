public class InsertionSort {
    public static void sort(int number[]){
        for(int i=1; i<number.length; i++){
            int cur = number[i];
            int prev = i-1;
            while(prev >= 0 && number[prev] > cur){
                number[prev + 1] = number[prev];
                System.out.println("Prev = "+ prev);
                prev--;
                System.out.println("prev after -- = "+ prev);
            }
            number[prev + 1] = cur;
        }
    }
    public static void main(String[] args) {
        int number[] = {5,4,1,3,2};
        sort(number);
        for(int i=0; i<number.length; i++){
            System.out.println(number[i]);
        }
    }
}
