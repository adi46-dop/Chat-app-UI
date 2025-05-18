package com.adityam.chatappui.screens.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.adityam.chatappui.screens.components.ChartSearchBar
import com.adityam.chatappui.screens.components.ChatHeader
import com.adityam.chatappui.screens.components.ChatLine
import com.adityam.chatappui.screens.components.ChatRow
import com.adityam.chatappui.screens.components.chatStoryList
import com.adityam.chatappui.screens.components.chattingList

@Composable
fun ChatUIScreen(
    modifier: Modifier = Modifier
) {
    ChatRow(
        modifier = modifier,
        header = { ChatHeader() },
        searchBar = { ChartSearchBar() },
        stories = { chatStoryList() },
        line = { ChatLine() },
        chats = { chattingList() }
    )
}