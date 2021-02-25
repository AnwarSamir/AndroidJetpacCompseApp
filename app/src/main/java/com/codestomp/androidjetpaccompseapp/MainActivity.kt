package com.codestomp.androidjetpaccompseapp

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.codestomp.androidjetpaccompseapp.ui.LoginActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.text.ClickableText


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            com.codestomp.androidjetpaccompseapp.ui.ui.theme.AndroidJetpacCompseAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = MaterialTheme.colors.background,
                    modifier = Modifier.padding(16.dp)
                ) {
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
                enabled = true


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

