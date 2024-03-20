import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class CredentialsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_credentials)

        val newUsernameEditText = findViewById<EditText>(R.id.newUsernameEditText)
        val newPasswordEditText = findViewById<EditText>(R.id.newPasswordEditText)
        val saveButton = findViewById<Button>(R.id.saveButton)

        saveButton.setOnClickListener {
            val newUsername = newUsernameEditText.text.toString()
            val newPassword = newPasswordEditText.text.toString()

            if (newUsername.isEmpty() || newPassword.isEmpty()) {
                Toast.makeText(this, "Por favor, preencha todos os campos.", Toast.LENGTH_SHORT).show()
            } else {
                // Aqui você pode implementar a lógica para salvar as novas credenciais
                // e exibir a mensagem de sucesso.
                Toast.makeText(this, "Novas credenciais salvas com sucesso.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
