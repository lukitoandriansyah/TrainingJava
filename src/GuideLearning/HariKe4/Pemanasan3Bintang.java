package GuideLearning.HariKe4;

public class Pemanasan3Bintang {
    public static void main(String[] args) {
        for (int i = 0 ; i < 4; i++ ) {
            int j;
            for (j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= j; k++){
                System.out.print("+");
            }
            System.out.println("");
        }
    }
}
