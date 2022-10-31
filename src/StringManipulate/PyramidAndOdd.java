package StringManipulate;

public class PyramidAndOdd {

    public int countOfOdd() {
        int counter = 0;
        for (int i = 1; i < 10; i++) {
            if (i % 2 != 0) {
                counter = counter + i;
            }
        }
        return counter;
    }

    public void starDownPyramid() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i + j < 5) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        PyramidAndOdd pyramidAndOdd = new PyramidAndOdd();
        System.out.print("Count of odd in range 1-10 is: ");
        System.out.println(pyramidAndOdd.countOfOdd());
        pyramidAndOdd.starDownPyramid();
    }
}
