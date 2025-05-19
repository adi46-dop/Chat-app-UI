package com.adityam.chatappui.screens.instagramHome.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.adityam.chatappui.R
import com.adityam.chatappui.components.AppIcon
import com.adityam.chatappui.ui.theme.gray_12


@Composable
fun InstagramHomeHeader(
    modifier: Modifier = Modifier
) {

    Row(
        modifier = modifier
            .background(gray_12)
            .padding(16.dp)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        AppIcon(
            iconId = R.drawable.camera_icon, modifier = Modifier.size(22.dp)
        )
        AppIcon(
            iconId = R.drawable.instagram_logo
        )

        Row(
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            AppIcon(
                iconId = R.drawable.igtv, modifier = Modifier.size(22.dp)
            )
            AppIcon(
                iconId = R.drawable.share, modifier = Modifier.size(22.dp)
            )
        }

    }

}