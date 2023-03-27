package com.ewbugs.implicitintentskotlin


import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
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

        val menuItems: Array<String> = arrayOf(
            "Gender",
            "Female",
            "Male",
            "Transgender",
            "Gender-Neutral",
            "Non-Binary",
            "Agender",
            "Pan-gender",
            "Gender-queer",
            "Two-Spirit",
            "Third-Gender",
            "combination of the above",
            "all of the above",
            "none of the above"
        )
        val menuAdapter =
            ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, menuItems)
        binding.spinnerGender.adapter = menuAdapter

    }


    private fun onPreviewClicked() {

        val profile = AccountInformation(
            binding.editTextUserName.text.toString(),
            binding.editTextEmail.text.toString(),
            binding.editTextPhoneNumber.text.toString(),
            binding.editTextPassword.text.toString(),
            binding.spinnerGender.selectedItem?.toString(),
            binding.checkBoxNA.isChecked


        )
        val accountPreviewActivityIntent = Intent(this, AccountPreviewActivity::class.java)
        accountPreviewActivityIntent.putExtra("Account Information Profile", profile)

        startActivity(accountPreviewActivityIntent)
    }

}

//lateinit var selectedGender: String
//
////    lateinit var position: Any
//lateinit var autoCompleteTextView: AutoCompleteTextView
//lateinit var textViewDisplay: TextView

//private fun AutoCompleteTextView.setOnItemClickListener() {
//
//        autoCompleteTextView = AutoCompleteTextView(this, findViewById(R.id.gender))
//        textViewDisplay = TextView(this, findViewById(R.id.menu))
//
//        val menuAdapter = ArrayAdapter(this, R.layout.list_item, menuItems)
//        autoCompleteTextView.setAdapter(menuAdapter)
//        autoCompleteTextView.setOnItemClickListener()
//
//        (binding.menu.editText as AutoCompleteTextView).onItemClickListener =
//
//            OnItemClickListener { adapterView, view, position, id ->
//
//                val selectedGender: String? = menuAdapter.getItem(position)
//            }













