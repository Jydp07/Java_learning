public class MaxSub {
    public static void maxSub(int number[]){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<number.length; i++){
            for(int j=i; j<number.length ; j++){
                int curSum = 0;
                for(int k=i; k<=j; k++){
                    System.out.print(number[k]+" ");
                    curSum += number[k];
                }
                System.out.println("Sum is "+curSum);
                if(max < curSum){
                    max = curSum;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Maximum Sum Is:"+max);
    }
    public static void main(String[] args) {
        int number[] = {1,2,3,4,5};
        maxSub(number);
    }
}
