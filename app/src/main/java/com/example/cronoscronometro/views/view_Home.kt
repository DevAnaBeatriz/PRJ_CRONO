package com.example.cronoscronometro.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.cronoscronometro.R
import com.example.cronoscronometro.components.FloatButton
import com.example.cronoscronometro.components.TituloHome
import com.example.cronoscronometro.components.formatTiempo
import com.example.cronoscronometro.viewModels.CronosViewModel
import me.saket.swipe.SwipeAction
import me.saket.swipe.SwipeableActionsBox
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeView(navController: NavHostController, cronosVM: CronosViewModel) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { TituloHome(title = "Cronos Cronômetro") },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = (Color(color = 0xFF1A1C1D))
                )
            )
        },
        floatingActionButton = {
            FloatButton {
                navController.navigate("AddView")
            }
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
    ) {
        ContentHomeView(it, navController, cronosVM)
    }
}
@Composable
fun ContentHomeView(it: PaddingValues, navController: NavController, cronosVM: CronosViewModel) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        // Imagem de fundo
        Image(
            painter = painterResource(id = R.drawable.fundo),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        Column(
            modifier = Modifier
                .padding(it)
        ) {
            val cronosList by cronosVM.cronosList.collectAsState()
            if (cronosList.isEmpty()) {
                SemRecordsCard()
            } else {
                LazyColumn {
                    items(cronosList) { item ->
                        val delete = SwipeAction(
                            icon = rememberVectorPainter(Icons.Default.Delete),
                            background = (Color(color = 0xFFf3ffeb)),
                            onSwipe = { cronosVM.deleteCrono(item) }
                        )
                        SwipeableActionsBox(endActions = listOf(delete), swipeThreshold = 270.dp) {
                            CronCard(
                                titulo = item.title,
                                crono = formatTiempo(item.crono),
                                onDelete = {

                                    cronosVM.deleteCrono(item)
                                },
                                onEdit = {
                                    navController.navigate("EditView/${item.id}")
                                }
                            )
                            Spacer(modifier = Modifier.height(8.dp))
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun SemRecordsCard() {
    Box(
        modifier = Modifier
            .padding(16.dp)
            .background(Color(0xFF1A1C1D), shape = RoundedCornerShape(16.dp))
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            // Mensagem informativa
            Text(
                text = "Nenhum registro de tempo encontrado... ",
                color = Color.White,
                textAlign = TextAlign.Start,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(20.dp))
            // Ícone de alerta
            Image(
                painter = painterResource(id = R.drawable.sobre), // Substitua pelo seu ícone de alerta
                contentDescription = "Alerta",
                modifier = Modifier
                    .size(46.dp)
            )


        }
    }
}




@Composable
fun CronCard(titulo: String, crono: String,  onDelete: () -> Unit, onEdit: () -> Unit) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .border(
                width = 8.dp,
                color = (Color(color = 0xFF1A1C1D)),
                shape = RoundedCornerShape(5.dp)
            )
            .background(color = Color(0xFF87CEEB), shape = RoundedCornerShape(12.dp)) // Alterei a cor de fundo para azul claro
    ) {
        Column(
            modifier = Modifier
                .background(color = Color.White, shape = RoundedCornerShape(12.dp))
                .padding(16.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                // Ícone sobre o título
                Image(
                    painter = painterResource(id = R.drawable.sobre), // Substitua pelo seu ícone
                    contentDescription = null,
                    modifier = Modifier.size(24.dp)
                )
                // Título
                Text(
                    text = titulo,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.DarkGray,
                    modifier = Modifier.weight(1f)
                )
                // Ícone de lápis
                IconButton(
                    onClick = onEdit,
                    modifier = Modifier.size(24.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.lapis), // Substitua pelo seu ícone
                        contentDescription = "Editar",
                    )
                }

                // Ícone de lixeira
                IconButton(
                    onClick = onDelete,
                    modifier = Modifier.size(24.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.lixo), // Substitua pelo seu ícone
                        contentDescription = "Excluir",
                    )
                }
            }

            Divider(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(1.dp),
                thickness = 2.dp,
                color = Color(color = 0xFF1A1C1D)
            )

            Spacer(modifier = Modifier.height(8.dp))

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.relogio),
                    contentDescription = null,
                    modifier = Modifier.size(24.dp)
                )
                Text(text = crono, fontSize = 20.sp, color = Color.DarkGray)
            }
        }
    }
}
