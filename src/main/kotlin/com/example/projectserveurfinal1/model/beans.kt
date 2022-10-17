package com.example.projectserveurfinal1.model

import javax.persistence.*


@Entity
@Table(name = "station")
data class StationBean(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id : Int? = null,
    var name: String = "",
    var longitude : Double = 0.0,
    var latitude : Double = 0.0,
    var line:String=""
)

