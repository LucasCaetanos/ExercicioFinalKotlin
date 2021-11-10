package service

import model.Student
import org.junit.Test

import org.junit.Assert.*
import java.util.*
import kotlin.collections.HashMap



class StudentServiceTest {

    val student = Student("22","Lucas","lucas@mail.com", birthDate = null)


    @Test
    fun isSubscribed(){
        val studentServiceTest = StudentService()
        studentServiceTest.subscribeStudent(student)

        assertTrue(studentServiceTest.isSubscribed(student.id))
        assertFalse(studentServiceTest.isSubscribed("FAKEID"))
        assertFalse(studentServiceTest.isSubscribed(null))
    }
}