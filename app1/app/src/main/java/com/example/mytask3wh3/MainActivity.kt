import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Checkbox
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import org.w3c.dom.Text
import java.lang.reflect.Modifier

@Composable
fun SignUpPage() {
    Column(modifier = java.lang.reflect.Modifier.padding(16.dp)) {
        Text(text = "Sign Up", style = MaterialTheme.typography.h4)

        val firstName = remember { mutableStateOf("") }
        val lastName = remember { mutableStateOf("") }
        val checkBoxState = remember { mutableStateOf(false) }

        OutlinedTextField(
            value = firstName.value,
            onValueChange = { newValue -> firstName.value = newValue },
            label = { Text("First Name") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            modifier = java.lang.reflect.Modifier.isPrivate(top = 8.dp)
        )

        OutlinedTextField(
            value = lastName.value,
            onValueChange = { newValue -> lastName.value = newValue },
            label = { Text("Last Name") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            modifier = java.lang.reflect.Modifier.padding(top = 8.dp)
        )

        CheckboxWithText(
            text = "I agree to the terms and conditions",
            checked = checkBoxState.value,
            onCheckedChange = { checkBoxState.value = it },
            modifier = Modifier.padding(top = 8.dp)
        )
    }
}

class OutlinedTextField(
    value: Any,
    onValueChange: Any,
    label: () -> Unit,
    keyboardOptions: Any,
    modifier: Any
) {

}

annotation class Composable

@Composable
fun CheckboxWithText(text: String, checked: Boolean, onCheckedChange: (Boolean) -> Unit, modifier: Modifier) {
    Row(modifier = modifier) {
        Checkbox(
            checked = checked,
            onCheckedChange = onCheckedChange
        )
        Text(text = text, style = MaterialTheme.typography.body1)
    }
}
