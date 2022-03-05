package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private LinearLayout linear_layout;
    private ScrollView scrollView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linear_layout = findViewById(R.id.linear_layout);
        scrollView2 = findViewById(R.id.scrollView2);
    }
    public int new_textview = 0;
    public void button_7(View view){
        final float scale = linear_layout.getContext().getResources().getDisplayMetrics().density;
        int height_pixels = (int) (50 * scale + 0.5f);
        if(new_textview == 0){
            View view_to_insert =  linear_layout.getChildAt( linear_layout.getChildCount()-1 );
            if( view_to_insert instanceof TextView ) {
                TextView textView = (TextView) view_to_insert;
                textView.setText(textView.getText() + "7");
            }
        }
        else{
            TextView textView = new TextView(this);
            textView.setText("7");
            textView.setWidth(ViewGroup.LayoutParams.MATCH_PARENT);
            textView.setHeight(height_pixels);
            textView.setGravity(Gravity.END);
            linear_layout.addView(textView);
            scrollView2.smoothScrollTo(0, scrollView2.getHeight());
            new_textview = 0;
        }


    }
    public void button_8(View view) {
        final float scale = linear_layout.getContext().getResources().getDisplayMetrics().density;
        int height_pixels = (int) (50 * scale + 0.5f);
        if (new_textview == 0) {
            View view_to_insert = linear_layout.getChildAt(linear_layout.getChildCount() - 1);
            if (view_to_insert instanceof TextView) {
                TextView textView = (TextView) view_to_insert;
                textView.setText(textView.getText() + "8");
            }
        } else {
            TextView textView = new TextView(this);
            textView.setText("8");
            textView.setWidth(ViewGroup.LayoutParams.MATCH_PARENT);
            textView.setHeight(height_pixels);
            textView.setGravity(Gravity.END);
            linear_layout.addView(textView);
            new_textview = 0;
            scrollView2.smoothScrollTo(0, scrollView2.getHeight());
        }
    }
    public void button_9(View view) {
        final float scale = linear_layout.getContext().getResources().getDisplayMetrics().density;
        int height_pixels = (int) (50 * scale + 0.5f);
        if (new_textview == 0) {
            View view_to_insert = linear_layout.getChildAt(linear_layout.getChildCount() - 1);
            if (view_to_insert instanceof TextView) {
                TextView textView = (TextView) view_to_insert;
                textView.setText(textView.getText() + "9");
            }
        } else {
            TextView textView = new TextView(this);
            textView.setText("9");
            textView.setWidth(ViewGroup.LayoutParams.MATCH_PARENT);
            textView.setHeight(height_pixels);
            textView.setGravity(Gravity.END);
            linear_layout.addView(textView);
            new_textview = 0;
            scrollView2.smoothScrollTo(0, scrollView2.getHeight());
        }
    }
    public void button_4(View view) {
        final float scale = linear_layout.getContext().getResources().getDisplayMetrics().density;
        int height_pixels = (int) (50 * scale + 0.5f);
        if (new_textview == 0) {
            View view_to_insert = linear_layout.getChildAt(linear_layout.getChildCount() - 1);
            if (view_to_insert instanceof TextView) {
                TextView textView = (TextView) view_to_insert;
                textView.setText(textView.getText() + "4");
            }
        } else {
            TextView textView = new TextView(this);
            textView.setText("4");
            textView.setWidth(ViewGroup.LayoutParams.MATCH_PARENT);
            textView.setHeight(height_pixels);
            textView.setGravity(Gravity.END);
            linear_layout.addView(textView);
            new_textview = 0;
            scrollView2.smoothScrollTo(0, scrollView2.getHeight());
        }
    }
    public void button_5(View view) {
        final float scale = linear_layout.getContext().getResources().getDisplayMetrics().density;
        int height_pixels = (int) (50 * scale + 0.5f);
        if (new_textview == 0) {
            View view_to_insert = linear_layout.getChildAt(linear_layout.getChildCount() - 1);
            if (view_to_insert instanceof TextView) {
                TextView textView = (TextView) view_to_insert;
                textView.setText(textView.getText() + "5");
            }
        } else {
            TextView textView = new TextView(this);
            textView.setText("5");
            textView.setWidth(ViewGroup.LayoutParams.MATCH_PARENT);
            textView.setHeight(height_pixels);
            textView.setGravity(Gravity.END);
            linear_layout.addView(textView);
            scrollView2.smoothScrollTo(0, scrollView2.getHeight());
            new_textview = 0;
        }
    }
    public void button_6(View view) {
        final float scale = linear_layout.getContext().getResources().getDisplayMetrics().density;
        int height_pixels = (int) (50 * scale + 0.5f);
        if (new_textview == 0) {
            View view_to_insert = linear_layout.getChildAt(linear_layout.getChildCount() - 1);
            if (view_to_insert instanceof TextView) {
                TextView textView = (TextView) view_to_insert;
                textView.setText(textView.getText() + "6");
            }
        } else {
            TextView textView = new TextView(this);
            textView.setText("6");
            textView.setWidth(ViewGroup.LayoutParams.MATCH_PARENT);
            textView.setHeight(height_pixels);
            textView.setGravity(Gravity.END);
            linear_layout.addView(textView);
            new_textview = 0;
            scrollView2.smoothScrollTo(0, scrollView2.getHeight());
        }
    }
    public void button_3(View view) {
        final float scale = linear_layout.getContext().getResources().getDisplayMetrics().density;
        int height_pixels = (int) (50 * scale + 0.5f);
        if (new_textview == 0) {
            View view_to_insert = linear_layout.getChildAt(linear_layout.getChildCount() - 1);
            if (view_to_insert instanceof TextView) {
                TextView textView = (TextView) view_to_insert;
                textView.setText(textView.getText() + "3");
            }
        } else {
            TextView textView = new TextView(this);
            textView.setText("3");
            textView.setWidth(ViewGroup.LayoutParams.MATCH_PARENT);
            textView.setHeight(height_pixels);
            textView.setGravity(Gravity.END);
            linear_layout.addView(textView);
            new_textview = 0;
            scrollView2.smoothScrollTo(0, scrollView2.getHeight());
        }
    }
    public void button_2(View view) {
        final float scale = linear_layout.getContext().getResources().getDisplayMetrics().density;
        int height_pixels = (int) (50 * scale + 0.5f);
        if (new_textview == 0) {
            View view_to_insert = linear_layout.getChildAt(linear_layout.getChildCount() - 1);
            if (view_to_insert instanceof TextView) {
                TextView textView = (TextView) view_to_insert;
                textView.setText(textView.getText() + "2");
            }
        } else {
            TextView textView = new TextView(this);
            textView.setText("2");
            textView.setWidth(ViewGroup.LayoutParams.MATCH_PARENT);
            textView.setHeight(height_pixels);
            textView.setGravity(Gravity.END);
            linear_layout.addView(textView);
            scrollView2.smoothScrollTo(0, scrollView2.getHeight());
            new_textview = 0;
        }
    }
    public void button_1(View view) {
        final float scale = linear_layout.getContext().getResources().getDisplayMetrics().density;
        int height_pixels = (int) (50 * scale + 0.5f);
        if (new_textview == 0) {
            View view_to_insert = linear_layout.getChildAt(linear_layout.getChildCount() - 1);
            if (view_to_insert instanceof TextView) {
                TextView textView = (TextView) view_to_insert;
                textView.setText(textView.getText() + "1");
            }
        } else {
            TextView textView = new TextView(this);
            textView.setText("1");
            textView.setWidth(ViewGroup.LayoutParams.MATCH_PARENT);
            textView.setHeight(height_pixels);
            textView.setGravity(Gravity.END);
            linear_layout.addView(textView);
            scrollView2.smoothScrollTo(0, scrollView2.getHeight());
            new_textview = 0;
        }
    }
    public void button_0(View view) {
        final float scale = linear_layout.getContext().getResources().getDisplayMetrics().density;
        int height_pixels = (int) (50 * scale + 0.5f);
        if (new_textview == 0) {
            View view_to_insert = linear_layout.getChildAt(linear_layout.getChildCount() - 1);
            if (view_to_insert instanceof TextView) {
                TextView textView = (TextView) view_to_insert;
                textView.setText(textView.getText() + "0");
            }
        } else {
            TextView textView = new TextView(this);
            textView.setText("0");
            textView.setWidth(ViewGroup.LayoutParams.MATCH_PARENT);
            textView.setHeight(height_pixels);
            textView.setGravity(Gravity.END);
            linear_layout.addView(textView);
            scrollView2.smoothScrollTo(0, scrollView2.getHeight());
            new_textview = 0;
        }
    }
    public void button_plus(View view) {
        if (new_textview == 0) {
            View view_to_insert = linear_layout.getChildAt(linear_layout.getChildCount() - 1);
            if (view_to_insert instanceof TextView) {
                TextView textView = (TextView) view_to_insert;
                textView.setText(textView.getText() + "+");
            }
        }
    }
    public void button_minus(View view) {
        if (new_textview == 0) {
            View view_to_insert = linear_layout.getChildAt(linear_layout.getChildCount() - 1);
            if (view_to_insert instanceof TextView) {
                TextView textView = (TextView) view_to_insert;
                textView.setText(textView.getText() + "-");
            }
        }
    }
    public void button_multiply(View view) {
        if (new_textview == 0) {
            View view_to_insert = linear_layout.getChildAt(linear_layout.getChildCount() - 1);
            if (view_to_insert instanceof TextView) {
                TextView textView = (TextView) view_to_insert;
                textView.setText(textView.getText() + "*");
            }
        }
    }
    public void button_divide(View view) {
        if (new_textview == 0) {
            View view_to_insert = linear_layout.getChildAt(linear_layout.getChildCount() - 1);
            if (view_to_insert instanceof TextView) {
                TextView textView = (TextView) view_to_insert;
                textView.setText(textView.getText() + "/");
            }
        }
    }
    public void button_decimal(View view) {
        if (new_textview == 0) {
            View view_to_insert = linear_layout.getChildAt(linear_layout.getChildCount() - 1);
            if (view_to_insert instanceof TextView) {
                TextView textView = (TextView) view_to_insert;
                textView.setText(textView.getText() + ".");
            }
        }
    }
    public void button_equal(View view){
        final float scale = linear_layout.getContext().getResources().getDisplayMetrics().density;
        int height_pixels = (int) (50 * scale + 0.5f);
        String eval_string;
        double result;
        View view_to_insert = linear_layout.getChildAt(linear_layout.getChildCount() - 1);
        if (view_to_insert instanceof TextView) {
            TextView textView = (TextView) view_to_insert;
            eval_string = (String) textView.getText();
            result = eval(eval_string);
            TextView textViewtoinsert = new TextView(this);
            textViewtoinsert.setText(String.valueOf(result));
            textViewtoinsert.setWidth(ViewGroup.LayoutParams.MATCH_PARENT);
            textViewtoinsert.setHeight(height_pixels);
            textViewtoinsert.setGravity(Gravity.END);
            linear_layout.addView(textViewtoinsert);
            scrollView2.smoothScrollTo(0, scrollView2.getHeight());
            new_textview = 1;
        }


    }
    public void button_clear(View view){
        View view_to_insert = linear_layout.getChildAt(linear_layout.getChildCount() - 1);
        if (view_to_insert instanceof TextView) {
            TextView textView = (TextView) view_to_insert;
            textView.setText("0");
        }
    }

    public static double eval(final String str) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
                return x;
            }

            // Grammar:
            // expression = term | expression `+` term | expression `-` term
            // term = factor | term `*` factor | term `/` factor
            // factor = `+` factor | `-` factor | `(` expression `)` | number
            //        | functionName `(` expression `)` | functionName factor
            //        | factor `^` factor

            double parseExpression() {
                double x = parseTerm();
                for (;;) {
                    if      (eat('+')) x += parseTerm(); // addition
                    else if (eat('-')) x -= parseTerm(); // subtraction
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if      (eat('*')) x *= parseFactor(); // multiplication
                    else if (eat('/')) x /= parseFactor(); // division
                    else return x;
                }
            }

            double parseFactor() {
                if (eat('+')) return +parseFactor(); // unary plus
                if (eat('-')) return -parseFactor(); // unary minus

                double x;
                int startPos = this.pos;
                if (eat('(')) { // parentheses
                    x = parseExpression();
                    if (!eat(')')) throw new RuntimeException("Missing ')'");
                } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') { // functions
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startPos, this.pos);
                    if (eat('(')) {
                        x = parseExpression();
                        if (!eat(')')) throw new RuntimeException("Missing ')' after argument to " + func);
                    } else {
                        x = parseFactor();
                    }
                    if (func.equals("sqrt")) x = Math.sqrt(x);
                    else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                    else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                    else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                    else throw new RuntimeException("Unknown function: " + func);
                } else {
                    throw new RuntimeException("Unexpected: " + (char)ch);
                }

                if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation

                return x;
            }
        }.parse();
    }
}