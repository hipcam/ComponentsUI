package pe.edu.tecsup.componentsui;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
public class AndroidButtonActivity extends AppCompatActivity {
    private static final String TAG = AndroidButtonActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_button);
    }
    //debe ser public, retorno void y con parametro tipo View
    public void callButton1(View view){
        Log.d(TAG,  "Entro el boton 1");
        Toast.makeText(this, "Entró al botón 1", Toast.LENGTH_LONG).show();
    }
    public void callButton2(View view){
        Log.d(TAG,  "Entro el boton 2");
        Toast.makeText(this, "Entró al botón 2", Toast.LENGTH_LONG).show();
    }
}
