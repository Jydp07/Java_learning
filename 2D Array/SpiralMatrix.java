public class SpiralMatrix{
    public static void printSpiral(int number[][]){
        int startCol = 0;
        int startRow = 0;
        int endCol = number.length -1;
        int endRow = number.length -1;

        while(startCol <= endCol && startRow <= endRow){
            //top
            for(int j=startCol; j<=endCol; j++){
                System.out.println(number[startRow][j]);
            }
            //Right
            for(int i=startRow + 1; i<=endRow; i++){
                System.out.println(number[i][endCol]);
            }
            //Bottom
            for(int j=endCol - 1; j>=startCol; j--){
                if(startRow == endRow){
                    break;
                }
                System.out.println(number[endRow][j]);
            }
            //Left
            for(int i=endRow -1 ; i>startRow; i--){
                if(startCol == endCol){
                    break;
                }
                System.out.println(number[i][startCol]);
            }

            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
    }
    public static void main(String[] args) {
        int number[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        for(int i=0; i<number.length; i++){
            for(int j=0; j<number.length; j++){
                System.out.print(number[i][j]);
            }
            System.out.println();
        }
        printSpiral(number);
    }
}