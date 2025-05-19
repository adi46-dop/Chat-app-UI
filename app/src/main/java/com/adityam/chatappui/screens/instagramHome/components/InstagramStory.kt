package com.adityam.chatappui.screens.instagramHome.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.adityam.chatappui.components.AppIcon
import com.adityam.chatappui.components.AppText
import com.adityam.chatappui.screens.instagramHome.domain.Story
import com.adityam.chatappui.screens.instagramHome.domain.instagramStories
import com.adityam.chatappui.ui.theme.gray_f9
import com.adityam.chatappui.ui.theme.interFont
import com.adityam.chatappui.ui.theme.story_gradient


@Composable
fun InstagramStory(
    modifier: Modifier = Modifier,
    data: Story
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(5.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        AppIcon(
            iconId = data.icon,
            modifier = modifier.size(56.dp)
                .drawBehind {
                    drawCircle(
                        brush = story_gradient,
                        style = Stroke(width = 2.dp.toPx()),
                    )
                }
                .padding(3.dp)
        )
        AppText(text = data.name, style = TextStyle(
            color = gray_f9,
            fontFamily = interFont,
            fontWeight = FontWeight.W400
        ))
    }
}

fun LazyListScope.instaStoriesListItem() {
    items(instagramStories, key = { it.id }) {
        InstagramStory(data = it)
    }
}