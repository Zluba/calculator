package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.app.Activity;

public class CalculatorActivity extends Activity  implements OnClickListener{

    //声明一些控件
    Button ac_but=null;
    Button sq_but=null;
    Button cube_but=null;
    Button percent_but=null;
    Button plus_but=null;
    Button minus_but=null;
    Button multiply_but=null;
    Button divide_but=null;
    Button one_but=null;
    Button two_but=null;
    Button three_but=null;
    Button four_but=null;
    Button five_but=null;
    Button six_but=null;
    Button seven_but=null;
    Button eight_but=null;
    Button nine_but=null;
    Button zero_but=null;
    Button back_but=null;
    Button equal_but=null;
    TextView show=null;
    //声明两个参数。接收show前后的值
    double num1=0,num2=0;
    double Result=0;//计算结果
    int op=0;//判断操作数，
    boolean isClickEqu=false;//判断是否按了“=”按钮

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        //从布局文件中获取控件，
        ac_but=(Button)findViewById(R.id.ac_but);
        sq_but=(Button)findViewById(R.id.sq_but);
        cube_but=(Button)findViewById(R.id.cube_but);
        percent_but=(Button)findViewById(R.id.percent_but);
        plus_but=(Button)findViewById(R.id.plus_but);
        minus_but=(Button)findViewById(R.id.minus_but);
        multiply_but=(Button)findViewById(R.id.multiply_but);
        divide_but=(Button)findViewById(R.id.divide_but);
        one_but=(Button)findViewById(R.id.one_but);
        two_but=(Button)findViewById(R.id.two_but);
        three_but=(Button)findViewById(R.id.three_but);
        four_but=(Button)findViewById(R.id.four_but);
        five_but=(Button)findViewById(R.id.five_but);
        six_but=(Button)findViewById(R.id.six_but);
        seven_but=(Button)findViewById(R.id.seven_but);
        eight_but=(Button)findViewById(R.id.eight_but);
        nine_but=(Button)findViewById(R.id.nine_but);
        zero_but=(Button)findViewById(R.id.zero_but);
        back_but=(Button)findViewById(R.id.back_but);
        equal_but=(Button)findViewById(R.id.equal_but);
        show=(TextView)findViewById(R.id.show);

        //添加监听\
        back_but.setOnClickListener(this);
        ac_but.setOnClickListener(this);

        zero_but.setOnClickListener(this);
        one_but.setOnClickListener(this);
        two_but.setOnClickListener(this);
        three_but.setOnClickListener(this);
        four_but.setOnClickListener(this);
        five_but.setOnClickListener(this);
        six_but.setOnClickListener(this);
        seven_but.setOnClickListener(this);
        eight_but.setOnClickListener(this);
        nine_but.setOnClickListener(this);

        percent_but.setOnClickListener(this);
        plus_but.setOnClickListener(this);
        minus_but.setOnClickListener(this);
        multiply_but.setOnClickListener(this);
        divide_but.setOnClickListener(this);
        equal_but.setOnClickListener(this);
        sq_but.setOnClickListener(this);
        cube_but.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            //btnBackspace和CE--------------------
            case R.id.back_but:
                String myStr=show.getText().toString();
                try {
                    show.setText(myStr.substring(0, myStr.length() - 1));
                } catch (Exception e) {
                    show.setText("");
                }

                break;
            case R.id.ac_but:
                show.setText(null);
                break;

            //btn0--9---------------------------
            case R.id.zero_but:
                if(isClickEqu)
                {
                    show.setText(null);
                    isClickEqu=false;
                }
                String myString=show.getText().toString();
                myString+="0";
                show.setText(myString);
                break;
            case R.id.one_but:
                if(isClickEqu)
                {
                    show.setText(null);
                    isClickEqu=false;
                }
                String myString1=show.getText().toString();
                myString1+="1";
                show.setText(myString1);
                break;
            case R.id.two_but:
                if(isClickEqu)
                {
                    show.setText(null);
                    isClickEqu=false;
                }
                String myString2=show.getText().toString();
                myString2+="2";
                show.setText(myString2);
                break;
            case R.id.three_but:
                if(isClickEqu)
                {
                    show.setText(null);
                    isClickEqu=false;
                }
                String myString3=show.getText().toString();
                myString3+="3";
                show.setText(myString3);
                break;
            case R.id.four_but:
                if(isClickEqu)
                {
                    show.setText(null);
                    isClickEqu=false;
                }
                String myString4=show.getText().toString();
                myString4+="4";
                show.setText(myString4);
                break;
            case R.id.five_but:
                if(isClickEqu)
                {
                    five_but.setText(null);
                    isClickEqu=false;
                }
                String myString5=show.getText().toString();
                myString5+="5";
                show.setText(myString5);
                break;
            case R.id.six_but:
                if(isClickEqu)
                {
                    show.setText(null);
                    isClickEqu=false;
                }
                String myString6=show.getText().toString();
                myString6+="6";
                show.setText(myString6);
                break;
            case R.id.seven_but:
                if(isClickEqu)
                {
                    show.setText(null);
                    isClickEqu=false;
                }
                String myString7=show.getText().toString();
                myString7+="7";
                show.setText(myString7);
                break;
            case R.id.eight_but:
                if(isClickEqu)
                {
                    show.setText(null);
                    isClickEqu=false;
                }
                String myString8=show.getText().toString();
                myString8+="8";
                show.setText(myString8);
                break;
            case R.id.nine_but:
                if(isClickEqu)
                {
                    show.setText(null);
                    isClickEqu=false;
                }
                String myString9=show.getText().toString();
                myString9+="9";
                show.setText(myString9);
                break;

            //btn+-*/=--------------------------------
            case R.id.plus_but:
                String myStringAdd=show.getText().toString();
                if(myStringAdd.equals(null))
                {
                    return;
                }
                num1=Double.valueOf(myStringAdd);
                show.setText(null);
                op=1;
                isClickEqu=false;
                break;

            case R.id.minus_but:
                String myStringSub=show.getText().toString();
                if(myStringSub.equals(null))
                {
                    return;
                }
                num1=Double.valueOf(myStringSub);
                show.setText(null);
                op=2;
                isClickEqu=false;
                break;
            case R.id.multiply_but:
                String myStringMul=show.getText().toString();
                if(myStringMul.equals(null))
                {
                    return;
                }
                num1=Double.valueOf(myStringMul);
                show.setText(null);
                op=3;
                isClickEqu=false;
                break;
            case R.id.divide_but:
                String myStringDiv=show.getText().toString();
                if(myStringDiv.equals(null))
                {
                    return;
                }
                num1=Double.valueOf(myStringDiv);
                show.setText(null);
                op=4;
                isClickEqu=false;
                break;
            case R.id.percent_but:
                String myStringPer=show.getText().toString();
                num1=Double.valueOf(myStringPer);
                num1=num1/100;
                String show3=String.valueOf(num1);
                show.setText(show3);
                isClickEqu=true;
                break;
            case R.id.sq_but:
                String myStringsq=show.getText().toString();
                num1=Double.valueOf(myStringsq);
                double num2=num1*num1;
                String show1=String.valueOf(num2);
                show.setText(show1);
                isClickEqu=true;
                break;
            case R.id.cube_but:
                String myStringcube=show.getText().toString();
                num1=Double.valueOf(myStringcube);
                double numCube=num1*num1*num1;
                String show2=String.valueOf(numCube);
                show.setText(show2);
                isClickEqu=true;
                break;
            case R.id.equal_but:
                String myStringEqu=show.getText().toString();
                if(myStringEqu.equals(null))
                {
                    return;
                }
                num2=Double.valueOf(myStringEqu);
                show.setText(null);
                switch (op) {
                    case 0:
                        Result=num2;
                        break;
                    case 1:
                        Result=num1+num2;
                        break;
                    case 2:
                        Result=num1-num2;
                        break;
                    case 3:
                        Result=num1*num2;
                        break;
                    case 4:
                        Result=num1/num2;
                        break;
                    default:
                        Result=0;
                        break;
                }
                show.setText(String.valueOf(Result));
                isClickEqu=true;
                break;

            default:
                break;
        }
    }
}
