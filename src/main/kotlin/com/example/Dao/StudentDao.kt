package com.example.Dao

import com.example.domain.Student
import org.jooq.DSLContext
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository

@Repository
class StudentDao {
    @Autowired
    lateinit var dslContext: DSLContext

    fun getById(id: String): Student {
        println("开始查询")
        val student: Student =
            dslContext.select().from("student").where("id = ?", id).fetchOne()?.into(Student::class.java)!!
        return student
    }

}