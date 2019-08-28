package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class Controller {

    @FXML
    private Label lblName;

    @FXML
    private TextArea txtName;

    @FXML
    private Button btnSubmit;

    @FXML
    void showName(MouseEvent event) {
        //scene builder View -> Show sample controller skeleton
        //System.out.println("in ");
        String name;
        name = txtName.getText();
        System.out.println(name);

        lblName.setText(name);

    }

}
