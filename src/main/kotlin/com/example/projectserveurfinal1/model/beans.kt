package com.example.projectserveurfinal1.model

import javax.persistence.*


@Entity
@Table(name = "station")
data class StationBean(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id : Int? = null,
    var name: String = "",
    var long : Double = 0.0,
    var lat : Double = 0.0,
    var line:String=""
)

