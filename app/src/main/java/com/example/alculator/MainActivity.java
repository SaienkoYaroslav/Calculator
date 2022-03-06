package com.example.alculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvResult;
    private Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonDelete,
            buttonDivide, buttonMultiply, buttonPlus, buttonMinus, buttonPoint, buttonEqual, buttonDeleteLastChar;
    private String userNumber = "";
    private int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    private String idOperation;
    private Float firstNumber, secondNumber;
    private float floatResult;
    private boolean idButtonPoint = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        clickButton0();
        clickButton1();
        clickButton2();
        clickButton3();
        clickButton4();
        clickButton5();
        clickButton6();
        clickButton7();
        clickButton8();
        clickButton9();
        clickButtonDelete();
        clickButtonDivide();
        clickButtonMultiply();
        clickButtonPlus();
        clickButtonMinus();
        clickButtonPoint();
        clickButtonEqual();
        clickButtonDeleteLastChar();
    }

    void init() {
        tvResult = findViewById(R.id.tv_result);
        button0 = findViewById(R.id.button_0);
        button1 = findViewById(R.id.button_1);
        button2 = findViewById(R.id.button_2);
        button3 = findViewById(R.id.button_3);
        button4 = findViewById(R.id.button_4);
        button5 = findViewById(R.id.button_5);
        button6 = findViewById(R.id.button_6);
        button7 = findViewById(R.id.button_7);
        button8 = findViewById(R.id.button_8);
        button9 = findViewById(R.id.button_9);
        buttonDelete = findViewById(R.id.button_delete);
        buttonDivide = findViewById(R.id.button_divide);
        buttonMultiply = findViewById(R.id.button_multiply);
        buttonPlus = findViewById(R.id.button_plus);
        buttonMinus = findViewById(R.id.button_minus);
        buttonPoint = findViewById(R.id.button_point);
        buttonEqual = findViewById(R.id.button_equal);
        buttonDeleteLastChar = findViewById(R.id.button_delete_last_char);
    }

    void clickButton0() {
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userNumber = userNumber + numbers[0];
                tvResult.setText(userNumber);
            }
        });
    }

    void clickButton1() {
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userNumber = userNumber + numbers[1];
                tvResult.setText(userNumber);
            }
        });
    }

    void clickButton2() {
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userNumber = userNumber + numbers[2];
                tvResult.setText(userNumber);
            }
        });
    }

    void clickButton3() {
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userNumber = userNumber + numbers[3];
                tvResult.setText(userNumber);
            }
        });
    }

    void clickButton4() {
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userNumber = userNumber + numbers[4];
                tvResult.setText(userNumber);
            }
        });
    }

    void clickButton5() {
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userNumber = userNumber + numbers[5];
                tvResult.setText(userNumber);
            }
        });
    }

    void clickButton6() {
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userNumber = userNumber + numbers[6];
                tvResult.setText(userNumber);
            }
        });
    }

    void clickButton7() {
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userNumber = userNumber + numbers[7];
                tvResult.setText(userNumber);
            }
        });
    }

    void clickButton8() {
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userNumber = userNumber + numbers[8];
                tvResult.setText(userNumber);
            }
        });
    }

    void clickButton9() {
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userNumber = userNumber + numbers[9];
                tvResult.setText(userNumber);
            }
        });
    }

    void clickButtonDelete() {
        buttonDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userNumber = "";
                tvResult.setText(userNumber);
                firstNumber = null;
                secondNumber = null;

                if (idButtonPoint == false) {
                    buttonPoint.setEnabled(true);
                    idButtonPoint = true;
                }
            }
        });
    }

    void clickButtonDeleteLastChar() {
        buttonDeleteLastChar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (userNumber != null && userNumber.length() > 0) {
                    userNumber = userNumber.substring(0, userNumber.length() - 1);
                }
                tvResult.setText(userNumber);
            }
        });
    }

    void clickButtonDivide() {
        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (firstNumber == null) {
                    String stringFirstNumber = tvResult.getText().toString();
                    if (stringFirstNumber != null && !stringFirstNumber.trim().isEmpty()) {
                        firstNumber = Float.parseFloat(stringFirstNumber);
                    }
                } else if (firstNumber != null) {
                    String stringSecondNumber = tvResult.getText().toString();
                    secondNumber = Float.parseFloat(stringSecondNumber);
                    switch (idOperation) {
                        case "/":
                            floatResult = firstNumber / secondNumber;
                            break;
                        case "*":
                            floatResult = firstNumber * secondNumber;
                            break;
                        case "+":
                            floatResult = firstNumber + secondNumber;
                            break;
                        case "-":
                            floatResult = firstNumber - secondNumber;
                            break;
                    }
                    firstNumber = floatResult;
                    userNumber = String.valueOf(floatResult);
                    tvResult.setText(userNumber);
                }
                userNumber = "";
                idOperation = "/";

                if (idButtonPoint == false) {
                    buttonPoint.setEnabled(true);
                    idButtonPoint = true;
                }
            }
        });
    }

    void clickButtonMultiply() {
        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (firstNumber == null) {
                    String stringFirstNumber = tvResult.getText().toString();
                    if (stringFirstNumber != null && !stringFirstNumber.trim().isEmpty()) {
                        firstNumber = Float.parseFloat(stringFirstNumber);
                    }
                } else if (firstNumber != null) {
                    String stringSecondNumber = tvResult.getText().toString();
                    secondNumber = Float.parseFloat(stringSecondNumber);
                    switch (idOperation) {
                        case "/":
                            floatResult = firstNumber / secondNumber;
                            break;
                        case "*":
                            floatResult = firstNumber * secondNumber;
                            break;
                        case "+":
                            floatResult = firstNumber + secondNumber;
                            break;
                        case "-":
                            floatResult = firstNumber - secondNumber;
                            break;
                    }
                    firstNumber = floatResult;
                    userNumber = String.valueOf(floatResult);
                    tvResult.setText(userNumber);
                }
                userNumber = "";
                idOperation = "*";

                if (idButtonPoint == false) {
                    buttonPoint.setEnabled(true);
                    idButtonPoint = true;
                }
            }
        });
    }

    void clickButtonPlus() {
        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (firstNumber == null) {
                    String stringFirstNumber = tvResult.getText().toString();
                    if (stringFirstNumber != null && !stringFirstNumber.trim().isEmpty()) {
                        firstNumber = Float.parseFloat(stringFirstNumber);
                    }
                } else if (firstNumber != null) {
                    String stringSecondNumber = tvResult.getText().toString();
                    secondNumber = Float.parseFloat(stringSecondNumber);
                    switch (idOperation) {
                        case "/":
                            floatResult = firstNumber / secondNumber;
                            break;
                        case "*":
                            floatResult = firstNumber * secondNumber;
                            break;
                        case "+":
                            floatResult = firstNumber + secondNumber;
                            break;
                        case "-":
                            floatResult = firstNumber - secondNumber;
                            break;
                    }
                    firstNumber = floatResult;
                    userNumber = String.valueOf(floatResult);
                    tvResult.setText(userNumber);
                }
                userNumber = "";
                idOperation = "+";

                if (idButtonPoint == false) {
                    buttonPoint.setEnabled(true);
                    idButtonPoint = true;
                }
            }
        });
    }

    void clickButtonMinus() {
        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (firstNumber == null) {
                    String stringFirstNumber = tvResult.getText().toString();
                    if (stringFirstNumber != null && !stringFirstNumber.trim().isEmpty()) {
                        firstNumber = Float.parseFloat(stringFirstNumber);
                    }
                } else if (firstNumber != null) {
                    String stringSecondNumber = tvResult.getText().toString();
                    secondNumber = Float.parseFloat(stringSecondNumber);
                    switch (idOperation) {
                        case "/":
                            floatResult = firstNumber / secondNumber;
                            break;
                        case "*":
                            floatResult = firstNumber * secondNumber;
                            break;
                        case "+":
                            floatResult = firstNumber + secondNumber;
                            break;
                        case "-":
                            floatResult = firstNumber - secondNumber;
                            break;
                    }
                    firstNumber = floatResult;
                    userNumber = String.valueOf(floatResult);
                    tvResult.setText(userNumber);
                }
                userNumber = "";
                idOperation = "-";

                if (idButtonPoint == false) {
                    buttonPoint.setEnabled(true);
                    idButtonPoint = true;
                }
            }
        });
    }

    void clickButtonPoint() {
        buttonPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (userNumber != "")
                    userNumber = userNumber + ".";
                tvResult.setText(userNumber);
                buttonPoint.setEnabled(false);
                idButtonPoint = false;

            }
        });
    }

    void clickButtonEqual() {
        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringSecondNumber = tvResult.getText().toString();
                if (stringSecondNumber != null && !stringSecondNumber.trim().isEmpty()) {
                    secondNumber = Float.parseFloat(stringSecondNumber);
                }
                if (idOperation != null && !idOperation.trim().isEmpty() && firstNumber != null && secondNumber != null) {
                    switch (idOperation) {
                        case "/":
                            floatResult = firstNumber / secondNumber;
                            break;
                        case "*":
                            floatResult = firstNumber * secondNumber;
                            break;
                        case "+":
                            floatResult = firstNumber + secondNumber;
                            break;
                        case "-":
                            floatResult = firstNumber - secondNumber;
                            break;
                    }
                }

                userNumber = String.valueOf(floatResult);
                tvResult.setText(userNumber);

                firstNumber = floatResult;
                secondNumber = null;
                idOperation = "";
                userNumber = "";

                if (idButtonPoint == false) {
                    buttonPoint.setEnabled(true);
                    idButtonPoint = true;
                }

            }
        });
    }


}