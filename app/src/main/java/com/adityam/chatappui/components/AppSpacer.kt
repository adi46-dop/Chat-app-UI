package com.adityam.chatappui.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SpacerWidth(
    width: Int = 10
) {
    Spacer(modifier = Modifier.width(width.dp))
}

@Composable
fun SpacerHeight(
    height: Int = 10
) {
    Spacer(modifier = Modifier.width(height.dp))
}

