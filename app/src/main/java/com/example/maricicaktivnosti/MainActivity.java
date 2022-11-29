package com.example.maricicaktivnosti.;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void send_msg(View view)
    {

        Intent intent = new Intent(this, MainActivity2.class);

        EditText  myMsg = (EditText) findViewById(R.id.textview);
        String msg = myMsg.getText().toString();

        intent.putExtra("EXTRA_MESSAGE",msg);

        startActivity(intent);
    }

}

