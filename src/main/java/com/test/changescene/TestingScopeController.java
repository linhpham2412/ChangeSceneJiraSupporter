package com.test.changescene;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.*;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.*;
import java.net.URL;
import java.util.HashMap;
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
    public Button cbxTestScopeCopyFromSelected;
    public Button cbxTestScopeCopyAll;
    FileChooser fileChooser = new FileChooser();
    private File templateFile = null;
    String currentPath = null;
    supporterUtils supporterUtilTestingScope = new supporterUtils();
    AtomicBoolean listModeTestingScope = new AtomicBoolean(false);
    AtomicBoolean numericModeTestingScope = new AtomicBoolean(false);
    AtomicInteger numericIndexTestingScope = new AtomicInteger(1);
    final Clipboard clipboard = Clipboard.getSystemClipboard();
    final ClipboardContent content = new ClipboardContent();

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
        supporterUtilTestingScope.onHandleTextArea(keyEvent, txaTestingScope, false, listModeTestingScope, numericModeTestingScope, numericIndexTestingScope);
    }

    public void onHandleTestingScopeGivenClick(ActionEvent actionEvent) {
        supporterUtilTestingScope.customTextAddMethod(txaTestingScope, false, "Given");
    }

    public void onHandleTestingScopeWhenClick(ActionEvent actionEvent) {
        supporterUtilTestingScope.customTextAddMethod(txaTestingScope, false, "When");
    }

    public void onHandleTestingScopeThenClick(ActionEvent actionEvent) {
        supporterUtilTestingScope.customTextAddMethod(txaTestingScope, false, "Then");
    }

    public void onHandleTestingScopeAndClick(ActionEvent actionEvent) {
        supporterUtilTestingScope.customTextAddMethod(txaTestingScope, false, "And");
    }

    public void onHandleTestingScopeBoldClick(ActionEvent actionEvent) {
//        if (togglebtnTestingScopeICJira.isSelected()) {
//            supporterUtilTestingScope.markdownTextInTextArea(txaTestingScope, "**", "*");
//        } else {
        supporterUtilTestingScope.markdownTextInTextArea(txaTestingScope, "*", null);
//        }
    }

    public void onHandleTestingScopeItalicClick(ActionEvent actionEvent) {
        supporterUtilTestingScope.markdownTextInTextArea(txaTestingScope, "_", null);
    }

    public void onHandleTestingScopeHighlightClick(ActionEvent actionEvent) {
        supporterUtilTestingScope.markdownTextInTextArea(txaTestingScope, "+", null);
    }

    public void onHandleTestingScopeNumericClick(ActionEvent actionEvent) {
        supporterUtilTestingScope.onChangeMultipleLinesToNumeric(txaTestingScope, numericModeTestingScope, numericIndexTestingScope);
    }

    public void onHandleTestingScopeListClick(ActionEvent actionEvent) {
        supporterUtilTestingScope.onChangeMultipleLinesToList(txaTestingScope, listModeTestingScope);
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

    @FXML
    void saveTestScopeTemplate() {
        StringBuilder sb1 = getDataFromTextAreaToArray(false, true, false);

        fileChooser.setInitialDirectory(new File(currentPath));
        fileChooser.setSelectedExtensionFilter(new FileChooser.ExtensionFilter("Text Files", "*.txt"));
        File savedFile = fileChooser.showSaveDialog(null);

        try {
            if (!(templateFile == null)) {
                if (savedFile.getName().equals(templateFile.getName())) {
                    FileWriter fstream = new FileWriter(templateFile.getName());
                    BufferedWriter bw = new BufferedWriter(fstream);
                    bw.write(String.valueOf(sb1));
                    bw.close();
                } else {
                    FileWriter fstream = new FileWriter(savedFile.getName());
                    BufferedWriter bw = new BufferedWriter(fstream);
                    bw.write(String.valueOf(sb1));
                    bw.close();
                }
            } else {
                FileWriter fstream = new FileWriter(savedFile.getName());
                BufferedWriter bw = new BufferedWriter(fstream);
                bw.write(String.valueOf(sb1));
                bw.close();
            }
        } catch (IOException e) {
        }
    }

    public void onTCCopySelectedAction(ActionEvent actionEvent) {
        StringBuilder sb1 = getDataFromTextAreaToArray(true, false, true);
        content.putString(String.valueOf(sb1));
        clipboard.setContent(content);
    }

    public void onTCCopyAllAction(ActionEvent actionEvent) {
        StringBuilder sb1 = getDataFromTextAreaToArray(false, false, true);
        content.putString(String.valueOf(sb1));
        clipboard.setContent(content);
    }

    private StringBuilder getDataFromTextAreaToArray(boolean isGetFromSelectedCheckBoxes, boolean ignoreMarkDownSwitchToICJira, boolean isExportToCopyFunction) {
        StringBuilder sb = new StringBuilder();
        String tempTextChange = "";
        HashMap<Integer, CheckBox> availableCheckboxes = testingScope.getCheckBoxList();
        if (!testingScope.getMaxItemNumber().equals(0)) {
            try {
                for (int i = 0; i < availableCheckboxes.size(); i++) {
                    Event.fireEvent(availableCheckboxes.get(i), new MouseEvent(MouseEvent.MOUSE_CLICKED, availableCheckboxes.get(i).getLayoutX(), availableCheckboxes.get(i).getLayoutY(), availableCheckboxes.get(i).getLayoutX(), availableCheckboxes.get(i).getLayoutY(), MouseButton.PRIMARY, 1, true, true, true, true, true, true, true, true, true, true, null));
                }
            } catch (Exception ignored) {
            }
            //Save data to testing scope first
            HashMap<Integer, Integer> textMapping = testingScope.checkAndSetTextAreaFollowOrder(txaTestingScope);
            testingScope.saveDataWithTextIndexInTextArea(textMapping);
            //start write content
            if (isGetFromSelectedCheckBoxes) {
                for (int i = 0; i < testingScope.getMaxItemNumber(); i++) {
                    if (availableCheckboxes.get(i).isSelected()) {
                        sb.append(testingScope.getHeaderById(i)).append("\n").append(testingScope.getTestingScopeContentById(i)).append("<EndSection>").append("\n");
                    }
                }
            } else {
                for (int i = 0; i < testingScope.getMaxItemNumber(); i++) {
                    sb.append(testingScope.getHeaderById(i)).append("\n").append(testingScope.getTestingScopeContentById(i)).append("<EndSection>").append("\n");
                }
            }
        }
        if (!ignoreMarkDownSwitchToICJira) {
            if (togglebtnTestingScopeICJira.isSelected()) {
                sb = new StringBuilder(supporterUtilTestingScope.switchMarkDownToICJira(sb.toString()));
            } else {
                sb = new StringBuilder(supporterUtilTestingScope.switchMarkDownToFXTJira(sb.toString()));
            }
        }

        if (isExportToCopyFunction){
            tempTextChange = sb.toString();
            tempTextChange = tempTextChange.replaceAll("<EndSection>\n","");
            sb = new StringBuilder(tempTextChange);
        }
        return sb;
    }

    public void onTestScopeAddNewItemAction(ActionEvent actionEvent) {
        supporterUtilTestingScope.customTextAddMethod(txaTestingScope, null, "[ ]* ");
    }
}
