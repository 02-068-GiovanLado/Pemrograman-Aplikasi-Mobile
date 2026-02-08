package org.example.giovanlado

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun App() {
    MaterialTheme {
        var showContent by remember {
            mutableStateOf(false)
        }

        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // 1. Ubah teks menjadi "Halo, [Nama Anda]!"
            Text("Halo, Giovan Lado!")

            // 2. Tambahkan NIM di bawah nama
            Text("NIM: 123140068")  // ← GANTI dengan NIM Anda

            // 3. Tampilkan nama platform
            Text("Platform: Desktop")  // Atau "Desktop" jika run di desktop

            Button(
                onClick = { showContent = !showContent }
            ) {
                Text("Click me!")
            }

            AnimatedVisibility(showContent) {
                Text("Kamu klik tombolnya!")
            }
        }
    }
}