package com.test.changescene;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.*;
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
    public Button btnTestScopeLoadTemplate;
    public Label txtTestScopeFileName;
    FileChooser fileChooser = new FileChooser();
    private File templateFile = null;
    String currentPath = null;
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
        testingScope.getTextArea(txaTestingScope);
        txtTestingScopeYourName.setText(supporterUtilTestingScope.getUserName());
        try {
            currentPath = new java.io.File(".").getCanonicalPath();
        } catch (IOException e) {
            e.printStackTrace();
        }
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

    @FXML
    void loadTestScopeTemplate() throws IOException {
        pngScroll = (ScrollPane) btnAddNewHeaderTestingScope.getParent().getParent().getChildrenUnmodifiable().get(1);
        fileChooser.setInitialDirectory(new File(currentPath));
        templateFile = fileChooser.showOpenDialog(null);
        txtTestScopeFileName.setText(templateFile.getName());
        testingScope.resetTestingScope();
        BufferedReader reader = null;
        Object[] readData = new Object[0];
        try {
            reader = new BufferedReader(new FileReader(templateFile));
            readData = reader.lines().toArray();
            reader.close();
        } catch (FileNotFoundException e) {
            reader.reset();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String header = "";
        String content = "";
        int readIndex = 0;
        if (readData.length > 0) {
            for (int i = 0; i < readData.length; i++) {
                if (readData[i].toString().startsWith("#!")) {
                    header = readData[i].toString();
                } else if (readData[i].toString().startsWith("[ ]*") || readData[i].toString().startsWith("*") || readData[i].toString().startsWith("") && !readData[i].toString().equals("<EndSection>")) {
                    content += readData[i].toString() + "\n";
                } else if (readData[i].toString().equals("<EndSection>")) {
                    pngScroll.setContent(testingScope.addNewTestingScopeWithData(readIndex, header, content));
                    readIndex += 1;
                    header = "";
                    content = "";
                }
            }
        }
    }
}
