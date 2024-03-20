import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val usernameEditText = findViewById<EditText>(R.id.usernameEditText)
        val passwordEditText = findViewById<EditText>(R.id.passwordEditText)
        val loginButton = findViewById<Button>(R.id.loginButton)

        loginButton.setOnClickListener {
            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()

            if (username.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Por favor, preencha todos os campos.", Toast.LENGTH_SHORT).show()
            } else if (username == "user" && password == "1234") {
                val intent = Intent(this, CredentialsActivity::class.java)
                startActivity(intent)
                finish()
            } else {
                showErrorDialog()
            }
        }
    }

    private fun showErrorDialog() {
        // Implemente aqui a exibição de um dialog com a mensagem de erro.
        Toast.makeText(this, "Credenciais inválidas. Tente novamente.", Toast.LENGTH_SHORT).show()
    }
}
