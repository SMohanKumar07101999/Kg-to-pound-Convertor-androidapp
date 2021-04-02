package com.example.uniconvert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private EditText editText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.convertbutton);
        textView=findViewById(R.id.resultview);
        editText=findViewById(R.id.userenter);
  button.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {

//Black color text which appears on our phone when we press a button//
//Toast.makeText(MainActivity.this, "Hi click Listener works", Toast.LENGTH_SHORT).show();
    Toast.makeText(MainActivity.this, "Thanks for Using this App", Toast.LENGTH_SHORT).show();
    String s=editText.getText().toString();   //taking the value of edittext as a string and then parsing it//
  int Kg=Integer.parseInt(s);
  double pound = 2.205*Kg;
   textView.setText("The corresponding value in Pound is"+" "+ pound);


     }
 });

    }

}
//  button.setOnClickListener(new View.OnClickListener() {
// @Override
//public void onClick(View v) {

//Black color text which appears on our phone when we press a button//
//Toast.makeText(MainActivity.this, "Hi click Listener works", Toast.LENGTH_SHORT).show();

//    String s=editText.getText().toString();   //taking the value of edittext as a string and then parsing it//
//   int Kg=Integer.parseInt(s);
//   double pound = 2.205*Kg;
//   textView.setText("The corresponding value in Pound is"+" "+ pound);


//     }
// });