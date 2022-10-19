package com.example.projectserveurfinal1.controller

import com.example.projectserveurfinal1.StationService
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component

@Component
class TimeComponent(val stationService: StationService) {

    //Action chaque jour à 1h du matin
    @Scheduled(cron = "0 0 1 * * *")
    fun everyDay() {
        stationService.refreshDataFromAPI()
        println("done")
    }

    //Action chaque minute
//    @Scheduled(fixedRate = 60000)
//    fun everyMinute() {
//        stationService.refreshDataFromAPI()
//    }

}

