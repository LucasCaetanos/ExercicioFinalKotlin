package model

import service.CourseService
import java.util.*

class Student(id: String?, name: String?, email: String?, birthDate: Date?) : Person(id, name, email, birthDate),
    Evaluation {
    private val average = 0.0

    private val courses: MutableList<Course?> = ArrayList()
    private val approvedCourses: MutableMap<String, Course> = HashMap()

    override fun getAverage(): Double {
        return average;
    }

    fun enrollToCourse(course: Course?) {
        if (course != null){
            courses.add(course)
            println("Student added successfully")
        }else{
            println("Error")
        }
    }

    fun registerApprovedCourse(course: Course) {
        approvedCourses[course.code] = course
    }

    fun isCourseApproved(courseCode: String?): Boolean {
        return if (courseCode != null) {
            approvedCourses.contains(courseCode)
        }else{
            false
        }
    }

    fun isAttendingCourse(courseCode: String?): Boolean {
        if (courseCode != null) {
            return CourseService().getCourse(courseCode) != null
        }
        return false
    }

    override fun getApprovedCourses(): List<Course> {
        return approvedCourses.values.toList()
    }

    override fun toString(): String {
        return "Student {" + super.toString() + "}"
    }
}
