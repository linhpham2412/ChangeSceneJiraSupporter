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

public class FXT4EyesCommentController implements Initializable {
    public Button btnFXT4EeyesBackToDB;
    public Label txtFXT4EyesYourName;
    public CheckBox cbxFXT4EyesBuildInformationTitle;
    public CheckBox cbxFXT4EyesBuildInformation1;
    public CheckBox cbxFXT4EyesBuildInformation2;
    public CheckBox cbxFXT4EyesBuildInformation3;
    public CheckBox cbxFXT4EyesBuildInformation4;
    public CheckBox cbxFXT4EyesBuildInformation5;
    public CheckBox cbxFXT4EyesBuildInformation6;
    public CheckBox cbxFXT4EyesBuildInformation7;
    public CheckBox cbxFXT4EyesBuildInformation8;
    public CheckBox cbxFXT4EyesBuildInformation9;
    public CheckBox cbxFXT4EyesBuildInformation10;
    public List<CheckBox> cbxFXT4EyesBuildInformationList = new ArrayList<>();
    public CheckBox cbxFXT4EyesServerNameTitle;
    public CheckBox cbxFXT4EyesServerName1;
    public CheckBox cbxFXT4EyesServerName2;
    public CheckBox cbxFXT4EyesServerName3;
    public CheckBox cbxFXT4EyesServerName4;
    public CheckBox cbxFXT4EyesServerName5;
    public CheckBox cbxFXT4EyesServerName6;
    public CheckBox cbxFXT4EyesServerName7;
    public CheckBox cbxFXT4EyesServerName8;
    public CheckBox cbxFXT4EyesServerName9;
    public CheckBox cbxFXT4EyesServerName10;
    public List<CheckBox> cbxFXT4EyesServerNameList = new ArrayList<>();
    public CheckBox cbxFXT4EyesSDKNameTitle;
    public CheckBox cbxFXT4EyesSDKName1;
    public CheckBox cbxFXT4EyesSDKName2;
    public CheckBox cbxFXT4EyesSDKName3;
    public CheckBox cbxFXT4EyesSDKName4;
    public CheckBox cbxFXT4EyesSDKName5;
    public CheckBox cbxFXT4EyesSDKName6;
    public CheckBox cbxFXT4EyesSDKName7;
    public CheckBox cbxFXT4EyesSDKName8;
    public CheckBox cbxFXT4EyesSDKName9;
    public CheckBox cbxFXT4EyesSDKName10;
    public List<CheckBox> cbxFXT4EyesSDKNameList = new ArrayList<>();
    public CheckBox cbxFXT4EyesSLOTNameTitle;
    public CheckBox cbxFXT4EyesSLOTName1;
    public CheckBox cbxFXT4EyesSLOTName2;
    public CheckBox cbxFXT4EyesSLOTName3;
    public CheckBox cbxFXT4EyesSLOTName4;
    public CheckBox cbxFXT4EyesSLOTName5;
    public CheckBox cbxFXT4EyesSLOTName6;
    public CheckBox cbxFXT4EyesSLOTName7;
    public CheckBox cbxFXT4EyesSLOTName8;
    public CheckBox cbxFXT4EyesSLOTName9;
    public CheckBox cbxFXT4EyesSLOTName10;
    public List<CheckBox> cbxFXT4EyesSLOTNameList = new ArrayList<>();
    public CheckBox cbxFXT4EyesInternalSLOTTitle;
    public CheckBox cbxFXT4EyesInternalSLOT1;
    public CheckBox cbxFXT4EyesInternalSLOT2;
    public CheckBox cbxFXT4EyesInternalSLOT3;
    public CheckBox cbxFXT4EyesInternalSLOT4;
    public CheckBox cbxFXT4EyesInternalSLOT5;
    public CheckBox cbxFXT4EyesInternalSLOT6;
    public CheckBox cbxFXT4EyesInternalSLOT7;
    public CheckBox cbxFXT4EyesInternalSLOT8;
    public CheckBox cbxFXT4EyesInternalSLOT9;
    public CheckBox cbxFXT4EyesInternalSLOT10;
    public List<CheckBox> cbxFXT4EyesInternalSLOTList = new ArrayList<>();
    public CheckBox cbxFXT4EyesURLInformationTitle;
    public CheckBox cbxFXT4EyesURLInformation1;
    public CheckBox cbxFXT4EyesURLInformation2;
    public CheckBox cbxFXT4EyesURLInformation3;
    public CheckBox cbxFXT4EyesURLInformation4;
    public CheckBox cbxFXT4EyesURLInformation5;
    public CheckBox cbxFXT4EyesURLInformation6;
    public CheckBox cbxFXT4EyesURLInformation7;
    public CheckBox cbxFXT4EyesURLInformation8;
    public CheckBox cbxFXT4EyesURLInformation9;
    public CheckBox cbxFXT4EyesURLInformation10;
    public List<CheckBox> cbxFXT4EyesURLInformationList = new ArrayList<>();
    public CheckBox cbxFXT4EyesIssueTypeTitle;
    public CheckBox cbxFXT4EyesIssueType1;
    public CheckBox cbxFXT4EyesIssueType2;
    public CheckBox cbxFXT4EyesIssueType3;
    public CheckBox cbxFXT4EyesIssueType4;
    public CheckBox cbxFXT4EyesIssueType5;
    public CheckBox cbxFXT4EyesIssueType6;
    public CheckBox cbxFXT4EyesIssueType7;
    public CheckBox cbxFXT4EyesIssueType8;
    public CheckBox cbxFXT4EyesIssueType9;
    public CheckBox cbxFXT4EyesIssueType10;
    public List<CheckBox> cbxFXT4EyesIssueTypeList = new ArrayList<>();
    public CheckBox cbxFXT4EyesIssueStatusTitle;
    public CheckBox cbxFXT4EyesIssueStatus1;
    public CheckBox cbxFXT4EyesIssueStatus2;
    public CheckBox cbxFXT4EyesIssueStatus3;
    public CheckBox cbxFXT4EyesIssueStatus4;
    public CheckBox cbxFXT4EyesIssueStatus5;
    public CheckBox cbxFXT4EyesIssueStatus6;
    public CheckBox cbxFXT4EyesIssueStatus7;
    public CheckBox cbxFXT4EyesIssueStatus8;
    public CheckBox cbxFXT4EyesIssueStatus9;
    public CheckBox cbxFXT4EyesIssueStatus10;
    public List<CheckBox> cbxFXT4EyesIssueStatusList = new ArrayList<>();
    public CheckBox cbxFXT4EyesEnvironmentTitle;
    public CheckBox cbxFXT4EyesEnvironment1;
    public CheckBox cbxFXT4EyesEnvironment2;
    public CheckBox cbxFXT4EyesEnvironment3;
    public CheckBox cbxFXT4EyesEnvironment4;
    public CheckBox cbxFXT4EyesEnvironment5;
    public CheckBox cbxFXT4EyesEnvironment6;
    public CheckBox cbxFXT4EyesEnvironment7;
    public CheckBox cbxFXT4EyesEnvironment8;
    public CheckBox cbxFXT4EyesEnvironment9;
    public CheckBox cbxFXT4EyesEnvironment10;
    public List<CheckBox> cbxFXT4EyesEnvironmentList = new ArrayList<>();
    public CheckBox cbxFXT4EyesTestingTypeAndBrowserTitle;
    public CheckBox cbxFXT4EyesTestingTypeAndBrowser1;
    public CheckBox cbxFXT4EyesTestingTypeAndBrowser2;
    public CheckBox cbxFXT4EyesTestingTypeAndBrowser3;
    public CheckBox cbxFXT4EyesTestingTypeAndBrowser4;
    public CheckBox cbxFXT4EyesTestingTypeAndBrowser5;
    public CheckBox cbxFXT4EyesTestingTypeAndBrowser6;
    public CheckBox cbxFXT4EyesTestingTypeAndBrowser7;
    public CheckBox cbxFXT4EyesTestingTypeAndBrowser8;
    public CheckBox cbxFXT4EyesTestingTypeAndBrowser9;
    public CheckBox cbxFXT4EyesTestingTypeAndBrowser10;
    public List<CheckBox> cbxFXT4EyesTestingTypeAndBrowserList = new ArrayList<>();
    public CheckBox cbxFXT4EyesTestingCredentialTitle;
    public CheckBox cbxFXT4EyesTestingCredential1;
    public CheckBox cbxFXT4EyesTestingCredential2;
    public CheckBox cbxFXT4EyesTestingCredential3;
    public CheckBox cbxFXT4EyesTestingCredential4;
    public CheckBox cbxFXT4EyesTestingCredential5;
    public CheckBox cbxFXT4EyesTestingCredential6;
    public CheckBox cbxFXT4EyesTestingCredential7;
    public CheckBox cbxFXT4EyesTestingCredential8;
    public CheckBox cbxFXT4EyesTestingCredential9;
    public CheckBox cbxFXT4EyesTestingCredential10;
    public List<CheckBox> cbxFXT4EyesTestingCredentialList = new ArrayList<>();
    public CheckBox cbxFXT4EyesTestingLanguageTitle;
    public CheckBox cbxFXT4EyesTestingLanguage1;
    public CheckBox cbxFXT4EyesTestingLanguage2;
    public CheckBox cbxFXT4EyesTestingLanguage3;
    public CheckBox cbxFXT4EyesTestingLanguage4;
    public CheckBox cbxFXT4EyesTestingLanguage5;
    public CheckBox cbxFXT4EyesTestingLanguage6;
    public CheckBox cbxFXT4EyesTestingLanguage7;
    public CheckBox cbxFXT4EyesTestingLanguage8;
    public CheckBox cbxFXT4EyesTestingLanguage9;
    public CheckBox cbxFXT4EyesTestingLanguage10;
    public List<CheckBox> cbxFXT4EyesTestingLanguageList = new ArrayList<>();
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
        cbxFXT4EyesBuildInformationList.addAll(List.of(cbxFXT4EyesBuildInformation1, cbxFXT4EyesBuildInformation2, cbxFXT4EyesBuildInformation3, cbxFXT4EyesBuildInformation4, cbxFXT4EyesBuildInformation5, cbxFXT4EyesBuildInformation6, cbxFXT4EyesBuildInformation7, cbxFXT4EyesBuildInformation8, cbxFXT4EyesBuildInformation9, cbxFXT4EyesBuildInformation10));
        cbxFXT4EyesServerNameList.addAll(List.of(cbxFXT4EyesServerName1, cbxFXT4EyesServerName2, cbxFXT4EyesServerName3, cbxFXT4EyesServerName4, cbxFXT4EyesServerName5, cbxFXT4EyesServerName6, cbxFXT4EyesServerName7, cbxFXT4EyesServerName8, cbxFXT4EyesServerName9, cbxFXT4EyesServerName10));
        cbxFXT4EyesSDKNameList.addAll(List.of(cbxFXT4EyesSDKName1, cbxFXT4EyesSDKName2, cbxFXT4EyesSDKName3, cbxFXT4EyesSDKName4, cbxFXT4EyesSDKName5, cbxFXT4EyesSDKName6, cbxFXT4EyesSDKName7, cbxFXT4EyesSDKName8, cbxFXT4EyesSDKName9, cbxFXT4EyesSDKName10));
        cbxFXT4EyesSLOTNameList.addAll(List.of(cbxFXT4EyesSLOTName1, cbxFXT4EyesSLOTName2, cbxFXT4EyesSLOTName3, cbxFXT4EyesSLOTName4, cbxFXT4EyesSLOTName5, cbxFXT4EyesSLOTName6, cbxFXT4EyesSLOTName7, cbxFXT4EyesSLOTName8, cbxFXT4EyesSLOTName9, cbxFXT4EyesSLOTName10));
        cbxFXT4EyesInternalSLOTList.addAll(List.of(cbxFXT4EyesInternalSLOT1, cbxFXT4EyesInternalSLOT2, cbxFXT4EyesInternalSLOT3, cbxFXT4EyesInternalSLOT4, cbxFXT4EyesInternalSLOT5, cbxFXT4EyesInternalSLOT6, cbxFXT4EyesInternalSLOT7, cbxFXT4EyesInternalSLOT8, cbxFXT4EyesInternalSLOT9, cbxFXT4EyesInternalSLOT10));
        cbxFXT4EyesURLInformationList.addAll(List.of(cbxFXT4EyesURLInformation1, cbxFXT4EyesURLInformation2, cbxFXT4EyesURLInformation3, cbxFXT4EyesURLInformation4, cbxFXT4EyesURLInformation5, cbxFXT4EyesURLInformation6, cbxFXT4EyesURLInformation7, cbxFXT4EyesURLInformation8, cbxFXT4EyesURLInformation9, cbxFXT4EyesURLInformation10));
        cbxFXT4EyesIssueTypeList.addAll(List.of(cbxFXT4EyesIssueType1, cbxFXT4EyesIssueType2, cbxFXT4EyesIssueType3, cbxFXT4EyesIssueType4, cbxFXT4EyesIssueType5, cbxFXT4EyesIssueType6, cbxFXT4EyesIssueType7, cbxFXT4EyesIssueType8, cbxFXT4EyesIssueType9, cbxFXT4EyesIssueType10));
        cbxFXT4EyesIssueStatusList.addAll(List.of(cbxFXT4EyesIssueStatus1, cbxFXT4EyesIssueStatus2, cbxFXT4EyesIssueStatus3, cbxFXT4EyesIssueStatus4, cbxFXT4EyesIssueStatus5, cbxFXT4EyesIssueStatus6, cbxFXT4EyesIssueStatus7, cbxFXT4EyesIssueStatus8, cbxFXT4EyesIssueStatus9, cbxFXT4EyesIssueStatus10));
        cbxFXT4EyesEnvironmentList.addAll(List.of(cbxFXT4EyesEnvironment1, cbxFXT4EyesEnvironment2, cbxFXT4EyesEnvironment3, cbxFXT4EyesEnvironment4, cbxFXT4EyesEnvironment5, cbxFXT4EyesEnvironment6, cbxFXT4EyesEnvironment7, cbxFXT4EyesEnvironment8, cbxFXT4EyesEnvironment9, cbxFXT4EyesEnvironment10));
        cbxFXT4EyesTestingTypeAndBrowserList.addAll(List.of(cbxFXT4EyesTestingTypeAndBrowser1, cbxFXT4EyesTestingTypeAndBrowser2, cbxFXT4EyesTestingTypeAndBrowser3, cbxFXT4EyesTestingTypeAndBrowser4, cbxFXT4EyesTestingTypeAndBrowser5, cbxFXT4EyesTestingTypeAndBrowser6, cbxFXT4EyesTestingTypeAndBrowser7, cbxFXT4EyesTestingTypeAndBrowser8, cbxFXT4EyesTestingTypeAndBrowser9, cbxFXT4EyesTestingTypeAndBrowser10));
        cbxFXT4EyesTestingCredentialList.addAll(List.of(cbxFXT4EyesTestingCredential1, cbxFXT4EyesTestingCredential2, cbxFXT4EyesTestingCredential3, cbxFXT4EyesTestingCredential4, cbxFXT4EyesTestingCredential5, cbxFXT4EyesTestingCredential6, cbxFXT4EyesTestingCredential7, cbxFXT4EyesTestingCredential8, cbxFXT4EyesTestingCredential9, cbxFXT4EyesTestingCredential10));
        cbxFXT4EyesTestingLanguageList.addAll(List.of(cbxFXT4EyesTestingLanguage1, cbxFXT4EyesTestingLanguage2, cbxFXT4EyesTestingLanguage3, cbxFXT4EyesTestingLanguage4, cbxFXT4EyesTestingLanguage5, cbxFXT4EyesTestingLanguage6, cbxFXT4EyesTestingLanguage7, cbxFXT4EyesTestingLanguage8, cbxFXT4EyesTestingLanguage9, cbxFXT4EyesTestingLanguage10));


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

    public void handleFXT4EyesTitleChecked(ActionEvent actionEvent) {
        CheckBox actionTitleCheckbox = (CheckBox) actionEvent.getSource();
        if (actionTitleCheckbox.equals(cbxFXT4EyesBuildInformationTitle)) {
            if (cbxFXT4EyesBuildInformationTitle.isSelected()) {
                cbxFXT4EyesBuildInformationList.forEach(checkBox -> checkBox.setSelected(true));
            } else {
                cbxFXT4EyesBuildInformationList.forEach(checkBox -> checkBox.setSelected(false));
            }
        } else if (actionTitleCheckbox.equals(cbxFXT4EyesServerNameTitle)) {
            if (cbxFXT4EyesServerNameTitle.isSelected()) {
                cbxFXT4EyesServerNameList.forEach(checkBox -> checkBox.setSelected(true));
            } else {
                cbxFXT4EyesServerNameList.forEach(checkBox -> checkBox.setSelected(false));
            }
        }else if (actionTitleCheckbox.equals(cbxFXT4EyesSDKNameTitle)) {
            if (cbxFXT4EyesSDKNameTitle.isSelected()) {
                cbxFXT4EyesSDKNameList.forEach(checkBox -> checkBox.setSelected(true));
            } else {
                cbxFXT4EyesSDKNameList.forEach(checkBox -> checkBox.setSelected(false));
            }
        }else if (actionTitleCheckbox.equals(cbxFXT4EyesSLOTNameTitle)) {
            if (cbxFXT4EyesSLOTNameTitle.isSelected()) {
                cbxFXT4EyesSLOTNameList.forEach(checkBox -> checkBox.setSelected(true));
            } else {
                cbxFXT4EyesSLOTNameList.forEach(checkBox -> checkBox.setSelected(false));
            }
        }else if (actionTitleCheckbox.equals(cbxFXT4EyesInternalSLOTTitle)) {
            if (cbxFXT4EyesInternalSLOTTitle.isSelected()) {
                cbxFXT4EyesInternalSLOTList.forEach(checkBox -> checkBox.setSelected(true));
            } else {
                cbxFXT4EyesInternalSLOTList.forEach(checkBox -> checkBox.setSelected(false));
            }
        }else if (actionTitleCheckbox.equals(cbxFXT4EyesURLInformationTitle)) {
            if (cbxFXT4EyesURLInformationTitle.isSelected()) {
                cbxFXT4EyesURLInformationList.forEach(checkBox -> checkBox.setSelected(true));
            } else {
                cbxFXT4EyesURLInformationList.forEach(checkBox -> checkBox.setSelected(false));
            }
        }else if (actionTitleCheckbox.equals(cbxFXT4EyesIssueTypeTitle)) {
            if (cbxFXT4EyesIssueTypeTitle.isSelected()) {
                cbxFXT4EyesIssueTypeList.forEach(checkBox -> checkBox.setSelected(true));
            } else {
                cbxFXT4EyesIssueTypeList.forEach(checkBox -> checkBox.setSelected(false));
            }
        }else if (actionTitleCheckbox.equals(cbxFXT4EyesIssueStatusTitle)) {
            if (cbxFXT4EyesIssueStatusTitle.isSelected()) {
                cbxFXT4EyesIssueStatusList.forEach(checkBox -> checkBox.setSelected(true));
            } else {
                cbxFXT4EyesIssueStatusList.forEach(checkBox -> checkBox.setSelected(false));
            }
        }else if (actionTitleCheckbox.equals(cbxFXT4EyesEnvironmentTitle)) {
            if (cbxFXT4EyesEnvironmentTitle.isSelected()) {
                cbxFXT4EyesEnvironmentList.forEach(checkBox -> checkBox.setSelected(true));
            } else {
                cbxFXT4EyesEnvironmentList.forEach(checkBox -> checkBox.setSelected(false));
            }
        }else if (actionTitleCheckbox.equals(cbxFXT4EyesTestingTypeAndBrowserTitle)) {
            if (cbxFXT4EyesTestingTypeAndBrowserTitle.isSelected()) {
                cbxFXT4EyesTestingTypeAndBrowserList.forEach(checkBox -> checkBox.setSelected(true));
            } else {
                cbxFXT4EyesTestingTypeAndBrowserList.forEach(checkBox -> checkBox.setSelected(false));
            }
        }else if (actionTitleCheckbox.equals(cbxFXT4EyesTestingCredentialTitle)) {
            if (cbxFXT4EyesTestingCredentialTitle.isSelected()) {
                cbxFXT4EyesTestingCredentialList.forEach(checkBox -> checkBox.setSelected(true));
            } else {
                cbxFXT4EyesTestingCredentialList.forEach(checkBox -> checkBox.setSelected(false));
            }
        }else if (actionTitleCheckbox.equals(cbxFXT4EyesTestingLanguageTitle)) {
            if (cbxFXT4EyesTestingLanguageTitle.isSelected()) {
                cbxFXT4EyesTestingLanguageList.forEach(checkBox -> checkBox.setSelected(true));
            } else {
                cbxFXT4EyesTestingLanguageList.forEach(checkBox -> checkBox.setSelected(false));
            }
        }
    }
}
