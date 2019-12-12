package edu.iu.com.example.meds

import android.os.AsyncTask
import android.os.Bundle

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import edu.iu.com.example.meds.Db.WorkDatabase
import edu.iu.com.example.meds.Db.Workout
import kotlinx.android.synthetic.main.fragment_info.*


class info : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_info, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        //  WorkDatabase(activity!!).getWorkoutDao().
        button_save.setOnClickListener {

            val workoutTitle = edit_text_title.text.toString().trim()
            val workoutBody = edit_text_workout.text.toString().trim()

            if (workoutTitle.isEmpty()) {
                edit_text_title.error = "info required"
                edit_text_title.requestFocus()
                return@setOnClickListener
            }
            if (workoutBody.isEmpty()) {
                edit_text_workout.error = "required info"
                edit_text_workout.requestFocus()
                return@setOnClickListener
            }
            val workout = Workout(workoutTitle, workoutBody)
            saveWorkout(workout)
        }
    }

    private fun saveWorkout(workout: Workout) {
        class someTask() : AsyncTask<Void, Void, String>() {
            override fun doInBackground(vararg params: Void?): String? {
                WorkDatabase(activity!!).getWorkoutDao()
                return null

            }

            override fun onPreExecute() {
                super.onPreExecute()
            }

            override fun onPostExecute(result: String?) {
                super.onPostExecute(result)

                Toast.makeText(activity, "Saved", Toast.LENGTH_LONG).show()
            }
        }

    }
}




    
