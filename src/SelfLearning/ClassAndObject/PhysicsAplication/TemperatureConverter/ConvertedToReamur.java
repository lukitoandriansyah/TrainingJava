package SelfLearning.ClassAndObject.PhysicsAplication.TemperatureConverter;
public class ConvertedToReamur {
    public String convertedToReamur(double value, String unitInput,
                                    String unitResult) {
        double askIndicator = 4;
        if (unitInput.equals("K")) {
            double coolestPointInput = 273;
            double knownIndicator = 5;
            double valueConverted = ((askIndicator / knownIndicator)
                    * (value - coolestPointInput));
            double result = Math.round(valueConverted * 1000.0) / 1000.0;
            return ("Temperature Converted is: " + result + " " + unitResult);
        }
        if (unitInput.equals("C")) {
            double knownIndicator = 5;
            double valueConverted = (askIndicator / knownIndicator)
                    * value;
            double result = Math.round(valueConverted * 1000.0) / 1000.0;
            return ("Temperature Converted is: " + result + " " + unitResult);
        }
        if (unitInput.equals("F")) {
            double coolestPointInput = 32;
            double knownIndicator = 9;
            double valueConverted = ((askIndicator / knownIndicator)
                    * (value - coolestPointInput));
            double result = Math.round(valueConverted * 1000.0) / 1000.0;
            return ("Temperature Converted is: " + result + " " + unitResult);
        }
        return "";
    }
}
