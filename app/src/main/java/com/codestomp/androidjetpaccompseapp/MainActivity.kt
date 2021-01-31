package com.codestomp.androidjetpaccompseapp

import android.content.Context
import android.graphics.Typeface
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.ClickableText
import androidx.compose.material.Text
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.font
import androidx.compose.ui.text.font.fontFamily
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp

import com.codestomp.androidjetpaccompseapp.ui.theme.AndroidJetpacCompseAppTheme
import com.codestomp.androidjetpaccompseapp.ui.theme.typography

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            AndroidJetpacCompseAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    buildTextView(this)
                }
            }
        }
    }

    @Composable
    fun buildTextView(context: Context) {
        ClickableText(text = AnnotatedString(text = "Hello From Android App and you can see this now ", SpanStyle(
                color = Color.Red,
                fontSize = TextUnit.Sp(30),
                fontStyle = FontStyle.Italic,
                fontFamily = fontFamily(font(R.font.fontnum1)),
        )),
                modifier = Modifier.padding(start = 10.dp, end = 10.dp, top = 20.dp, bottom = 5.dp),
                overflow = TextOverflow.Ellipsis,
                maxLines = 1,
                style = TextStyle(background = Color.Yellow, shadow = Shadow(color = Color.Black, blurRadius = 5f)), onClick = {
            Toast.makeText(context, "this from clickable text hii ?", Toast.LENGTH_SHORT).show()
        })

    }
}

