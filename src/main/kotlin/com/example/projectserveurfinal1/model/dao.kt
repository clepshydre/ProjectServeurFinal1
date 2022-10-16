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

object TypeLineDao{
    fun loadAllTypeLine():List<TypeLineBean>{
        return emptyList()
    }
}

object CoordinateDao{
    fun loadCoordinatesFromStation(station: Station): List<CoordinateBean>{
        return emptyList()
    }
}