package com.example.projectserveurfinal1

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableScheduling

@EnableScheduling
@SpringBootApplication
class ProjectServeurFinal1Application

fun main(args: Array<String>) {
    runApplication<ProjectServeurFinal1Application>(*args)
}
