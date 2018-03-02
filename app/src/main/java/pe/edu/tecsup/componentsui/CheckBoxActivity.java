package pe.edu.tecsup.componentsui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;
public class CheckBoxActivity extends AppCompatActivity {
    private CheckBox checkBox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);
        checkBox = (CheckBox) findViewById(R.id.checkBox);
        // Setting check to specific checkbox
        checkBox.setChecked(true);
        if(checkBox.isChecked())
            Toast.makeText(this, "First checkbox is checked!", Toast.LENGTH_LONG).show();
    }
    public void androidCheckBoxClicked(View view) {
        // action for checkbox click
        switch (view.getId()) {
            case R.id.checkBox:
                CheckBox checkBox = (CheckBox) view;
                if(checkBox.isChecked())
                    Toast.makeText(this, checkBox.getText() + " selected!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.checkBox2:
                CheckBox checkBox2 = (CheckBox) view;
                if(checkBox2.isChecked())
                    Toast.makeText(this, checkBox2.getText() + " selected!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.checkBox3:
                CheckBox checkBox3 = (CheckBox) view;
                if(checkBox3.isChecked())
                    Toast.makeText(this, checkBox3.getText() + " selected!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.checkBox4:
                CheckBox checkBox4 = (CheckBox) view;
                if(checkBox4.isChecked())
                    Toast.makeText(this, checkBox4.getText() + " selected!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.checkBox5:
                CheckBox checkBox5 = (CheckBox) view;
                if(checkBox5.isChecked())
                    Toast.makeText(this, checkBox5.getText() + " selected!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.checkBox6:
                CheckBox checkBox6 = (CheckBox) view;
                if(checkBox6.isChecked())
                    Toast.makeText(this, checkBox6.getText() + " selected!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.checkBox7:
                CheckBox checkBox7 = (CheckBox) view;
                if(checkBox7.isChecked())
                    Toast.makeText(this, checkBox7.getText() + " selected!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.checkBox8:
                CheckBox checkBox8 = (CheckBox) view;
                if(checkBox8.isChecked())
                    Toast.makeText(this, checkBox8.getText() + " selected!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.checkBox9:
                CheckBox checkBox9 = (CheckBox) view;
                if(checkBox9.isChecked())
                    Toast.makeText(this, checkBox9.getText() + " selected!", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
