public class PrefixSum {
    public static int preFix(int number[]){
        int prefix[] = new int[number.length];
        int curSum = 0;
        int maxSum = Integer.MIN_VALUE;
        prefix[0] = number[0];
        //Calculate
        for(int i=1; i<number.length; i++){
            prefix[i] = prefix[i-1] + number[i]; 
        }

        for(int i=0; i<prefix.length; i++){
            for(int j=i; j<prefix.length; j++){
                curSum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];
                if(maxSum < curSum){
                    maxSum = curSum;
                }
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int number[] = {-2,-3,4,-1,-2,1,5,-3};
        System.out.println(preFix(number));
    }
}
