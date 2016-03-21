package com.example.dellinc.calc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    Button button0,button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,buttonAdd,buttonSub,buttonMul,buttonDivision,buttonC,buttonEqual,buttonsin,buttoncos,buttontan,buttonlog,buttonasin,buttonatan,buttonsqrt,buttonacos;
        final EditText display;
        final float[] mValueOne = new float[1];
        final double[] value = new double[1];
        final String[] result = new String[1];
        final boolean[] mAddition = new boolean[1]; final boolean[] mSubtract = new boolean[1]; final boolean[] mMultiplication = new boolean[1]; final boolean[] mDivision = new boolean[1];
        final boolean[] msin = new boolean[1];final boolean[] cos = new boolean[1];final boolean[] tan = new boolean[1];final boolean[] log = new boolean[1];
        final boolean[] acos = new boolean[1];final boolean[] asin = new boolean[1];final boolean[] sqrt = new boolean[1];final boolean[] atan = new boolean[1];
        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        display = (EditText)findViewById(R.id.tv);
        button10 = (Button) findViewById(R.id.button10);
        buttonAdd = (Button) findViewById(R.id.buttonadd);
        buttonSub = (Button) findViewById(R.id.buttonsub);
        buttonMul = (Button) findViewById(R.id.buttonmul);
        buttonDivision = (Button) findViewById(R.id.buttondiv);
        buttonC = (Button) findViewById(R.id.buttonc);
        buttonEqual = (Button) findViewById(R.id.equal);
        buttonsin = (Button) findViewById(R.id.sin);
        buttoncos = (Button) findViewById(R.id.cos);
        buttontan = (Button) findViewById(R.id.tan);
        buttonlog = (Button) findViewById(R.id.log);
        buttonasin = (Button) findViewById(R.id.asin);
        buttonatan = (Button) findViewById(R.id.atan);
        buttonsqrt = (Button) findViewById(R.id.sqrt);
        buttonacos = (Button) findViewById(R.id.acos);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+"1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+"2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+"4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+"5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+"6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+"7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+"8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+"9");
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+".");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+"0");
            }
        });



        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (display == null){
                    display.setText("");
                }else {
                    mValueOne[0] = Float.parseFloat(display.getText() + "");
                    mAddition[0] = true;
                    display.setText(null);
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne[0] = Float.parseFloat(display.getText() + "");
                mSubtract[0] = true ;
                display.setText(null);
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne[0] = Float.parseFloat(display.getText() + "");
                mMultiplication[0] = true ;
                display.setText(null);
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne[0] = Float.parseFloat(display.getText()+"");
                mDivision[0] = true ;
                display.setText(null);
            }
        });

        buttonsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value[0] = Double.parseDouble(display.getText() + "");
                msin[0] = true;

            }
        });

        buttoncos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value[0] = Double.parseDouble(display.getText() + "");
                cos[0] = true;

            }
        });
        buttontan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value[0] = Double.parseDouble(display.getText() + "");
                tan[0] = true;

            }
        });
        buttonlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value[0] = Double.parseDouble(display.getText() + "");
                log[0] = true;

            }
        });
        buttonsqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value[0] = Double.parseDouble(display.getText() + "");
                sqrt[0] = true;

            }
        });
        buttonasin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value[0] = Double.parseDouble(display.getText() + "");
                asin[0] = true;

            }
        });
        buttonacos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value[0] = Double.parseDouble(display.getText() + "");
                acos[0] = true;

            }
        });
        buttonatan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value[0] = Double.parseDouble(display.getText() + "");
                atan[0] = true;

            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float mValueTwo = Float.parseFloat(display.getText() + "");

                if (mAddition[0] == true){

                    display.setText(mValueOne[0] + mValueTwo +"");
                    mAddition[0] =false;
                }


                if (mSubtract[0] == true){
                    display.setText(mValueOne[0] - mValueTwo+"");
                    mSubtract[0] =false;
                }

                if (mMultiplication[0] == true){
                    display.setText(mValueOne[0] * mValueTwo+"");
                    mMultiplication[0] =false;
                }

                if (mDivision[0] == true){
                    display.setText(mValueOne[0] / mValueTwo+"");
                    mDivision[0] =false;
                }
     if(msin[0] == true)
     {
         result[0] = Math.sin(value[0]) + "";
         display.setText(result[0]);

     }

                if(cos[0] == true)
                {
                    result[0] = Math.cos(value[0]) + "";
                    display.setText(result[0]);

                }
                if(tan[0] == true)
                {
                    result[0] = Math.tan(value[0]) + "";
                    display.setText(result[0]);

                }
                if(log[0] == true)
                {
                    result[0] = Math.log(value[0]) + "";
                    display.setText(result[0]);

                }
                if(asin[0] == true)
                {
                    result[0] = Math.asin(value[0]) + "";
                    display.setText(result[0]);

                }
                if(acos[0] == true)
                {
                    result[0] = Math.acos(value[0]) + "";
                    display.setText(result[0]);

                }
                if(atan[0] == true)
                {
                    result[0] = Math.atan(value[0]) + "";
                    display.setText(result[0]);

                }
                if(sqrt[0] == true)
                {
                    result[0] = Math.sqrt(value[0]) + "";
                    display.setText(result[0]);

                }


            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText("");
            }
        });





    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
