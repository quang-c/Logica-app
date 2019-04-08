package com.example.logica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText userAnswer1, userAnswer2, userAnswer3, userAnswer4;
    private Button submitButton;
    private String answer1, answer2, answer3, answer4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userAnswer1 = findViewById(R.id.input1);
        userAnswer2 = findViewById(R.id.input2);
        userAnswer3 = findViewById(R.id.input3);
        userAnswer4 = findViewById(R.id.input4);
        submitButton = findViewById(R.id.buttonSubmit);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitAnswer();
            }
        });
    }

    private void submitAnswer(){
        answer1 = userAnswer1.getEditableText().toString();
        answer2 = userAnswer2.getText().toString();
        answer3 = userAnswer3.getText().toString();
        answer4 = userAnswer4.getText().toString();
        if(answer1.equalsIgnoreCase("t") && answer2.equalsIgnoreCase("f") && answer3.equalsIgnoreCase("f") && answer4.equalsIgnoreCase("f")){
            Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Incorrect!", Toast.LENGTH_SHORT).show();
        }

    }
}
