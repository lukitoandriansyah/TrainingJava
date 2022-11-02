package SelfLearning.ClassAndObject.PhysicsAplication.TemperatureConverter;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("===========  Converted temperature  ==========");
        System.out.print("Input Value: ");
        double value = scanner.nextDouble();
        System.out.print("Input Initial Unit \n(required one: f,F,r,R,k,K,c,C): ");
        String unitInput = scanner.next();
        Converted converted = new Converted();
        Choice choice = new Choice();
        switch (choice.choice()) {
            case "1":
                System.out.println(converted.converted(value,
                        unitInput.toUpperCase(), "C")); break;
            case "2":
                System.out.println(converted.converted(value,
                        unitInput.toUpperCase(), "F")); break;
            case "3":
                System.out.println(converted.converted(value,
                        unitInput.toUpperCase(), "R")); break;
            case "4":
                System.out.println(converted.converted(value,
                        unitInput.toUpperCase(), "K")); break;
            default:
                System.out.println("Wrong Input. Try Again");
        }
    }
}
