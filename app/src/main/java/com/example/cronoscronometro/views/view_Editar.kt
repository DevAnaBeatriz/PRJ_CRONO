package com.example.cronoscronometro.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box

import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.cronoscronometro.R
import com.example.cronoscronometro.components.CircleButton
import com.example.cronoscronometro.components.MainIconButton
import com.example.cronoscronometro.components.Label
import com.example.cronoscronometro.components.TituloHome
import com.example.cronoscronometro.components.formatTiempo
import com.example.cronoscronometro.model.Cronos
import com.example.cronoscronometro.viewModels.CronometroViewModel
import com.example.cronoscronometro.viewModels.CronosViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EditarView(
    navController: NavHostController,
    cronometroVM: CronometroViewModel,
    cronosVM: CronosViewModel,
    id: Long,
) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { TituloHome(title = "Alterar Cronômetro") },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = (Color(color = 0xFF1A1C1D))
                ),
                navigationIcon = {
                    MainIconButton(icon = Icons.Default.ArrowBack) {
                        navController.popBackStack()
                    }
                }
            )
        },
        bottomBar = {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(48.dp)
                    .background(Color(0xFF1A1C1D))
            ) {
                Text(
                    text = "Desenvolvido por Ana Beatriz Martins Batista",
                    color = Color.White,
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp),
                    textAlign = TextAlign.Center,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    ) { it ->
        ContentEditView(it, navController, cronometroVM, cronosVM, id)
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ContentEditView(
    it: PaddingValues,
    navController: NavController,
    cronometroVM: CronometroViewModel,
    cronosVM: CronosViewModel,
    id: Long,
) {

    val state = cronometroVM.state

    LaunchedEffect(state.cronometroActivo) {
        cronometroVM.cronos()
    }

    LaunchedEffect(Unit) {
        cronometroVM.getCronoById(id)
    }

    Spacer(modifier = Modifier.height(30.dp))

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {
        // Imagem de fundo
        Image(
            painter = painterResource(id = R.drawable.texturafundo), // Substitua pelo ID real da sua imagem de fundo
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        Column(
            modifier = Modifier
                .padding(it)
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Text(
                text = formatTiempo(cronometroVM.tiempo),
                fontSize = 50.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )

            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.padding(vertical = 16.dp)
            ) {
                // iniciar
                CircleButton(
                    icon = painterResource(id = R.drawable.play),
                    enabled = !state.cronometroActivo
                ) {
                    cronometroVM.iniciar()
                }
                // pausar
                CircleButton(
                    icon = painterResource(id = R.drawable.pause),
                    enabled = state.cronometroActivo
                ) {
                    cronometroVM.pausar()
                }
            }
            Label(
                value = state.title,
                onValueChange = { cronometroVM.onValue(it) },
                label = "Nome do Cronômetro"
            )
            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.padding(vertical = 16.dp)
            ) {
                Button(
                    modifier = Modifier.padding(end = 8.dp), // Adiciona um espaçamento à direita do botão
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF1A1C1D),
                        contentColor = Color.White
                    ),
                    onClick = {
                        cronosVM.updateCrono(
                            Cronos(
                                id = id,
                                title = state.title,
                                crono = cronometroVM.tiempo
                            )
                        )

                        navController.popBackStack()
                    }
                ) {
                    Text(text = "Editar")
                }


            }
            DisposableEffect(Unit) {
                onDispose {
                    cronometroVM.detener()
                }
            }
        }
    }
}
