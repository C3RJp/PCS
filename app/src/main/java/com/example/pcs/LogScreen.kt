package com.example.pcs

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun Logscreen(navController: NavController)
{
    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.log),
            contentDescription = "log_image",
            modifier = Modifier.size(200.dp)
        )
        Text(text = "Bienvenido", fontSize = 28.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(value ="", onValueChange = {}, label = {
            Text(text = "ID", fontSize = 18.sp, fontWeight = FontWeight.Normal)
        })

        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(value = "", onValueChange = {}, label = {
            Text(text = "Password", fontSize = 18.sp, fontWeight = FontWeight.Normal)
        }, visualTransformation = PasswordVisualTransformation())

        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = { navController.navigate("irB") }) {
            Text(text = "Log In", fontSize = 18.sp, fontWeight = FontWeight.Normal)
        }

        Spacer(modifier = Modifier.height(32.dp))

        TextButton(onClick = { }) {
            Text(text="Forgot the password ?")
        }
    }
}