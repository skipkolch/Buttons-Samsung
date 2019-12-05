package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //объявляем переменные для компонентов (виджетов)
    private TextView txt;
    private EditText etxt;
    private Button btCancel;
    private Button btQuit;
    private Button btEnter;
    private ImageButton btImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // инициализируем переменные объектами связанными с ID виджетов
        txt = (TextView) findViewById(R.id.txt1);
        etxt = (EditText) findViewById(R.id.etxt1);
        btEnter = (Button) findViewById(R.id.bt_enter);
        btCancel = (Button) findViewById(R.id.bt_cancel);
        btQuit = (Button) findViewById(R.id.bt_quit);
        btImage = (ImageButton) findViewById(R.id.bt_image);

        //создаем обработчик
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.bt_enter:
                        txt.setText(etxt.getText().toString());
                        break;
                    case R.id.bt_cancel:
                        txt.setText("");
                        break;
                    case R.id.bt_quit:
                        finish();
                        break;
                    case R.id.bt_image:
                        Toast.makeText(MainActivity.this, "Image", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        };

        setClickListener(listener);
    }

    private void setClickListener(View.OnClickListener listener) {
        btEnter.setOnClickListener(listener);
        btCancel.setOnClickListener(listener);
        btQuit.setOnClickListener(listener);
        btImage.setOnClickListener(listener);
    }
}
