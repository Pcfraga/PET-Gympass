package com.example.petgympass.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter

@Composable
fun DetailsScreen() {
    val serviceProvider = ServiceProvider(
        id = 1,
        name = "Prestador de Serviço",
        description = "Descrição detalhada do serviço.",
        address = "Endereço do prestador.",
        images = listOf("url_to_image1", "url_to_image2"),
        code = "CODIGO_UNICO"
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(text = serviceProvider.name, style = MaterialTheme.typography.headlineMedium)
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = serviceProvider.description)
        Spacer(modifier = Modifier.height(16.dp))
        ImageCarousel(images = serviceProvider.images)
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Endereço: ${serviceProvider.address}")
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "Código de uso: ${serviceProvider.code}")
    }
}

@Composable
fun ImageCarousel(images: List<String>) {
    LazyRow {
        items(images) { imageUrl ->
            Image(
                painter = rememberImagePainter(imageUrl),
                contentDescription = null,
                modifier = Modifier
                    .size(100.dp)
                    .padding(4.dp)
            )
        }
    }
}

