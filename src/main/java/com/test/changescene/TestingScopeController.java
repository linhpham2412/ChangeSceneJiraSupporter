package com.test.changescene;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class TestingScopeController implements Initializable {
    public Button btnTSMBackToDB;
    public ScrollPane pngScroll;
    public Button btnAddNewHeaderTestingScope;
    public TextArea txaTestingScope;
    supporterUtils supporterUtilTestingScope = new supporterUtils();

    private final TestingScopeContent testingScope = new TestingScopeContent();
    public Label txtTestingScopeYourName;
    AtomicBoolean listModeTestingScope = new AtomicBoolean(false);
    AtomicBoolean numericModeTestingScope = new AtomicBoolean(false);
    AtomicInteger numericIndexTestingScope = new AtomicInteger(1);

    public void testingScopeBackToDashBoard(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("dashboard.fxml")));

            Scene dashboard = new Scene(root);
            //This line gets the Stage Information
            //here we get the stage from event action and setting the root element in the scene and display scene with stage object (window) which is retrieved from action event
            Stage window=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            window.setScene(dashboard);
            window.show();
        } catch (IOException ex) {
//            System.Logger.getLogger(DataSettingsController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void addNewHeaderTestingScope() {
        //get Vbox -> scroll pane
        pngScroll = (ScrollPane) this.btnAddNewHeaderTestingScope.getParent().getParent().getChildrenUnmodifiable().get(1);
        pngScroll.setContent(testingScope.addNewTestingScopeWithData(testingScope.getMaxItemNumber(), "", ""));
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        txtTestingScopeYourName.setText(supporterUtilTestingScope.getUserName());
    }

    public void handleTextAreaTestingScopeKeyReleased(KeyEvent keyEvent) {
        supporterUtilTestingScope.onHandleTextArea(keyEvent, txaTestingScope, true, listModeTestingScope, numericModeTestingScope, numericIndexTestingScope);
    }
}
