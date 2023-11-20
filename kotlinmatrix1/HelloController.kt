package com.example.kotlinmatrix1

import javafx.event.ActionEvent
import javafx.fxml.FXML
import javafx.scene.control.Label
import javafx.scene.control.TextField


class HelloController {
    var t111: TextField? = null
    var t121: TextField? = null
    var t131: TextField? = null
    var t112: TextField? = null
    var t122: TextField? = null
    var t132: TextField? = null
    var t113: TextField? = null
    var t123: TextField? = null
    var t133: TextField? = null
    var t211: TextField? = null
    var t221: TextField? = null
    var t231: TextField? = null
    var t212: TextField? = null
    var t222: TextField? = null
    var t232: TextField? = null
    var t213: TextField? = null
    var t223: TextField? = null
    var t233: TextField? = null

    @FXML
    private val welcomeText: Label? = null
    var answer: Label? = null

    //private SimpleStringProperty answer = new SimpleStringProperty();
    @FXML
    protected fun onHelloButtonClick() {
        welcomeText!!.text = "Welcome to JavaFX Application!"
    }

    var n111 = 0.0
    var n121 = 0.0
    var n131 = 0.0
    var n112 = 0.0
    var n122 = 0.0
    var n132 = 0.0
    var n113 = 0.0
    var n123 = 0.0
    var n133 = 0.0
    fun calculate(actionEvent: ActionEvent?) {
        n111 = t111!!.text.toDouble()
        n121 = t121!!.text.toDouble()
        n131 = t131!!.text.toDouble()
        n112 = t112!!.text.toDouble()
        n122 = t122!!.text.toDouble()
        n132 = t132!!.text.toDouble()
        n113 = t113!!.text.toDouble()
        n123 = t123!!.text.toDouble()
        n133 = t133!!.text.toDouble()
        val det = findDET(n111, n121, n131, n112, n122, n132, n113, n123, n133)
        answer!!.text = "Определитель равен $det"
    }

    fun findDET(
        n111: Double,
        n121: Double,
        n131: Double,
        n112: Double,
        n122: Double,
        n132: Double,
        n113: Double,
        n123: Double,
        n133: Double
    ): Double {
        return n111 * n122 * n133 + n112 * n123 * n131 + n113 * n121 * n132 - n113 * n122 * n131 - n112 * n121 * n133 - n111 * n123 * n132
    }

    fun reversedMatrix(actionEvent: ActionEvent?) {
        n111 = t111!!.text.toDouble()
        n121 = t121!!.text.toDouble()
        n131 = t131!!.text.toDouble()
        n112 = t112!!.text.toDouble()
        n122 = t122!!.text.toDouble()
        n132 = t132!!.text.toDouble()
        n113 = t113!!.text.toDouble()
        n123 = t123!!.text.toDouble()
        n133 = t133!!.text.toDouble()
        val det = findDET(n111, n121, n131, n112, n122, n132, n113, n123, n133)

        //найти миноры
        val a11 = n122 * n133 - n123 * n132
        val a21 = -(n112 * n133 - n113 * n132)
        val a31 = n112 * n123 - n113 * n122
        val a12 = -(n121 * n133 - n123 * n131)
        val a22 = n111 * n133 - n113 * n131
        val a32 = -(n111 * n123 - n113 * n121)
        val a13 = n121 * n132 - n122 * n131
        val a23 = -(n111 * n132 - n112 * n131)
        val a33 = n111 * n122 - n112 * n121

        //транспонирование

        //поделить транспонированную матрицу миноров на определитель
        val A_11 = a11 / det
        val A_21 = a12 / det
        val A_31 = a13 / det
        val A_12 = a21 / det
        val A_22 = a22 / det
        val A_32 = a23 / det
        val A_13 = a31 / det
        val A_23 = a32 / det
        val A_33 = a33 / det

        //вывести результат вычислений на GUI
        t111!!.text = java.lang.Double.toString(A_11)
        t121!!.text = java.lang.Double.toString(A_21)
        t131!!.text = java.lang.Double.toString(A_31)
        t112!!.text = java.lang.Double.toString(A_12)
        t122!!.text = java.lang.Double.toString(A_22)
        t132!!.text = java.lang.Double.toString(A_32)
        t113!!.text = java.lang.Double.toString(A_13)
        t123!!.text = java.lang.Double.toString(A_23)
        t133!!.text = java.lang.Double.toString(A_33)
    }

    fun multiplyMatrixes(actionEvent: ActionEvent?) {
        n111 = t111!!.text.toDouble()
        n121 = t121!!.text.toDouble()
        n131 = t131!!.text.toDouble()
        n112 = t112!!.text.toDouble()
        n122 = t122!!.text.toDouble()
        n132 = t132!!.text.toDouble()
        n113 = t113!!.text.toDouble()
        n123 = t123!!.text.toDouble()
        n133 = t133!!.text.toDouble()
        val n211: Double = t211!!.text.toDouble()
        val n221: Double = t221!!.text.toDouble()
        val n231: Double = t231!!.text.toDouble()
        val n212: Double = t212!!.text.toDouble()
        val n222: Double = t222!!.text.toDouble()
        val n232: Double = t232!!.text.toDouble()
        val n213: Double = t213!!.text.toDouble()
        val n223: Double = t223!!.text.toDouble()
        val n233: Double = t233!!.text.toDouble()
        val m11 = n111 * n211 + n112 * n221 + n113 * n231
        val m21 = n121 * n211 + n122 * n221 + n123 * n231
        val m31 = n131 * n211 + n132 * n221 + n133 * n231
        val m12 = n111 * n212 + n112 * n222 + n113 * n232
        val m22 = n121 * n212 + n122 * n222 + n123 * n232
        val m32 = n131 * n212 + n132 * n222 + n133 * n232
        val m13 = n111 * n213 + n112 * n223 + n113 * n233
        val m23 = n121 * n213 + n122 * n223 + n123 * n233
        val m33 = n131 * n213 + n132 * n223 + n133 * n233
        t111!!.text = java.lang.Double.toString(m11)
        t121!!.text = java.lang.Double.toString(m21)
        t131!!.text = java.lang.Double.toString(m31)
        t112!!.text = java.lang.Double.toString(m12)
        t122!!.text = java.lang.Double.toString(m22)
        t132!!.text = java.lang.Double.toString(m32)
        t113!!.text = java.lang.Double.toString(m13)
        t123!!.text = java.lang.Double.toString(m23)
        t133!!.text = java.lang.Double.toString(m33)
    }
}