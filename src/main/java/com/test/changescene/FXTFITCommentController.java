package com.test.changescene;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.ResourceBundle;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class FXTFITCommentController implements Initializable {
    public Button btnFXTFITCommentBackToDB;
    public Label txtFXTFITYourName;
    public List<CheckBox> cbxFXTFITBuildInformationList = new ArrayList<>();
    public List<CheckBox> cbxFXTFITServerNameList = new ArrayList<>();
    public List<CheckBox> cbxFXTFITSDKNameList = new ArrayList<>();
    public List<CheckBox> cbxFXTFITSLOTNameList = new ArrayList<>();
    public List<CheckBox> cbxFXTFITInternalSLOTList = new ArrayList<>();
    public List<CheckBox> cbxFXTFITURLInformationList = new ArrayList<>();
    public List<CheckBox> cbxFXTFITIssueTypeList = new ArrayList<>();
    public List<CheckBox> cbxFXTFITIssueStatusList = new ArrayList<>();
    public List<CheckBox> cbxFXTFITEnvironmentList = new ArrayList<>();
    public List<CheckBox> cbxFXTFITTestingTypeAndBrowserList = new ArrayList<>();
    public List<CheckBox> cbxFXTFITTestingCredentialList = new ArrayList<>();
    public List<CheckBox> cbxFXTFITTestingLanguageList = new ArrayList<>();
    public VBox vboxFXTFITBuildInformation;
    public VBox vboxFXTFITServerName;
    public VBox vboxFXTFITSDKName;
    public VBox vboxFXTFITSLOTName;
    public VBox vboxFXTFITInternalSLOT;
    public VBox vboxFXTFITURLInformation;
    public VBox vboxFXTFITIssueType;
    public VBox vboxFXTFITIssueStatus;
    public VBox vboxFXTFITEnvironment;
    public VBox vboxFXTFITTestingTypeAndBrowser;
    public VBox vboxFXTFITTestingCredential;
    public VBox vboxFXTFITTestingLanguage;
    public TextArea txaFXTFITTestVersion;
    public TextArea txaFXTFITTestingBehavior;
    public CheckBox cbxFXTFITWithAttachment;
    supporterUtils supporterUtilFXTFIT = new supporterUtils();
    List<SettingData> supporterSettingsFXTFITList = new ArrayList<>();
    SettingData setting1FXTFIT = new SettingData();
    SettingData setting2FXTFIT = new SettingData();
    SettingData setting3FXTFIT = new SettingData();
    SettingData setting4FXTFIT = new SettingData();
    SettingData setting5FXTFIT = new SettingData();
    SettingData setting6FXTFIT = new SettingData();
    SettingData setting7FXTFIT = new SettingData();
    SettingData setting8FXTFIT = new SettingData();
    SettingData setting9FXTFIT = new SettingData();
    SettingData setting10FXTFIT = new SettingData();
    final Clipboard clipboard = Clipboard.getSystemClipboard();
    final ClipboardContent content = new ClipboardContent();
    AtomicBoolean listModeFXTFITTestBehavior = new AtomicBoolean(false);
    AtomicBoolean numericModeFXTFITTestBehavior = new AtomicBoolean(false);
    AtomicInteger numericIndexFXTFITTestBehavior = new AtomicInteger(1);
    AtomicBoolean listModeFXTFITTestVersion = new AtomicBoolean(false);
    AtomicBoolean numericModeFXTFITTestVersion = new AtomicBoolean(false);
    AtomicInteger numericIndexFXTFITTestVersion = new AtomicInteger(1);


    public void handelFXTFITCommentBackToDB(ActionEvent actionEvent) {
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

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        supporterSettingsFXTFITList.addAll(List.of(setting1FXTFIT, setting2FXTFIT, setting3FXTFIT, setting4FXTFIT, setting5FXTFIT, setting6FXTFIT, setting7FXTFIT, setting8FXTFIT, setting9FXTFIT, setting10FXTFIT));

        cbxFXTFITBuildInformationList = supporterUtilFXTFIT.autoAdd10SelectCheckboxes(vboxFXTFITBuildInformation, "Build Information", "cbxFXTFITBuildInformation");
        cbxFXTFITServerNameList = supporterUtilFXTFIT.autoAdd10SelectCheckboxes(vboxFXTFITServerName, "Server Name", "cbxFXTFITServerName");
        cbxFXTFITSDKNameList = supporterUtilFXTFIT.autoAdd10SelectCheckboxes(vboxFXTFITSDKName, "SDK Name", "cbxFXTFITSDKName");
        cbxFXTFITSLOTNameList = supporterUtilFXTFIT.autoAdd10SelectCheckboxes(vboxFXTFITSLOTName, "SLOT Name", "cbxFXTFITSLOTName");
        cbxFXTFITInternalSLOTList = supporterUtilFXTFIT.autoAdd10SelectCheckboxes(vboxFXTFITInternalSLOT, "Internal SLOT", "cbxFXTFITInternalSLOT");
        cbxFXTFITURLInformationList = supporterUtilFXTFIT.autoAdd10SelectCheckboxes(vboxFXTFITURLInformation, "URL Information", "cbxFXTFITURLInformation");
        cbxFXTFITIssueTypeList = supporterUtilFXTFIT.autoAdd10SelectCheckboxes(vboxFXTFITIssueType, "Issue Type", "cbxFXTFITIssueType");
        cbxFXTFITIssueStatusList = supporterUtilFXTFIT.autoAdd10SelectCheckboxes(vboxFXTFITIssueStatus, "Issue Status", "cbxFXTFITIssueStatus");
        cbxFXTFITEnvironmentList = supporterUtilFXTFIT.autoAdd10SelectCheckboxes(vboxFXTFITEnvironment, "Environment", "cbxFXTFITEnvironment");
        cbxFXTFITTestingTypeAndBrowserList = supporterUtilFXTFIT.autoAdd10SelectCheckboxes(vboxFXTFITTestingTypeAndBrowser, "Testing Type/ Browser", "cbxFXTFITTestingTypeAndBrowser");
        cbxFXTFITTestingCredentialList = supporterUtilFXTFIT.autoAdd10SelectCheckboxes(vboxFXTFITTestingCredential, "Testing Credential", "cbxFXTFITTestingCredential");
        cbxFXTFITTestingLanguageList = supporterUtilFXTFIT.autoAdd10SelectCheckboxes(vboxFXTFITTestingLanguage, "Testing Language", "cbxFXTFITTestingLanguage");
        supporterSettingsFXTFITList = supporterUtilFXTFIT.importSettingsFromFile();
        txtFXTFITYourName.setText(supporterUtilFXTFIT.getUserName());
        IntStream.range(0, 10).forEach(index -> cbxFXTFITBuildInformationList.get(index).setText(supporterSettingsFXTFITList.get(index).getBuildName()));
        IntStream.range(0, 10).forEach(index -> cbxFXTFITServerNameList.get(index).setText(supporterSettingsFXTFITList.get(index).getServerName()));
        IntStream.range(0, 10).forEach(index -> cbxFXTFITSDKNameList.get(index).setText(supporterSettingsFXTFITList.get(index).getSdk()));
        IntStream.range(0, 10).forEach(index -> cbxFXTFITSLOTNameList.get(index).setText(supporterSettingsFXTFITList.get(index).getSlotName()));
        IntStream.range(0, 10).forEach(index -> cbxFXTFITInternalSLOTList.get(index).setText(supporterSettingsFXTFITList.get(index).getInternalSlot()));
        IntStream.range(0, 10).forEach(index -> cbxFXTFITURLInformationList.get(index).setText(supporterSettingsFXTFITList.get(index).getUrl()));
        IntStream.range(0, 10).forEach(index -> cbxFXTFITIssueTypeList.get(index).setText(supporterSettingsFXTFITList.get(index).getIssueType()));
        IntStream.range(0, 10).forEach(index -> cbxFXTFITIssueStatusList.get(index).setText(supporterSettingsFXTFITList.get(index).getStatus()));
        IntStream.range(0, 10).forEach(index -> cbxFXTFITEnvironmentList.get(index).setText(supporterSettingsFXTFITList.get(index).getEnvironment()));
        IntStream.range(0, 10).forEach(index -> cbxFXTFITTestingTypeAndBrowserList.get(index).setText(supporterSettingsFXTFITList.get(index).getBrowser()));
        IntStream.range(0, 10).forEach(index -> cbxFXTFITTestingCredentialList.get(index).setText(supporterSettingsFXTFITList.get(index).getTestUser()));
        IntStream.range(0, 10).forEach(index -> cbxFXTFITTestingLanguageList.get(index).setText(supporterSettingsFXTFITList.get(index).getLanguage()));
    }

    public void handleTextAreaFXTFITTestingBehaviorKeyReleased(KeyEvent keyEvent) {
        supporterUtilFXTFIT.onHandleTextArea(keyEvent,txaFXTFITTestingBehavior,false, listModeFXTFITTestBehavior, numericModeFXTFITTestBehavior, numericIndexFXTFITTestBehavior);
    }

    public void handleTextAreaFXTFITTestVersionKeyReleased(KeyEvent keyEvent) {
        supporterUtilFXTFIT.onHandleTextArea(keyEvent,txaFXTFITTestVersion,false, listModeFXTFITTestVersion, numericModeFXTFITTestVersion, numericIndexFXTFITTestVersion);
    }

    @FXML
    void generateAndCopyFXTFITComment() {
        StringBuilder fourEyeCommentContent = new StringBuilder();
        String firstSelectedIssueType = "";
        String firstSelectedStatus = "";
        //Only get 1 first selected value for Issue Type and Issue Status
        for (CheckBox cb : cbxFXTFITIssueTypeList) {
            if (cb.isSelected()) {
                firstSelectedIssueType = cb.getText();
                break;
            }
        }
        for (CheckBox cb : cbxFXTFITIssueStatusList) {
            if (cb.isSelected()) {
                firstSelectedStatus = cb.getText();
                break;
            }
        }
        fourEyeCommentContent.append("*").append(firstSelectedIssueType).append("* 4eyes verified by +").append(txtFXTFITYourName.getText()).append("+ with status *").append(firstSelectedStatus).append("*, FIT Test Version: +").append(txaFXTFITTestVersion.getText()).append("+").append("\n");
        fourEyeCommentContent.append(supporterUtilFXTFIT.pickSelectedCheckBoxesAndPrint(cbxFXTFITBuildInformationList, "Build Information","+","*"));
        fourEyeCommentContent.append(supporterUtilFXTFIT.pickSelectedCheckBoxesAndPrint(cbxFXTFITServerNameList,"Server Name","+","*"));
        fourEyeCommentContent.append(supporterUtilFXTFIT.pickSelectedCheckBoxesAndPrint(cbxFXTFITSDKNameList,"SDK Name","+","*"));
        fourEyeCommentContent.append(supporterUtilFXTFIT.pickSelectedCheckBoxesAndPrint(cbxFXTFITSLOTNameList,"SLOT Name","+","*"));
        fourEyeCommentContent.append(supporterUtilFXTFIT.pickSelectedCheckBoxesAndPrint(cbxFXTFITInternalSLOTList,"Internal SLOT","+","*"));
        fourEyeCommentContent.append(supporterUtilFXTFIT.pickSelectedCheckBoxesAndPrint(cbxFXTFITURLInformationList,"URL Information","+","*"));
        fourEyeCommentContent.append(supporterUtilFXTFIT.pickSelectedCheckBoxesAndPrint(cbxFXTFITEnvironmentList,"Testing Environment","+",""));
        fourEyeCommentContent.append(supporterUtilFXTFIT.pickSelectedCheckBoxesAndPrint(cbxFXTFITTestingTypeAndBrowserList,"Testing Type/Browser","+","*"));
        fourEyeCommentContent.append(supporterUtilFXTFIT.pickSelectedCheckBoxesAndPrint(cbxFXTFITTestingCredentialList,"Testing Credential","+","*"));
        fourEyeCommentContent.append(supporterUtilFXTFIT.pickSelectedCheckBoxesAndPrint(cbxFXTFITTestingLanguageList,"Testing Language","+","*"));
        fourEyeCommentContent.append("\n").append("+FIT Test Behavior:+ ").append("\n");
        fourEyeCommentContent.append(txaFXTFITTestingBehavior.getText()).append("\n");
        if (cbxFXTFITWithAttachment.isSelected())
            fourEyeCommentContent.append("\n").append("Please check the attachment for more detail").append("\n");
        content.putString(String.valueOf(fourEyeCommentContent));
        clipboard.setContent(content);
    }
}
