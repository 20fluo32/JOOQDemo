package com.example

import com.example.Dao.StudentDao
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class Demo2ApplicationTests {

    @Autowired
    lateinit var studentDao: StudentDao

    @Test
    fun test() {
        var student = studentDao.getById("2020831032")
        println(student)
    }

}
