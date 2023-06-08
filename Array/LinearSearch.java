public class LinearSearch {
    public static int linearSearch(String menu[],String key){
        for(int i=0; i<menu.length; i++){
            if(menu[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String menu[] = {"Dhosa","Pizza","Samosa","Burger"};
        //int number[] = {1,7,4,5,9,10};
        String key = "Pizza";

        int index = linearSearch(menu, key);
        if(index == -1){
            System.out.println("Key Not Found");
        }else{
            System.out.println("Key Found At "+linearSearch(menu, key));
        }
    }
}
