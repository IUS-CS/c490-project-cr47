package edu.iu.com.example.meds

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.gson.GsonBuilder
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.list_source.*
import okhttp3.*
import java.io.IOException

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navController = Navigation.findNavController(this, R.id.fragment2)
        NavigationUI.setupActionBarWithNavController(this, navController)

       recyclerView_main.layoutManager = LinearLayoutManager(this)


        fetchJson()
    }

    override fun onSupportNavigateUp(): Boolean {
        return NavigationUI.navigateUp(
            Navigation.findNavController(this, R.id.fragment2),
             null
        )
    }

    fun fetchJson(){
        println("Attempting to Fetch JSON")

        val url = "https://wger.de/api/v2/exerciseimage/?page=2"

        val request = Request.Builder().url(url).build()

        val client = OkHttpClient()
        client.newCall(request).enqueue(object: Callback {

            override fun onResponse(call: Call, response: Response) {
                val body  = response?.body()?.string()
                println(body)

                val gson = GsonBuilder().create()

               val homeFeed = gson.fromJson(body, HomeFeed::class.java)

                runOnUiThread {
                    recyclerView_main.adapter = MainAdapter(homeFeed)
                }
            }
            override fun onFailure(call: Call, e: IOException) {
                println("Failed to execute request")
            }

        })
    }
}

       class HomeFeed(val results: List<Result>)

       class Result(val id: Int, val image: String ,val description: String)