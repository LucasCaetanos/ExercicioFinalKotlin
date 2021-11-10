package service

import model.Course
import org.junit.Test

import org.junit.Assert.*

class CourseServiceTest {

    var Course = Course("abcd","Kotlin",20,module = null)
    var CourseService = CourseService()

    @Test
    fun getCourse(){
        CourseService.registerCourse(Course)
        assertEquals(Course, CourseService.getCourse("abcd"))
    }

}
