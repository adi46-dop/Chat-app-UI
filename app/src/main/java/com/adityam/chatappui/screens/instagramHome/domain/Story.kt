package com.adityam.chatappui.screens.instagramHome.domain

import androidx.annotation.DrawableRes
import com.adityam.chatappui.R

data class Story(
    val id: Int,
    val name: String,
    @DrawableRes val icon: Int,
)

val instagramStories = listOf(
    Story(1, "David", R.drawable.photo_2),
    Story(2, "Ravi", R.drawable.photo_3),
    Story(3, "Aditya", R.drawable.photo_4),
    Story(4, "David", R.drawable.photo_5),
    Story(5, "Ravi", R.drawable.photo_6),
    Story(6, "Aditya", R.drawable.photo),
    )
