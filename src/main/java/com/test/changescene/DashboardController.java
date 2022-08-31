package com.test.changescene;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class DashboardController {

    public Button btnDataSettings;
    public Button btnDBTestingScopeManagement;
    public Button btnDBMoveToICDefect;
    public Button btnDBFXTDefectDescription;
    public Button btnICFITComment;
    public Button btnFXTFITComment;
    public Button btnDBIC4EyesComment;
    public Button btnDBFXT4EeyesComment;

    @FXML
    private void handleDataSettingsMoving(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("datasetting.fxml")));
            Scene dashboard=new Scene(root);
            //This line gets the Stage Information
            Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(dashboard);
            window.show();
        } catch (IOException ex) {
//            System.Logger.getLogger(DataSettingsController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void handleTestingScopeManagementMoving(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("testingscope.fxml")));
            Scene dashboard=new Scene(root);
            //This line gets the Stage Information
            Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(dashboard);
            window.show();
        } catch (IOException ex) {
//            System.Logger.getLogger(DataSettingsController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void handleICDefect(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("ICDefect.fxml")));
            Scene dashboard=new Scene(root);
            //This line gets the Stage Information
            Stage window=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            window.setScene(dashboard);
            window.show();
        } catch (IOException ex) {
//            System.Logger.getLogger(DataSettingsController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void handleDBFXTDefectDescription(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("FXTDefect.fxml")));
            Scene dashboard=new Scene(root);
            //This line gets the Stage Information
            Stage window=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            window.setScene(dashboard);
            window.show();
        } catch (IOException ex) {
//            System.Logger.getLogger(DataSettingsController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void handelICFITComment(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("FITComment.fxml")));
            Scene dashboard=new Scene(root);
            //This line gets the Stage Information
            Stage window=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            window.setScene(dashboard);
            window.show();
        } catch (IOException ex) {
//            System.Logger.getLogger(DataSettingsController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void handelFXTFITComment(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("FXTFITComment.fxml")));
            Scene dashboard=new Scene(root);
            //This line gets the Stage Information
            Stage window=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            window.setScene(dashboard);
            window.show();
        } catch (IOException ex) {
//            System.Logger.getLogger(DataSettingsController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void handelDBIC4EyesComment(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("4eyes.fxml")));
            Scene dashboard=new Scene(root);
            //This line gets the Stage Information
            Stage window=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            window.setScene(dashboard);
            window.show();
        } catch (IOException ex) {
//            System.Logger.getLogger(DataSettingsController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void handelDBFXT4EeyesComment(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("FXT4eyes.fxml")));
            Scene dashboard=new Scene(root);
            //This line gets the Stage Information
            Stage window=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            window.setScene(dashboard);
            window.show();
        } catch (IOException ex) {
//            System.Logger.getLogger(DataSettingsController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}