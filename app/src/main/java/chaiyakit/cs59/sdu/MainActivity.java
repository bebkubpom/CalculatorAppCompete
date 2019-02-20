package chaiyakit.cs59.sdu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText in1;
    private EditText in2;
    private Button add;
    private Button sub;
    private Button mul;
    private Button div;
    private TextView txt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        in1=(EditText)findViewById(R.id.in1);
        in2=(EditText)findViewById(R.id.in2);
        add=(Button)findViewById(R.id.add);
        sub=(Button)findViewById(R.id.sub);
        mul=(Button)findViewById(R.id.mul);
        div=(Button)findViewById(R.id.div);
        txt1=(TextView)findViewById(R.id.textView);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x = Integer.parseInt(in1.getText().toString());
                int y = Integer.parseInt(in2.getText().toString());

                int result =(x+y);

                txt1.setText(String.valueOf(result));
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x = Integer.parseInt(in1.getText().toString());
                int y = Integer.parseInt(in2.getText().toString());

                int result =(x-y);

                txt1.setText(String.valueOf(result));
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x = Integer.parseInt(in1.getText().toString());
                int y = Integer.parseInt(in2.getText().toString());

                int result = (x*y);

                txt1.setText(String.valueOf(result));
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x = Integer.parseInt(in1.getText().toString());
                int y = Integer.parseInt(in2.getText().toString());

                int result = (x/y);

                txt1.setText(String.valueOf(result));
            }
        });
    }
}
