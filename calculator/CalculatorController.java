package edu.csueastbay.cs401.calculator;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalculatorController {

    private String strNum1 = "";
    private String strNum2 = "";
    private String total;
    private String temp;
    private char op = 'n';
    private int num = 1;

    public void reset(){
        strNum1 = "";
        strNum2 = "";
        num = 1;
    }
    @FXML
    private Button acButton;

    @FXML
    private Button addButton;

    @FXML
    private Button cButton;

    @FXML
    private Button decimalButton;

    @FXML
    private Button divButton;

    @FXML
    private Button eightButton;

    @FXML
    private Button equalButton;

    @FXML
    private Button fiveButton;

    @FXML
    private Button fourButton;

    @FXML
    private Button multButton;

    @FXML
    private Button nineButton;

    @FXML
    private Button oneButton;

    @FXML
    private Button pnButton;

    @FXML
    private Button sevenButton;

    @FXML
    private Button sixButton;

    @FXML
    private Button subButton;

    @FXML
    private TextField textField;

    @FXML
    private Button threeButton;

    @FXML
    private Button twoButton;

    @FXML
    private Button zeroButton;

    @FXML
    void acButtonPress(ActionEvent event) {
        textField.setText("0");
        reset();
    }

    @FXML
    void addButtonPress(ActionEvent event) {
        num = 2;
        op = '+';
    }

    @FXML
    void cButtonPress(ActionEvent event) {
        if (num == 1){
            strNum1 = "";
        }
        strNum2 = "";
        textField.setText("0");
    }

    @FXML
    void decimalButtonPress(ActionEvent event) {
        if (num == 1) {
            strNum1 = strNum1 + ".";
            textField.setText(strNum1);
        }
        else{
            strNum2 = strNum2 + ".";
            textField.setText(strNum2);
        }
    }

    @FXML
    void divButtonPress(ActionEvent event) {
        num = 2;
        op = '/';
    }

    @FXML
    void eightButtonPress(ActionEvent event) {
        if (num == 1) {
            strNum1 = strNum1 + 8;
            textField.setText(strNum1);
        }
        else{
            strNum2 = strNum2 + 8;
            textField.setText(strNum2);
        }
    }

    @FXML
    void equalButtonPress(ActionEvent event) {
        if(strNum1 == "") {
            textField.setText("Enter the numbers before calculating");
            return;
        }
        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);
        switch(op){
            case '+':
                total = String.valueOf(num1+num2);
                break;
            case '-':
                total = String.valueOf(num1-num2);
                break;
            case '/':
                try{
                    double temp = num1/num2;
                    total = String.valueOf(temp);
                }
                catch (ArithmeticException e){
                    textField.setText("Error");
                }
                break;
            case 'x':
                total = String.valueOf(num1*num2);
                break;
        }
        textField.setText(total);
        reset();
    }

    @FXML
    void fiveButtonPress(ActionEvent event) {
        if (num == 1) {
            strNum1 = strNum1 + 5;
            textField.setText(strNum1);
        }
        else{
            strNum2 = strNum2 + 5;
            textField.setText(strNum2);
        }
    }

    @FXML
    void fourButtonPress(ActionEvent event) {
        if (num == 1) {
            strNum1 = strNum1 + 4;
            textField.setText(strNum1);
        }
        else{
            strNum2 = strNum2 + 4;
            textField.setText(strNum2);
        }
    }

    @FXML
    void multButtonPress(ActionEvent event) {
        num = 2;
        op = 'x';
    }

    @FXML
    void nineButtonPress(ActionEvent event) {
        if (num == 1) {
            strNum1 = strNum1 + 9;
            textField.setText(strNum1);
        }
        else{
            strNum2 = strNum2 + 9;
            textField.setText(strNum2);
        }
    }

    @FXML
    void oneButtonPress(ActionEvent event) {
        if (num == 1) {
            strNum1 = strNum1 + 1;
            textField.setText(strNum1);
        }
        else{
            strNum2 = strNum2 + 1;
            textField.setText(strNum2);
        }
    }

    @FXML
    void pnButtonPress(ActionEvent event) {
        if (num == 1) {
            if(strNum1 == "") {
                textField.setText("Enter a number before changing attribute");
                return;
            }
            if (strNum1.charAt(0) == '-'){
                StringBuilder sb = new StringBuilder(strNum1);
                sb.deleteCharAt(0);
                strNum1 = sb.toString();
                textField.setText(strNum1);
            }
            else{
                strNum1 = '-' + strNum1;
                textField.setText(strNum1);
            }
        }
        else{
            if(strNum2 == "") {
                textField.setText("Enter a number before changing attribute");
                return;
            }
            if (strNum2.charAt(0) == '-'){
                StringBuilder sb = new StringBuilder(strNum2);
                sb.deleteCharAt(0);
                strNum2 = sb.toString();
                textField.setText(strNum2);
            }
            else{
                strNum2 = '-' + strNum2;
                textField.setText(strNum2);
            }
        }
    }

    @FXML
    void sevenButtonPress(ActionEvent event) {
        if (num == 1) {
            strNum1 = strNum1 + 7;
            textField.setText(strNum1);
        }
        else{
            strNum2 = strNum2 + 7;
            textField.setText(strNum2);
        }
    }

    @FXML
    void sixButtonPress(ActionEvent event) {
        if (num == 1) {
            strNum1 = strNum1 + 6;
            textField.setText(strNum1);
        }
        else{
            strNum2 = strNum2 + 6;
            textField.setText(strNum2);
        }
    }

    @FXML
    void subButtonPress(ActionEvent event) {
        num = 2;
        op = '-';
    }

    @FXML
    void threeButtonPress(ActionEvent event) {
        if (num == 1) {
            strNum1 = strNum1 + 3;
            textField.setText(strNum1);
        }
        else{
            strNum2 = strNum2 + 3;
            textField.setText(strNum2);
        }
    }

    @FXML
    void twoButtonPress(ActionEvent event) {
        if (num == 1) {
            strNum1 = strNum1 + 2;
            textField.setText(strNum1);
        }
        else{
            strNum2 = strNum2 + 2;
            textField.setText(strNum2);
        }
    }

    @FXML
    void zeroButtonPress(ActionEvent event) {
        if (num == 1) {
            strNum1 = strNum1 + 0;
            textField.setText(strNum1);
        }
        else{
            strNum2 = strNum2 + 0;
            textField.setText(strNum2);
        }
    }

}
