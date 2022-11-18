package ru.ogtulashvili.nomadapp.data

import ru.ogtulashvili.nomadapp.domain.models.ArticleName


fun listArticlesImplementation() {

    val listArticles = setOf<ArticleName>(
        ArticleName(
            articleName = "FirstArticle",
            articleURL = "google.ru"
        ),
        ArticleName(
            articleName = "SecondArticle",
            articleURL = "yandex.ru"
        ),
        ArticleName(
            articleName = "ThirdArticle",
            articleURL = "yahoo.com"
        )
    )
    val listArticlesRandom = listArticles.random()
}
