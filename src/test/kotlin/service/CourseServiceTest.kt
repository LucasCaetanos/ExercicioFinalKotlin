package service

import model.Course
import org.junit.Test

import org.junit.Assert.*

class CourseServiceTest {

    val course = Course("Luc987","Analise de sistemas",222, module = null)

    @Test
    fun registerCourse() {
        val courses: MutableMap<String, Course> = HashMap()
        courses[course.code] = course
        assertEquals(course.name, courses[course.code]?.name)
    }
}