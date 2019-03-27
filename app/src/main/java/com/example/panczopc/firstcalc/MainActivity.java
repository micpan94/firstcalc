package com.example.panczopc.firstcalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnplus,btnminus,btndiv,btnmulti;
    private EditText et1,et2;
    private TextView result;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    init();




    }

    private void init(){

        btnplus = (Button)findViewById(R.id.btnplus);
        btnminus = (Button)findViewById(R.id.btnminus);
        btndiv = (Button)findViewById(R.id.btndiv);
        btnmulti = (Button)findViewById(R.id.btnmulti);
        et1 = (EditText)findViewById(R.id.et1);
        et2 = (EditText)findViewById(R.id.et2);
        result = (TextView)findViewById(R.id.result);

        btnplus.setOnClickListener(this);
        btnminus.setOnClickListener(this);
        btndiv.setOnClickListener(this);
        btnmulti.setOnClickListener(this);




    }


    @Override
    public void onClick(View view) {



        String num1 = et1.getText().toString();
        String num2 = et2.getText().toString();

        if(num1.isEmpty() | num2.isEmpty())
        {
            Toast.makeText(getApplicationContext(),"Podaj dwie wartości :)",Toast.LENGTH_SHORT).show();
        }
        else

        switch (view.getId()){
            case R.id.btnplus:
                int add = Integer.parseInt(num1) + Integer.parseInt(num2);
                result.setText(String.valueOf(add));
                break;
            case R.id.btnminus:
                int sub = Integer.parseInt(num1) - Integer.parseInt(num2);
                result.setText(String.valueOf(sub));
                break;
            case R.id.btnmulti:
                int multi = Integer.parseInt(num1) * Integer.parseInt(num2);
                result.setText(String.valueOf(multi));
                break;
            case R.id.btndiv:

                int a = Integer.parseInt(num1);
                int b = Integer.parseInt(num2);

                if(a == 0 | b == 0)
                {
                    Toast.makeText(getApplicationContext(),"Nie można dzielić przez 0",Toast.LENGTH_SHORT).show();
                }
                else {

                    int div = a /b ;
                    result.setText(String.valueOf(div));
                    break;
                }
        }

    }
}

