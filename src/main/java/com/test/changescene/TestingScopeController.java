package com.test.changescene;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class TestingScopeController {
    public Button btnTSMBackToDB;
    public ScrollPane pngScroll;
    public Button btnAddNewHeaderTestingScope;

    private final TestingScopeContent testingScope = new TestingScopeContent();

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
}
