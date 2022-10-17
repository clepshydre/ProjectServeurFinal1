package com.example.projectserveurfinal1.controller

import com.example.projectserveurfinal1.model.StationBean
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class StationController {
    //http://localhost:8080/readStationList?
    @GetMapping("/readStationList")
    fun readStationList() :ArrayList<StationBean>{
        println("/readStationList")
        try {

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