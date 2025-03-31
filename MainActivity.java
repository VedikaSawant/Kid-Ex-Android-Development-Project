package com.example.intenteventlistener;
import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.util.*;
public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText username;
    private EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.Button);
        username = findViewById(R.id.inputText);
        password = findViewById(R.id.inputText1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = username.getText().toString();
                if (!text.isEmpty()) {
                    Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                    intent.putExtra("input", text);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "Please enter all fields", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}