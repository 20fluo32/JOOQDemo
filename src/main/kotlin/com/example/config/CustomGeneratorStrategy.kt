package com.example.config

import org.jooq.codegen.DefaultGeneratorStrategy
import org.jooq.codegen.GeneratorStrategy
import org.jooq.meta.Definition
import org.springframework.context.annotation.Configuration

//@Configuration
open class CustomGeneratorStrategy : DefaultGeneratorStrategy() {

    // 修改类名和文件扩展名为 Kotlin 格式 (.kt)
    override fun getJavaClassName(definition: Definition?, mode: GeneratorStrategy.Mode): String {
        return super.getJavaClassName(definition, mode).replace("java", "kt")
    }

    // 其他自定义逻辑可以在这里实现
}