package com.adityam.chatappui.components

import androidx.annotation.DrawableRes
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector

@Composable
fun AppIconButton(
    modifier: Modifier = Modifier,
    @DrawableRes iconId: Int? = null,
    imageVector: ImageVector? = null,
    tint: Color = Color.Unspecified,
    onClick: () -> Unit
) {
    iconId?.let {
        IconButton(
            onClick = onClick,
            modifier = Modifier
        ) {
            AppIcon(iconId = iconId, tint = tint)
        }
    }
    imageVector?.let {
        IconButton(onClick = onClick, modifier = Modifier) {
            AppIcon(imageVector = imageVector, tint = tint)
        }
    }
}