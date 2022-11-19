package ru.ogtulashvili.nomadapp.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import ru.ogtulashvili.nomadapp.R
import ru.ogtulashvili.nomadapp.data.repository.ListArticles

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewArticles = ListArticles()

        btn_give_article.setOnClickListener {

            val randomNumber = (0..2).random()
            val randomArticleName = viewArticles.listArticles[randomNumber].name
            val randomArticleUrl = viewArticles.listArticles[randomNumber].url

            tv_some_article.text = "Read: $randomArticleName $randomArticleUrl"
        }
    }
}