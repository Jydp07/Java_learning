public class LargestN {
    public static int getMin(int number[]){
        int min = Integer.MAX_VALUE;
        for(int i=0; i<number.length; i++){
            if(min > number[i]){
                min = number[i];
            }
        }
        return min;
    }
    public static int getLargest(int number[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<number.length; i++){
            if(largest < number[i]){
                largest = number[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int number[] = {1,3,2,6,5};
        System.out.println("Maximum Number "+getLargest(number));
        System.out.println("Minimum Number "+getMin(number));
    }
}
