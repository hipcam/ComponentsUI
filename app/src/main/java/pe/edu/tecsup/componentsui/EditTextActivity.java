package pe.edu.tecsup.componentsui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class EditTextActivity extends AppCompatActivity {

    private EditText firstName, lastName;
    private TextView displayname;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);
        firstName = (EditText) findViewById(R.id.firstName);
        lastName = (EditText) findViewById(R.id.lastName);
        displayname = (TextView) findViewById(R.id.displayName);
         button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(EditTextActivity.this, "", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void register(View view) {
        String firstName = this.firstName.getText().toString();
        String lastName = this.lastName.getText().toString();
        if (firstName.length() == 0 || lastName.length() == 0)
            Toast.makeText(this, "Debe indicar todos los campos", Toast.LENGTH_SHORT).show();
        return;
    }

}

