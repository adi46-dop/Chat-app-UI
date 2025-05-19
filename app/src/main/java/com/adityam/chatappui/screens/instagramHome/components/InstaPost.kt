package com.adityam.chatappui.screens.instagramHome.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.FontWeight.Companion.W600
import androidx.compose.ui.text.font.FontWeight.Companion.W700
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.adityam.chatappui.R
import com.adityam.chatappui.components.AppIcon
import com.adityam.chatappui.components.AppImage
import com.adityam.chatappui.components.AppText
import com.adityam.chatappui.ui.theme.blue_38
import com.adityam.chatappui.ui.theme.gray_99
import com.adityam.chatappui.ui.theme.gray_f9
import com.adityam.chatappui.ui.theme.interFont

@Composable
fun InstaUserProfile(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .padding(horizontal = 16.dp)
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(10.dp),
            modifier = Modifier.weight(1f)
        ) {
            AppIcon(iconId = R.drawable.photo, modifier = modifier.size(32.dp))
            Column {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(5.dp)
                ) {
                    AppText(text = "Aditya", style = TextStyle(
                        color = gray_f9,
                        fontFamily = interFont,
                        fontWeight = W600,
                        fontSize = 13.sp
                    ))

                    AppIcon(iconId = R.drawable.blue_tick, modifier = modifier.size(9.dp))
                }
                AppText(text = "Pauni, Maharashtra", style = TextStyle(
                    color = gray_f9,
                    fontFamily = interFont,
                    fontWeight = FontWeight.W400,
                    fontSize = 11.sp
                ))
            }
        }
        AppIcon(iconId = R.drawable.more)
    }

}

@Composable
fun PostContentRow(
    modifier: Modifier = Modifier,
    pagerState: PagerState
) {
    HorizontalPager(
        modifier = modifier,
        state = pagerState
    ) {
        AppImage(image = R.drawable.post, modifier = Modifier.fillMaxWidth())
    }
}

@Composable
fun InstaPostAction(
    modifier: Modifier = Modifier,
    pagerState: PagerState
) {
    Row(
        modifier = modifier
            .padding(horizontal = 16.dp)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            AppIcon(iconId = R.drawable.like)
            AppIcon(iconId = R.drawable.message)
            AppIcon(iconId = R.drawable.share)
        }
        Row(
            horizontalArrangement = Arrangement.spacedBy(5.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            repeat(pagerState.pageCount) {
                Spacer(
                    modifier = Modifier
                        .background(
                            color = if (pagerState.currentPage == it) blue_38 else gray_f9,
                            shape = CircleShape
                        )
                        .size(8.dp)
                )
            }
        }
        AppIcon(iconId = R.drawable.bookmark)

    }
}

@Composable
fun InstaPostDescription(modifier: Modifier = Modifier) {

    val text = buildAnnotatedString {
        withStyle(
            style = SpanStyle(
                fontSize = 13.sp,
                fontFamily = interFont,
                color = gray_f9,
                fontWeight = FontWeight.W400
            )
        ) {
            append("Liked by")
        }
        append(" ")
        withStyle(
            style = SpanStyle(
                fontSize = 13.sp,
                fontFamily = interFont,
                color = gray_f9,
                fontWeight = FontWeight.W600
            )
        ) {
            append("craig_love")
        }
        append(" ")
        withStyle(
            style = SpanStyle(
                fontSize = 13.sp,
                fontFamily = interFont,
                color = gray_f9,
                fontWeight = FontWeight.W400
            )
        ) {
            append("and")
        }
        append(" ")
        withStyle(
            style = SpanStyle(
                fontSize = 13.sp,
                fontFamily = interFont,
                color = gray_f9,
                fontWeight = FontWeight.W600
            )
        ) {
            append("44,444")
        }
        append(" ")
        withStyle(
            style = SpanStyle(
                fontSize = 13.sp,
                fontFamily = interFont,
                color = gray_f9,
                fontWeight = FontWeight.W400
            )
        ) {
            append("others")
        }
    }

    val comment = buildAnnotatedString {
        withStyle(
            style = SpanStyle(
                fontSize = 13.sp,
                fontFamily = interFont,
                color = gray_f9,
                fontWeight = FontWeight.W600
            )
        ) {
            append("joshua_i")
        }
        append(" ")
        withStyle(
            style = SpanStyle(
                fontSize = 13.sp,
                fontFamily = interFont,
                color = gray_f9,
                fontWeight = FontWeight.W400
            )
        ) {
            append("The game in Pauni was amazing and I want to share some photos")
        }
    }

    Column(
        modifier = modifier.padding(horizontal = 16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            AppIcon(
                modifier = Modifier.size(17.dp),
                iconId = R.drawable.photo_2
            )
            Text(text)
        }
        Text(comment)
        AppText(
            text = "September 20", style = TextStyle(
                color = gray_99,
                fontSize = 11.sp,
                fontFamily = interFont,
                fontWeight = FontWeight.W400
            )
        )
    }

}
@Composable
fun InstagramProfileRow(modifier: Modifier = Modifier) {
    val pager = rememberPagerState(
        initialPage = 0
    ) {
        3
    }
    Column(
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        InstaUserProfile()
        PostContentRow(pagerState = pager)
        InstaPostAction(pagerState = pager)
        InstaPostDescription()
    }
}

fun LazyListScope.postListItem() {
    items(10) {
        InstagramProfileRow()
    }
}
