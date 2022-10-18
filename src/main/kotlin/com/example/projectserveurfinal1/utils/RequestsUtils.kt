package com.example.projectserveurfinal1.utils

import com.example.projectserveurfinal1.model.StationBean
import com.example.projectserveurfinal1.model.SubwayBean
import com.google.gson.Gson
import okhttp3.OkHttpClient
import okhttp3.Request


object RequestsUtils {


    val client = OkHttpClient()
    val gson = Gson()
    private const val URL_SUBWAY = "https://data.toulouse-metropole.fr/api/records/1.0/search/?dataset=stations-de-metro"


    //GET HTML

    fun sendGet(url: String): String {
        println("url : $url")
        //Création de la requête
        val request = Request.Builder().url(url).build()
        //Execution de la requête
        return client.newCall(request).execute().use {
            //Analyse du code retour
            if (!it.isSuccessful) {
                throw Exception("Réponse du serveur incorrect :${it.code}")
            }
            //Résultat de la requête
            it.body.string()
        }
    }


    //GET STATIONS SUBWAY
    fun loadStation():ArrayList<StationBean>{
        //Réaliser la requête.
        val json: String = sendGet(URL_SUBWAY)

        //Parser le JSON avec le bon bean et GSON
        val data = gson.fromJson(json, SubwayBean::class.java)

        //Remplir les beans pour la nouvelle API
        var arrayStation= ArrayList<StationBean>()
        data.records.forEach {
            var station = StationBean(null, it.fields.nom, it.fields.geo_point_2d[1], it.fields.geo_point_2d[0], it.fields.ligne)
            arrayStation.add(station)
        }

        //Retourner la donnée
        return arrayStation
    }

}