public class SearchSM {
    public static boolean stairCaseSearch(int matrix[][],int key){
        int row = 0, col = matrix.length -1;
        while(row >= 0 && col < matrix.length){
            if(matrix[row][col] == key){
                System.out.println("Key Found At ("+ row + ","+col+")");
                return true;
            }else if(key < matrix[row][col]){
                col--;
            }else{
                row++;
            }
        }
        System.out.println("Key Not Found");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = {
            {10,20,30,40},
            {15,25,35,45},
            {27,29,37,48},
            {32,33,39,50}
        };
        int key = 39;
        stairCaseSearch(matrix, key);
    }
}
