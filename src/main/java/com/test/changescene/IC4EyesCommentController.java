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
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.ResourceBundle;
import java.util.stream.IntStream;

public class IC4EyesCommentController implements Initializable {
    public Button btnIC4eyesBackToDB;
    public Label txtIC4EyesYourName;
    public CheckBox cbxIC4EyesBuildInformationTitle;
    public CheckBox cbxIC4EyesBuildInformation1;
    public CheckBox cbxIC4EyesBuildInformation2;
    public CheckBox cbxIC4EyesBuildInformation3;
    public CheckBox cbxIC4EyesBuildInformation4;
    public CheckBox cbxIC4EyesBuildInformation5;
    public CheckBox cbxIC4EyesBuildInformation6;
    public CheckBox cbxIC4EyesBuildInformation7;
    public CheckBox cbxIC4EyesBuildInformation8;
    public CheckBox cbxIC4EyesBuildInformation9;
    public CheckBox cbxIC4EyesBuildInformation10;
    public List<CheckBox> cbxIC4EyesBuildInformationList = new ArrayList<>();
    public CheckBox cbxIC4EyesServerNameTitle;
    public CheckBox cbxIC4EyesServerName1;
    public CheckBox cbxIC4EyesServerName2;
    public CheckBox cbxIC4EyesServerName3;
    public CheckBox cbxIC4EyesServerName4;
    public CheckBox cbxIC4EyesServerName5;
    public CheckBox cbxIC4EyesServerName6;
    public CheckBox cbxIC4EyesServerName7;
    public CheckBox cbxIC4EyesServerName8;
    public CheckBox cbxIC4EyesServerName9;
    public CheckBox cbxIC4EyesServerName10;
    public List<CheckBox> cbxIC4EyesServerNameList = new ArrayList<>();
    public CheckBox cbxIC4EyesSDKNameTitle;
    public CheckBox cbxIC4EyesSDKName1;
    public CheckBox cbxIC4EyesSDKName2;
    public CheckBox cbxIC4EyesSDKName3;
    public CheckBox cbxIC4EyesSDKName4;
    public CheckBox cbxIC4EyesSDKName5;
    public CheckBox cbxIC4EyesSDKName6;
    public CheckBox cbxIC4EyesSDKName7;
    public CheckBox cbxIC4EyesSDKName8;
    public CheckBox cbxIC4EyesSDKName9;
    public CheckBox cbxIC4EyesSDKName10;
    public List<CheckBox> cbxIC4EyesSDKNameList = new ArrayList<>();
    public CheckBox cbxIC4EyesSLOTNameTitle;
    public CheckBox cbxIC4EyesSLOTName1;
    public CheckBox cbxIC4EyesSLOTName2;
    public CheckBox cbxIC4EyesSLOTName3;
    public CheckBox cbxIC4EyesSLOTName4;
    public CheckBox cbxIC4EyesSLOTName5;
    public CheckBox cbxIC4EyesSLOTName6;
    public CheckBox cbxIC4EyesSLOTName7;
    public CheckBox cbxIC4EyesSLOTName8;
    public CheckBox cbxIC4EyesSLOTName9;
    public CheckBox cbxIC4EyesSLOTName10;
    public List<CheckBox> cbxIC4EyesSLOTNameList = new ArrayList<>();
    public CheckBox cbxIC4EyesInternalSLOTTitle;
    public CheckBox cbxIC4EyesInternalSLOT1;
    public CheckBox cbxIC4EyesInternalSLOT2;
    public CheckBox cbxIC4EyesInternalSLOT3;
    public CheckBox cbxIC4EyesInternalSLOT4;
    public CheckBox cbxIC4EyesInternalSLOT5;
    public CheckBox cbxIC4EyesInternalSLOT6;
    public CheckBox cbxIC4EyesInternalSLOT7;
    public CheckBox cbxIC4EyesInternalSLOT8;
    public CheckBox cbxIC4EyesInternalSLOT9;
    public CheckBox cbxIC4EyesInternalSLOT10;
    public List<CheckBox> cbxIC4EyesInternalSLOTList = new ArrayList<>();
    public CheckBox cbxIC4EyesURLInformationTitle;
    public CheckBox cbxIC4EyesURLInformation1;
    public CheckBox cbxIC4EyesURLInformation2;
    public CheckBox cbxIC4EyesURLInformation3;
    public CheckBox cbxIC4EyesURLInformation4;
    public CheckBox cbxIC4EyesURLInformation5;
    public CheckBox cbxIC4EyesURLInformation6;
    public CheckBox cbxIC4EyesURLInformation7;
    public CheckBox cbxIC4EyesURLInformation8;
    public CheckBox cbxIC4EyesURLInformation9;
    public CheckBox cbxIC4EyesURLInformation10;
    public List<CheckBox> cbxIC4EyesURLInformationList = new ArrayList<>();
    public CheckBox cbxIC4EyesIssueTypeTitle;
    public CheckBox cbxIC4EyesIssueType1;
    public CheckBox cbxIC4EyesIssueType2;
    public CheckBox cbxIC4EyesIssueType3;
    public CheckBox cbxIC4EyesIssueType4;
    public CheckBox cbxIC4EyesIssueType5;
    public CheckBox cbxIC4EyesIssueType6;
    public CheckBox cbxIC4EyesIssueType7;
    public CheckBox cbxIC4EyesIssueType8;
    public CheckBox cbxIC4EyesIssueType9;
    public CheckBox cbxIC4EyesIssueType10;
    public List<CheckBox> cbxIC4EyesIssueTypeList = new ArrayList<>();
    public CheckBox cbxIC4EyesIssueStatusTitle;
    public CheckBox cbxIC4EyesIssueStatus1;
    public CheckBox cbxIC4EyesIssueStatus2;
    public CheckBox cbxIC4EyesIssueStatus3;
    public CheckBox cbxIC4EyesIssueStatus4;
    public CheckBox cbxIC4EyesIssueStatus5;
    public CheckBox cbxIC4EyesIssueStatus6;
    public CheckBox cbxIC4EyesIssueStatus7;
    public CheckBox cbxIC4EyesIssueStatus8;
    public CheckBox cbxIC4EyesIssueStatus9;
    public CheckBox cbxIC4EyesIssueStatus10;
    public List<CheckBox> cbxIC4EyesIssueStatusList = new ArrayList<>();
    public CheckBox cbxIC4EyesEnvironmentTitle;
    public CheckBox cbxIC4EyesEnvironment1;
    public CheckBox cbxIC4EyesEnvironment2;
    public CheckBox cbxIC4EyesEnvironment3;
    public CheckBox cbxIC4EyesEnvironment4;
    public CheckBox cbxIC4EyesEnvironment5;
    public CheckBox cbxIC4EyesEnvironment6;
    public CheckBox cbxIC4EyesEnvironment7;
    public CheckBox cbxIC4EyesEnvironment8;
    public CheckBox cbxIC4EyesEnvironment9;
    public CheckBox cbxIC4EyesEnvironment10;
    public List<CheckBox> cbxIC4EyesEnvironmentList = new ArrayList<>();
    public CheckBox cbxIC4EyesTestingTypeAndBrowserTitle;
    public CheckBox cbxIC4EyesTestingTypeAndBrowser1;
    public CheckBox cbxIC4EyesTestingTypeAndBrowser2;
    public CheckBox cbxIC4EyesTestingTypeAndBrowser3;
    public CheckBox cbxIC4EyesTestingTypeAndBrowser4;
    public CheckBox cbxIC4EyesTestingTypeAndBrowser5;
    public CheckBox cbxIC4EyesTestingTypeAndBrowser6;
    public CheckBox cbxIC4EyesTestingTypeAndBrowser7;
    public CheckBox cbxIC4EyesTestingTypeAndBrowser8;
    public CheckBox cbxIC4EyesTestingTypeAndBrowser9;
    public CheckBox cbxIC4EyesTestingTypeAndBrowser10;
    public List<CheckBox> cbxIC4EyesTestingTypeAndBrowserList = new ArrayList<>();
    public CheckBox cbxIC4EyesTestingCredentialTitle;
    public CheckBox cbxIC4EyesTestingCredential1;
    public CheckBox cbxIC4EyesTestingCredential2;
    public CheckBox cbxIC4EyesTestingCredential3;
    public CheckBox cbxIC4EyesTestingCredential4;
    public CheckBox cbxIC4EyesTestingCredential5;
    public CheckBox cbxIC4EyesTestingCredential6;
    public CheckBox cbxIC4EyesTestingCredential7;
    public CheckBox cbxIC4EyesTestingCredential8;
    public CheckBox cbxIC4EyesTestingCredential9;
    public CheckBox cbxIC4EyesTestingCredential10;
    public List<CheckBox> cbxIC4EyesTestingCredentialList = new ArrayList<>();
    public CheckBox cbxIC4EyesTestingLanguageTitle;
    public CheckBox cbxIC4EyesTestingLanguage1;
    public CheckBox cbxIC4EyesTestingLanguage2;
    public CheckBox cbxIC4EyesTestingLanguage3;
    public CheckBox cbxIC4EyesTestingLanguage4;
    public CheckBox cbxIC4EyesTestingLanguage5;
    public CheckBox cbxIC4EyesTestingLanguage6;
    public CheckBox cbxIC4EyesTestingLanguage7;
    public CheckBox cbxIC4EyesTestingLanguage8;
    public CheckBox cbxIC4EyesTestingLanguage9;
    public CheckBox cbxIC4EyesTestingLanguage10;
    public List<CheckBox> cbxIC4EyesTestingLanguageList = new ArrayList<>();
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
        cbxIC4EyesBuildInformationList.addAll(List.of(cbxIC4EyesBuildInformation1, cbxIC4EyesBuildInformation2, cbxIC4EyesBuildInformation3, cbxIC4EyesBuildInformation4, cbxIC4EyesBuildInformation5, cbxIC4EyesBuildInformation6, cbxIC4EyesBuildInformation7, cbxIC4EyesBuildInformation8, cbxIC4EyesBuildInformation9, cbxIC4EyesBuildInformation10));
        cbxIC4EyesServerNameList.addAll(List.of(cbxIC4EyesServerName1, cbxIC4EyesServerName2, cbxIC4EyesServerName3, cbxIC4EyesServerName4, cbxIC4EyesServerName5, cbxIC4EyesServerName6, cbxIC4EyesServerName7, cbxIC4EyesServerName8, cbxIC4EyesServerName9, cbxIC4EyesServerName10));
        cbxIC4EyesSDKNameList.addAll(List.of(cbxIC4EyesSDKName1, cbxIC4EyesSDKName2, cbxIC4EyesSDKName3, cbxIC4EyesSDKName4, cbxIC4EyesSDKName5, cbxIC4EyesSDKName6, cbxIC4EyesSDKName7, cbxIC4EyesSDKName8, cbxIC4EyesSDKName9, cbxIC4EyesSDKName10));
        cbxIC4EyesSLOTNameList.addAll(List.of(cbxIC4EyesSLOTName1, cbxIC4EyesSLOTName2, cbxIC4EyesSLOTName3, cbxIC4EyesSLOTName4, cbxIC4EyesSLOTName5, cbxIC4EyesSLOTName6, cbxIC4EyesSLOTName7, cbxIC4EyesSLOTName8, cbxIC4EyesSLOTName9, cbxIC4EyesSLOTName10));
        cbxIC4EyesInternalSLOTList.addAll(List.of(cbxIC4EyesInternalSLOT1, cbxIC4EyesInternalSLOT2, cbxIC4EyesInternalSLOT3, cbxIC4EyesInternalSLOT4, cbxIC4EyesInternalSLOT5, cbxIC4EyesInternalSLOT6, cbxIC4EyesInternalSLOT7, cbxIC4EyesInternalSLOT8, cbxIC4EyesInternalSLOT9, cbxIC4EyesInternalSLOT10));
        cbxIC4EyesURLInformationList.addAll(List.of(cbxIC4EyesURLInformation1, cbxIC4EyesURLInformation2, cbxIC4EyesURLInformation3, cbxIC4EyesURLInformation4, cbxIC4EyesURLInformation5, cbxIC4EyesURLInformation6, cbxIC4EyesURLInformation7, cbxIC4EyesURLInformation8, cbxIC4EyesURLInformation9, cbxIC4EyesURLInformation10));
        cbxIC4EyesIssueTypeList.addAll(List.of(cbxIC4EyesIssueType1, cbxIC4EyesIssueType2, cbxIC4EyesIssueType3, cbxIC4EyesIssueType4, cbxIC4EyesIssueType5, cbxIC4EyesIssueType6, cbxIC4EyesIssueType7, cbxIC4EyesIssueType8, cbxIC4EyesIssueType9, cbxIC4EyesIssueType10));
        cbxIC4EyesIssueStatusList.addAll(List.of(cbxIC4EyesIssueStatus1, cbxIC4EyesIssueStatus2, cbxIC4EyesIssueStatus3, cbxIC4EyesIssueStatus4, cbxIC4EyesIssueStatus5, cbxIC4EyesIssueStatus6, cbxIC4EyesIssueStatus7, cbxIC4EyesIssueStatus8, cbxIC4EyesIssueStatus9, cbxIC4EyesIssueStatus10));
        cbxIC4EyesEnvironmentList.addAll(List.of(cbxIC4EyesEnvironment1, cbxIC4EyesEnvironment2, cbxIC4EyesEnvironment3, cbxIC4EyesEnvironment4, cbxIC4EyesEnvironment5, cbxIC4EyesEnvironment6, cbxIC4EyesEnvironment7, cbxIC4EyesEnvironment8, cbxIC4EyesEnvironment9, cbxIC4EyesEnvironment10));
        cbxIC4EyesTestingTypeAndBrowserList.addAll(List.of(cbxIC4EyesTestingTypeAndBrowser1, cbxIC4EyesTestingTypeAndBrowser2, cbxIC4EyesTestingTypeAndBrowser3, cbxIC4EyesTestingTypeAndBrowser4, cbxIC4EyesTestingTypeAndBrowser5, cbxIC4EyesTestingTypeAndBrowser6, cbxIC4EyesTestingTypeAndBrowser7, cbxIC4EyesTestingTypeAndBrowser8, cbxIC4EyesTestingTypeAndBrowser9, cbxIC4EyesTestingTypeAndBrowser10));
        cbxIC4EyesTestingCredentialList.addAll(List.of(cbxIC4EyesTestingCredential1, cbxIC4EyesTestingCredential2, cbxIC4EyesTestingCredential3, cbxIC4EyesTestingCredential4, cbxIC4EyesTestingCredential5, cbxIC4EyesTestingCredential6, cbxIC4EyesTestingCredential7, cbxIC4EyesTestingCredential8, cbxIC4EyesTestingCredential9, cbxIC4EyesTestingCredential10));
        cbxIC4EyesTestingLanguageList.addAll(List.of(cbxIC4EyesTestingLanguage1, cbxIC4EyesTestingLanguage2, cbxIC4EyesTestingLanguage3, cbxIC4EyesTestingLanguage4, cbxIC4EyesTestingLanguage5, cbxIC4EyesTestingLanguage6, cbxIC4EyesTestingLanguage7, cbxIC4EyesTestingLanguage8, cbxIC4EyesTestingLanguage9, cbxIC4EyesTestingLanguage10));


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

    public void handleIC4EyesTitleChecked(ActionEvent actionEvent) {
        CheckBox actionTitleCheckbox = (CheckBox) actionEvent.getSource();
        if (actionTitleCheckbox.equals(cbxIC4EyesBuildInformationTitle)) {
            if (cbxIC4EyesBuildInformationTitle.isSelected()) {
                cbxIC4EyesBuildInformationList.forEach(checkBox -> checkBox.setSelected(true));
            } else {
                cbxIC4EyesBuildInformationList.forEach(checkBox -> checkBox.setSelected(false));
            }
        } else if (actionTitleCheckbox.equals(cbxIC4EyesServerNameTitle)) {
            if (cbxIC4EyesServerNameTitle.isSelected()) {
                cbxIC4EyesServerNameList.forEach(checkBox -> checkBox.setSelected(true));
            } else {
                cbxIC4EyesServerNameList.forEach(checkBox -> checkBox.setSelected(false));
            }
        }else if (actionTitleCheckbox.equals(cbxIC4EyesSDKNameTitle)) {
            if (cbxIC4EyesSDKNameTitle.isSelected()) {
                cbxIC4EyesSDKNameList.forEach(checkBox -> checkBox.setSelected(true));
            } else {
                cbxIC4EyesSDKNameList.forEach(checkBox -> checkBox.setSelected(false));
            }
        }else if (actionTitleCheckbox.equals(cbxIC4EyesSLOTNameTitle)) {
            if (cbxIC4EyesSLOTNameTitle.isSelected()) {
                cbxIC4EyesSLOTNameList.forEach(checkBox -> checkBox.setSelected(true));
            } else {
                cbxIC4EyesSLOTNameList.forEach(checkBox -> checkBox.setSelected(false));
            }
        }else if (actionTitleCheckbox.equals(cbxIC4EyesInternalSLOTTitle)) {
            if (cbxIC4EyesInternalSLOTTitle.isSelected()) {
                cbxIC4EyesInternalSLOTList.forEach(checkBox -> checkBox.setSelected(true));
            } else {
                cbxIC4EyesInternalSLOTList.forEach(checkBox -> checkBox.setSelected(false));
            }
        }else if (actionTitleCheckbox.equals(cbxIC4EyesURLInformationTitle)) {
            if (cbxIC4EyesURLInformationTitle.isSelected()) {
                cbxIC4EyesURLInformationList.forEach(checkBox -> checkBox.setSelected(true));
            } else {
                cbxIC4EyesURLInformationList.forEach(checkBox -> checkBox.setSelected(false));
            }
        }else if (actionTitleCheckbox.equals(cbxIC4EyesIssueTypeTitle)) {
            if (cbxIC4EyesIssueTypeTitle.isSelected()) {
                cbxIC4EyesIssueTypeList.forEach(checkBox -> checkBox.setSelected(true));
            } else {
                cbxIC4EyesIssueTypeList.forEach(checkBox -> checkBox.setSelected(false));
            }
        }else if (actionTitleCheckbox.equals(cbxIC4EyesIssueStatusTitle)) {
            if (cbxIC4EyesIssueStatusTitle.isSelected()) {
                cbxIC4EyesIssueStatusList.forEach(checkBox -> checkBox.setSelected(true));
            } else {
                cbxIC4EyesIssueStatusList.forEach(checkBox -> checkBox.setSelected(false));
            }
        }else if (actionTitleCheckbox.equals(cbxIC4EyesEnvironmentTitle)) {
            if (cbxIC4EyesEnvironmentTitle.isSelected()) {
                cbxIC4EyesEnvironmentList.forEach(checkBox -> checkBox.setSelected(true));
            } else {
                cbxIC4EyesEnvironmentList.forEach(checkBox -> checkBox.setSelected(false));
            }
        }else if (actionTitleCheckbox.equals(cbxIC4EyesTestingTypeAndBrowserTitle)) {
            if (cbxIC4EyesTestingTypeAndBrowserTitle.isSelected()) {
                cbxIC4EyesTestingTypeAndBrowserList.forEach(checkBox -> checkBox.setSelected(true));
            } else {
                cbxIC4EyesTestingTypeAndBrowserList.forEach(checkBox -> checkBox.setSelected(false));
            }
        }else if (actionTitleCheckbox.equals(cbxIC4EyesTestingCredentialTitle)) {
            if (cbxIC4EyesTestingCredentialTitle.isSelected()) {
                cbxIC4EyesTestingCredentialList.forEach(checkBox -> checkBox.setSelected(true));
            } else {
                cbxIC4EyesTestingCredentialList.forEach(checkBox -> checkBox.setSelected(false));
            }
        }else if (actionTitleCheckbox.equals(cbxIC4EyesTestingLanguageTitle)) {
            if (cbxIC4EyesTestingLanguageTitle.isSelected()) {
                cbxIC4EyesTestingLanguageList.forEach(checkBox -> checkBox.setSelected(true));
            } else {
                cbxIC4EyesTestingLanguageList.forEach(checkBox -> checkBox.setSelected(false));
            }
        }
    }
}
