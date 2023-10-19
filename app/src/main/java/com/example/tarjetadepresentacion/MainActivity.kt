package com.example.tarjetadepresentacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tarjetadepresentacion.ui.theme.TarjetaDePresentacionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TarjetaDePresentacionTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
                    Perfil()
                }
            }
        }
    }
}

@Composable
fun Perfil() {
    var mostrarDatos by remember { mutableStateOf(false) }/*Se pone false para que NO se pulse por defecto*/

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(color = Color(109, 172, 179))
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        val image = painterResource(R.drawable.fotoperfil)
        Image(painter = image, contentDescription = null, modifier = Modifier.size(250.dp))
        Text(
            text = "Daniel",
            modifier = Modifier
                .padding(top = 18.dp, bottom = 8.dp)
                .fillMaxWidth(),
            fontWeight = FontWeight.Bold,
            fontSize = 35.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = "Rueda de Lorenzo",
            fontSize = 25.sp,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Medium
        )
        Text(
            text = "Desarrollo de aplicaciones multiplataforma",
            fontSize = 18.sp,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )
        Button(onClick = { mostrarDatos = !mostrarDatos }) {
            Text(
                if (mostrarDatos)
                    "Ocultar datos del perfil"
                else
                    "Mostrar datos del perfil"
            )
        }

        if (mostrarDatos) {
            Spacer(modifier = Modifier.padding(20.dp))/*Para que haya espacio entre los datos y el boton*/
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text("📞 Teléfono:")
                Text("+34 620 55 97 20")
            }
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text("✉️ Correo:")
                Text("danielrueda3012@gmail.com")
            }
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text("🌐 Red Social:")
                Text("@ruedinha30_")
            }
        }
    }
}

@Composable
fun ConBotonPulsado() {
    var mostrarDatos by remember { mutableStateOf(true) }/*Se pone true para que se pulse por defecto*/

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(color = Color(109, 172, 179))
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        val image = painterResource(R.drawable.fotoperfil)
        Image(painter = image, contentDescription = null, modifier = Modifier.size(250.dp))
        Text(
            text = "Daniel",
            modifier = Modifier
                .padding(top = 18.dp, bottom = 8.dp)
                .fillMaxWidth(),
            fontWeight = FontWeight.Bold,
            fontSize = 35.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = "Rueda de Lorenzo",
            fontSize = 25.sp,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Medium
        )
        Text(
            text = "Desarrollo de aplicaciones multiplataforma",
            fontSize = 18.sp,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )
        Button(onClick = { mostrarDatos = !mostrarDatos }) {

            Text(
                if (mostrarDatos)
                    "Ocultar datos del perfil"
                else
                    "Mostrar datos del perfil"
            )
        }

        if (mostrarDatos) {
            Spacer(modifier = Modifier.padding(20.dp))/*Para que haya espacio entre los datos y el boton*/
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text("📞 Teléfono:")
                Text("+34 620 55 97 20")
            }
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text("✉️ Correo:")
                Text("danielrueda3012@gmail.com")
            }
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text("🌐 Red Social:")
                Text("@ruedinha30_")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun VistaPrevia1() {
    TarjetaDePresentacionTheme {
        Perfil()
    }
}

@Preview(showBackground = true)
@Composable
fun VistaPrevia2() {
    TarjetaDePresentacionTheme {
        ConBotonPulsado()
    }
}