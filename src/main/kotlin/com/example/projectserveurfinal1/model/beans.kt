package com.example.projectserveurfinal1.model

data class LineBean(var id: Int? = null, var name: String = "")
data class StationBean(var id : Int? = null, var name: String = "")
data class TypeLineBean(var id: Int? = null, var name: String = "")
data class CoordinateBean(var id : Int? = null, var long : Double = 0.0, var lat : Double = 0.0)

data class Station(
    val nhits: Int,
    val parameters: Parameters,
    val records: List<Record>
)

data class Parameters(
    val dataset: String,
    val format: String,
    val rows: Int,
    val start: Int,
    val timezone: String
)

data class Record(
    val datasetid: String,
    val fields: Fields,
    val geometry: Geometry,
    val record_timestamp: String,
    val recordid: String
)

data class Fields(
    val commune: String,
    val couvert: String,
    val en_service: Int,
    val etat: String,
    val geo_point_2d: List<Double>,
    val geo_shape: GeoShape,
    val infobulle: String,
    val ligne: String,
    val nom: String,
    val type: String
)

data class Geometry(
    val coordinates: List<Double>,
    val type: String
)

data class GeoShape(
    val coordinates: List<List<Double>>,
    val type: String
)