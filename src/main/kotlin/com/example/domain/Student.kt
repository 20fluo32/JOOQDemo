package com.example.domain

import lombok.Data
import java.io.Serializable

@Data
class Student : Serializable {
    var id: String? = null
    var name: String? = null
}