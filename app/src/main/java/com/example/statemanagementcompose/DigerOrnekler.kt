package com.example.statemanagementcompose

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.painter.ColorPainter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.statemanagementcompose.ui.theme.StateManagementComposeTheme

@Composable
fun DigerOrnekler() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        var kullanıcıGirdisi = remember{ mutableStateOf("") }
        var textdegeri = remember { mutableStateOf("Merhaba android") }

        Image(bitmap = ImageBitmap.imageResource(id = R.drawable.paycell),
            contentDescription = "paycell logosu",
            modifier = Modifier.size(250.dp, 200.dp)
        )
        Spacer(modifier = Modifier.padding(10.dp))

        TextField(value = kullanıcıGirdisi.value, onValueChange = {
            kullanıcıGirdisi.value = it
            println(it)
        }, placeholder = {
            Text("Yaşınızı Giriniz!")
        })

        Spacer(modifier = Modifier.padding(10.dp))

        Text(text = textdegeri.value)

        Spacer(modifier = Modifier.padding(10.dp))

        Button(onClick = {
            textdegeri.value = "Merhaba Semi"
        }, enabled = true) {
            Text(text = "Örnek Buton")
        }

        Spacer(modifier = Modifier.padding(10.dp))

        Image(imageVector = ImageVector.vectorResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = "test"
        )
        Image(painter = ColorPainter(color = Color.Gray),
            contentDescription = "test",
            modifier = Modifier.size(100.dp,100.dp)
        )
    }
}
