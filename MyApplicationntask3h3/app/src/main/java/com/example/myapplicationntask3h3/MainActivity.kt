package com.example.myapplicationntask3h3


import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dpandroidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import java.lang.reflect.Modifier

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent() {
            SignUpScreen()
        }

    }
}



    @Composable
    fun SignUpScreen() {
        Colmn(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Sign Up",
                fontWeight = FontWeight.Bold,
                style = MaterialTheme.typography.h4
            )

            Spacer(modifier = Modifier.height(24.dp))

            val firstName = remember { mutableStateOf("") }
            val lastName = remember { mutableStateOf("") }

            OutlinedTextField(
                value = firstName.value,
                onValueChange = { firstName.value = it },
                label = { Text("First Name") },
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(16.dp))

            OutlinedTextField(
                value = lastName.value,
                onValueChange = { lastName.value = it },
                label = { Text("Last Name") },
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(16.dp))

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Checkbox(
                    checked = false, // Replace with a mutableStateOf for state management
                    onCheckedChange = { /* Handle checkbox state change */ }
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(text = "I agree to the terms and conditions")
            }
        }
    }

class Colmn(modifier: Any, horizontalAlignment: Any, function: () -> Unit) {

}

annotation class Composable

@Preview(showBackground = true)
    @Composable
    fun Preview() {
        SignUpScreen()
    }
}
