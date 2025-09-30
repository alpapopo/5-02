import kotlin.math.sqrt
import kotlin.math.pow

data class Point(val x: Double, val y: Double) {
    fun distanceTo(other: Point): Double {
        return sqrt((other.x - x).pow(2) + (other.y - y).pow(2))
    }
}
