package observer_pattern.v1

interface Observer {
    fun update(temp: Float, humidity: Float, pressure: Float)
}