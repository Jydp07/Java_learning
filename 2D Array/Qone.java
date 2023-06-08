public class Qone {
    public static int count(int number[][]){
        int icount = 0;
        for(int i=0; i<number.length; i++){
            for(int j=0; j<number[0].length; j++){
                if(number[i][j] == 7){
                    icount++;
                }
            }
        }
        return icount;
    }
    public static void main(String[] args) {
        int number[][] = {
            {4,7,8},
            {8,8,7}
        };
        System.out.println(count(number));
    }
}
