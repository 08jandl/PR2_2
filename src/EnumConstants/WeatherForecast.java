package EnumConstants;

public class WeatherForecast {
    public static final String RAINY = "Weather tomorrow will be rainy";
    public static final String CLOUDY = "Weather tomorrow will be cloudy";
    public static final String SUNNY = "Weather tomorrow will be sunny";
    private DirectionEnum direction;
    private double temperature;
    private double humidity;
    private boolean isCloudy;

    public String forecast(double temperature, double humidity, boolean isCloudy, DirectionEnum direction) {
        if (direction.equals(DirectionEnum.EAST)) {
            if (isCloudy) {
                if (temperature > 25.3 && humidity > 74.6) {
                    return RAINY;
                } else if (temperature > 25 && humidity < 74) {
                    return CLOUDY;
                } else {
                    return SUNNY;
                }
            } else {
                if (temperature < 10 && humidity > 12) {
                    return SUNNY;
                } else if (temperature > 25 && humidity > 80) {
                    return RAINY;
                } else {
                    return CLOUDY;
                }
            }
        } else if (direction.equals(DirectionEnum.WEST)) {
            if (!isCloudy) {
                if (temperature > 25.3 && humidity > 74.6) {
                    return RAINY;
                } else if (temperature > 25 && humidity < 74) {
                    return CLOUDY;
                } else {
                    return SUNNY;
                }
            } else {
                if (temperature < 10 && humidity > 12) {
                    return SUNNY;
                } else if (temperature > 25 && humidity > 80) {
                    return RAINY;
                } else {
                    return CLOUDY;
                }
            }
        } else {
            return CLOUDY;
        }
    }
}
