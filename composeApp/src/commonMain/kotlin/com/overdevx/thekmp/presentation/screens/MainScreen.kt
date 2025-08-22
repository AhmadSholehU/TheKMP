package com.overdevx.thekmp.presentation.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.tab.CurrentTab
import cafe.adriel.voyager.navigator.tab.TabNavigator
import com.overdevx.thekmp.presentation.navigation.HomeTab
import com.overdevx.thekmp.presentation.navigation.ProfileTab
import com.overdevx.thekmp.presentation.navigation.ProjectsTab
import com.overdevx.thekmp.presentation.navigation.ScheduleTab

object MainScreen : Screen {
    @Composable
    override fun Content() {
        val tabs = listOf(HomeTab, ScheduleTab, ProjectsTab, ProfileTab)

        TabNavigator(HomeTab) { tabNavigator ->
            Scaffold(
                content = { padding ->
                    Box(modifier = Modifier.padding(padding)) {
                        CurrentTab() // Menampilkan konten tab yang sedang aktif
                    }
                },
                bottomBar = {
                    NavigationBar {
                        tabs.forEach { tab ->
                            NavigationBarItem(
                                selected = tabNavigator.current == tab,
                                onClick = { tabNavigator.current = tab },
                                icon = {
                                    tab.options.icon?.let { painter ->
                                        Icon(painter, contentDescription = tab.options.title)
                                    }
                                },
                                label = { Text(tab.options.title) }
                            )
                        }
                    }
                },
                floatingActionButton = {
                    FloatingActionButton(
                        onClick = {

                        }
                    ) {
                        Icon(Icons.Default.Add, contentDescription = "Add Task")
                    }
                }
            )
        }
    }
}