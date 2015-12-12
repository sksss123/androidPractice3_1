package kr.ac.kookmin.exer3_1.exer3_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button edit_bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit_bt = (Button) findViewById(R.id.edit);
        textView = (TextView) findViewById(R.id.text);
        String a = (String) textView.getText();
        edit_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), NextActivity.class);
                intent.putExtra("text", textView.getText().toString());
                startActivityForResult(intent,0);
            }
        });
    }
    public void onActivityResult(int requestCode, int resultCode, Intent intent)
    {
        if(resultCode == RESULT_OK)
        {
            String text = intent.getStringExtra("nextText");
            textView.setText(text);
        }
    }
}
