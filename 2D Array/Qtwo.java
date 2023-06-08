public class Qtwo {
    public static int sumOfRow(int number[][]){
        int sum = 0;
        for(int i=0; i<number.length; i++){
            for(int j=i; j<number[0].length; j++){
                sum += number[1][j];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int number[][] = {
            {1,4,9},
            {11,4,3},
            {2,2,3}
        };
        System.out.println(sumOfRow(number));
    }
}
