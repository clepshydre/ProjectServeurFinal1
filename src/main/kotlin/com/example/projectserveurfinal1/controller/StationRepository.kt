package com.example.projectserveurfinal1.controller

import com.example.projectserveurfinal1.model.StationBean
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface StationRepository :JpaRepository<StationBean, Int>{
}