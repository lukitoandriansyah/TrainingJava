package GuideLearning.HariKe4;

public class Pemanasan5Bintang {
    public static void main(String[] args) {
        for (int i = 4 ; i > 0; i-- ) {
            int j;
            for (j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= j; k++){
                switch(k){
                    case 1:
                        System.out.print("A");
                        break;
                    case 2:
                        System.out.print("B");
                        break;
                    case 3:
                        System.out.print("C");
                        break;
                    case 4:
                        System.out.print("D");
                        break;
                }
            }
            System.out.println("");
        }
    }
}
