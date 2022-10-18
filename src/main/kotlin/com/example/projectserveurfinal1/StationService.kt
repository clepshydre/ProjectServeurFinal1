package com.example.projectserveurfinal1

import com.example.projectserveurfinal1.model.StationBean
import org.springframework.stereotype.Service

@Service
class StationService(val stationRep: StationRepository) {

    fun loadStation():ArrayList<StationBean>{
        return arrayListOf(StationBean(null))
    }


    fun refreshDataFromAPI(){

    }


    //test
//    fun getAll() = stationRep.findAll()
//
//    fun add() = stationRep.save(StationBean(2, "test",2.2, 2.2, "C" ))
//
//    fun deleteAll() = stationRep.deleteAll()
}