package SelfLearning.ClassAndObject.PhysicsAplication.TemperatureConverter;

public class ConvertedInstance {
    String unitTemp = "KCRF";
    String[] arrUnitTemp = unitTemp.split("");
    ConvertedToCelsius convertedToCelsius = new ConvertedToCelsius();
    ConvertedToFahrenheit convertedToFahrenheit = new ConvertedToFahrenheit();
    ConvertedToKelvin convertedToKelvin = new ConvertedToKelvin();
    ConvertedToReamur convertedToReamur = new ConvertedToReamur();
}
