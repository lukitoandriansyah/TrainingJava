package SelfLearning.ClassAndObject.PhysicsAplication.TemperatureConverter;
public class ConvertedToFahrenheit {
    public String convertedToFahrenheit(double value, String unitInput,
                                        String unitResult) {
        double askIndicator = 9;
        double coolestPointResult = 32;
        if (unitInput.equals("K")) {
            double coolestPointInput = 273;
            double knownIndicator = 5;
            double valueConverted = ((askIndicator / knownIndicator)
                    * (value - coolestPointInput)) + coolestPointResult;
            double result = Math.round(valueConverted * 1000.0) / 1000.0;
            return ("Temperature Converted is: " + result + " " + unitResult);
        }
        if (unitInput.equals("R")) {
            double knownIndicator = 4;
            double valueConverted = ((askIndicator / knownIndicator)
                    * value) + coolestPointResult;
            double result = Math.round(valueConverted * 1000.0) / 1000.0;
            return ("Temperature Converted is: " + result + " " + unitResult);
        }
        if (unitInput.equals("C")) {
            double knownIndicator = 5;
            double valueConverted = ((askIndicator / knownIndicator)
                    * (value)) + coolestPointResult;
            double result = Math.round(valueConverted * 1000.0) / 1000.0;
            return ("Temperature Converted is: " + result + " " + unitResult);
        }
        return ("Wrong Input, Try Again");
    }
}
