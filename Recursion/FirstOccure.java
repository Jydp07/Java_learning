public class FirstOccure {
    public static int first(int arr[],int key,int index){
        if(key == arr[index]){
            return index;
        }
        if(index == arr.length - 1){
            return 0;
        }
        return first(arr, key, index+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,2,3,9};
        int key = 9,index = 0;
        System.out.println(first(arr, key, index));
    }
}
