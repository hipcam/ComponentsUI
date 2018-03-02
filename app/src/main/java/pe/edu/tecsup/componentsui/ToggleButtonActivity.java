package pe.edu.tecsup.componentsui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.ToggleButton;

public class ToggleButtonActivity extends AppCompatActivity {
    private ToggleButton toggleButton1, toggleButton2;
    private TextView textView1, textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle_button);
        toggleButton1 = (ToggleButton) findViewById(R.id.toggleButton1);
        toggleButton2 = (ToggleButton) findViewById(R.id.toggleButton2);
        textView1 = (TextView) findViewById(R.id.text_view1);
        textView2 = (TextView) findViewById(R.id.text_view2);
        toggleButton1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean checked) {
                if (checked) {
                    textView1.setText("Está encendido");
                } else {
                    textView1.setText("Apagado y triste como salas");
                }
            }
        });
        toggleButton2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean checked) {
                if (checked) {
                    textView2.setText("Está encendido");
                } else {
                    textView2.setText("Apagado y triste como salas");
                }
            }
        });
        if (toggleButton1.isChecked()) {
            textView1.setText("Está encendido");
        } else {
            textView1.setText("Apagado y triste como salas");
        }

        if (toggleButton2.isChecked()) {
            textView2.setText("Está encendido");
        } else {
            textView2.setText("Apagado y triste como salas");
        }
    }
}

