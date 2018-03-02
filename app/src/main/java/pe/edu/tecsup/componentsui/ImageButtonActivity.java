package pe.edu.tecsup.componentsui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class ImageButtonActivity extends AppCompatActivity {
    private static final String TAG = ImageButtonActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_button);
    }
    public void firstImageButton(View view){
        Log.d(TAG,  "Entro el boton icono");
        Toast.makeText(this, "Entró al botón icono", Toast.LENGTH_LONG).show();
    }
    public void secondImageButton(View view){
        Log.d(TAG,  "Entro el boton imagen");
        Toast.makeText(this, "Entró al botón imagen", Toast.LENGTH_LONG).show();
    }
}
