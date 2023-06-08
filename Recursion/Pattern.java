public class Pattern {
    public static void main(String[] args) {
        int h = 6; 
        int w = 6;
        for(int i=0; i<h; i++){
            for(int j=0;j<w;j++){
                if(i == 0 || j == 0 || i == h -1 || j == w-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                //System.out.print(" *");
            }
            System.out.println();
        }
    }
}
