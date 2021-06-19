package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Calwork<value> extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btn00, btnclear, btndot,
            btnplus, btnminus, btnmultiply, btndivision, btnequal;
    ImageView bspace;
    TextView opr;
   /* double a, b; */
    String value="",value2="",op="";
    float v1,v,r;

    /*boolean plus, minus, multiply, division;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calwork);
        opr = (TextView) findViewById(R.id.opr);
        btn1 = (Button) findViewById(R.id.one);
        btn2 = (Button) findViewById(R.id.two);
        btn3 = (Button) findViewById(R.id.three);
        btn4 = (Button) findViewById(R.id.four);
        btn5 = (Button) findViewById(R.id.five);
        btn6 = (Button) findViewById(R.id.six);
        btn7 = (Button) findViewById(R.id.seven);
        btn8 = (Button) findViewById(R.id.eight);
        btn9 = (Button) findViewById(R.id.nine);
        btn0 = (Button) findViewById(R.id.zero);
        btn00 = (Button) findViewById(R.id.doublezero);
        btnclear = (Button) findViewById(R.id.clear);
        btndot = (Button) findViewById(R.id.dot);
        btnplus = (Button) findViewById(R.id.plus);
        btnminus = (Button) findViewById(R.id.minus);
        btnmultiply = (Button) findViewById(R.id.multiply);
        btndivision = (Button) findViewById(R.id.division);
        btnequal = (Button) findViewById(R.id.equal);
        bspace = findViewById(R.id.bspace);
        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opr.setText("");
                value="";
            }
        });
        bspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (opr.getText().toString()!="" && opr.getText().toString().length()>0 ){
                    opr.setText(opr.getText().toString().substring(0,opr.getText().toString().length()-1));
                }
            }
        });

  /*     btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            opr.setText(opr.getText()+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opr.setText(opr.getText()+"2");
            }
        }); btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opr.setText(opr.getText()+"3");
            }
        }); btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opr.setText(opr.getText()+"4");
            }
        }); btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opr.setText(opr.getText()+"5");
            }
        }); btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opr.setText(opr.getText()+"6");
            }
        }); btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opr.setText(opr.getText()+"7");
            }
        }); btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opr.setText(opr.getText()+"8");
            }
        }); btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opr.setText(opr.getText()+"9");
            }
        }); btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opr.setText(opr.getText()+"0");
            }
        }); btn00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opr.setText(opr.getText()+"00");
            }
        });
        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opr.setText(opr.getText()+".");
            }
        }); btnplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    a= Float.parseFloat(opr.getText() + "");
                    plus= true;
                    opr.setText(null);


            }
        }); btnminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    a= Float.parseFloat(opr.getText() + "");
                    minus= true;
                    opr.setText(null);;

            }
        }); btnmultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    a= Float.parseFloat(opr.getText() + "");
                    multiply= true;
                    opr.setText(null);

            }
        }); btndivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    a= Float.parseFloat(opr.getText() + "");
                    division= true;
                    opr.setText(null);

            }
        });
        btnequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b=Double.parseDouble(opr.getText()+"");
                if(plus==true){
                    opr.setText(a+b+"");
                    plus=false;
                }
                if(minus==true){
                    opr.setText(a-b+"");
                    minus=false;
                }
                if(multiply==true){
                    opr.setText(a*b+"");
                    multiply=false;
                }
                if(division==true){
                    opr.setText(a/b+"");
                    division=false;
                }
            }
        });
        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               opr.setText("");
            }
        });


    }*/
    }
    public void click(View view) {
        if (view.getId() == R.id.one) {
            value = value + btn1.getText().toString();
            opr.setText(value);
        }
        else if (view.getId()==R.id.two){
            value=value+btn2.getText().toString();
            opr.setText(value);
        }
        else if (view.getId()==R.id.three){
            value=value+btn3.getText().toString();
            opr.setText(value);
        }
        else if (view.getId()==R.id.four){
            value=value+btn4.getText().toString();
            opr.setText(value);
        }
        else if (view.getId()==R.id.five){
            value=value+btn5.getText().toString();
            opr.setText(value);
        }
        else if (view.getId()==R.id.six){
            value=value+btn6.getText().toString();
            opr.setText(value);
        }
        else if (view.getId()==R.id.seven){
            value=value+btn7.getText().toString();
            opr.setText(value);
        }
        else if (view.getId()==R.id.eight){
            value=value+btn8.getText().toString();
            opr.setText(value);
        }
        else if (view.getId()==R.id.nine){
            value=value+btn9.getText().toString();
            opr.setText(value);
        }
        else if (view.getId()==R.id.zero){
            value=value+btn0.getText().toString();
            opr.setText(value);
        }
        else if (view.getId()==R.id.doublezero){
            value=value+btn00.getText().toString();
            opr.setText(value);
        }
        else if (view.getId()==R.id.plus){
            value2=value;
            value="";
            op="+";

            opr.setText("+");
        }
        else if (view.getId()==R.id.minus){
            value2=value;
            value="";
            op="-";
            opr.setText("-");        }
        else if (view.getId()==R.id.multiply){
            value2=value;
            value="";
            op="*";
            opr.setText("*");
        }
        else if (view.getId()==R.id.division){
            value2=value;
            value="";
            op="/";
            opr.setText("/");
        }
        else if (view.getId()==R.id.dot){
            value=value+btndot.getText().toString();
            opr.setText(value);
        }
        else if(view.getId()==R.id.equal){
                v=Integer.valueOf(value);
                v1=Integer.valueOf(value2);
            if (op.equals("+")){
                r=v1+v;
                opr.setText(String.valueOf(r));
                value2="";
                value="";
                op="";
            }else if (op.equals("-")){
             r=v1-v;
             opr.setText(String.valueOf(r));
             value2="";
             value="";
             op="";
            }
            else if (op.equals("*")){
                r=v*v1;
                opr.setText(String.valueOf(r));
                value2="";
                value="";
                op="";
            }
            else if (op.equals("/")){

                r=v/v1;
                opr.setText(String.valueOf(r));
                value2="";
                value="";
                op="";
            }


        }
    }


}
