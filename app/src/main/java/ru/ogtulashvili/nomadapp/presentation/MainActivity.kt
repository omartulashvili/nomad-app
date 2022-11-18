package ru.ogtulashvili.nomadapp.presentation

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import ru.ogtulashvili.nomadapp.R
import ru.ogtulashvili.nomadapp.domain.GetSomeArticle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        @SuppressLint("SetTextI18n")
        fun articleView(){
            val tvArticle = tv_some_article
            val getSomeArticle = GetSomeArticle()

            tvArticle.text = "Read it: $getSomeArticle"
        }
        return articleView()
    }
}