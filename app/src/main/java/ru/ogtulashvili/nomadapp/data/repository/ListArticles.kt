package ru.ogtulashvili.nomadapp.data.repository

import ru.ogtulashvili.nomadapp.domain.models.ArticleName

class ListArticles (){

    val listArticles = listOf(
        ArticleName(
            name = "First",
            url = "google.ru"
        ),
        ArticleName(
            name = "Second",
            url = "yandex.ru"
        ),
        ArticleName(
            name = "Third",
            url = "yahoo.com"
        )
    )
    @JvmName("getListArticles1")
    fun getListArticles(): List<ArticleName> {
        return listArticles
    }
}