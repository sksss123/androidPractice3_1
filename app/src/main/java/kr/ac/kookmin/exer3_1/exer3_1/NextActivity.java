package kr.ac.kookmin.exer3_1.exer3_1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by 정민 on 2015-12-12.
 */
public class NextActivity extends AppCompatActivity{

    Button ok_bt;
    Button cancel_bt;
    EditText textView;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        ok_bt = (Button) findViewById(R.id.OK);
        cancel_bt = (Button) findViewById(R.id.cancel);
        textView = (EditText) findViewById(R.id.text2);
        textView.setText(getIntent().getStringExtra("text"));

        ok_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.putExtra("nextText", textView.getText().toString());
                setResult(RESULT_OK, intent);
                finish();
            }
        });

        cancel_bt.setOnClickListener(new View.OnClickListener(){
            @Override
        public void onClick(View v){
                setResult(RESULT_CANCELED);
                finish();
            }
        });
    }
}
