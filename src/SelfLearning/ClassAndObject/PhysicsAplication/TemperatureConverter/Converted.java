package SelfLearning.ClassAndObject.PhysicsAplication.TemperatureConverter;

public class Converted extends ConvertedInstance {
    public String converted(double value, String unitInput,
                            String unitResult) {
        if (unitResult.equals(unitInput)) {
            return ("Temperature Converted is: " + value + " "
                    + unitResult);
        }
        for (String s : arrUnitTemp) {
            if (!(s.toUpperCase().equals(unitInput))) {
                if (s.toUpperCase().equals(unitResult)) {
                    if (unitResult.equals("K")) {
                        return convertedToKelvin.convertedToKelvin(value,
                                unitInput, s.toUpperCase());
                    }
                    if (unitResult.equals("C")) {
                        return convertedToCelsius.convertedToCelsius(value,
                                unitInput, s.toUpperCase());
                    }
                    if (unitResult.equals("R")) {
                        return convertedToReamur.convertedToReamur(value,
                                unitInput, s.toUpperCase());
                    }
                    if (unitResult.equals("F")) {
                        return convertedToFahrenheit.convertedToFahrenheit(value,
                                unitInput, s.toUpperCase());}
                }
            }
        }
        return ("Wrong Input, Try Again");
    }
}
