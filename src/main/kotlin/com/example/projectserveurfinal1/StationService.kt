package com.example.projectserveurfinal1

import com.example.projectserveurfinal1.model.RecordBean
import com.example.projectserveurfinal1.model.StationBean
import com.example.projectserveurfinal1.model.SubwayBean
import com.example.projectserveurfinal1.utils.RequestsUtils
import org.springframework.stereotype.Service


@Service
class StationService(val stationRep: StationRepository) {

    //ajouter les données en BDD
    fun refreshDataFromAPI(){
        //delete + rajout en bdd
        stationRep.deleteAll()
        var newData = RequestsUtils.loadStation()
        newData.forEach {
            stationRep.save(it)
        }
        println(newData)

    }

    //Chercher les données en bdd et les retourner
    fun loadStation():List<StationBean>{
        var arrayStations = stationRep.findAll()
        return arrayStations.toList()
    }

}




    //test
//    fun getAll() = stationRep.findAll()
//
//    fun add() = stationRep.save(StationBean(2, "test",2.2, 2.2, "C" ))
//
//    fun deleteAll() = stationRep.deleteAll()
