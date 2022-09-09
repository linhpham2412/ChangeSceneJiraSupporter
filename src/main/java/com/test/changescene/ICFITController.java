package com.test.changescene;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.ResourceBundle;
import java.util.stream.IntStream;

public class ICFITController implements Initializable {
    public Button btnICFITCommentBackToDB;
    public Label txtICFITYourName;
    public List<CheckBox> cbxICFITBuildInformationList = new ArrayList<>();
    public List<CheckBox> cbxICFITServerNameList = new ArrayList<>();
    public List<CheckBox> cbxICFITSDKNameList = new ArrayList<>();
    public List<CheckBox> cbxICFITSLOTNameList = new ArrayList<>();
    public List<CheckBox> cbxICFITInternalSLOTList = new ArrayList<>();
    public List<CheckBox> cbxICFITURLInformationList = new ArrayList<>();
    public List<CheckBox> cbxICFITIssueTypeList = new ArrayList<>();
    public List<CheckBox> cbxICFITIssueStatusList = new ArrayList<>();
    public List<CheckBox> cbxICFITEnvironmentList = new ArrayList<>();
    public List<CheckBox> cbxICFITTestingTypeAndBrowserList = new ArrayList<>();
    public List<CheckBox> cbxICFITTestingCredentialList = new ArrayList<>();
    public List<CheckBox> cbxICFITTestingLanguageList = new ArrayList<>();
    public VBox vboxICFITBuildInformation;
    public VBox vboxICFITServerName;
    public VBox vboxICFITSDKName;
    public VBox vboxICFITSLOTName;
    public VBox vboxICFITInternalSLOT;
    public VBox vboxICFITURLInformation;
    public VBox vboxICFITIssueType;
    public VBox vboxICFITIssueStatus;
    public VBox vboxICFITEnvironment;
    public VBox vboxICFITTestingTypeAndBrowser;
    public VBox vboxICFITTestingCredential;
    public VBox vboxICFITTestingLanguage;
    supporterUtils supporterUtilICFIT = new supporterUtils();
    List<SettingData> supporterSettingsICFITList = new ArrayList<>();
    SettingData setting1ICFIT = new SettingData();
    SettingData setting2ICFIT = new SettingData();
    SettingData setting3ICFIT = new SettingData();
    SettingData setting4ICFIT = new SettingData();
    SettingData setting5ICFIT = new SettingData();
    SettingData setting6ICFIT = new SettingData();
    SettingData setting7ICFIT = new SettingData();
    SettingData setting8ICFIT = new SettingData();
    SettingData setting9ICFIT = new SettingData();
    SettingData setting10ICFIT = new SettingData();

    public void handelICFITCommentBackToDB(ActionEvent actionEvent) {
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
        supporterSettingsICFITList.addAll(List.of(setting1ICFIT, setting2ICFIT, setting3ICFIT, setting4ICFIT, setting5ICFIT, setting6ICFIT, setting7ICFIT, setting8ICFIT, setting9ICFIT, setting10ICFIT));

        cbxICFITBuildInformationList = supporterUtilICFIT.autoAdd10SelectCheckboxes(vboxICFITBuildInformation, "Build Information", "cbxICFITBuildInformation");
        cbxICFITServerNameList = supporterUtilICFIT.autoAdd10SelectCheckboxes(vboxICFITServerName, "Server Name", "cbxICFITServerName");
        cbxICFITSDKNameList = supporterUtilICFIT.autoAdd10SelectCheckboxes(vboxICFITSDKName, "SDK Name", "cbxICFITSDKName");
        cbxICFITSLOTNameList = supporterUtilICFIT.autoAdd10SelectCheckboxes(vboxICFITSLOTName, "SLOT Name", "cbxICFITSLOTName");
        cbxICFITInternalSLOTList = supporterUtilICFIT.autoAdd10SelectCheckboxes(vboxICFITInternalSLOT, "Internal SLOT", "cbxICFITInternalSLOT");
        cbxICFITURLInformationList = supporterUtilICFIT.autoAdd10SelectCheckboxes(vboxICFITURLInformation, "URL Information", "cbxICFITURLInformation");
        cbxICFITIssueTypeList = supporterUtilICFIT.autoAdd10SelectCheckboxes(vboxICFITIssueType, "Issue Type", "cbxICFITIssueType");
        cbxICFITIssueStatusList = supporterUtilICFIT.autoAdd10SelectCheckboxes(vboxICFITIssueStatus, "Issue Status", "cbxICFITIssueStatus");
        cbxICFITEnvironmentList = supporterUtilICFIT.autoAdd10SelectCheckboxes(vboxICFITEnvironment, "Environment", "cbxICFITEnvironment");
        cbxICFITTestingTypeAndBrowserList = supporterUtilICFIT.autoAdd10SelectCheckboxes(vboxICFITTestingTypeAndBrowser, "Testing Type/ Browser", "cbxICFITTestingTypeAndBrowser");
        cbxICFITTestingCredentialList = supporterUtilICFIT.autoAdd10SelectCheckboxes(vboxICFITTestingCredential, "Testing Credential", "cbxICFITTestingCredential");
        cbxICFITTestingLanguageList = supporterUtilICFIT.autoAdd10SelectCheckboxes(vboxICFITTestingLanguage, "Testing Language", "cbxICFITTestingLanguage");
        supporterSettingsICFITList = supporterUtilICFIT.importSettingsFromFile();
        txtICFITYourName.setText(supporterUtilICFIT.getUserName());
        IntStream.range(0, 10).forEach(index -> cbxICFITBuildInformationList.get(index).setText(supporterSettingsICFITList.get(index).getBuildName()));
        IntStream.range(0, 10).forEach(index -> cbxICFITServerNameList.get(index).setText(supporterSettingsICFITList.get(index).getServerName()));
        IntStream.range(0, 10).forEach(index -> cbxICFITSDKNameList.get(index).setText(supporterSettingsICFITList.get(index).getSdk()));
        IntStream.range(0, 10).forEach(index -> cbxICFITSLOTNameList.get(index).setText(supporterSettingsICFITList.get(index).getSlotName()));
        IntStream.range(0, 10).forEach(index -> cbxICFITInternalSLOTList.get(index).setText(supporterSettingsICFITList.get(index).getInternalSlot()));
        IntStream.range(0, 10).forEach(index -> cbxICFITURLInformationList.get(index).setText(supporterSettingsICFITList.get(index).getUrl()));
        IntStream.range(0, 10).forEach(index -> cbxICFITIssueTypeList.get(index).setText(supporterSettingsICFITList.get(index).getIssueType()));
        IntStream.range(0, 10).forEach(index -> cbxICFITIssueStatusList.get(index).setText(supporterSettingsICFITList.get(index).getStatus()));
        IntStream.range(0, 10).forEach(index -> cbxICFITEnvironmentList.get(index).setText(supporterSettingsICFITList.get(index).getEnvironment()));
        IntStream.range(0, 10).forEach(index -> cbxICFITTestingTypeAndBrowserList.get(index).setText(supporterSettingsICFITList.get(index).getBrowser()));
        IntStream.range(0, 10).forEach(index -> cbxICFITTestingCredentialList.get(index).setText(supporterSettingsICFITList.get(index).getTestUser()));
        IntStream.range(0, 10).forEach(index -> cbxICFITTestingLanguageList.get(index).setText(supporterSettingsICFITList.get(index).getLanguage()));
    }
}
