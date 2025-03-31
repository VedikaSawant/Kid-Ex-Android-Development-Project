package com.example.intenteventlistener;
import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;
import java.util.*;
public class ResultActivity extends AppCompatActivity {
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_result);
        Intent intent = getIntent();
        String input = intent.getStringExtra("input");
        result = findViewById(R.id.resultText);
        result.setText("Welcome " + input + "! \nYou are now signed in");
        Button goBack = findViewById(R.id.goBackButton);
        goBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent restart = new Intent(ResultActivity.this, MainActivity.class);
                startActivity(restart);
                finish();
            }
        });
    }
}
