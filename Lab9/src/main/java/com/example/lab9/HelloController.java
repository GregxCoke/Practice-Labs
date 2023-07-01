package com.example.lab9;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;
    private int clickCount = 0;

    @FXML
    protected void onHelloButtonClick() {
        clickCount++;
        welcomeText.setText("Welcome to javaFX! " + clickCount);


    }
}