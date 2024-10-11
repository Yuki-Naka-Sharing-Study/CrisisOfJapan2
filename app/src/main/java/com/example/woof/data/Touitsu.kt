package com.example.woof.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.woof.R

data class Touitsu(
    @DrawableRes val imageResourceId: Int,
    @StringRes val name: Int,
    @StringRes val hobbies: Int
)

val touitsus = listOf(
    Touitsu(R.drawable.sinzo_abe, R.string.touitsu_name_abe, R.string.touitsu_description_abe),
    Touitsu(R.drawable.kouichi_hagiuda, R.string.touitsu_name_ogiuda, R.string.touitsu_description_ogiuda),
    Touitsu(R.drawable.takayuki_kobayashi, R.string.touitsu_name_kobayashi, R.string.touitsu_description_kobayashi),
    Touitsu(R.drawable.katsunobu_katou, R.string.touitsu_name_katou, R.string.touitsu_description_katou),
    Touitsu(R.drawable.shigeru_ishiba, R.string.touitsu_name_ishiba, R.string.touitsu_description_ishiba),
    Touitsu(R.drawable.tsuneo_kitamura, R.string.touitsu_name_kitamura, R.string.touitsu_description_kitamura),
    Touitsu(R.drawable.masahiko_koumura, R.string.touitsu_name_koumura, R.string.touitsu_description_koumura),
    Touitsu(R.drawable.kuniko_inoguchi, R.string.touitsu_name_inoguchi, R.string.touitsu_description_inoguchi),
    Touitsu(R.drawable.hiroaki_saitou, R.string.touitsu_name_saitou, R.string.touitsu_description_saitou),
)
