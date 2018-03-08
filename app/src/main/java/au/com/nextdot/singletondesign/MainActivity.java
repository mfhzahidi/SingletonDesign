package au.com.nextdot.singletondesign;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private EditText editText1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Singleton singleton = Singleton.getInstance(this);

        button=(Button)findViewById(R.id.button1);
        editText1=(EditText)findViewById(R.id.ed1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                singleton.setName("name",editText1.getText().toString());
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
            }
        });
    }


}
