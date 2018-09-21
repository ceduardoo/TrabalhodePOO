package login;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class ControllerLogin {
    @FXML
    TextField loginUsuario;
    @FXML
    PasswordField loginSenha;
    @FXML
    Button btnEntrar;

    public void loginEntrar() {
        System.out.println(loginUsuario.getText());
        System.out.println(loginSenha.getText());
    }
}
