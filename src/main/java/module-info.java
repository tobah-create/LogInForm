module toba.loginform {
    requires javafx.controls;
    requires javafx.fxml;


    opens toba.loginform to javafx.fxml;
    exports toba.loginform;
}