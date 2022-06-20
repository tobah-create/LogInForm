package toba.loginform;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import java.io.IOException;

public class AfterLogin {
    @FXML
    private Button logOut;
    public void userLogOut(ActionEvent event) throws IOException {
        Main main = new Main();
        main.changeScene("login.fxml");
    }
}
