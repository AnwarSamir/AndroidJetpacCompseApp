package com.codestomp.androidjetpaccompseapp

import android.content.Context
import android.content.Intent
import android.graphics.Typeface
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ClickableText
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.font
import androidx.compose.ui.text.font.fontFamily
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import com.codestomp.androidjetpaccompseapp.ui.LoginActivity

import com.codestomp.androidjetpaccompseapp.ui.theme.AndroidJetpacCompseAppTheme
import com.codestomp.androidjetpaccompseapp.ui.theme.typography
import kotlin.math.round

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            AndroidJetpacCompseAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background,modifier = Modifier.padding(16.dp)) {
                    makeButton()
                }
            }
        }
    }

    @Composable
    fun makeButton()
    {
        Button(onClick = {
             startActivity(Intent(this@MainActivity, LoginActivity::class.java))
        },border = BorderStroke(1.dp, Color.Black),
              shape = RoundedCornerShape(5.dp),
                modifier = Modifier.fillMaxWidth(),
                enabled = false


        ) {
            // Text
            makeTextForButton()
        }

    }

    @Composable
    fun makeTextForButton(){
        Text(text = "Open Login Activity")
    }



}

