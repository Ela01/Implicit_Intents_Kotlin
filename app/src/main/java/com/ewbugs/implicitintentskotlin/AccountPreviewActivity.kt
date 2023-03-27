package com.ewbugs.implicitintentskotlin

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ewbugs.implicitintentskotlin.databinding.ActivityAccountPreviewBinding

class AccountPreviewActivity : AppCompatActivity() {
    private lateinit var profile: AccountInformation
    private lateinit var profilePreviewText: String

    private lateinit var binding: ActivityAccountPreviewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityAccountPreviewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayProfile()
        setupButton()
    }

    private fun displayProfile() {

        profile = intent.getSerializableExtra("Account Information Profile") as AccountInformation

        profilePreviewText = """
                
               Username: ${profile.userName}
               
               Email: ${profile.email}
               
               Phone Number: ${profile.phoneNumber}
               
               Password: ${profile.password}
               
               Gender: ${profile.ifEmpty()}
               
                          
            """.trimIndent()

        binding.textViewProfile.text = profilePreviewText
    }

    private fun setupButton() {

        binding.buttonSaveAndSend.setOnClickListener {

            intent = Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("smsto: ${profile.phoneNumber}")
                putExtra("sms_body", profilePreviewText)
            }
            startActivity(intent)
        }
    }
}