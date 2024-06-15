package math.units

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class AngleTest {

    val angle1 = 45.0.degrees
    val angle2 = Math.PI.radians

    @Test
    fun plus() {
        assertEquals((5 * Math.PI / 4.0).radians, angle1 + angle2)
    }

    @Test
    fun minus() {
        assertEquals(135.0, (angle2 - angle1).asDegrees)
    }

    @Test
    fun times() {
        assertEquals(angle2, angle1 * 4.0)
    }

    @Test
    fun div() {
        assertEquals(angle1, angle2 / 4.0)
    }

    @Test
    fun rem() {
    }

    @Test
    operator fun unaryPlus() {
    }

    @Test
    operator fun unaryMinus() {
    }

    @Test
    fun compareTo() {
    }

    @Test
    fun testToString() {
    }

    @Test
    fun sin() {
    }

    @Test
    fun cos() {
    }

    @Test
    fun tan() {
    }

    @Test
    fun wrap() {
    }

    @Test
    fun unWrap() {
    }

    @Test
    fun getAsDegrees() {
    }

    @Test
    fun testSin() {
    }

    @Test
    fun testCos() {
    }

    @Test
    fun testTan() {
    }

    @Test
    fun asin() {
    }

    @Test
    fun acos() {
    }

    @Test
    fun atan() {
    }

    @Test
    fun atan2() {
    }
}