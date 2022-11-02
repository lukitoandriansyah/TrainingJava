package SelfLearning.ClassAndObject.PhysicsAplication.TemperatureConverter;
public class ConvertedToKelvin {
    public String convertedToKelvin(double value, String unitInput,
                                    String unitResult) {
        double coolestPointResult = 273;
        double askIndicator = 5;
        if (unitInput.equals("C")) {
            double valueConverted = value + coolestPointResult;
            double result = Math.round(valueConverted * 1000.0) / 1000.0;
            return ("Temperature Converted is: " + result + " " +
                    unitResult);
        }
        if (unitInput.equals("R")) {
            double knownIndicator = 4;
            double valueConverted = ((askIndicator / knownIndicator)
                    * value) + coolestPointResult;
            double result = Math.round(valueConverted * 1000.0) / 1000.0;
            return ("Temperature Converted is: " + result + " "
                    + unitResult);
        }
        if (unitInput.equals("F")) {
            double coolestPointInput = 32;
            double knownIndicator = 9;
            double valueConverted = ((askIndicator / knownIndicator)
                    * (value - coolestPointInput)) + coolestPointResult;
            double result = Math.round(valueConverted * 1000.0) / 1000.0;
            return ("Temperature Converted is: " + result + " " + unitResult);
        }
        return ("Wrong Input, Try Again");
    }
}
