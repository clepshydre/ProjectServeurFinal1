package com.example.projectserveurfinal1.controller

import com.example.projectserveurfinal1.StationService
import com.example.projectserveurfinal1.model.StationBean
import com.google.gson.Gson
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class StationController(val stationService : StationService) {
    val gson = Gson()

    //http://localhost:8080/getAllStations
    @GetMapping("/getAllStations")
    fun getAllStations() :String{
        println("/getAllStations")
        var data = ""
        try {
            data = gson.toJson(stationService.loadStation())
        } catch (e: Exception) {
            e.printStackTrace()
        }
        println(data)
        return data
    }

    //http://localhost:8080/testHello
//    @GetMapping("/testHello")
//    fun testHelloWorld(): String {
//        println("/testHello")
//
//        return "helloWorld"
//    }

}