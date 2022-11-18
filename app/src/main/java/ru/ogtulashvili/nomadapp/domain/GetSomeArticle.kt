package ru.ogtulashvili.nomadapp.domain

import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import ru.ogtulashvili.nomadapp.data.listArticlesImplementation


class GetSomeArticle : AppCompatActivity() {
    fun getSomeArticle() {
        btn_give_article.setOnClickListener {
            listArticlesImplementation()
        }
    }
}