package com.codestomp.androidjetpaccompseapp.ui

import android.graphics.drawable.PaintDrawable
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.ScrollScope
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.codestomp.androidjetpaccompseapp.R
import com.codestomp.androidjetpaccompseapp.ui.ui.theme.AndroidJetpacCompseAppTheme

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidJetpacCompseAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    // userNameInput()
                    //makeFrame(this)
                    makeVerticalLayout()
                }
            }
        }
    }
}




// make linear layout
@Composable
fun makeVerticalLayout()
{


        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = "Login to your account",
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center
            )
            userNameInput()
            userPasswordInput()
            makeButton()

            buildOtherLoginTypes1()
            buildOtherLoginTypes2()
            buildOtherLoginTypes3()
            buildOtherLoginTypes4()
            buildOtherLoginTypes5()
            buildOtherLoginTypes6()


        }


}

@Composable
fun buildOtherLoginTypes1()
{
    Row(modifier = Modifier
        .padding(10.dp)
        .fillMaxWidth()) {

        Box(modifier = Modifier.background(Color.Blue)) {
            Text(text = "FB Login ",modifier = Modifier.padding(5.dp),style = TextStyle(Color.White))
        }

        Box(modifier = Modifier.background(Color.Red)) {
            Text(text = "G Login ",modifier = Modifier.padding(5.dp),style = TextStyle(Color.White))
        }

        Box(modifier = Modifier.background(Color.Cyan)) {
            Text(text = "T Login ",modifier = Modifier.padding(5.dp),style = TextStyle(Color.Black))
        }


    }




}

@Composable
fun buildOtherLoginTypes2()
{
    Row(modifier = Modifier
        .padding(10.dp)
        .fillMaxWidth(),horizontalArrangement = Arrangement.Center) {

        Box(modifier = Modifier.background(Color.Blue)) {
            Text(text = "FB Login ",modifier = Modifier.padding(5.dp),style = TextStyle(Color.White))
        }

        Box(modifier = Modifier.background(Color.Red)) {
            Text(text = "G Login ",modifier = Modifier.padding(5.dp),style = TextStyle(Color.White))
        }

        Box(modifier = Modifier.background(Color.Cyan)) {
            Text(text = "T Login ",modifier = Modifier.padding(5.dp),style = TextStyle(Color.Black))
        }


    }




}


@Composable
fun buildOtherLoginTypes3()
{
    Row(modifier = Modifier
        .padding(10.dp)
        .fillMaxWidth(),horizontalArrangement = Arrangement.End) {

        Box(modifier = Modifier.background(Color.Blue)) {
            Text(text = "FB Login ",modifier = Modifier.padding(5.dp),style = TextStyle(Color.White))
        }

        Box(modifier = Modifier.background(Color.Red)) {
            Text(text = "G Login ",modifier = Modifier.padding(5.dp),style = TextStyle(Color.White))
        }

        Box(modifier = Modifier.background(Color.Cyan)) {
            Text(text = "T Login ",modifier = Modifier.padding(5.dp),style = TextStyle(Color.Black))
        }


    }




}


@Composable
fun buildOtherLoginTypes4()
{
    Row(modifier = Modifier
        .padding(10.dp)
        .fillMaxWidth(),horizontalArrangement = Arrangement.SpaceEvenly) {

        Box(modifier = Modifier.background(Color.Blue)) {
            Text(text = "FB Login ",modifier = Modifier.padding(5.dp),style = TextStyle(Color.White))
        }

        Box(modifier = Modifier.background(Color.Red)) {
            Text(text = "G Login ",modifier = Modifier.padding(5.dp),style = TextStyle(Color.White))
        }

        Box(modifier = Modifier.background(Color.Cyan)) {
            Text(text = "T Login ",modifier = Modifier.padding(5.dp),style = TextStyle(Color.Black))
        }


    }




}




@Composable
fun buildOtherLoginTypes5()
{
    Row(modifier = Modifier
        .padding(10.dp)
        .fillMaxWidth(),horizontalArrangement = Arrangement.SpaceAround) {

        Row(modifier = Modifier.background(Color.Blue)) {
            Image(modifier = Modifier.size(30.dp),painter = painterResource(R.drawable.ic_launcher_background), contentDescription ="dkslkdj" )
            Text(text = "FB Login ",modifier = Modifier.padding(5.dp),style = TextStyle(Color.White))
        }

        Box(modifier = Modifier.background(Color.Red)) {
            Text(text = "G Login ",modifier = Modifier.padding(5.dp),style = TextStyle(Color.White))
        }

        Box(modifier = Modifier.background(Color.Cyan)) {
            Text(text = "T Login ",modifier = Modifier.padding(5.dp),style = TextStyle(Color.Black))
        }




    }




}



@Composable
fun buildOtherLoginTypes6()
{
    Row(modifier = Modifier
        .padding(10.dp)
        .fillMaxWidth(),horizontalArrangement = Arrangement.SpaceBetween) {

        Box(modifier = Modifier.background(Color.Blue)) {
            Text(text = "FB Login ",modifier = Modifier.padding(5.dp),style = TextStyle(Color.White))
        }

        Box(modifier = Modifier.background(Color.Red)) {
            Text(text = "G Login ",modifier = Modifier.padding(5.dp),style = TextStyle(Color.White))
        }

        Box(modifier = Modifier.background(Color.Cyan)) {
            Text(text = "T Login ",modifier = Modifier.padding(5.dp),style = TextStyle(Color.Black))
        }


    }




}































@Composable
fun makeFrame(loginActivity: LoginActivity)
{
    Box(modifier = Modifier
        .size(Dp(200f))
        .padding(10.dp)
        .clip(RoundedCornerShape(10f))
        .background(Color.Blue)
        .clickable(onClick = {
            Toast
                .makeText(loginActivity, "From Box Number one ", Toast.LENGTH_SHORT)
                .show()
        }

        ),contentAlignment = Alignment.Center){

        Box(modifier = Modifier
            .size(100.dp)
            .background(Color.White)
            .clip(RoundedCornerShape(20f)),contentAlignment = Alignment.Center){
            Text(
                text = "Helle from the top of box 2",
                fontSize = 12.sp
            )
        }
    }
}




var rememberUserNameValue:MutableState<TextFieldValue>?=null

@Composable
fun userNameInput() {
   rememberUserNameValue = remember { mutableStateOf(TextFieldValue()) }
    TextField(value = rememberUserNameValue!!.value,
        placeholder = { androidx.compose.material.Text(text = "enter user name") },
        leadingIcon = { Icon(Icons.Default.Email,"email icon ") },
        onValueChange = {
            rememberUserNameValue!!.value = it
        },modifier = Modifier
            .padding(0.dp, 16.dp, 0.dp, 0.dp)
            .fillMaxWidth(),

        )


}


var rememberUserPasswordValue:MutableState<TextFieldValue>?=null
@Composable
fun userPasswordInput() {
    rememberUserPasswordValue = remember { mutableStateOf(TextFieldValue()) }
    TextField(value = rememberUserPasswordValue!!.value,
        placeholder = { androidx.compose.material.Text(text = "enter password") },
        leadingIcon = { Icon(Icons.Default.Lock,"") },
        onValueChange = {
            rememberUserPasswordValue!!.value = it
        },modifier = Modifier
            .padding(0.dp, 16.dp, 0.dp, 0.dp)
            .fillMaxWidth(),
        visualTransformation = PasswordVisualTransformation()

        )


}

@Composable
fun makeButton()
{
    Button(onClick = {
        Log.e("User input is ->","usernaame is : ${rememberUserNameValue!!.value.text},password : ${rememberUserPasswordValue!!.value.text}")
    },border = BorderStroke(1.dp, Color.Black),
        shape = RoundedCornerShape(5.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(0.dp, 16.dp, 0.dp, 0.dp),
        enabled = true


    ) {
        // Text
        makeTextForButton()
    }




}

@Composable
fun makeTextForButton(){
    Text(text = "Login")
}

