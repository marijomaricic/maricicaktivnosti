package com.example.maricicaktivnosti;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2
package com.example.maricicaktivnosti;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.view.View;

        import android.os.Bundle;
        import android.widget.TextView;

public class    MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitivty_main2);

        Intent intent = getIntent();
        String msg = intent.getStringExtra("EXTRA_MESSAGE");

        TextView myMsg = (TextView) findViewById(R.id.textview2);
        myMsg.setText(msg); }}{
}
