package com.codedotorg;

import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) {
        launch();
    }

    public void start(Stage primaryStage) {
        WeatherApp weather = new WeatherApp(primaryStage, 500, 500);
        weather.startApp();
    }

}