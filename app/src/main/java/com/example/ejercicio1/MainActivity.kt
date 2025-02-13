package com.example.ejercicio1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.ejercicio1.ui.theme.Ejercicio1Theme
import androidx.compose.ui.graphics.Color
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Ejercicio1Theme {
                setContent()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview(){
    
}

@Composable
fun setContent(){
    Column {
        SimpleButton()
        ButtonWithColor()
        ButtonWithTwoTextView()
    }
}

@Composable
fun SimpleButton() {
    Button(onClick = {
        //your onclick code here
    }) {
        Text(text = "Simple Button")
    }
}

@Composable
fun ButtonWithColor(){
    Button(onClick = {
        //your onclick code
    },
        colors = ButtonDefaults.buttonColors(Color.DarkGray))

    {
        Text(text = "Button with gray background",color = Color.White)
    }
}

@Composable
fun ButtonWithTwoTextView() {
    Button(onClick = {
        //your onclick code here
    }) {
        Text(text = "Click ", color = Color.Magenta)
        Text(text = "Here", color = Color.Green)
    }
}

@Composable
fun ButtonWithIcon() {
    Button(onClick = {}) {
        Image(
            painterResource(id = R.drawable.cart),
            contentDescription ="Cart button icon",
            modifier = Modifier.size(20.dp))

        Text(text = "Add to cart",Modifier.padding(start = 10.dp))
    }
}


