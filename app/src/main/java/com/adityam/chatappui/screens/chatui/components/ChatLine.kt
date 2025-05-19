package com.adityam.chatappui.screens.chatui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.adityam.chatappui.ui.theme.line_gradient

@Composable
fun ChatLine(modifier: Modifier = Modifier) {

    Spacer(
        modifier = Modifier
            .background(
                brush = line_gradient
            )
            .fillMaxWidth()
            .height(1.7.dp)
    )

}