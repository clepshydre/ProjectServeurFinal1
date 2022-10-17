package com.example.projectserveurfinal1.controller

import com.example.projectserveurfinal1.StationService
import com.example.projectserveurfinal1.model.StationBean
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class StationController(val stationService : StationService) {
    //http://localhost:8080/getAllStations
    @GetMapping("/getAllStations")
    fun getAllStations() :ArrayList<StationBean>{
        println("/getAllStations")
        try {
          var result =  stationService.getAll()
            println(result)
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return arrayListOf(StationBean(null))
    }

    //http://localhost:8080/testHello
    @GetMapping("/testHello")
    fun testHelloWorld(): String {
        println("/testHello")

        return "helloWorld"
    }


}