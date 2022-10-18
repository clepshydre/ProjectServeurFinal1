package com.example.projectserveurfinal1.controller

import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component

@Component
class TimeComponent {

    //Action chaque jour à 1h du matin
    @Scheduled(cron = "0 0 1 * * *")
    fun everyDay() {

    }

}