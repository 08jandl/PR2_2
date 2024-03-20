package EnumConstants;

public class WeatherMain {
    public static void main(String[] args) {
        WeatherForecast forecast = new WeatherForecast();

        System.out.println(forecast.forecast(25, 74, true, DirectionEnum.NORTH));
    }
}
