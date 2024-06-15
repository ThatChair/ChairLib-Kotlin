package math

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import kotlin.math.atan

class CubicSplineTest {

    val testCubicSpline: CubicSpline = CubicSpline(-1.0, 3.0, 1.0, -3.0, 3.0, 3.0)

    @Test
    fun getAngle1() {
        val expected = atan(3.0)
        assertEquals(expected, testCubicSpline.angle1)
    }

    @Test
    fun getAngle2() {
        val expected = atan(3.0)
        assertEquals(expected, testCubicSpline.angle2)
    }

    @Test
    fun getA() {
        val expected = 3.0
        assertEquals(expected, testCubicSpline.a)
    }

    @Test
    fun setA() {
        testCubicSpline.a = 1.0

        assertEquals(1.0, testCubicSpline.a)

        testCubicSpline.a = 3.0

        assertEquals(3.0, testCubicSpline.a)
    }

    @Test
    fun getB() {
        val expected = 0.0
        assertEquals(expected, testCubicSpline.b)
    }

    @Test
    fun setB() {
        testCubicSpline.b = 1.0

        assertEquals(1.0, testCubicSpline.b)

        testCubicSpline.b = 0.0

        assertEquals(0.0, testCubicSpline.b)
    }

    @Test
    fun getC() {
        val expected = -6.0
        assertEquals(expected, testCubicSpline.c)
    }

    @Test
    fun setC() {
        testCubicSpline.c = 1.0

        assertEquals(1.0, testCubicSpline.c)

        testCubicSpline.c = -6.0

        assertEquals(-6.0, testCubicSpline.c)
    }

    @Test
    fun getD() {
        val expected = 0.0
        assertEquals(expected, testCubicSpline.d)
    }

    @Test
    fun setD() {
        testCubicSpline.d = 1.0

        assertEquals(1.0, testCubicSpline.d)

        testCubicSpline.d = 0.0

        assertEquals(0.0, testCubicSpline.d)
    }

    @Test
    fun getY() {
        assertEquals(-63.0, testCubicSpline.getY(-3.0))

        assertEquals(-12.0, testCubicSpline.getY(-2.0))

        assertEquals(3.0, testCubicSpline.getY(-1.0))

        assertEquals(0.0, testCubicSpline.getY(-0.0))

        assertEquals(-3.0, testCubicSpline.getY(1.0))

        assertEquals(12.0, testCubicSpline.getY(2.0))

        assertEquals(63.0, testCubicSpline.getY(3.0))
    }

    @Test
    fun getSlope() {
        assertEquals(75.0, testCubicSpline.getSlope(-3.0))

        assertEquals(30.0, testCubicSpline.getSlope(-2.0))

        assertEquals(3.0, testCubicSpline.getSlope(-1.0))

        assertEquals(-6.0, testCubicSpline.getSlope(-0.0))

        assertEquals(3.0, testCubicSpline.getSlope(1.0))

        assertEquals(30.0, testCubicSpline.getSlope(2.0))

        assertEquals(75.0, testCubicSpline.getSlope(3.0))
    }

    @Test
    fun testToString() {
        assertEquals("CubicSpline(3.0,0.0,-6.0,0.0)", testCubicSpline.toString())
    }
}