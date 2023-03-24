package com.ewbugs.implicitintentskotlin


import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
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

        val menuItems = listOf("Female", "Male", "Transgender", "Gender-Neutral", "Non-Binary", "Agender", "Pan-gender", "Gender-queer", "Two-Spirit", "Third-Gender", "combination of the above", "all of the above", "none of the above")
        val menuAdapter = ArrayAdapter(this, R.layout.list_item, menuItems)
        (binding.exposedDropDownMenu.editText as? AutoCompleteTextView)?.setAdapter(menuAdapter)
    }

    private fun onPreviewClicked(){

        //val selectedValue: Editable? = (binding.exposedDropDownMenu.editText as AutoCompleteTextView).text

        val profile = AccountInformation(
        binding.editTextUserName.text.toString(),
        binding.editTextEmail.text.toString(),
        binding.editTextPhoneNumber.text.toString(),
        binding.editTextPassword.text.toString(),
        binding.exposedDropDownMenu.editText.toString())

        val accountPreviewActivityIntent = Intent(this, AccountPreviewActivity::class.java)
        accountPreviewActivityIntent.putExtra("Account Information Profile", profile)

        startActivity(accountPreviewActivityIntent)
    }
}