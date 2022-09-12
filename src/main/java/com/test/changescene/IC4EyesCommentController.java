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

public class IC4EyesCommentController implements Initializable {
    public Button btnIC4eyesBackToDB;
    public Label txtIC4EyesYourName;
    public List<CheckBox> cbxIC4EyesBuildInformationList = new ArrayList<>();
    public List<CheckBox> cbxIC4EyesServerNameList = new ArrayList<>();
    public List<CheckBox> cbxIC4EyesSDKNameList = new ArrayList<>();
    public List<CheckBox> cbxIC4EyesSLOTNameList = new ArrayList<>();
    public List<CheckBox> cbxIC4EyesInternalSLOTList = new ArrayList<>();
    public List<CheckBox> cbxIC4EyesURLInformationList = new ArrayList<>();
    public List<CheckBox> cbxIC4EyesIssueTypeList = new ArrayList<>();
    public List<CheckBox> cbxIC4EyesIssueStatusList = new ArrayList<>();
    public List<CheckBox> cbxIC4EyesEnvironmentList = new ArrayList<>();
    public List<CheckBox> cbxIC4EyesTestingTypeAndBrowserList = new ArrayList<>();
    public List<CheckBox> cbxIC4EyesTestingCredentialList = new ArrayList<>();
    public List<CheckBox> cbxIC4EyesTestingLanguageList = new ArrayList<>();
    public VBox vboxIC4EyesIssueType;
    public VBox vboxIC4EyesBuildInformation;
    public VBox vboxIC4EyesServerName;
    public VBox vboxIC4EyesSDKName;
    public VBox vboxIC4EyesSLOTName;
    public VBox vboxIC4EyesInternalSLOT;
    public VBox vboxIC4EyesURLInformation;
    public VBox vboxIC4EyesIssueStatus;
    public VBox vboxIC4EyesEnvironment;
    public VBox vboxIC4EyesTestingTypeAndBrowser;
    public VBox vboxIC4EyesTestingCredential;
    public VBox vboxIC4EyesTestingLanguage;
    public TextArea txaIC4EyesFITTestingBehavior;
    public TextArea txaIC4EyesDeveloperName;
    public CheckBox cbxIC4EyesWithAttachment;
    supporterUtils supporterUtilIC4Eyes = new supporterUtils();
    List<SettingData> supporterSettingsIC4EyesList = new ArrayList<>();
    SettingData setting1IC4eyes = new SettingData();
    SettingData setting2IC4eyes = new SettingData();
    SettingData setting3IC4eyes = new SettingData();
    SettingData setting4IC4eyes = new SettingData();
    SettingData setting5IC4eyes = new SettingData();
    SettingData setting6IC4eyes = new SettingData();
    SettingData setting7IC4eyes = new SettingData();
    SettingData setting8IC4eyes = new SettingData();
    SettingData setting9IC4eyes = new SettingData();
    SettingData setting10IC4eyes = new SettingData();
    AtomicBoolean listModeIC4eyes = new AtomicBoolean(false);
    AtomicBoolean numericModeIC4eyes = new AtomicBoolean(false);
    AtomicInteger numericIndexIC4eyes = new AtomicInteger(1);
    final Clipboard clipboard = Clipboard.getSystemClipboard();
    final ClipboardContent content = new ClipboardContent();

    public void handelbtnIC4eyesBackToDB(ActionEvent actionEvent) {
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

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        supporterSettingsIC4EyesList.addAll(List.of(setting1IC4eyes, setting2IC4eyes, setting3IC4eyes, setting4IC4eyes, setting5IC4eyes, setting6IC4eyes, setting7IC4eyes, setting8IC4eyes, setting9IC4eyes, setting10IC4eyes));

        cbxIC4EyesBuildInformationList = supporterUtilIC4Eyes.autoAdd10SelectCheckboxes(vboxIC4EyesBuildInformation, "Build Information", "cbxIC4EyesBuildInformation");
        cbxIC4EyesServerNameList = supporterUtilIC4Eyes.autoAdd10SelectCheckboxes(vboxIC4EyesServerName, "Server Name", "cbxIC4EyesServerName");
        cbxIC4EyesSDKNameList = supporterUtilIC4Eyes.autoAdd10SelectCheckboxes(vboxIC4EyesSDKName, "SDK Name", "cbxIC4EyesSDKName");
        cbxIC4EyesSLOTNameList = supporterUtilIC4Eyes.autoAdd10SelectCheckboxes(vboxIC4EyesSLOTName, "SLOT Name", "cbxIC4EyesSLOTName");
        cbxIC4EyesInternalSLOTList = supporterUtilIC4Eyes.autoAdd10SelectCheckboxes(vboxIC4EyesInternalSLOT, "Internal SLOT", "cbxIC4EyesInternalSLOT");
        cbxIC4EyesURLInformationList = supporterUtilIC4Eyes.autoAdd10SelectCheckboxes(vboxIC4EyesURLInformation, "URL Information", "cbxIC4EyesURLInformation");
        cbxIC4EyesIssueTypeList = supporterUtilIC4Eyes.autoAdd10SelectCheckboxes(vboxIC4EyesIssueType, "Issue Type", "cbxIC4EyesIssueType");
        cbxIC4EyesIssueStatusList = supporterUtilIC4Eyes.autoAdd10SelectCheckboxes(vboxIC4EyesIssueStatus, "Issue Status", "cbxIC4EyesIssueStatus");
        cbxIC4EyesEnvironmentList = supporterUtilIC4Eyes.autoAdd10SelectCheckboxes(vboxIC4EyesEnvironment, "Environment", "cbxIC4EyesEnvironment");
        cbxIC4EyesTestingTypeAndBrowserList = supporterUtilIC4Eyes.autoAdd10SelectCheckboxes(vboxIC4EyesTestingTypeAndBrowser, "Testing Type/ Browser", "cbxIC4EyesTestingTypeAndBrowser");
        cbxIC4EyesTestingCredentialList = supporterUtilIC4Eyes.autoAdd10SelectCheckboxes(vboxIC4EyesTestingCredential, "Testing Credential", "cbxIC4EyesTestingCredential");
        cbxIC4EyesTestingLanguageList = supporterUtilIC4Eyes.autoAdd10SelectCheckboxes(vboxIC4EyesTestingLanguage, "Testing Language", "cbxIC4EyesTestingLanguage");
        supporterSettingsIC4EyesList = supporterUtilIC4Eyes.importSettingsFromFile();
        txtIC4EyesYourName.setText(supporterUtilIC4Eyes.getUserName());
        IntStream.range(0, 10).forEach(index -> cbxIC4EyesBuildInformationList.get(index).setText(supporterSettingsIC4EyesList.get(index).getBuildName()));
        IntStream.range(0, 10).forEach(index -> cbxIC4EyesServerNameList.get(index).setText(supporterSettingsIC4EyesList.get(index).getServerName()));
        IntStream.range(0, 10).forEach(index -> cbxIC4EyesSDKNameList.get(index).setText(supporterSettingsIC4EyesList.get(index).getSdk()));
        IntStream.range(0, 10).forEach(index -> cbxIC4EyesSLOTNameList.get(index).setText(supporterSettingsIC4EyesList.get(index).getSlotName()));
        IntStream.range(0, 10).forEach(index -> cbxIC4EyesInternalSLOTList.get(index).setText(supporterSettingsIC4EyesList.get(index).getInternalSlot()));
        IntStream.range(0, 10).forEach(index -> cbxIC4EyesURLInformationList.get(index).setText(supporterSettingsIC4EyesList.get(index).getUrl()));
        IntStream.range(0, 10).forEach(index -> cbxIC4EyesIssueTypeList.get(index).setText(supporterSettingsIC4EyesList.get(index).getIssueType()));
        IntStream.range(0, 10).forEach(index -> cbxIC4EyesIssueStatusList.get(index).setText(supporterSettingsIC4EyesList.get(index).getStatus()));
        IntStream.range(0, 10).forEach(index -> cbxIC4EyesEnvironmentList.get(index).setText(supporterSettingsIC4EyesList.get(index).getEnvironment()));
        IntStream.range(0, 10).forEach(index -> cbxIC4EyesTestingTypeAndBrowserList.get(index).setText(supporterSettingsIC4EyesList.get(index).getBrowser()));
        IntStream.range(0, 10).forEach(index -> cbxIC4EyesTestingCredentialList.get(index).setText(supporterSettingsIC4EyesList.get(index).getTestUser()));
        IntStream.range(0, 10).forEach(index -> cbxIC4EyesTestingLanguageList.get(index).setText(supporterSettingsIC4EyesList.get(index).getLanguage()));
    }


    public void handleTextAreaKeyReleased(KeyEvent keyEvent) {
        TextArea eventTextArea = (TextArea) keyEvent.getSource();
        supporterUtilIC4Eyes.onHandleTextArea(keyEvent,eventTextArea,true,listModeIC4eyes,null,numericModeIC4eyes,null,numericIndexIC4eyes);
    }

    @FXML
    void generateAndCopyIC4EyeComment() {
        StringBuilder fourEyeCommentContent = new StringBuilder();
        String firstSelectedIssueType = "";
        String firstSelectedStatus = "";
        //Only get 1 first selected value for Issue Type and Issue Status
        for (CheckBox cb : cbxIC4EyesIssueTypeList) {
            if (cb.isSelected()) {
                firstSelectedIssueType = cb.getText();
                break;
            }
        }
        for (CheckBox cb : cbxIC4EyesIssueStatusList) {
            if (cb.isSelected()) {
                firstSelectedStatus = cb.getText();
                break;
            }
        }
        fourEyeCommentContent.append("**").append(firstSelectedIssueType).append("** 4eyes verified by `").append(txtIC4EyesYourName.getText()).append("` with status **").append(firstSelectedStatus).append("**, Developer Name: `").append(txaIC4EyesDeveloperName.getText()).append("`").append("\n");
        fourEyeCommentContent.append(supporterUtilIC4Eyes.pickSelectedCheckBoxesAndPrint(cbxIC4EyesBuildInformationList, "Build Information","`","**"));
        fourEyeCommentContent.append(supporterUtilIC4Eyes.pickSelectedCheckBoxesAndPrint(cbxIC4EyesServerNameList,"Server Name","`","**"));
        fourEyeCommentContent.append(supporterUtilIC4Eyes.pickSelectedCheckBoxesAndPrint(cbxIC4EyesSDKNameList,"SDK Name","`","**"));
        fourEyeCommentContent.append(supporterUtilIC4Eyes.pickSelectedCheckBoxesAndPrint(cbxIC4EyesSLOTNameList,"SLOT Name","`","**"));
        fourEyeCommentContent.append(supporterUtilIC4Eyes.pickSelectedCheckBoxesAndPrint(cbxIC4EyesInternalSLOTList,"Internal SLOT","`","**"));
        fourEyeCommentContent.append(supporterUtilIC4Eyes.pickSelectedCheckBoxesAndPrint(cbxIC4EyesURLInformationList,"URL Information","`","**"));
        fourEyeCommentContent.append(supporterUtilIC4Eyes.pickSelectedCheckBoxesAndPrint(cbxIC4EyesEnvironmentList,"Testing Environment","`",""));
        fourEyeCommentContent.append(supporterUtilIC4Eyes.pickSelectedCheckBoxesAndPrint(cbxIC4EyesTestingTypeAndBrowserList,"Testing Type/Browser","`","**"));
        fourEyeCommentContent.append(supporterUtilIC4Eyes.pickSelectedCheckBoxesAndPrint(cbxIC4EyesTestingCredentialList,"Testing Credential","`","**"));
        fourEyeCommentContent.append(supporterUtilIC4Eyes.pickSelectedCheckBoxesAndPrint(cbxIC4EyesTestingLanguageList,"Testing Language","`","**"));
        fourEyeCommentContent.append("\n").append("`4Eyes Test Behavior:` ").append("\n");
        fourEyeCommentContent.append(txaIC4EyesFITTestingBehavior.getText()).append("\n");
        if (cbxIC4EyesWithAttachment.isSelected())
            fourEyeCommentContent.append("\n").append("Please check the attachment for more detail").append("\n");
        content.putString(String.valueOf(fourEyeCommentContent));
        clipboard.setContent(content);
    }
}
