package com.adityam.chatappui.screens.instagramHome.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.adityam.chatappui.screens.instagramHome.components.InstaLine
import com.adityam.chatappui.screens.instagramHome.components.InstaUserProfile
import com.adityam.chatappui.screens.instagramHome.components.InstagramHomeHeader
import com.adityam.chatappui.screens.instagramHome.components.InstagramHomeRow
import com.adityam.chatappui.screens.instagramHome.components.instaStoriesListItem
import com.adityam.chatappui.screens.instagramHome.components.postListItem

@Composable
fun InstagramHomeScreen(modifier: Modifier = Modifier) {
    InstagramHomeRow(
        modifier = modifier,
        header = {
            InstagramHomeHeader()
        },
        stories = {
            instaStoriesListItem()
        },
        line = {
            InstaLine()
        },
        posts = {
            postListItem()
        }
    )
}