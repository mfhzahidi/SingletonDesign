package au.com.nextdot.singletondesign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Final extends AppCompatActivity {

    private TextView textView1,textView2,textView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        textView1=(TextView)findViewById(R.id.text4);
        textView2=(TextView)findViewById(R.id.text5);
        textView3=(TextView)findViewById(R.id.text6);
        String name=null;
        int id = 0,number=0;
        Singleton singleton=Singleton.getInstance(this);
        name=singleton.getName("name",name);
        id=singleton.getID("id",id);
        number=singleton.getNum("number",number);
        textView1.setText(name);
        textView2.setText(String.valueOf(id));
        textView3.setText(String.valueOf(number));
    }
}
