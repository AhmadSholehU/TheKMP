package com.overdevx.thekmp.presentation.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import cafe.adriel.voyager.navigator.tab.Tab
import cafe.adriel.voyager.navigator.tab.TabOptions
import com.overdevx.thekmp.presentation.screens.HomeScreen
import com.overdevx.thekmp.presentation.screens.ProfileScreen
import com.overdevx.thekmp.presentation.screens.ProjectsScreen
import com.overdevx.thekmp.presentation.screens.ScheduleScreen

object HomeTab : Tab {
    override val options: TabOptions
        @Composable
        get() {
            val title = "Home"
            val icon = rememberVectorPainter(Icons.Default.Home)
            return remember { TabOptions(index = 0u, title = title, icon = icon) }
        }

    @Composable
    override fun Content() {
        HomeScreen() // Nanti kita hubungkan ke layar sebenarnya
    }
}

object ScheduleTab : Tab {
    override val options: TabOptions
        @Composable
        get() {
            val title = "Schedule"
            val icon = rememberVectorPainter(Icons.Default.DateRange)
            return remember { TabOptions(index = 1u, title = title, icon = icon) }
        }

    @Composable
    override fun Content() {
        ScheduleScreen()
    }
}

object ProjectsTab : Tab {
    override val options: TabOptions
        @Composable
        get() {
            val title = "Projects"
            val icon = rememberVectorPainter(Icons.Default.List)
            return remember { TabOptions(index = 2u, title = title, icon = icon) }
        }

    @Composable
    override fun Content() {
        ProjectsScreen()
    }
}

object ProfileTab : Tab {
    override val options: TabOptions
        @Composable
        get() {
            val title = "Profile"
            val icon = rememberVectorPainter(Icons.Default.AccountCircle)
            return remember { TabOptions(index = 3u, title = title, icon = icon) }
        }

    @Composable
    override fun Content() {
        ProfileScreen()
    }
}