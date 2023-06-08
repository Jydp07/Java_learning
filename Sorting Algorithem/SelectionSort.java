public class SelectionSort {
    public static void sort(int number[]){
        int count = 0;
        for(int i=0; i<number.length-1; i++){
            int minPos = i;
            for(int j=i+1; j<number.length; j++){
                count++;
                if(number[minPos] > number[j]){
                    minPos = j;
                    
                    System.out.println("Current minimum position "+minPos+" "+count);
                }
            }
            int temp = number[minPos];
            number[minPos] = number[i];
            number[i] = temp;
            System.out.println("Number"+ number[i]);
        }
    }
    public static void main(String[] args) {
        int number[] ={5,4,1,3,2};
        sort(number);
        for(int i=0; i<number.length; i++){
            System.out.print(number[i] + " ");
        }
    }
}
