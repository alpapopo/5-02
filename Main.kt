fun readDouble(prompt: String): Double {
    print(prompt)
    return readLine()?.toDoubleOrNull() ?: 0.0
}

fun main() {
    val x1 = readDouble("Введите X координату первой точки: ")
    val y1 = readDouble("Введите Y координату первой точки: ")
    val x2 = readDouble("Введите X координату второй точки: ")
    val y2 = readDouble("Введите Y координату второй точки: ")

    val p1 = Point(x1, y1)
    val p2 = Point(x2, y2)

    val distance = p1.distanceTo(p2)
    println("Расстояние между двумя точками: $distance")
}

