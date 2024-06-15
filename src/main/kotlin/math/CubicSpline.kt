package math

import kotlin.math.atan2
import kotlin.math.pow

// math can be found here if you want to bore yourself:
// https://math.stackexchange.com/questions/1522439/generalised-formula-for-fitting-a-cubic-between-two-points-with-specified-slopes

// Creates a spline between two points. The spline begins and ends with the two specified slopes (m1 & m2).
class CubicSpline(
    x1: Double,
    y1: Double,
    x2: Double,
    y2: Double,
    m1: Double = 0.0,
    m2: Double = 0.0
) {

    val angle1: Double = atan2(m1, 1.0)
    val angle2: Double = atan2(m2, 1.0)

    var a = (m1 + m2 - 2.0 * (y2 - y1) / (x2 - x1)) / (x1 - x2).pow(2)
    var b = (m2 - m1) / (2.0 * (x2 - x1)) - (3.0 / 2.0) * (x1 + x2) * a
    var c = m1 - 3.0 * x1.pow(2) * a - 2.0 * x1 * b
    var d = y1 - x1.pow(3) * a - x1.pow(2) * b - x1 * c

    fun getY(x: Double): Double {
        return a * x.pow(3) + b * x.pow(2) + c * x + d
    }

    fun getSlope(x: Double): Double {
        return 3 * a * x.pow(2) + 2 * b * x + c
    }

    override fun toString(): String {
        return "CubicSpline($a,$b,$c,$d)"
    }
}