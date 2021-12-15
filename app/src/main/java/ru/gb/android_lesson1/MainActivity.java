package ru.gb.android_lesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText textPersonNameEditText;
    private EditText textPasswordEditText;
    private EditText textEmailAddressEditText;
    private EditText phoneNumberEditText;
    private EditText numberEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        textPersonNameEditText = findViewById(R.id.textPersonName_edit_text);
        textPasswordEditText = findViewById(R.id.textPassword_edit_text);
        textEmailAddressEditText = findViewById(R.id.textEmailAddress_edit_text);
        phoneNumberEditText = findViewById(R.id.phoneNumber_edit_text);
        numberEditText = findViewById(R.id.number_edit_text);

    }
}