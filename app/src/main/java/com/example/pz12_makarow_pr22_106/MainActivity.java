package com.example.pz12_makarow_pr22_106;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Double> numbers = new ArrayList<>();
    int ind;
    int kol;
    int kol2 = 0;
    int point_kol;
    Button one;
    Button two;
    Button three;
    Button four;
    Button five;
    Button six;
    Button seven;
    Button eight;
    Button nine;
    Button zero;
    TextView out;
    Button plus;
    String num = "";
    String primer = "";
    String a;
    double fin = 0;
    int c;
    int error;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        out = (TextView) findViewById(R.id.textView);
        one = (Button) findViewById(R.id.button_one);
        two = (Button) findViewById(R.id.button_two);
        three = (Button) findViewById(R.id.button_three);
        four = (Button) findViewById(R.id.button_four);
        five = (Button) findViewById(R.id.button_five);
        six = (Button) findViewById(R.id.button_six);
        seven = (Button) findViewById(R.id.button_seven);
        eight = (Button) findViewById(R.id.button_eight);
        nine = (Button) findViewById(R.id.button_nine);
    }

    public void btn1(View view) {

        out.setTextSize(50);
        fin = 0;
        num += "1";
        primer += "1";
        out.setText("" + primer);
    }

    public void btn2(View view) {
        out.setTextSize(50);
        fin = 0;
        num += "2";
        primer += "2";
        out.setText("" + primer);
    }

    public void btn3(View view) {
        out.setTextSize(50);
        fin = 0;
        num += "3";
        primer += "3";
        out.setText("" + primer);
    }

    public void btn4(View view) {
        out.setTextSize(50);
        fin = 0;
        num += "4";
        primer += "4";
        out.setText("" + primer);
    }

    public void btn5(View view) {
        out.setTextSize(50);
        fin = 0;
        num += "5";
        primer += "5";
        out.setText("" + primer);
    }

    public void btn6(View view) {
        out.setTextSize(50);
        fin = 0;
        num += "6";
        primer += "6";
        out.setText("" + primer);
    }

    public void btn7(View view) {
        out.setTextSize(50);
        fin = 0;
        num += "7";
        primer += "7";
        out.setText("" + primer);
    }

    public void btn8(View view) {
        out.setTextSize(50);
        fin = 0;
        num += "8";
        primer += "8";
        out.setText("" + primer);
    }

    public void btn9(View view) {
        out.setTextSize(50);
        fin = 0;
        num += "9";
        primer += "9";
        out.setText("" + primer);
    }

    public void btn0(View view) {
        out.setTextSize(50);
        fin = 0;
        num += "0";
        primer += "0";
        out.setText("" + primer);
    }

    public void btnPoint(View view) {
        out.setTextSize(50);

        if (kol2 == 0) {
            kol2 = 1;
            fin = 0;
            num += ".";
            primer += ".";
            out.setText("" + primer);
            point_kol += 1;
        }

    }

    public void plus(View view) {
        out.setTextSize(50);
        if (fin != 0) {
            numbers.add(fin);
            if(point_kol == 0)
            {
                c = (int)fin;
                primer = Integer.toString(c);
            }
            else {
                primer = Double.toString(fin);
            }
        } else {
            if (num == "") {
                numbers.add(Double.parseDouble("0"));
                primer += "0";
            } else {
                numbers.add(Double.parseDouble(num));
            }
        }
        primer += "+";
        out.setText("" + primer);
        num = "";
        ind = 1;
        kol = 1;
        kol2 = 0;
    }

    public void minus(View view) {
        out.setTextSize(50);
        if (fin != 0) {
            numbers.add(fin);
            if(point_kol == 0)
            {
                c = (int)fin;
                primer = Integer.toString(c);
            }
            else {
                primer = Double.toString(fin);
            }
        } else {
            if (num == "") {
                numbers.add(Double.parseDouble("0"));
                primer += "0";
            } else {
                numbers.add(Double.parseDouble(num));
            }
        }
        primer += "-";
        out.setText("" + primer);
        num = "";
        ind = 2;
        kol = 1;
        kol2 = 0;
    }

    public void div(View view) {
        out.setTextSize(50);
        if (fin != 0) {
            numbers.add(fin);
            if(point_kol == 0)
            {
                c = (int)fin;
                primer = Integer.toString(c);
            }
            else {
                primer = Double.toString(fin);
            }
        } else {
            if (num == "") {
                numbers.add(Double.parseDouble("0"));
                primer += "0";
            } else {
                numbers.add(Double.parseDouble(num));
            }
        }
        primer += "/";
        out.setText("" + primer);
        num = "";
        ind = 3;
        kol = 1;
        kol2 = 0;
    }

    public void mul(View view) {
        out.setTextSize(50);
        if (fin != 0) {
            numbers.add(fin);
            if(point_kol == 0)
            {
                c = (int)fin;
                primer = Integer.toString(c);
            }
            else {
                primer = Double.toString(fin);
            }
        } else {
            if (num == "") {
                numbers.add(Double.parseDouble("0"));
                primer += "0";
            } else {
                numbers.add(Double.parseDouble(num));
            }
        }
        primer += "x";
        out.setText("" + primer);
        num = "";
        ind = 4;
        kol = 1;
        kol2 = 0;
    }
public void  percent(View view)
{
    out.setTextSize(50);
    if (num == ""||num == "0")
    {
        numbers.add(Double.parseDouble("0"));
        primer = "";
        primer += "0";
    }
    else
    {
        double y = Double.valueOf(num);
        y = y/100;
        numbers.add(y);
        primer = "";
        primer += y;
        out.setText(primer);
    }
}
public void clear(View view)
    {
        out.setText("");
        numbers.clear();
        primer = "";
        num = "";
        point_kol = 0;

    }
    public void equal(View view) {
        out.setTextSize(50);
        try {


            if (num == "") {
                numbers.add(Double.parseDouble("0"));
                primer += "0";
            } else {
                numbers.add(Double.parseDouble(num));
            }
            switch (ind) {
                case 1:
                    fin = numbers.get(0) + numbers.get(1);
                    break;
                case 2:
                    fin = numbers.get(0) - numbers.get(1);
                    break;
                case 3:
                    if(numbers.get(1)==0)
                    {
                        throw new ArithmeticException("Попытка деления на ноль.");
                    }
                    else {
                        fin = numbers.get(0) / numbers.get(1);
                    }
                    break;
                case 4:
                    fin = numbers.get(0) * numbers.get(1);
                    break;
            }
            if (point_kol == 0) {
                int b = (int)fin;
                out.setText(primer + "=" + b);
            } else {
                a = Double.toString(fin);
                out.setText(primer + "=" + a);
            }
            num = "";
            primer = "";
            numbers.clear();
            kol2 = 0;
        }
        catch (ArithmeticException e)
        {
            out.setTextSize(20);
            out.setText(e.getMessage());
        }
    }
}


