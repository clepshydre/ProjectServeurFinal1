package com.example.projectserveurfinal1.model

object LineDao{

    fun loadAllLine(): List<LineBean>{
        return emptyList()
    }

    fun loadOneLine(name: String): LineBean{
        return LineBean()
    }
}

object StationDao{

    fun loadAllStationFromOneLine(lineBean: LineBean): List<StationBean>{

        return emptyList()
    }
}