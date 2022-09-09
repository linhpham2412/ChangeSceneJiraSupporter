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

public class FXTDefectController implements Initializable {
    public Button btnFXTDefectBackToDB;
    public Label txtFXTDefectYourName;
    public List<CheckBox> cbxFXTDefectBuildInformationList = new ArrayList<>();
    public List<CheckBox> cbxFXTDefectServerNameList = new ArrayList<>();
    public List<CheckBox> cbxFXTDefectSDKNameList = new ArrayList<>();
    public List<CheckBox> cbxFXTDefectSLOTNameList = new ArrayList<>();
    public List<CheckBox> cbxFXTDefectInternalSLOTList = new ArrayList<>();
    public List<CheckBox> cbxFXTDefectURLInformationList = new ArrayList<>();
    public List<CheckBox> cbxFXTDefectIssueTypeList = new ArrayList<>();
    public List<CheckBox> cbxFXTDefectIssueStatusList = new ArrayList<>();
    public List<CheckBox> cbxFXTDefectEnvironmentList = new ArrayList<>();
    public List<CheckBox> cbxFXTDefectTestingTypeAndBrowserList = new ArrayList<>();
    public List<CheckBox> cbxFXTDefectTestingCredentialList = new ArrayList<>();
    public List<CheckBox> cbxFXTDefectTestingLanguageList = new ArrayList<>();
    public VBox vboxFXTDefectBuildInformation;
    public VBox vboxFXTDefectServerName;
    public VBox vboxFXTDefectSDKName;
    public VBox vboxFXTDefectSLOTName;
    public VBox vboxFXTDefectInternalSLOT;
    public VBox vboxFXTDefectURLInformation;
    public VBox vboxFXTDefectEnvironment;
    public VBox vboxFXTDefectTestingTypeAndBrowser;
    public VBox vboxFXTDefectTestingCredential;
    public VBox vboxFXTDefectTestingLanguage;
    supporterUtils supporterUtilFXTDefect = new supporterUtils();
    List<SettingData> supporterSettingsFXTDefectList = new ArrayList<>();
    SettingData setting1FXTDefect = new SettingData();
    SettingData setting2FXTDefect = new SettingData();
    SettingData setting3FXTDefect = new SettingData();
    SettingData setting4FXTDefect = new SettingData();
    SettingData setting5FXTDefect = new SettingData();
    SettingData setting6FXTDefect = new SettingData();
    SettingData setting7FXTDefect = new SettingData();
    SettingData setting8FXTDefect = new SettingData();
    SettingData setting9FXTDefect = new SettingData();
    SettingData setting10FXTDefect = new SettingData();

    public void handleFXTDefectBackToDB(ActionEvent actionEvent) {
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
        supporterSettingsFXTDefectList.addAll(List.of(setting1FXTDefect, setting2FXTDefect, setting3FXTDefect, setting4FXTDefect, setting5FXTDefect, setting6FXTDefect, setting7FXTDefect, setting8FXTDefect, setting9FXTDefect, setting10FXTDefect));

        cbxFXTDefectBuildInformationList = supporterUtilFXTDefect.autoAdd10SelectCheckboxes(vboxFXTDefectBuildInformation, "Build Information", "cbxFXTDefectBuildInformation");
        cbxFXTDefectServerNameList = supporterUtilFXTDefect.autoAdd10SelectCheckboxes(vboxFXTDefectServerName, "Server Name", "cbxFXTDefectServerName");
        cbxFXTDefectSDKNameList = supporterUtilFXTDefect.autoAdd10SelectCheckboxes(vboxFXTDefectSDKName, "SDK Name", "cbxFXTDefectSDKName");
        cbxFXTDefectSLOTNameList = supporterUtilFXTDefect.autoAdd10SelectCheckboxes(vboxFXTDefectSLOTName, "SLOT Name", "cbxFXTDefectSLOTName");
        cbxFXTDefectInternalSLOTList = supporterUtilFXTDefect.autoAdd10SelectCheckboxes(vboxFXTDefectInternalSLOT, "Internal SLOT", "cbxFXTDefectInternalSLOT");
        cbxFXTDefectURLInformationList = supporterUtilFXTDefect.autoAdd10SelectCheckboxes(vboxFXTDefectURLInformation, "URL Information", "cbxFXTDefectURLInformation");
        cbxFXTDefectEnvironmentList = supporterUtilFXTDefect.autoAdd10SelectCheckboxes(vboxFXTDefectEnvironment, "Environment", "cbxFXTDefectEnvironment");
        cbxFXTDefectTestingTypeAndBrowserList = supporterUtilFXTDefect.autoAdd10SelectCheckboxes(vboxFXTDefectTestingTypeAndBrowser, "Testing Type/ Browser", "cbxFXTDefectTestingTypeAndBrowser");
        cbxFXTDefectTestingCredentialList = supporterUtilFXTDefect.autoAdd10SelectCheckboxes(vboxFXTDefectTestingCredential, "Testing Credential", "cbxFXTDefectTestingCredential");
        cbxFXTDefectTestingLanguageList = supporterUtilFXTDefect.autoAdd10SelectCheckboxes(vboxFXTDefectTestingLanguage, "Testing Language", "cbxFXTDefectTestingLanguage");
        supporterSettingsFXTDefectList = supporterUtilFXTDefect.importSettingsFromFile();
        txtFXTDefectYourName.setText(supporterUtilFXTDefect.getUserName());
        IntStream.range(0, 10).forEach(index -> cbxFXTDefectBuildInformationList.get(index).setText(supporterSettingsFXTDefectList.get(index).getBuildName()));
        IntStream.range(0, 10).forEach(index -> cbxFXTDefectServerNameList.get(index).setText(supporterSettingsFXTDefectList.get(index).getServerName()));
        IntStream.range(0, 10).forEach(index -> cbxFXTDefectSDKNameList.get(index).setText(supporterSettingsFXTDefectList.get(index).getSdk()));
        IntStream.range(0, 10).forEach(index -> cbxFXTDefectSLOTNameList.get(index).setText(supporterSettingsFXTDefectList.get(index).getSlotName()));
        IntStream.range(0, 10).forEach(index -> cbxFXTDefectInternalSLOTList.get(index).setText(supporterSettingsFXTDefectList.get(index).getInternalSlot()));
        IntStream.range(0, 10).forEach(index -> cbxFXTDefectURLInformationList.get(index).setText(supporterSettingsFXTDefectList.get(index).getUrl()));
        IntStream.range(0, 10).forEach(index -> cbxFXTDefectEnvironmentList.get(index).setText(supporterSettingsFXTDefectList.get(index).getEnvironment()));
        IntStream.range(0, 10).forEach(index -> cbxFXTDefectTestingTypeAndBrowserList.get(index).setText(supporterSettingsFXTDefectList.get(index).getBrowser()));
        IntStream.range(0, 10).forEach(index -> cbxFXTDefectTestingCredentialList.get(index).setText(supporterSettingsFXTDefectList.get(index).getTestUser()));
        IntStream.range(0, 10).forEach(index -> cbxFXTDefectTestingLanguageList.get(index).setText(supporterSettingsFXTDefectList.get(index).getLanguage()));
    }
}
