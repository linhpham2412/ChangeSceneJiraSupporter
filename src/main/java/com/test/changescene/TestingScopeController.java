package com.test.changescene;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class TestingScopeController implements Initializable {
    private final TestingScopeContent testingScope = new TestingScopeContent();
    public Button btnTSMBackToDB;
    public ScrollPane pngScroll;
    public Button btnAddNewHeaderTestingScope;
    public TextArea txaTestingScope;
    public ToggleButton togglebtnTestingScopeICJira;
    public ToggleButton togglebtnTestingScopeFXTJira;
    public Label txtTestingScopeYourName;
    supporterUtils supporterUtilTestingScope = new supporterUtils();
    AtomicBoolean listModeTestingScope = new AtomicBoolean(false);
    AtomicBoolean numericModeTestingScope = new AtomicBoolean(false);
    AtomicInteger numericIndexTestingScope = new AtomicInteger(1);

    public void testingScopeBackToDashBoard(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("dashboard.fxml")));

            Scene dashboard = new Scene(root);
            //This line gets the Stage Information
            //here we get the stage from event action and setting the root element in the scene and display scene with stage object (window) which is retrieved from action event
            Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
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

    public void onHandleTestingScopeGivenClick(ActionEvent actionEvent) {
        supporterUtilTestingScope.customTextAddMethod(txaTestingScope, togglebtnTestingScopeICJira.isSelected(), "Given");
    }

    public void onHandleTestingScopeWhenClick(ActionEvent actionEvent) {
        supporterUtilTestingScope.customTextAddMethod(txaTestingScope, togglebtnTestingScopeICJira.isSelected(), "When");
    }

    public void onHandleTestingScopeThenClick(ActionEvent actionEvent) {
        supporterUtilTestingScope.customTextAddMethod(txaTestingScope, togglebtnTestingScopeICJira.isSelected(), "Then");
    }

    public void onHandleTestingScopeAndClick(ActionEvent actionEvent) {
        supporterUtilTestingScope.customTextAddMethod(txaTestingScope, togglebtnTestingScopeICJira.isSelected(), "  And");
    }

    public void onHandleTestingScopeBoldClick(ActionEvent actionEvent) {
        if (togglebtnTestingScopeICJira.isSelected()) {
            supporterUtilTestingScope.markdownTextInTextArea(txaTestingScope, "**", "*");
        } else {
            supporterUtilTestingScope.markdownTextInTextArea(txaTestingScope, "*", null);
        }
    }

    public void onHandleTestingScopeItalicClick(ActionEvent actionEvent) {
        if (togglebtnTestingScopeICJira.isSelected()) {
            supporterUtilTestingScope.markdownTextInTextArea(txaTestingScope, "*", null);
        } else {
            supporterUtilTestingScope.markdownTextInTextArea(txaTestingScope, "_", null);
        }
    }

    public void onHandleTestingScopeHighlightClick(ActionEvent actionEvent) {
        if (togglebtnTestingScopeICJira.isSelected()) {
            supporterUtilTestingScope.markdownTextInTextArea(txaTestingScope, "`", null);
        } else {
            supporterUtilTestingScope.markdownTextInTextArea(txaTestingScope, "+", null);
        }
    }

    public void onHandleTestingScopeNumericClick(ActionEvent actionEvent) {
        supporterUtilTestingScope.onChangeMultipleLinesToNumeric(txaTestingScope, numericModeTestingScope, numericIndexTestingScope);
    }

    public void onHandleTestingScopeListClick(ActionEvent actionEvent) {
        supporterUtilTestingScope.onChangeMultipleLinesToList(txaTestingScope, listModeTestingScope);
    }

    public void onChangeJiraModeThenSwitchAllMarkdown(ActionEvent actionEvent) {
        supporterUtilTestingScope.onChangeJiraModeThenSwitchAllMarkdown(txaTestingScope,togglebtnTestingScopeICJira.isSelected());
    }
}
