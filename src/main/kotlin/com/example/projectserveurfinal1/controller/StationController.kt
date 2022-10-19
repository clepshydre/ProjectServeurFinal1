package com.example.projectserveurfinal1.controller

import com.example.projectserveurfinal1.StationService
import com.example.projectserveurfinal1.model.ErreurBean
import com.example.projectserveurfinal1.model.StationBean
import com.google.gson.Gson
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import javax.servlet.http.HttpServletResponse

@RestController
class StationController(val stationService : StationService) {

    //http://localhost:8080/getAllStations
    @GetMapping("/getAllStations")
    fun getAllStations(response: HttpServletResponse) : Any {
        println("/getAllStations")
        try {
           return stationService.loadStation()

        } catch (e: Exception) {
            e.printStackTrace()
            response.status = 512
            return e
        }
    }

    //http://localhost:8080/testHello
//    @GetMapping("/testHello")
//    fun testHelloWorld(): String {
//        println("/testHello")
//
//        return "helloWorld"
//    }

}