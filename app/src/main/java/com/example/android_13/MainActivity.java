package com.example.android_13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int[] imgID={R.drawable.rat, R.drawable.ox, R.drawable.tiger, R.drawable.rabbit, R.drawable.dragen,
            R.drawable.snake, R.drawable.horse, R.drawable.sheep,R.drawable.monkey, R.drawable.chiken,
            R.drawable.dog,R.drawable.pig};
    ImageView imageView;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView= findViewById(R.id.imageView);
        editText = findViewById(R.id.editTextTextPersonName);

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                sh();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }

    public void sh(){
        try {
            int num = Integer.parseInt(editText.getText().toString());
            imageView.setImageResource(imgID[num-1]);
        }
        catch (Exception e){
            Toast.makeText(this, "請輸入1~12其中一個數字", Toast.LENGTH_LONG).show();
        }
    }

}