package lesson03JavaFxIntro;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import users.User;
import users.UserList;

import java.io.IOException;
import java.util.Objects;

public class LoginController {
    private final UserList users = new UserList();

    private Parent root;
    private Stage stage;
    private Scene scene;


    @FXML private TextField fieldUsername;
    @FXML private TextField fieldPassword;
    @FXML private Label labelRemark;
    @FXML private Button btnLogout;

    public void onClickLogin(ActionEvent actionEvent) throws IOException {
        // get form input
        String username = fieldUsername.getText();
        String password = fieldPassword.getText();

        // verify user
        if (!users.getList().containsKey(username)) {
            labelRemark.setText("User doesn't exist");
            return;
        }

        // verify password
        User user = users.getList().get(username);

        if (!user.getPassword().equals(password)) {
            labelRemark.setText("Wrong Password");
            return;
        }

        // login user
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("fxml/Home.fxml")));
        stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);

        stage.show();
    }

    public void onClickLogout(ActionEvent actionEvent) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("fxml/Login.fxml")));
        stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


}