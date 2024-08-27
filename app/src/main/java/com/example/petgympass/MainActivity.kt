package com.example.petgympass

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.petgympass.ui.theme.PETGympassTheme
import com.example.petgympass.ui.theme.LoginScreen
import com.example.petgympass.ui.theme.DetailsScreen
import com.example.petgympass.ui.theme.RegisterScreen

class MainActivity : ComponentActivity() { // Alterado de AppCompatActivity para ComponentActivity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            PETGympassTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AppNavHost()
                }
            }
        }
    }
}

@Composable
fun AppNavHost() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "login") {
        composable("login") { LoginScreen(navController) }
        composable("register") { RegisterScreen(navController) }
        composable("details") { DetailsScreen() }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PETGympassTheme {
        AppNavHost()
    }
}
