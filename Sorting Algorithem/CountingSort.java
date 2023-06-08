public class CountingSort {
    public static void sort(int number[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<number.length; i++){
            largest = Math.max(largest,number[i]);
        }
        System.out.println(largest);
        int count[] = new int[largest+1];
        for(int i=0; i<number.length; i++){
            count[number[i]]++;
            System.out.println("Count "+count[i]);
        }
        int j = 0;
        for(int i=0; i<count.length; i++){
            while(count[i] > 0){
                number[j] = i;
                j++;
                count[i]--;
            }    
        }
    }
    public static void main(String[] args) {
        int number[] = {1,4,1,3,2,4,3,7};
        sort(number);
        for(int i=0; i<number.length; i++){
            System.out.println(number[i]);
        }
    }
}
