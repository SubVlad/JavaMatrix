package com.example.kotlinmatrix1

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.stage.Stage
import java.io.IOException


class HelloApplication : Application() {
    @kotlin.Throws(IOException::class)
    override fun start(stage: Stage) {
        val fxmlLoader = FXMLLoader(HelloApplication::class.java.getResource("hello-view.fxml"))
        val scene = Scene(fxmlLoader.load<Parent>(), 600.0, 300.0)
        //scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        stage.title = "JavaMatrix!"
        stage.scene = scene
        stage.show()
    }

    companion object {
        @kotlin.jvm.JvmStatic
        fun main(args: Array<String>) {
            launch()
        }
    }
}