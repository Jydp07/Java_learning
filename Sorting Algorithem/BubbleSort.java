public class BubbleSort{
    public static void sort(int number[]){
        for(int i=0; i<number.length - 1; i++){
            for(int j=0; j<number.length -1 - i; j++){
                if(number[j] > number[j+1]){
                int temp = number[j];
                number[j] = number[j+1];
                number[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int number[] = {5,3,4,2,1};
        sort(number);
        for(int i=0; i<number.length; i++){
            System.out.print(number[i] + " ");
        }
    }
}