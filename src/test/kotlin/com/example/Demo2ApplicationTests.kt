package com.example

//import com.example.Dao.StudentDao
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.util.AntPathMatcher

@SpringBootTest
class Demo2ApplicationTests {

//    @Autowired
//    lateinit var studentDao: StudentDao

//    @Test
//    fun test() {
//        var student = studentDao.getById("2020831032")
//        println(student)
//    }

    @Test
    fun test2() {
        val path = "/d4241b/pypiL1/packages/awesome-package/0.1.0/awesome_package-0.1.0-py3-none-any.whl"
        val pathMatcher = AntPathMatcher()
        var extractUriTemplateVariables = pathMatcher.extractUriTemplateVariables(PYPI_PACKAGES_MAPPING_URI, path)
        val projectId = extractUriTemplateVariables["projectId"]
        val repoName = extractUriTemplateVariables["repoName"]
        val name = extractUriTemplateVariables["name"]
        val version = extractUriTemplateVariables["version"]

        // extractPathWithinPattern
        // 得到模式匹配的映射部分，找出*或者?匹配上的那一段路径以及后续路径
        val artifactUri = pathMatcher.extractPathWithinPattern(PYPI_PACKAGES_MAPPING_URI, path)
        println("projectId: $projectId, repoName: $repoName, name: $name, version: $version")
        println(artifactUri)
//        println(path)
    }

    companion object {
        const val PYPI_PACKAGES_MAPPING_URI = "/{projectId}/{repoName}/packages/**/{name:[^-]+}-{version:[^-]+}" +
                "{suffix:\\.tar\\.gz|\\.zip|\\.tgz|\\.egg|\\.tar\\.bz2|-.+\\.whl}"
    }

}
