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

public class FXT4EyesCommentController implements Initializable {
    public Button btnFXT4EeyesBackToDB;
    public Label txtFXT4EyesYourName;
    public List<CheckBox> cbxFXT4EyesBuildInformationList = new ArrayList<>();
    public List<CheckBox> cbxFXT4EyesServerNameList = new ArrayList<>();
    public List<CheckBox> cbxFXT4EyesSDKNameList = new ArrayList<>();
    public List<CheckBox> cbxFXT4EyesSLOTNameList = new ArrayList<>();
    public List<CheckBox> cbxFXT4EyesInternalSLOTList = new ArrayList<>();
    public List<CheckBox> cbxFXT4EyesURLInformationList = new ArrayList<>();
    public List<CheckBox> cbxFXT4EyesIssueTypeList = new ArrayList<>();
    public List<CheckBox> cbxFXT4EyesIssueStatusList = new ArrayList<>();
    public List<CheckBox> cbxFXT4EyesEnvironmentList = new ArrayList<>();
    public List<CheckBox> cbxFXT4EyesTestingTypeAndBrowserList = new ArrayList<>();
    public List<CheckBox> cbxFXT4EyesTestingCredentialList = new ArrayList<>();
    public List<CheckBox> cbxFXT4EyesTestingLanguageList = new ArrayList<>();
    public VBox vboxFXT4EyesBuildInformation;
    public VBox vboxFXT4EyesServerName;
    public VBox vboxFXT4EyesSDKName;
    public VBox vboxFXT4EyesSLOTName;
    public VBox vboxFXT4EyesInternalSLOT;
    public VBox vboxFXT4EyesURLInformation;
    public VBox vboxFXT4EyesIssueType;
    public VBox vboxFXT4EyesIssueStatus;
    public VBox vboxFXT4EyesEnvironment;
    public VBox vboxFXT4EyesTestingTypeAndBrowser;
    public VBox vboxFXT4EyesTestingCredential;
    public VBox vboxFXT4EyesTestingLanguage;
    public Label txtFXT4EyesDeveloperName;
    public TextArea txaFXT4EyesTestingBehavior;
    public CheckBox cbxFXT4EyesWithAttachment;
    public TextArea txaFXT4EyesDeveloperName;
    supporterUtils supporterUtilFXT4Eyes = new supporterUtils();
    List<SettingData> supporterSettingsFXT4EyesList = new ArrayList<>();
    SettingData setting1FXT4Eyes = new SettingData();
    SettingData setting2FXT4Eyes = new SettingData();
    SettingData setting3FXT4Eyes = new SettingData();
    SettingData setting4FXT4Eyes = new SettingData();
    SettingData setting5FXT4Eyes = new SettingData();
    SettingData setting6FXT4Eyes = new SettingData();
    SettingData setting7FXT4Eyes = new SettingData();
    SettingData setting8FXT4Eyes = new SettingData();
    SettingData setting9FXT4Eyes = new SettingData();
    SettingData setting10FXT4Eyes = new SettingData();
    final Clipboard clipboard = Clipboard.getSystemClipboard();
    final ClipboardContent content = new ClipboardContent();
    private final AtomicBoolean listModeFXT4eyesTestBehavior = new AtomicBoolean(false);
    private final AtomicBoolean numericModeFXT4eyesTestBehavior = new AtomicBoolean(false);
    private final AtomicInteger numericIndexFXT4eyesTestBehavior = new AtomicInteger(1);
    private final AtomicBoolean listModeFXT4eyesDeveloperName = new AtomicBoolean(false);
    private final AtomicBoolean numericModeFXT4eyesDeveloperName = new AtomicBoolean(false);
    private final AtomicInteger numericIndexFXT4eyesDeveloperName = new AtomicInteger(1);

    public void handelFXT4EeyesBackToDB(ActionEvent actionEvent) {
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
        supporterSettingsFXT4EyesList.addAll(List.of(setting1FXT4Eyes, setting2FXT4Eyes, setting3FXT4Eyes, setting4FXT4Eyes, setting5FXT4Eyes, setting6FXT4Eyes, setting7FXT4Eyes, setting8FXT4Eyes, setting9FXT4Eyes, setting10FXT4Eyes));

        cbxFXT4EyesBuildInformationList = supporterUtilFXT4Eyes.autoAdd10SelectCheckboxes(vboxFXT4EyesBuildInformation, "Build Information", "cbxFXT4EyesBuildInformation");
        cbxFXT4EyesServerNameList = supporterUtilFXT4Eyes.autoAdd10SelectCheckboxes(vboxFXT4EyesServerName, "Server Name", "cbxFXT4EyesServerName");
        cbxFXT4EyesSDKNameList = supporterUtilFXT4Eyes.autoAdd10SelectCheckboxes(vboxFXT4EyesSDKName, "SDK Name", "cbxFXT4EyesSDKName");
        cbxFXT4EyesSLOTNameList = supporterUtilFXT4Eyes.autoAdd10SelectCheckboxes(vboxFXT4EyesSLOTName, "SLOT Name", "cbxFXT4EyesSLOTName");
        cbxFXT4EyesInternalSLOTList = supporterUtilFXT4Eyes.autoAdd10SelectCheckboxes(vboxFXT4EyesInternalSLOT, "Internal SLOT", "cbxFXT4EyesInternalSLOT");
        cbxFXT4EyesURLInformationList = supporterUtilFXT4Eyes.autoAdd10SelectCheckboxes(vboxFXT4EyesURLInformation, "URL Information", "cbxFXT4EyesURLInformation");
        cbxFXT4EyesIssueTypeList = supporterUtilFXT4Eyes.autoAdd10SelectCheckboxes(vboxFXT4EyesIssueType, "Issue Type", "cbxFXT4EyesIssueType");
        cbxFXT4EyesIssueStatusList = supporterUtilFXT4Eyes.autoAdd10SelectCheckboxes(vboxFXT4EyesIssueStatus, "Issue Status", "cbxFXT4EyesIssueStatus");
        cbxFXT4EyesEnvironmentList = supporterUtilFXT4Eyes.autoAdd10SelectCheckboxes(vboxFXT4EyesEnvironment, "Environment", "cbxFXT4EyesEnvironment");
        cbxFXT4EyesTestingTypeAndBrowserList = supporterUtilFXT4Eyes.autoAdd10SelectCheckboxes(vboxFXT4EyesTestingTypeAndBrowser, "Testing Type/ Browser", "cbxFXT4EyesTestingTypeAndBrowser");
        cbxFXT4EyesTestingCredentialList = supporterUtilFXT4Eyes.autoAdd10SelectCheckboxes(vboxFXT4EyesTestingCredential, "Testing Credential", "cbxFXT4EyesTestingCredential");
        cbxFXT4EyesTestingLanguageList = supporterUtilFXT4Eyes.autoAdd10SelectCheckboxes(vboxFXT4EyesTestingLanguage, "Testing Language", "cbxFXT4EyesTestingLanguage");
        supporterSettingsFXT4EyesList = supporterUtilFXT4Eyes.importSettingsFromFile();
        txtFXT4EyesYourName.setText(supporterUtilFXT4Eyes.getUserName());
        IntStream.range(0, 10).forEach(index -> cbxFXT4EyesBuildInformationList.get(index).setText(supporterSettingsFXT4EyesList.get(index).getBuildName()));
        IntStream.range(0, 10).forEach(index -> cbxFXT4EyesServerNameList.get(index).setText(supporterSettingsFXT4EyesList.get(index).getServerName()));
        IntStream.range(0, 10).forEach(index -> cbxFXT4EyesSDKNameList.get(index).setText(supporterSettingsFXT4EyesList.get(index).getSdk()));
        IntStream.range(0, 10).forEach(index -> cbxFXT4EyesSLOTNameList.get(index).setText(supporterSettingsFXT4EyesList.get(index).getSlotName()));
        IntStream.range(0, 10).forEach(index -> cbxFXT4EyesInternalSLOTList.get(index).setText(supporterSettingsFXT4EyesList.get(index).getInternalSlot()));
        IntStream.range(0, 10).forEach(index -> cbxFXT4EyesURLInformationList.get(index).setText(supporterSettingsFXT4EyesList.get(index).getUrl()));
        IntStream.range(0, 10).forEach(index -> cbxFXT4EyesIssueTypeList.get(index).setText(supporterSettingsFXT4EyesList.get(index).getIssueType()));
        IntStream.range(0, 10).forEach(index -> cbxFXT4EyesIssueStatusList.get(index).setText(supporterSettingsFXT4EyesList.get(index).getStatus()));
        IntStream.range(0, 10).forEach(index -> cbxFXT4EyesEnvironmentList.get(index).setText(supporterSettingsFXT4EyesList.get(index).getEnvironment()));
        IntStream.range(0, 10).forEach(index -> cbxFXT4EyesTestingTypeAndBrowserList.get(index).setText(supporterSettingsFXT4EyesList.get(index).getBrowser()));
        IntStream.range(0, 10).forEach(index -> cbxFXT4EyesTestingCredentialList.get(index).setText(supporterSettingsFXT4EyesList.get(index).getTestUser()));
        IntStream.range(0, 10).forEach(index -> cbxFXT4EyesTestingLanguageList.get(index).setText(supporterSettingsFXT4EyesList.get(index).getLanguage()));
    }

    public void handleTextAreaFXT4EyesTestingBehaviorKeyReleased(KeyEvent keyEvent) {
        supporterUtilFXT4Eyes.onHandleTextArea(keyEvent,txaFXT4EyesTestingBehavior,false,listModeFXT4eyesTestBehavior, numericModeFXT4eyesTestBehavior, numericIndexFXT4eyesTestBehavior);
    }

    public void handleTextAreaFXT4EyesDeveloperNameKeyReleased(KeyEvent keyEvent) {
        supporterUtilFXT4Eyes.onHandleTextArea(keyEvent,txaFXT4EyesDeveloperName,false,listModeFXT4eyesDeveloperName,numericModeFXT4eyesDeveloperName,numericIndexFXT4eyesDeveloperName);
    }

    @FXML
    void generateAndCopyFXT4EyeComment() {
        StringBuilder fourEyeCommentContent = new StringBuilder();
        String firstSelectedIssueType = "";
        String firstSelectedStatus = "";
        //Only get 1 first selected value for Issue Type and Issue Status
        for (CheckBox cb : cbxFXT4EyesIssueStatusList) {
            if (cb.isSelected()) {
                firstSelectedIssueType = cb.getText();
                break;
            }
        }
        for (CheckBox cb : cbxFXT4EyesIssueStatusList) {
            if (cb.isSelected()) {
                firstSelectedStatus = cb.getText();
                break;
            }
        }
        fourEyeCommentContent.append("*").append(firstSelectedIssueType).append("* 4eyes verified by +").append(txtFXT4EyesYourName.getText()).append("+ with status *").append(firstSelectedStatus).append("*, Developer Name: +").append(txtFXT4EyesDeveloperName.getText()).append("+").append("\n");
        fourEyeCommentContent.append(supporterUtilFXT4Eyes.pickSelectedCheckBoxesAndPrint(cbxFXT4EyesBuildInformationList, "Build Information","+","*"));
        fourEyeCommentContent.append(supporterUtilFXT4Eyes.pickSelectedCheckBoxesAndPrint(cbxFXT4EyesServerNameList,"Server Name","+","*"));
        fourEyeCommentContent.append(supporterUtilFXT4Eyes.pickSelectedCheckBoxesAndPrint(cbxFXT4EyesSDKNameList,"SDK Name","+","*"));
        fourEyeCommentContent.append(supporterUtilFXT4Eyes.pickSelectedCheckBoxesAndPrint(cbxFXT4EyesSLOTNameList,"SLOT Name","+","*"));
        fourEyeCommentContent.append(supporterUtilFXT4Eyes.pickSelectedCheckBoxesAndPrint(cbxFXT4EyesInternalSLOTList,"Internal SLOT","+","*"));
        fourEyeCommentContent.append(supporterUtilFXT4Eyes.pickSelectedCheckBoxesAndPrint(cbxFXT4EyesURLInformationList,"URL Information","+","*"));
        fourEyeCommentContent.append(supporterUtilFXT4Eyes.pickSelectedCheckBoxesAndPrint(cbxFXT4EyesEnvironmentList,"Testing Environment","+",""));
        fourEyeCommentContent.append(supporterUtilFXT4Eyes.pickSelectedCheckBoxesAndPrint(cbxFXT4EyesTestingTypeAndBrowserList,"Testing Type/Browser","+","*"));
        fourEyeCommentContent.append(supporterUtilFXT4Eyes.pickSelectedCheckBoxesAndPrint(cbxFXT4EyesTestingCredentialList,"Testing Credential","+","*"));
        fourEyeCommentContent.append(supporterUtilFXT4Eyes.pickSelectedCheckBoxesAndPrint(cbxFXT4EyesTestingLanguageList,"Testing Language","+","*"));
        fourEyeCommentContent.append("\n").append("+4Eyes Test Behavior:+ ").append("\n");
        fourEyeCommentContent.append(txaFXT4EyesTestingBehavior.getText()).append("\n");
        if (cbxFXT4EyesWithAttachment.isSelected())
            fourEyeCommentContent.append("\n").append("Please check the attachment for more detail").append("\n");
        content.putString(String.valueOf(fourEyeCommentContent));
        clipboard.setContent(content);
    }
}
