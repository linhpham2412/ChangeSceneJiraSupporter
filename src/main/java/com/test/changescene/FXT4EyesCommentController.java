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
}
