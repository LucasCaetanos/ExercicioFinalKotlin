package service

import model.Student
import org.junit.Test

import org.junit.Assert.*
import java.util.*
import kotlin.collections.HashMap

val student = Student("22","Lucas","lucas@mail.com", birthDate = null)

class StudentServiceTest {

    @Test
    fun subscribeStudent() {
        val students: MutableMap<String?, Student> = HashMap()

        students[student.id] = student
        val registredStudent = students[student.id]?.name
        assertEquals(student.name, registredStudent)
    }
}