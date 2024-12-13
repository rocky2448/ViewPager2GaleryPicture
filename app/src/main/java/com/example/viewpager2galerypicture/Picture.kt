package com.example.viewpager2galerypicture

import java.io.Serializable

class Picture(
    val title: String,
    val imageView: Int,
    val author: String
) : Serializable {

    companion object {
        val viewPagerList = mutableListOf(
            Picture(
                "Мона Лиза", (R.drawable.mona_lisa), "Леонардо да Винчи"),
            Picture(
                "Свобода ведущая народ", (R.drawable.egen_delacrua_svoboda), "Эжен Делакруа"),
            Picture(
                "Девятый вал", (R.drawable.ayvazovsky_devatiy_val), "Иван Айвазовский"),
            Picture(
                "Похищение Прозепины", (R.drawable.allori_pohishenie_prozepini), "Аллори Алессандро"),
            Picture(
                "Композиция VIII", (R.drawable.kandinsky_compozitsia_viii), "Василий Кандинский"),
            Picture(
                "Клятва Горациев", (R.drawable.david_klyatva_goraziev), "Жак-Луи Давид"),
            Picture(
                "Отдых на пути в Египет", (R.drawable.karavago_otdih_na_egipet), "Караваджо"),
            Picture(
                "Похищение Орфии Бореем", (R.drawable.rubens_pohishenie), "Питер Пауль Рубенс"),
            Picture(
                "Рождение Венеры", (R.drawable.bottichelli_rogdenie_veneri), "Сандро Боттичелли"),
            Picture(
                "Акколада", (R.drawable.leyton_agolada), "Эдмунд Лейтон")
        )
    }
}