package toba.loginform;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class LogIn {
    public LogIn() {
    }
    @FXML
    private Button button;
    @FXML
    private Label wrongLogIn;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    public void userLogIn(ActionEvent event) throws IOException {
        checkLogIn();
    }
    public void checkLogIn() throws IOException {
        Main main = new Main();
        if(username.getText().toString().equals("tobah") && password.getText().toString().equals("greatness")) {
            wrongLogIn.setText("Success");
            main.changeScene("afterlogin.fxml");
        } else if(username.getText().isEmpty() && password.getText().isEmpty()) {
            wrongLogIn.setText("Pleasee provide your username and password");
        } else {
            wrongLogIn.setText("Wrong username or password");
        }
    }
}