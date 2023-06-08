public class Cadance {
    public static void main(String[] args) {
        int number[] = {-2,-3,4,-1,-2,1,5,-3};
        int curSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<number.length; i++){
            curSum = curSum + number[i];
            if(curSum < 0){
                curSum = 0;
            }
            maxSum = Math.max(maxSum, curSum);
        }
        System.out.println(maxSum);
    }
}
