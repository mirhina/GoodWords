package com.example.goodwords

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.example.goodwords.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var  binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sentenceList = mutableListOf<String>()
        sentenceList.add("Good Words1")
        sentenceList.add("Good Words2")
        sentenceList.add("Good Words3")
        sentenceList.add("Good Words4")
        sentenceList.add("Good Words5")
        sentenceList.add("Good Words6")
        sentenceList.add("Good Words7")

        Log.e("MainActivity",sentenceList.random())


        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.showAllSentenceBtn.setOnClickListener{
            val intent = Intent(this,SentenceActivity::class.java)
            startActivity(intent)
        }

        binding.GoodWordsTextArea.setText(sentenceList.random())
    }
}