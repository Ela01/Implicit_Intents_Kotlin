package com.ewbugs.implicitintentskotlin

//import android.R.layout.activity_list_item
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//import android.widget.ArrayAdapter
//import android.widget.AutoCompleteTextView
import com.ewbugs.implicitintentskotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.filledButtonSignUp.setOnClickListener {
            onPreviewClicked()
        }
        //val menuItems = listOf("Female", "Male", "Transgender", "Gender-Neutral", "Non-Binary", "Agender", "Pan-gender", "Gender-queer", "Two-Spirit", "Third-Gender", "combination of the above", "all of the above", "none of the above")
        //val menuAdapter = ArrayAdapter(this, activity_list_item, menuItems)
        //binding.exposedDropDownMenu.editText
        //(viewText.editText as? AutoCompleteTextView)?.setAdapter(adapter)
    }

    private fun onPreviewClicked(){

        //val message = Message{ * add commas between elements *
        binding.editTextUserName.text.toString()
        binding.editTextEmail.text.toString()
        binding.editTextPhoneNumber.text.toString()
        binding.editTextPassword.text.toString()
        binding.exposedDropDownMenu.isSelected.toString()

        //}
    }
}