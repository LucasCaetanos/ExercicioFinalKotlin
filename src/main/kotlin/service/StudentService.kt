package service

import model.Student
import java.util.HashMap
import model.Course

class StudentService {
    private val students: MutableMap<String?, Student> = HashMap()
    fun subscribeStudent(student: Student) {
        students[student.id] = student
    }

    fun findStudent(studentId: String?): Student? {
        return if (students.containsKey(studentId)) {
            students[studentId]
        } else null
    }

    fun isSubscribed(studentId: String?): Boolean {
        if (studentId != null){
            return students.contains(studentId)
        }
        return false
    }

    fun showSummary() {
        for (i in students){
            println("ID: ${i.value.id} / NOME: ${i.value.name} / EMAIL: ${i.value.email}")
        }
    }

    fun enrollToCourse(studentId: String?, course: Course?) {
        if (students.containsKey(studentId)) {
            students[studentId]!!.enrollToCourse(course)
        }
    }
}