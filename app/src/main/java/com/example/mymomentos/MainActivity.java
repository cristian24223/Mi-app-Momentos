package com.example.mymomentos;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText idUsuario = findViewById(R.id.idUsuario);
    TextView idNombre = findViewById(R.id.idNombre);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void evento(View view) {
        switch (view.getId()) {
            case R.id.btnLogin:
                String nombre = idUsuario.getText().toString();
                idNombre.setText("Bienevenido:" + nombre);
                Toast.makeText(this, "El nombre es:  " + nombre, Toast.LENGTH_SHORT).show();
                break;
        }
    }
    public void evento2(View view) {
    }
}

