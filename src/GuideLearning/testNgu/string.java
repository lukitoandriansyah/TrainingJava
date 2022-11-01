package GuideLearning.testNgu;

public class string {

    public static void main(String[] args) {
        String input = "Global Utama Nashta";
        String[] inputArr = input.split(" ");
        String[] kataPertama = new String[inputArr.length];
        for (int i = 0; i < inputArr.length; i++) {
            if (i == 0 ) {
                kataPertama[i] = inputArr[inputArr.length-1];
            }
            if (i == 1) {
                kataPertama[i] = inputArr[inputArr.length-inputArr.length];
            }
            if (i == 2) {
                kataPertama[i] = inputArr[inputArr.length-2];
            }
        }
        for (int j=0; j<inputArr.length; j++){
            System.out.printf("%s", kataPertama[j]);
            System.out.print(" ");
        }
    }
}
