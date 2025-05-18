package com.adityam.chatappui.components

import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import com.adityam.chatappui.ui.theme.interFont

/**
 * A reusable composable function for displaying styled text using a consistent font and styling.
 *
 * This function wraps Jetpack Compose's [Text] composable and applies a default font family
 * and font weight while still allowing customization through the [style] parameter.
 *
 * @param modifier Modifier to be applied to the text layout. Defaults to [Modifier].
 * @param text The string value to be displayed.
 * @param style A [TextStyle] that defines the text's appearance.
 *              Note: The color, fontFamily, and fontWeight will be overridden with defaults.
 */

@Composable
fun AppText(
    modifier: Modifier = Modifier,
    text: String,
    style: TextStyle = LocalTextStyle.current.copy(
        color = Color.Black,
        fontFamily = interFont,
        fontWeight = FontWeight.W400
    )
) {
    Text(
        text = text,
        modifier = modifier,
        style = style
    )
}