package SelfLearning.ClassAndObject.PhysicsAplication.TemperatureConverter;
import java.util.Scanner;
public class Choice {
    public String choice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("==========   Choose Converted to  ==========");
        System.out.println("1. Celsius");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Reamur");
        System.out.println("4. Kelvin");
        System.out.println();
        System.out.print("Input Number That You Choose: ");
        return scanner.nextLine();
    }
}
