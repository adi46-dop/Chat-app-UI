package com.adityam.chatappui.screens.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.adityam.chatappui.R
import com.adityam.chatappui.components.AppIcon
import com.adityam.chatappui.components.AppText
import com.adityam.chatappui.ui.theme.gray_f8
import com.adityam.chatappui.ui.theme.interFont
import com.adityam.chatappui.ui.theme.violet_a4

@Composable
fun ChartSearchBar(modifier: Modifier = Modifier) {

    var search by remember { mutableStateOf("") }
    BasicTextField(
        value = search,
        onValueChange = {
            search = it
        },
        modifier = modifier.padding(horizontal = 24.dp),
    ) {
        Row(
            modifier = Modifier.border(1.dp, violet_a4)
                .background(
                    color = gray_f8,
                    shape = CircleShape
                )
                .padding(start = 16.dp)
                .fillMaxWidth()
                .height(48.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            AppIcon(iconId = R.drawable.search, modifier = Modifier.size(22.dp))
            Box {
                if(search.isEmpty()) {
                    AppText(
                        text = stringResource(R.string.search),
                        style = TextStyle(
                            fontSize = 13.sp,
                            fontFamily = interFont,
                            fontWeight = FontWeight.W500,
                            color = violet_a4
                        )
                    )
                }
                it.invoke()
            }
        }
    }
}