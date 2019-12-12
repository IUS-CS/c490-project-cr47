package edu.iu.com.example.meds.Db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import java.util.concurrent.locks.Lock


@Database(
    entities = [Workout::class],
    version = 1
)
abstract class WorkDatabase : RoomDatabase(){
    abstract fun getWorkoutDao() : Dao

    companion object {
        @Volatile private var instance : WorkDatabase? = null
        private val Lock = Any()

        operator fun invoke(context: Context) = instance ?: synchronized(Lock){
            instance ?: buildDatabase(context).also{
                instance = it
            }
        }
        private fun buildDatabase(context: Context) = Room.databaseBuilder(
            context.applicationContext,
            WorkDatabase::class.java,
            "workdatabase"
        ).build()
    }
}