package com.example.alstm.cal_2015920018;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView text_result;
    Button btn_add,btn_sub,btn_mul,btn_div,btn_mod,btn_chg,result;
    String num1 = "";
    String num2 = "";
    int Cal;
    double dnum1=0;
    double dnum2=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text_result = findViewById(R.id.text_res);
        text_result.setText("");
        btn_add = findViewById(R.id.btn_add);
        btn_sub = findViewById(R.id.btn_sub);
        btn_mul = findViewById(R.id.btn_mul);
        btn_div = findViewById(R.id.btn_div);
        btn_mod = findViewById(R.id.btn_mod);
        btn_chg = findViewById(R.id.btn_chg);
        result = findViewById(R.id.btn_res);
        btn_add.setOnClickListener(oCListener);
        btn_sub.setOnClickListener(oCListener);
        btn_mul.setOnClickListener(oCListener);
        btn_div.setOnClickListener(oCListener);
        btn_mod.setOnClickListener(oCListener);
        result.setOnClickListener(oCListener);
        btn_chg.setOnClickListener(chgListner);

        Button btn_ac = findViewById(R.id.btn_ac);
        btn_ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_result.setText("0");
            }
        });

    }
//#################연산을 수행하고 연산의 결과가 나올 수 있도록 실행시켜주는 함수입니다.######################
    Button.OnClickListener oCListener = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {

            switch (v.getId()) {
                case R.id.btn_add:
                    num1 = text_result.getText().toString();
                    text_result.setText("");
                    Cal = 0;
                    break;

                case R.id.btn_sub:
                    num1 = text_result.getText().toString();
                    text_result.setText("");
                    Cal = 1;
                    break;

                case R.id.btn_mul:
                    num1 = text_result.getText().toString();
                    text_result.setText("");
                    Cal = 2;
                    break;

                case R.id.btn_div:
                    num1 = text_result.getText().toString();
                    text_result.setText("");
                    Cal = 3;
                    break;

                case R.id.btn_mod:
                    num1 = text_result.getText().toString();
                    text_result.setText("");
                    Cal = 4;
                    break;


                case R.id.btn_res:
                    double result = 0;
                    num2 = text_result.getText().toString();
                    dnum1 = Double.parseDouble(num1);
                    dnum2 = Double.parseDouble(num2);
                    if (Cal == 0) {
                        result = dnum1 + dnum2;
                        if(result-(int)result==0) {
                            text_result.setText("" + (int) result);
                        }
                        else{
                            text_result.setText(""+result);
                        }
                    } else if (Cal == 1) {
                        result = dnum1 - dnum2;
                        if(result-(int)result==0) {
                            text_result.setText("" + (int) result);
                        }
                        else{
                            text_result.setText(""+result);
                        }
                    } else if (Cal == 2) {
                        result = dnum1 * dnum2;
                        if(result-(int)result==0) {
                            text_result.setText("" + (int) result);
                        }
                        else{
                            text_result.setText(""+result);
                        }
                    } else if (Cal == 3) {
                        result = dnum1 / dnum2;
                        if(result-(int)result==0) {
                            text_result.setText("" + (int) result);
                        }
                        else{
                            text_result.setText(""+result);
                        }
                    } else if (Cal == 4) {
                        result = dnum1 % dnum2;
                        if(result-(int)result==0) {
                            text_result.setText("" + (int) result);
                        }
                        else{
                            text_result.setText(""+result);
                        }
                    }
                    num1 = text_result.getText().toString();
                    break;
            }

            }};

    // ####################+/-(chgListenr) 기능을 하게 해주는 함수입니다.####################
    Button.OnClickListener chgListner = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            if( ( (Double.parseDouble(text_result.getText().toString())) - ((int)Double.parseDouble(text_result.getText().toString())) ) == 0.0 )
            {
                text_result.setText( "" + (Integer.parseInt(text_result.getText().toString()) * -1) );
            }
            else {
                text_result.setText( "" + (Double.parseDouble(text_result.getText().toString()) * -1) );
            }

        }
    };
    //############### 숫자버튼에 따른 숫자를 저장해주는 클릭 메소드입니다.############################
    public void onClick (View v)
    {   if(text_result.getText().toString()=="0"){
        text_result.setText("");
    }
        switch(v.getId()){
            case R.id.btn_0 : text_result.setText(text_result.getText().toString() + 0); break;
            case R.id.btn_0_1 : text_result.setText(text_result.getText().toString() + 0); break;
            case R.id.btn_1 : text_result.setText(text_result.getText().toString() + 1); break;
            case R.id.btn_2 : text_result.setText(text_result.getText().toString() + 2); break;
            case R.id.btn_3 : text_result.setText(text_result.getText().toString() + 3); break;
            case R.id.btn_4 : text_result.setText(text_result.getText().toString() + 4); break;
            case R.id.btn_5 : text_result.setText(text_result.getText().toString() + 5); break;
            case R.id.btn_6 : text_result.setText(text_result.getText().toString() + 6); break;
            case R.id.btn_7 : text_result.setText(text_result.getText().toString() + 7); break;
            case R.id.btn_8 : text_result.setText(text_result.getText().toString() + 8); break;
            case R.id.btn_9 : text_result.setText(text_result.getText().toString() + 9); break;
            case R.id.btn_dot : text_result.setText(text_result.getText().toString() + "."); break;
        }
    }
}