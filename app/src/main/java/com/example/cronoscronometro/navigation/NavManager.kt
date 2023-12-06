package com.example.cronoscronometro.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.cronoscronometro.viewModels.CronometroViewModel
import com.example.cronoscronometro.viewModels.CronosViewModel
import com.example.cronoscronometro.views.AdicionarView
import com.example.cronoscronometro.views.EditarView
import com.example.cronoscronometro.views.HomeView

@Composable
fun NavManager(cronometroVM: CronometroViewModel, cronosVM: CronosViewModel){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "Home"){
        composable("Home"){
            HomeView(navController, cronosVM)
        }

        composable("AddView"){
            AdicionarView(navController, cronometroVM, cronosVM)
        }

        composable("EditView/{id}", arguments = listOf(
            navArgument("id") { type = NavType.LongType }
        )){
            val id = it.arguments?.getLong("id") ?: 0
            EditarView(navController, cronometroVM, cronosVM, id)
        }
    }
}