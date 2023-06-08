public class LastOccure {
    public static int last(int arr[],int i,int key){        
        if(i == arr.length - 1){
            return -1;
        }
        int isFound = last(arr, i+1, key);
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }
    public static void main(String[] args) {
        int arr[] = {8,3,6,9,5,10,2,5,3};
        int i = 0,key = 5;
        System.out.println(last(arr, i, key));
    }
}
