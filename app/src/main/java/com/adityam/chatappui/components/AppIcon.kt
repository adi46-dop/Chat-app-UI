package com.adityam.chatappui.components

import androidx.annotation.DrawableRes
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource

/**
 * A composable function that displays an icon.
 *
 * This function can display an icon from either a drawable resource or an ImageVector.
 * If both `iconId` and `imageVector` are provided, `iconId` will take precedence.
 * If neither is provided, nothing will be displayed.
 *
 * @param modifier Optional [Modifier] for this icon.
 * @param iconId Optional resource ID of a drawable to be used as the icon.
 * @param imageVector Optional [ImageVector] to be used as the icon.
 * @param tint Optional [Color] to apply to the icon. If [Color.Unspecified] is provided,
 *             the icon will be displayed with its intrinsic color.
 */
@Composable
fun AppIcon(
    modifier: Modifier = Modifier,
    @DrawableRes iconId: Int? = null,
    imageVector: ImageVector? = null,
    tint: Color = Color.Unspecified
) {

    iconId?.let {
        Icon(
            painter = painterResource(id = iconId),
            contentDescription = null,
            modifier = modifier,
            tint = tint
        )
    }
    imageVector?.let {
        Icon(
            imageVector = imageVector,
            contentDescription = null,
            modifier = modifier,
            tint = tint
        )
    }

}