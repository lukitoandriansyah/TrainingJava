package SelfLearning.ClassAndObject.PhysicsAplication.TemperatureConverter;
public class ConvertedToCelsius {
    public String convertedToCelsius(double value, String unitInput,
                                     String unitResult) {
        double askIndicator = 5;
        if (unitInput.equals("K")) {
            double coolestPointInput = 273;
            double valueConverted = value - coolestPointInput;
            double result = Math.round(valueConverted * 1000.0) / 1000.0;
            return ("Temperature Converted is: " + result + " " + unitResult);
        }
        if (unitInput.equals("R")) {
            double knownIndicator = 4;
            double valueConverted = (askIndicator / knownIndicator) * value;
            double result = Math.round(valueConverted * 1000.0) / 1000.0;
            return ("Temperature Converted is: " + result + " " + unitResult);
        }
        if (unitInput.equals("F")) {
            double knownIndicator = 9;
            double coolestPointInput = 32;
            double valueConverted = (askIndicator / knownIndicator)
                    * (value - coolestPointInput);
            double result = Math.round(valueConverted * 1000.0) / 1000.0;
            return ("Temperature Converted is: " + result + " " + unitResult);
        }
        return ("Wrong Input, Try Again");
    }
}
