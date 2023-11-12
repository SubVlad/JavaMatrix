package com.example.javamatrix;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    public TextField t111;
    public TextField t121;
    public TextField t131;
    public TextField t112;
    public TextField t122;
    public TextField t132;
    public TextField t113;
    public TextField t123;
    public TextField t133;

    public TextField t211;
    public TextField t221;
    public TextField t231;
    public TextField t212;
    public TextField t222;
    public TextField t232;
    public TextField t213;
    public TextField t223;
    public TextField t233;
    @FXML
    private Label welcomeText;
    public Label answer;
    //private SimpleStringProperty answer = new SimpleStringProperty();

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    double n111;
    double n121;
    double n131;
    double n112;
    double n122;
    double n132;
    double n113;
    double n123;
    double n133;


    public void calculate(ActionEvent actionEvent) {
         n111 = Double.parseDouble(t111.getText());
         n121 = Double.parseDouble(t121.getText());
         n131 = Double.parseDouble(t131.getText());
         n112 = Double.parseDouble(t112.getText());
         n122 = Double.parseDouble(t122.getText());
         n132 = Double.parseDouble(t132.getText());
         n113 = Double.parseDouble(t113.getText());
         n123 = Double.parseDouble(t123.getText());
         n133 = Double.parseDouble(t133.getText());

        double det = findDET(n111, n121, n131, n112, n122, n132, n113, n123, n133);
        answer.setText("Определитель равен " + det);
    }
    public double findDET(double n111,    double n121,    double n131,    double n112,    double n122,    double n132,    double n113,    double n123,    double n133)
    {
        double det = n111 * n122 * n133 + n112 * n123 * n131 + n113 * n121 * n132 - n113 * n122 * n131 - n112 * n121 * n133 - n111 * n123 * n132;
        return det;
    }
    public void reversedMatrix(ActionEvent actionEvent){
        n111 = Double.parseDouble(t111.getText());
        n121 = Double.parseDouble(t121.getText());
        n131 = Double.parseDouble(t131.getText());
        n112 = Double.parseDouble(t112.getText());
        n122 = Double.parseDouble(t122.getText());
        n132 = Double.parseDouble(t132.getText());
        n113 = Double.parseDouble(t113.getText());
        n123 = Double.parseDouble(t123.getText());
        n133 = Double.parseDouble(t133.getText());

        double det = findDET(n111, n121, n131, n112, n122, n132, n113, n123, n133);

        //найти миноры

        double a11 = n122*n133 - n123*n132;
        double a21 = -(n112*n133 - n113*n132);
        double a31 = n112*n123 - n113*n122;
        double a12 = -(n121*n133 - n123*n131);
        double a22 = n111*n133 - n113*n131;
        double a32 = -(n111*n123 - n113*n121);
        double a13 = n121*n132 - n122*n131;
        double a23 = -(n111*n132 - n112*n131);
        double a33 = n111*n122 - n112*n121;

        //транспонирование

        double tr11 = a11;
        double tr12 = a21;
        double tr13 = a31;
        double tr21 = a12;
        double tr22 = a22;
        double tr23 = a32;
        double tr31 = a13;
        double tr32 = a23;
        double tr33 = a33;

        //поделить транспонированную матрицу миноров на определитель

        double A_11 = tr11 / det;
        double A_21 = tr21 / det;
        double A_31 = tr31 / det;
        double A_12 = tr12 / det;
        double A_22 = tr22 / det;
        double A_32 = tr32 / det;
        double A_13 = tr13 / det;
        double A_23 = tr23 / det;
        double A_33 = tr33 / det;

        //вывести результат вычислений на GUI

        t111.setText(Double.toString(A_11));
        t121.setText(Double.toString(A_21));
        t131.setText(Double.toString(A_31));
        t112.setText(Double.toString(A_12));
        t122.setText(Double.toString(A_22));
        t132.setText(Double.toString(A_32));
        t113.setText(Double.toString(A_13));
        t123.setText(Double.toString(A_23));
        t133.setText(Double.toString(A_33));





    }
    public void multiplyMatrixes(ActionEvent actionEvent){
        n111 = Double.parseDouble(t111.getText());
        n121 = Double.parseDouble(t121.getText());
        n131 = Double.parseDouble(t131.getText());
        n112 = Double.parseDouble(t112.getText());
        n122 = Double.parseDouble(t122.getText());
        n132 = Double.parseDouble(t132.getText());
        n113 = Double.parseDouble(t113.getText());
        n123 = Double.parseDouble(t123.getText());
        n133 = Double.parseDouble(t133.getText());


        double n211 = Double.parseDouble(t211.getText());
        double n221 = Double.parseDouble(t221.getText());
        double n231 = Double.parseDouble(t231.getText());
        double n212 = Double.parseDouble(t212.getText());
        double n222 = Double.parseDouble(t222.getText());
        double n232 = Double.parseDouble(t232.getText());
        double n213 = Double.parseDouble(t213.getText());
        double n223 = Double.parseDouble(t223.getText());
        double n233 = Double.parseDouble(t233.getText());

        double m11 = n111*n211 + n112*n221 + n113*n231;
        double m21 = n121*n211 + n122*n221 + n123*n231;
        double m31 = n131*n211 + n132*n221 + n133*n231;
        double m12 = n111*n212 + n112*n222 + n113*n232;
        double m22 = n121*n212 + n122*n222 + n123*n232;
        double m32 = n131*n212 + n132*n222 + n133*n232;
        double m13 = n111*n213 + n112*n223 + n113*n233;
        double m23 = n121*n213 + n122*n223 + n123*n233;
        double m33 = n131*n213 + n132*n223 + n133*n233;


        t111.setText(Double.toString(m11));
        t121.setText(Double.toString(m21));
        t131.setText(Double.toString(m31));
        t112.setText(Double.toString(m12));
        t122.setText(Double.toString(m22));
        t132.setText(Double.toString(m32));
        t113.setText(Double.toString(m13));
        t123.setText(Double.toString(m23));
        t133.setText(Double.toString(m33));
    }
}