package observer_pattern.v1

fun main() {
    val weatherData = WeatherData()
    val currentConditionsDisplay = CurrentConditionsDisplay(weatherData)
    weatherData.setMeasurements(80f, 65f, 30.4f)
    weatherData.setMeasurements(82f, 70f, 29.2f)
    weatherData.setMeasurements(78f, 90f, 29.2f)
}