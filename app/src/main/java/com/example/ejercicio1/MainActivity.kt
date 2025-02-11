package com.example.ejercicio1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.ejercicio1.ui.theme.Ejercicio1Theme
import androidx.compose.ui.graphics.Color
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.input.KeyboardType

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContent {
            Ejercicio1Theme {
                GreetingPreview()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Column {
        //TextFieldSencillo()
        TextFieldPlaceHolder()
        TextFieldKeyboard()
    }
}

@Composable
fun TextFieldSencillo(){
    var text by remember {mutableStateOf("")}
    Column{
        TextField(
            value = text,
            onValueChange = {newText -> text = newText},
            label = { Text("introduce tu nombre") }

        )
        Text(text = "Tu nombre es:  $text")
    }

}

@Composable
fun TextFieldPlaceHolder(){
    var text by remember {mutableStateOf("")}
    Column{
        TextField(
            value = text,
            onValueChange = {newText -> text = newText},
            label = { Text("Nombre") },
            placeholder = { Text("introduce tu nombre")}
        )
    }

}

@Composable
fun TextFieldKeyboard(){
    var text by remember {mutableStateOf("")}
    Column{
        TextField(
            value = text,
            onValueChange = {newText -> text = newText},
            label = { Text("Numero") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
        Text("introduce tu numero: $text")
    }

}