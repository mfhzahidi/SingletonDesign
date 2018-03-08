package au.com.nextdot.singletondesign;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main3Activity extends AppCompatActivity {

    private EditText editText;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        editText=(EditText)findViewById(R.id.ed3);
        button=(Button)findViewById(R.id.button3);
        final Singleton singleton=Singleton.getInstance(this);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                singleton.setNum("number",Integer.parseInt(editText.getText().toString()));
                Intent intent=new Intent(Main3Activity.this,Final.class);
                startActivity(intent);
            }
        });
    }
}
