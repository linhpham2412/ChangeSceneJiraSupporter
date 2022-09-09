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

public class ICDefectController implements Initializable {
    public Button btnICDefectDBReturn;
    public Label txtICDefectYourName;
    public List<CheckBox> cbxICDefectBuildInformationList = new ArrayList<>();
    public List<CheckBox> cbxICDefectServerNameList = new ArrayList<>();
    public List<CheckBox> cbxICDefectSDKNameList = new ArrayList<>();
    public List<CheckBox> cbxICDefectSLOTNameList = new ArrayList<>();
    public List<CheckBox> cbxICDefectInternalSLOTList = new ArrayList<>();
    public List<CheckBox> cbxICDefectURLInformationList = new ArrayList<>();
    public List<CheckBox> cbxICDefectEnvironmentList = new ArrayList<>();
    public List<CheckBox> cbxICDefectTestingTypeAndBrowserList = new ArrayList<>();
    public List<CheckBox> cbxICDefectTestingCredentialList = new ArrayList<>();
    public List<CheckBox> cbxICDefectTestingLanguageList = new ArrayList<>();
    public VBox vboxICDefectBuildInformation;
    public VBox vboxICDefectServerName;
    public VBox vboxICDefectSDKName;
    public VBox vboxICDefectSLOTName;
    public VBox vboxICDefectInternalSLOT;
    public VBox vboxICDefectURLInformation;
    public VBox vboxICDefectEnvironment;
    public VBox vboxICDefectTestingTypeAndBrowser;
    public VBox vboxICDefectTestingCredential;
    public VBox vboxICDefectTestingLanguage;
    supporterUtils supporterUtilICDefect = new supporterUtils();
    List<SettingData> supporterSettingsICDefectList = new ArrayList<>();
    SettingData setting1ICDefect = new SettingData();
    SettingData setting2ICDefect = new SettingData();
    SettingData setting3ICDefect = new SettingData();
    SettingData setting4ICDefect = new SettingData();
    SettingData setting5ICDefect = new SettingData();
    SettingData setting6ICDefect = new SettingData();
    SettingData setting7ICDefect = new SettingData();
    SettingData setting8ICDefect = new SettingData();
    SettingData setting9ICDefect = new SettingData();
    SettingData setting10ICDefect = new SettingData();

    public void handleICDefectMoveToDB(ActionEvent actionEvent) {
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
        supporterSettingsICDefectList.addAll(List.of(setting1ICDefect, setting2ICDefect, setting3ICDefect, setting4ICDefect, setting5ICDefect, setting6ICDefect, setting7ICDefect, setting8ICDefect, setting9ICDefect, setting10ICDefect));

        cbxICDefectBuildInformationList = supporterUtilICDefect.autoAdd10SelectCheckboxes(vboxICDefectBuildInformation, "Build Information", "cbxICDefectBuildInformation");
        cbxICDefectServerNameList = supporterUtilICDefect.autoAdd10SelectCheckboxes(vboxICDefectServerName, "Server Name", "cbxICDefectServerName");
        cbxICDefectSDKNameList = supporterUtilICDefect.autoAdd10SelectCheckboxes(vboxICDefectSDKName, "SDK Name", "cbxICDefectSDKName");
        cbxICDefectSLOTNameList = supporterUtilICDefect.autoAdd10SelectCheckboxes(vboxICDefectSLOTName, "SLOT Name", "cbxICDefectSLOTName");
        cbxICDefectInternalSLOTList = supporterUtilICDefect.autoAdd10SelectCheckboxes(vboxICDefectInternalSLOT, "Internal SLOT", "cbxICDefectInternalSLOT");
        cbxICDefectURLInformationList = supporterUtilICDefect.autoAdd10SelectCheckboxes(vboxICDefectURLInformation, "URL Information", "cbxICDefectURLInformation");
        cbxICDefectEnvironmentList = supporterUtilICDefect.autoAdd10SelectCheckboxes(vboxICDefectEnvironment, "Environment", "cbxICDefectEnvironment");
        cbxICDefectTestingTypeAndBrowserList = supporterUtilICDefect.autoAdd10SelectCheckboxes(vboxICDefectTestingTypeAndBrowser, "Testing Type/ Browser", "cbxICDefectTestingTypeAndBrowser");
        cbxICDefectTestingCredentialList = supporterUtilICDefect.autoAdd10SelectCheckboxes(vboxICDefectTestingCredential, "Testing Credential", "cbxICDefectTestingCredential");
        cbxICDefectTestingLanguageList = supporterUtilICDefect.autoAdd10SelectCheckboxes(vboxICDefectTestingLanguage, "Testing Language", "cbxICDefectTestingLanguage");
        supporterSettingsICDefectList = supporterUtilICDefect.importSettingsFromFile();
        txtICDefectYourName.setText(supporterUtilICDefect.getUserName());
        IntStream.range(0, 10).forEach(index -> cbxICDefectBuildInformationList.get(index).setText(supporterSettingsICDefectList.get(index).getBuildName()));
        IntStream.range(0, 10).forEach(index -> cbxICDefectServerNameList.get(index).setText(supporterSettingsICDefectList.get(index).getServerName()));
        IntStream.range(0, 10).forEach(index -> cbxICDefectSDKNameList.get(index).setText(supporterSettingsICDefectList.get(index).getSdk()));
        IntStream.range(0, 10).forEach(index -> cbxICDefectSLOTNameList.get(index).setText(supporterSettingsICDefectList.get(index).getSlotName()));
        IntStream.range(0, 10).forEach(index -> cbxICDefectInternalSLOTList.get(index).setText(supporterSettingsICDefectList.get(index).getInternalSlot()));
        IntStream.range(0, 10).forEach(index -> cbxICDefectURLInformationList.get(index).setText(supporterSettingsICDefectList.get(index).getUrl()));
        IntStream.range(0, 10).forEach(index -> cbxICDefectEnvironmentList.get(index).setText(supporterSettingsICDefectList.get(index).getEnvironment()));
        IntStream.range(0, 10).forEach(index -> cbxICDefectTestingTypeAndBrowserList.get(index).setText(supporterSettingsICDefectList.get(index).getBrowser()));
        IntStream.range(0, 10).forEach(index -> cbxICDefectTestingCredentialList.get(index).setText(supporterSettingsICDefectList.get(index).getTestUser()));
        IntStream.range(0, 10).forEach(index -> cbxICDefectTestingLanguageList.get(index).setText(supporterSettingsICDefectList.get(index).getLanguage()));
    }
}
