package com.test.changescene;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class DashboardController implements Initializable {
    public supporterUtils supporterUtilDashBoard = new supporterUtils();

    public Button btnDataSettings;
    public Button btnDBTestingScopeManagement;
    public Button btnDBMoveToICDefect;
    public Button btnDBFXTDefectDescription;
    public Button btnICFITComment;
    public Button btnFXTFITComment;
    public Button btnDBIC4EyesComment;
    public Button btnDBFXT4EeyesComment;
    public Label txtDashBoardYourName;

    @FXML
    private void handleDataSettingsMoving(ActionEvent event) {
        try {
            Parent rootDataSetting = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("datasetting.fxml")));
            Scene sceneDataSetting = new Scene(rootDataSetting);
            //This line gets the Stage Information
//            Stage windowDataSetting =(Stage)((Node)event.getSource()).getScene().getWindow();
            Stage windowDataSetting = new Stage();
            windowDataSetting.setScene(sceneDataSetting);
            windowDataSetting.initModality(Modality.NONE);
            windowDataSetting.show();
        } catch (IOException ex) {
//            System.Logger.getLogger(DataSettingsController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    @FXML
    private void handleTestingScopeManagementMoving(ActionEvent event) {
        try {
            Parent rootTestingScope = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("testingscope.fxml")));
            Scene sceneTestingScope = new Scene(rootTestingScope);
            //This line gets the Stage Information
//            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Stage windowTestingScope = new Stage();
            windowTestingScope.setScene(sceneTestingScope);
            windowTestingScope.initModality(Modality.NONE);
            windowTestingScope.show();
        } catch (IOException ex) {
//            System.Logger.getLogger(DataSettingsController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void handleICDefect(ActionEvent actionEvent) {
        try {
            Parent rootICDefect = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("ICDefect.fxml")));
            Scene sceneICDefect = new Scene(rootICDefect);
            //This line gets the Stage Information
//            Stage windowICDefect = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            Stage windowICDefect = new Stage();
            windowICDefect.setScene(sceneICDefect);
            windowICDefect.show();
        } catch (IOException ex) {
//            System.Logger.getLogger(DataSettingsController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void handleDBFXTDefectDescription(ActionEvent actionEvent) {
        try {
            Parent rootFXTDefectDescription = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("FXTDefect.fxml")));
            Scene dashboardFXTDefectDescription = new Scene(rootFXTDefectDescription);
            //This line gets the Stage Information
//            Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            Stage windowFXTDefectDescription = new Stage();
            windowFXTDefectDescription.setScene(dashboardFXTDefectDescription);
            windowFXTDefectDescription.show();
        } catch (IOException ex) {
//            System.Logger.getLogger(DataSettingsController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void handelICFITComment(ActionEvent actionEvent) {
        try {
            Parent rootICFITComment = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("FITComment.fxml")));
            Scene dashboardICFITComment = new Scene(rootICFITComment);
            //This line gets the Stage Information
//            Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            Stage windowICFITComment = new Stage();
            windowICFITComment.setScene(dashboardICFITComment);
            windowICFITComment.show();
        } catch (IOException ex) {
//            System.Logger.getLogger(DataSettingsController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void handelFXTFITComment(ActionEvent actionEvent) {
        try {
            Parent rootFXTFITComment = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("FXTFITComment.fxml")));
            Scene dashboardFXTFITComment = new Scene(rootFXTFITComment);
            //This line gets the Stage Information
//            Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            Stage windowFXTFITComment = new Stage();
            windowFXTFITComment.setScene(dashboardFXTFITComment);
            windowFXTFITComment.show();
        } catch (IOException ex) {
//            System.Logger.getLogger(DataSettingsController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void handelDBIC4EyesComment(ActionEvent actionEvent) {
        try {
            Parent rootIC4EyesComment = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("4eyes.fxml")));
            Scene dashboardIC4EyesComment = new Scene(rootIC4EyesComment);
            //This line gets the Stage Information
//            Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            Stage windowIC4EyesComment = new Stage();
            windowIC4EyesComment.setScene(dashboardIC4EyesComment);
            windowIC4EyesComment.show();
        } catch (IOException ex) {
//            System.Logger.getLogger(DataSettingsController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void handelDBFXT4EeyesComment(ActionEvent actionEvent) {
        try {
            Parent rootFXT4EeyesComment = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("FXT4eyes.fxml")));
            Scene dashboardFXT4EeyesComment = new Scene(rootFXT4EeyesComment);
            //This line gets the Stage Information
//            Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            Stage windowFXT4EeyesComment = new Stage();
            windowFXT4EeyesComment.setScene(dashboardFXT4EeyesComment);
            windowFXT4EeyesComment.show();
        } catch (IOException ex) {
//            System.Logger.getLogger(DataSettingsController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        txtDashBoardYourName.setText(supporterUtilDashBoard.getUserName());
    }
}