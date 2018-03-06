package azmimuhammad.com.materialdesign.login;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import azmimuhammad.com.materialdesign.R;

public class LoginActivity extends AppCompatActivity {
    private EditText etUsername, etName, etPassword;
    private TextInputLayout inputLayoutUsername, inputLayoutName, inputLayoutPassword;
    private Toolbar toolbar;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        toolbar = findViewById(R.id.toolbar);
        etUsername = findViewById(R.id.username);
        etName = findViewById(R.id.fullname);
        etPassword = findViewById(R.id.password);
        inputLayoutName = findViewById(R.id.inputLayoutName);
        inputLayoutUsername = findViewById(R.id.inputLayoutUsername);
        inputLayoutPassword = findViewById(R.id.inputLayoutPassword);

        btnLogin = findViewById(R.id.login);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (etName.getText().toString().isEmpty() || etName.getText().toString().equals(""))
                    inputLayoutName.setError("Name cannot be null");
                else if (etUsername.getText().toString().isEmpty() || etUsername.getText().toString().equals(""))
                    inputLayoutUsername.setError("Username cannot be null");
                else if (etPassword.getText().toString().isEmpty() || etPassword.getText().toString().equals(""))
                    inputLayoutPassword.setError("Password cannot be null");
                else
                    Toast.makeText(LoginActivity.this, "Welcome, " + etName.getText().toString(),
                            Toast.LENGTH_SHORT).show();
            }
        });

        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Login");
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return super.onSupportNavigateUp();
    }
}
