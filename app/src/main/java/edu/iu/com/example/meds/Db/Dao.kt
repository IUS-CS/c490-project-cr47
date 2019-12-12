package edu.iu.com.example.meds.Db

import android.icu.text.IDNA
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import edu.iu.com.example.meds.Db.Workout

@Dao
interface Dao {
    @Insert
    fun getInfo(info: Workout)

    @Query("Select * From  workout")
    fun getAllWorkouts() : List<Workout>

    @Insert
    fun addMultipleWorkouts(vararg info: Workout)
}