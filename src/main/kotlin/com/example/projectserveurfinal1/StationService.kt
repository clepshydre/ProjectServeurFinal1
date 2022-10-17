package com.example.projectserveurfinal1

import com.example.projectserveurfinal1.model.StationBean
import org.springframework.stereotype.Service

@Service
class StationService(val stationRep: StationRepository) {

    fun refreshDataFromAPI():ArrayList<StationBean>{
        return arrayListOf(StationBean(null))
    }


    fun addStationDataToDB(){

    }


    //test
    fun getAll() = stationRep.findAll()
}