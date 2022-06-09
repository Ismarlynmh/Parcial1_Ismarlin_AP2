package com.mendozacreations.parcial1_ismarlin_ap2
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint
import com.mendozacreations.parcial1_ismarlin_ap2.utils.Screen
import com.mendozacreations.parcial1_ismarlin_ap2.ui.theme.Parcial1_Ismarlin_AP2Theme
import com.mendozacreations.parcial1_ismarlin_ap2.ui.Prestamos.ConsultaPrestamoScreen
import com.mendozacreations.parcial1_ismarlin_ap2.ui.Prestamos.RegistroPrestamoScreen

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Parcial1_Ismarlin_AP2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MyApp()
                }
            }
        }
    }
}

@Composable
fun MyApp() {
    val navHostController = rememberNavController()

    NavHost(navController = navHostController, startDestination = Screen.ConsultaScreen.route){
        composable(Screen.ConsultaScreen.route){
            ConsultaPrestamoScreen(navHostController = navHostController)
        }
        composable(Screen.RegistroScreen.route){
            RegistroPrestamoScreen(navHostController = navHostController)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Parcial1_Ismarlin_AP2Theme {
        MyApp()
    }
}

