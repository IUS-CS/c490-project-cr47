package edu.iu.com.example.meds.Db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
 data class Workout (
    val title: String,
    val info:  String
){
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}