package com.adityam.chatappui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.adaptive.currentWindowAdaptiveInfo
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import com.adityam.chatappui.screens.chatui.ui.ChatUIScreen
import com.adityam.chatappui.screens.instagramHome.ui.InstagramHomeScreen
import com.adityam.chatappui.ui.theme.ChatAppUiTheme
import com.adityam.chatappui.ui.theme.gray_12

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge(
            statusBarStyle = SystemBarStyle.auto(gray_12.toArgb(),gray_12.toArgb()),
            navigationBarStyle = SystemBarStyle.auto(gray_12.toArgb(),gray_12.toArgb())
        )
        setContent {
            val windowSize = currentWindowAdaptiveInfo().windowSizeClass
            val deviceConfiguration = DeviceConfiguration.fromWindowSizeClass(windowSize)
            when(deviceConfiguration) {
                DeviceConfiguration.MOBILE_PORTRAIT -> TODO()
                DeviceConfiguration.MOBILE_LANDSCAPE -> TODO()
                DeviceConfiguration.TABLET_PORTRAIT -> TODO()
                DeviceConfiguration.TABLET_LANDSCAPE -> TODO()
                DeviceConfiguration.DESKTOP -> TODO()
            }
            
            ChatAppUiTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ChatUIScreen(modifier = Modifier
                        .background(Color.White)
                        .padding(innerPadding)
                    )
//                    InstagramHomeScreen(modifier = Modifier.background(gray_12).padding(innerPadding))
                }
            }
        }
    }
}