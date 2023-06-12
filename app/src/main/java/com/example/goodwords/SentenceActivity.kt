package com.example.goodwords

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class SentenceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sentence)

        val sentenceList = mutableListOf<String>()
        sentenceList.add("Good Words1")
        sentenceList.add("Good Words2")
        sentenceList.add("Good Words3")
        sentenceList.add("Good Words4")
        sentenceList.add("Good Words5")
        sentenceList.add("Good Words6")
        sentenceList.add("Good Words7")
        val sentenceAdapter = ListViewAdapter(sentenceList)
        val listview = findViewById<ListView>(R.id.sentenceListView)

        listview.adapter = sentenceAdapter

    }
}