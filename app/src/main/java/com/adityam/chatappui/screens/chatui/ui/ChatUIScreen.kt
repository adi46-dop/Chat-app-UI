package com.adityam.chatappui.screens.chatui.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.adityam.chatappui.screens.chatui.components.ChartSearchBar
import com.adityam.chatappui.screens.chatui.components.ChatHeader
import com.adityam.chatappui.screens.chatui.components.ChatLine
import com.adityam.chatappui.screens.chatui.components.ChatRow
import com.adityam.chatappui.screens.chatui.components.chatStoryList
import com.adityam.chatappui.screens.chatui.components.chattingList

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