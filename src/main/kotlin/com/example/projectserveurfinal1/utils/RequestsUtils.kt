package com.example.projectserveurfinal1.utils

import com.example.projectserveurfinal1.model.StationBean
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

    //TIMER GET
    fun timerSendGet():String{
        return ""
    }


    //GET STATIONS SUBWAY
    fun loadStation():ArrayList<StationBean>{
        return arrayListOf(StationBean(null))
    }



}