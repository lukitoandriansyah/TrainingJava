package HariKe4;

public class Pemanasan2Bintang {
    public static void main(String[] args) {
        for (int i = 4 ; i > 0; i-- ) {
            int j;
            for (j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= j; k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
