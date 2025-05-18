package com.adityam.chatappui.screens.domain

import androidx.annotation.DrawableRes
import com.adityam.chatappui.R

data class Story(
    val id: Int,
    val name: String,
    @DrawableRes val image: Int,
)

val storyData = listOf(
    Story(1, "David", R.drawable.photo),
    Story(2, "Emily", R.drawable.photo_2),
    Story(3, "Michael", R.drawable.photo_3),
    Story(4, "Sarah", R.drawable.photo_4),
    Story(5, "David", R.drawable.photo_5),
    Story(6, "Emily", R.drawable.photo_6),
    Story(7, "Michael", R.drawable.photo_5),
    Story(8, "Sarah", R.drawable.photo_2),
)
