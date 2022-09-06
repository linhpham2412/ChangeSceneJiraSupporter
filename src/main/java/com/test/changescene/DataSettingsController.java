package com.test.changescene;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.ResourceBundle;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DataSettingsController implements Initializable {
    public TextField txtUserName;
    public DatePicker datepickDateReleased;
    public TextField txtSettingBuildName1;
    public TextField txtSettingBuildName2;
    public TextField txtSettingBuildName3;
    public TextField txtSettingBuildName4;
    public TextField txtSettingBuildName5;
    public TextField txtSettingBuildName6;
    public TextField txtSettingBuildName7;
    public TextField txtSettingBuildName8;
    public TextField txtSettingBuildName9;
    public TextField txtSettingBuildName10;
    List<TextField> settingBuildNameTextFields = new ArrayList<>();
    public TextField txtSettingServerName1;
    public TextField txtSettingServerName2;
    public TextField txtSettingServerName3;
    public TextField txtSettingServerName4;
    public TextField txtSettingServerName5;
    public TextField txtSettingServerName6;
    public TextField txtSettingServerName7;
    public TextField txtSettingServerName8;
    public TextField txtSettingServerName9;
    public TextField txtSettingServerName10;
    List<TextField> settingServerNameTextFields = new ArrayList<>();
    public TextField txtSettingSDK1;
    public TextField txtSettingSDK2;
    public TextField txtSettingSDK3;
    public TextField txtSettingSDK4;
    public TextField txtSettingSDK5;
    public TextField txtSettingSDK6;
    public TextField txtSettingSDK7;
    public TextField txtSettingSDK8;
    public TextField txtSettingSDK9;
    public TextField txtSettingSDK10;
    List<TextField> settingSDKTextFields = new ArrayList<>();
    public TextField txtSettingSLOT1;
    public TextField txtSettingSLOT2;
    public TextField txtSettingSLOT3;
    public TextField txtSettingSLOT4;
    public TextField txtSettingSLOT5;
    public TextField txtSettingSLOT6;
    public TextField txtSettingSLOT7;
    public TextField txtSettingSLOT8;
    public TextField txtSettingSLOT9;
    public TextField txtSettingSLOT10;
    List<TextField> settingSLOTTextFields = new ArrayList<>();
    public TextField txtSettingInternalSLOT1;
    public TextField txtSettingInternalSLOT2;
    public TextField txtSettingInternalSLOT3;
    public TextField txtSettingInternalSLOT4;
    public TextField txtSettingInternalSLOT5;
    public TextField txtSettingInternalSLOT6;
    public TextField txtSettingInternalSLOT7;
    public TextField txtSettingInternalSLOT8;
    public TextField txtSettingInternalSLOT9;
    public TextField txtSettingInternalSLOT10;
    List<TextField> settingInternalSLOTTextFields = new ArrayList<>();
    public TextField txtSettingURL1;
    public TextField txtSettingURL2;
    public TextField txtSettingURL3;
    public TextField txtSettingURL4;
    public TextField txtSettingURL5;
    public TextField txtSettingURL6;
    public TextField txtSettingURL7;
    public TextField txtSettingURL8;
    public TextField txtSettingURL9;
    public TextField txtSettingURL10;
    List<TextField> settingURLTextFields = new ArrayList<>();
    public TextField txtSettingItemStatus1;
    public TextField txtSettingItemStatus2;
    public TextField txtSettingItemStatus3;
    public TextField txtSettingItemStatus4;
    public TextField txtSettingItemStatus5;
    public TextField txtSettingItemStatus6;
    public TextField txtSettingItemStatus7;
    public TextField txtSettingItemStatus8;
    public TextField txtSettingItemStatus9;
    public TextField txtSettingItemStatus10;
    List<TextField> settingItemStatusTextFields = new ArrayList<>();
    public TextField txtSettingTestingEnvironment1;
    public TextField txtSettingTestingEnvironment2;
    public TextField txtSettingTestingEnvironment3;
    public TextField txtSettingTestingEnvironment4;
    public TextField txtSettingTestingEnvironment5;
    public TextField txtSettingTestingEnvironment6;
    public TextField txtSettingTestingEnvironment7;
    public TextField txtSettingTestingEnvironment8;
    public TextField txtSettingTestingEnvironment9;
    public TextField txtSettingTestingEnvironment10;
    List<TextField> settingTestingEnvironmentTextFields = new ArrayList<>();
    public TextField txtSettingIssueType1;
    public TextField txtSettingIssueType2;
    public TextField txtSettingIssueType3;
    public TextField txtSettingIssueType4;
    public TextField txtSettingIssueType5;
    public TextField txtSettingIssueType6;
    public TextField txtSettingIssueType7;
    public TextField txtSettingIssueType8;
    public TextField txtSettingIssueType9;
    public TextField txtSettingIssueType10;
    List<TextField> settingIssueTypeTextFields = new ArrayList<>();
    public TextField txtSettingTestingCredential1;
    public TextField txtSettingTestingCredential2;
    public TextField txtSettingTestingCredential3;
    public TextField txtSettingTestingCredential4;
    public TextField txtSettingTestingCredential5;
    public TextField txtSettingTestingCredential6;
    public TextField txtSettingTestingCredential7;
    public TextField txtSettingTestingCredential8;
    public TextField txtSettingTestingCredential9;
    public TextField txtSettingTestingCredential10;
    List<TextField> settingTestingCredentialTextFields = new ArrayList<>();
    public TextField txtSettingTestingLanguage1;
    public TextField txtSettingTestingLanguage2;
    public TextField txtSettingTestingLanguage3;
    public TextField txtSettingTestingLanguage4;
    public TextField txtSettingTestingLanguage5;
    public TextField txtSettingTestingLanguage6;
    public TextField txtSettingTestingLanguage7;
    public TextField txtSettingTestingLanguage8;
    public TextField txtSettingTestingLanguage9;
    public TextField txtSettingTestingLanguage10;
    List<TextField> settingTestingLanguageTextFields = new ArrayList<>();
    public TextField txtSettingTestingTypeAndBrowser1;
    public TextField txtSettingTestingTypeAndBrowser2;
    public TextField txtSettingTestingTypeAndBrowser3;
    public TextField txtSettingTestingTypeAndBrowser4;
    public TextField txtSettingTestingTypeAndBrowser5;
    public TextField txtSettingTestingTypeAndBrowser6;
    public TextField txtSettingTestingTypeAndBrowser7;
    public TextField txtSettingTestingTypeAndBrowser8;
    public TextField txtSettingTestingTypeAndBrowser9;
    public TextField txtSettingTestingTypeAndBrowser10;
    List<TextField> settingTestingTypeAndBrowserTextFields = new ArrayList<>();
    @FXML
    private Button btnDataSettingsToDashBoard;
    private String currentPath;
    List<SettingData> supporterSetting = new ArrayList<SettingData>();
    SettingData setting1 = new SettingData();
    SettingData setting2 = new SettingData();
    SettingData setting3 = new SettingData();
    SettingData setting4 = new SettingData();
    SettingData setting5 = new SettingData();
    SettingData setting6 = new SettingData();
    SettingData setting7 = new SettingData();
    SettingData setting8 = new SettingData();
    SettingData setting9 = new SettingData();
    SettingData setting10 = new SettingData();

    {
        try {
            currentPath = new java.io.File(".").getCanonicalPath();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        supporterSetting.add(setting1);
        supporterSetting.add(setting2);
        supporterSetting.add(setting3);
        supporterSetting.add(setting4);
        supporterSetting.add(setting5);
        supporterSetting.add(setting6);
        supporterSetting.add(setting7);
        supporterSetting.add(setting8);
        supporterSetting.add(setting9);
        supporterSetting.add(setting10);
        setting1.setSettingFileName("supporterSettings.csv");
        settingBuildNameTextFields.addAll(List.of(txtSettingBuildName1,txtSettingBuildName2,txtSettingBuildName3,txtSettingBuildName4,txtSettingBuildName5,txtSettingBuildName6,txtSettingBuildName7,txtSettingBuildName8,txtSettingBuildName9,txtSettingBuildName10));
        settingServerNameTextFields.addAll(List.of(txtSettingServerName1,txtSettingServerName2,txtSettingServerName3,txtSettingServerName4,txtSettingServerName5,txtSettingServerName6,txtSettingServerName7,txtSettingServerName8,txtSettingServerName9,txtSettingServerName10));
        settingSDKTextFields.addAll(List.of(txtSettingSDK1,txtSettingSDK2,txtSettingSDK3,txtSettingSDK4,txtSettingSDK5,txtSettingSDK6,txtSettingSDK7,txtSettingSDK8,txtSettingSDK9,txtSettingSDK10));
        settingSLOTTextFields.addAll(List.of(txtSettingSLOT1,txtSettingSLOT2,txtSettingSLOT3,txtSettingSLOT4,txtSettingSLOT5,txtSettingSLOT6,txtSettingSLOT7,txtSettingSLOT8,txtSettingSLOT9,txtSettingSLOT10));
        settingInternalSLOTTextFields.addAll(List.of(txtSettingInternalSLOT1,txtSettingInternalSLOT2,txtSettingInternalSLOT3,txtSettingInternalSLOT4,txtSettingInternalSLOT5,txtSettingInternalSLOT6,txtSettingInternalSLOT7,txtSettingInternalSLOT8,txtSettingInternalSLOT9,txtSettingInternalSLOT10));
        settingURLTextFields.addAll(List.of(txtSettingURL1,txtSettingURL2,txtSettingURL3,txtSettingURL4,txtSettingURL5,txtSettingURL6,txtSettingURL7,txtSettingURL8,txtSettingURL9,txtSettingURL10));
        settingItemStatusTextFields.addAll(List.of(txtSettingItemStatus1,txtSettingItemStatus2,txtSettingItemStatus3,txtSettingItemStatus4,txtSettingItemStatus5,txtSettingItemStatus6,txtSettingItemStatus7,txtSettingItemStatus8,txtSettingItemStatus9,txtSettingItemStatus10));
        settingTestingEnvironmentTextFields.addAll(List.of(txtSettingTestingEnvironment1,txtSettingTestingEnvironment2,txtSettingTestingEnvironment3,txtSettingTestingEnvironment4,txtSettingTestingEnvironment5,txtSettingTestingEnvironment6,txtSettingTestingEnvironment7,txtSettingTestingEnvironment8,txtSettingTestingEnvironment9,txtSettingTestingEnvironment10));
        settingIssueTypeTextFields.addAll(List.of(txtSettingIssueType1,txtSettingIssueType2,txtSettingIssueType3,txtSettingIssueType4,txtSettingIssueType5,txtSettingIssueType6,txtSettingIssueType7,txtSettingIssueType8,txtSettingIssueType9,txtSettingIssueType10));
        settingTestingCredentialTextFields.addAll(List.of(txtSettingTestingCredential1,txtSettingTestingCredential2,txtSettingTestingCredential3,txtSettingTestingCredential4,txtSettingTestingCredential5,txtSettingTestingCredential6,txtSettingTestingCredential7,txtSettingTestingCredential8,txtSettingTestingCredential9,txtSettingTestingCredential10));
        settingTestingLanguageTextFields.addAll(List.of(txtSettingTestingLanguage1,txtSettingTestingLanguage2,txtSettingTestingLanguage3,txtSettingTestingLanguage4,txtSettingTestingLanguage5,txtSettingTestingLanguage6,txtSettingTestingLanguage7,txtSettingTestingLanguage8,txtSettingTestingLanguage9,txtSettingTestingLanguage10));
        settingTestingTypeAndBrowserTextFields.addAll(List.of(txtSettingTestingTypeAndBrowser1,txtSettingTestingTypeAndBrowser2,txtSettingTestingTypeAndBrowser3,txtSettingTestingTypeAndBrowser4,txtSettingTestingTypeAndBrowser5,txtSettingTestingTypeAndBrowser6,txtSettingTestingTypeAndBrowser7,txtSettingTestingTypeAndBrowser8,txtSettingTestingTypeAndBrowser9,txtSettingTestingTypeAndBrowser10));
        importSettingsFromFile();
    }

    //back to dashboard button
    public void dataSettingsBackToDashBoard(ActionEvent event){
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("dashboard.fxml")));

            Scene dashboard = new Scene(root);
            //This line gets the Stage Information
            //here we get the stage from event action and setting the root element in the scene and display scene with stage object (window) which is retrieved from action event
            Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(dashboard);
            window.show();
        } catch (IOException ex) {
//            System.Logger.getLogger(DataSettingsController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    void importSettingsFromFile() {
        try (FileReader fr = new FileReader(currentPath + "/" + supporterSetting.get(0).getSettingFileName(), StandardCharsets.UTF_8); BufferedReader reader = new BufferedReader(fr)) {
            String importedLine;
            int columnIndex = 0;
            int rowIndex = 0;
            int previousDelimiterIndex = 0;
            //Read each line and store each value in each row to setting data based on the column number of the value in the line. At the end store both near last and the last value.
            while ((importedLine = reader.readLine()) != null) {
                if (!importedLine.substring(0, importedLine.indexOf(",")).equals("BuildName")) {
                    for (int i = -1; (i = importedLine.indexOf(",", i + 1)) != -1; i++) {
                        switch (columnIndex) {
                            case 0 -> {
                                supporterSetting.get(rowIndex).setBuildName(importedLine.substring(0, i).trim());
                                previousDelimiterIndex = i + 1;
                                columnIndex += 1;
                            }
                            case 1 -> {
                                supporterSetting.get(rowIndex).setServerName(importedLine.substring(previousDelimiterIndex, i).trim());
                                previousDelimiterIndex = i + 1;
                                columnIndex += 1;
                            }
                            case 2 -> {
                                supporterSetting.get(rowIndex).setSdk(importedLine.substring(previousDelimiterIndex, i).trim());
                                previousDelimiterIndex = i + 1;
                                columnIndex += 1;
                            }
                            case 3 -> {
                                supporterSetting.get(rowIndex).setSlotName(importedLine.substring(previousDelimiterIndex, i).trim());
                                previousDelimiterIndex = i + 1;
                                columnIndex += 1;
                            }
                            case 4 -> {
                                supporterSetting.get(rowIndex).setInternalSlot(importedLine.substring(previousDelimiterIndex, i).trim());
                                previousDelimiterIndex = i + 1;
                                columnIndex += 1;
                            }
                            case 5 -> {
                                supporterSetting.get(rowIndex).setUrl(importedLine.substring(previousDelimiterIndex, i).trim());
                                previousDelimiterIndex = i + 1;
                                columnIndex += 1;
                            }
                            case 6 -> {
                                supporterSetting.get(rowIndex).setStatus(importedLine.substring(previousDelimiterIndex, i).trim());
                                previousDelimiterIndex = i + 1;
                                columnIndex += 1;
                            }
                            case 7 -> {
                                supporterSetting.get(rowIndex).setEnvironment(importedLine.substring(previousDelimiterIndex, i).trim());
                                previousDelimiterIndex = i + 1;
                                columnIndex += 1;
                            }
                            case 8 -> {
                                supporterSetting.get(rowIndex).setIssueType(importedLine.substring(previousDelimiterIndex, i).trim());
                                previousDelimiterIndex = i + 1;
                                columnIndex += 1;
                            }
                            case 9 -> {
                                supporterSetting.get(rowIndex).setTestUser(importedLine.substring(previousDelimiterIndex, i).trim());
                                previousDelimiterIndex = i + 1;
                                columnIndex += 1;
                            }
                            case 10 -> {
                                supporterSetting.get(rowIndex).setLanguage(importedLine.substring(previousDelimiterIndex, i).trim());
                                previousDelimiterIndex = i + 1;
                                columnIndex += 1;
                            }
                            case 11 -> {
                                supporterSetting.get(rowIndex).setBrowser(importedLine.substring(previousDelimiterIndex, i).trim());
                                supporterSetting.get(rowIndex).setUserName(importedLine.substring(i + 1));
                                //end of line
                                previousDelimiterIndex = 0;
                                columnIndex = 0;
                                //moving to next row in import file
                                rowIndex += 1;
                            }
                        }
                    }
                }
            }
        } catch (IOException e) {
            //Create new blank file if file not exist
            StringBuilder sb = new StringBuilder();
            sb.append("BuildName,ServerName,SDK,SLOTName,InternalSLOT,URL,Status,Environment,IssueType,user,Language,Browser,UserName").append("\n");
            sb.append(" , , , , , , , , , , , , ").append("\n");
            sb.append(" , , , , , , , , , , , , ").append("\n");
            sb.append(" , , , , , , , , , , , , ").append("\n");
            sb.append(" , , , , , , , , , , , , ").append("\n");
            sb.append(" , , , , , , , , , , , , ").append("\n");
            sb.append(" , , , , , , , , , , , , ").append("\n");
            sb.append(" , , , , , , , , , , , , ").append("\n");
            sb.append(" , , , , , , , , , , , , ").append("\n");
            sb.append(" , , , , , , , , , , , , ").append("\n");
            sb.append(" , , , , , , , , , , , , ").append("\n");
            try (var fw = new FileWriter(currentPath + "/" + supporterSetting.get(0).getSettingFileName(), StandardCharsets.UTF_8)) {
                fw.write(String.valueOf(sb));
            } catch (IOException ignored) {
            }
        }
        initializeSettingData();
//        importSuccessAlert.showAndWait();
    }

    private void initializeSettingData() {
        txtUserName.setText(supporterSetting.get(0).getUserName());
        datepickDateReleased.setValue(LocalDate.now());
        supporterSetting.get(0).setReleaseDate(String.valueOf(datepickDateReleased.getValue()));
        IntStream.range(0,10).forEach(index -> settingBuildNameTextFields.get(index).setText(supporterSetting.get(index).getBuildName()));
        IntStream.range(0,10).forEach(index -> settingServerNameTextFields.get(index).setText(supporterSetting.get(index).getServerName()));
        IntStream.range(0,10).forEach(index -> settingSDKTextFields.get(index).setText(supporterSetting.get(index).getSdk()));
        IntStream.range(0,10).forEach(index -> settingSLOTTextFields.get(index).setText(supporterSetting.get(index).getSlotName()));
        IntStream.range(0,10).forEach(index -> settingInternalSLOTTextFields.get(index).setText(supporterSetting.get(index).getInternalSlot()));
        IntStream.range(0,10).forEach(index -> settingURLTextFields.get(index).setText(supporterSetting.get(index).getUrl()));
        IntStream.range(0,10).forEach(index -> settingItemStatusTextFields.get(index).setText(supporterSetting.get(index).getStatus()));
        IntStream.range(0,10).forEach(index -> settingTestingEnvironmentTextFields.get(index).setText(supporterSetting.get(index).getEnvironment()));
        IntStream.range(0,10).forEach(index -> settingIssueTypeTextFields.get(index).setText(supporterSetting.get(index).getIssueType()));
        IntStream.range(0,10).forEach(index -> settingTestingCredentialTextFields.get(index).setText(supporterSetting.get(index).getTestUser()));
        IntStream.range(0,10).forEach(index -> settingTestingLanguageTextFields.get(index).setText(supporterSetting.get(index).getLanguage()));
        IntStream.range(0,10).forEach(index -> settingTestingTypeAndBrowserTextFields.get(index).setText(supporterSetting.get(index).getBrowser()));
    }

    @FXML
    void exportSettingsToFile() throws IOException {
        //check for empty value and replace with blank in order to avoid exception while import with empty value
        try {
            for (SettingData sd : supporterSetting) {
                if (sd.getBuildName().isEmpty()) sd.setBuildName(" ");
                if (sd.getServerName().isEmpty()) sd.setServerName(" ");
                if (sd.getSdk().isEmpty()) sd.setSdk(" ");
                if (sd.getSlotName().isEmpty()) sd.setSlotName(" ");
                if (sd.getInternalSlot().isEmpty()) sd.setInternalSlot(" ");
                if (sd.getUrl().isEmpty()) sd.setUrl(" ");
                if (sd.getEnvironment().isEmpty()) sd.setEnvironment(" ");
                if (sd.getTestUser().isEmpty()) sd.setTestUser(" ");
                if (sd.getLanguage().isEmpty()) sd.setLanguage(" ");
                if (sd.getBrowser().isEmpty()) sd.setBrowser(" ");
                if (sd.getStatus().isEmpty()) sd.setStatus(" ");
                if (sd.getIssueType().isEmpty()) sd.setIssueType(" ");
                if (sd.getUserName().equals(" ")) sd.setUserName(" ");
            }
        } catch (Exception e) {
            for (SettingData sd : supporterSetting) {
                sd.setBuildName(" ");
                sd.setServerName(" ");
                sd.setSdk(" ");
                sd.setSlotName(" ");
                sd.setInternalSlot(" ");
                sd.setUrl(" ");
                sd.setEnvironment(" ");
                sd.setTestUser(" ");
                sd.setLanguage(" ");
                sd.setBrowser(" ");
                sd.setStatus(" ");
                sd.setIssueType(" ");
                sd.setUserName(" ");
            }
        }
        String exportContent = supporterSetting.stream().map(sd -> sd.getBuildName() + "," + sd.getServerName() + "," + sd.getSdk() + "," + sd.getSlotName() + "," + sd.getInternalSlot() + "," + sd.getUrl() + "," + sd.getStatus() + "," + sd.getEnvironment() + "," + sd.getIssueType() + "," + sd.getTestUser() + "," + sd.getLanguage() + "," + sd.getBrowser() + "," + sd.getUserName() + "\n").collect(Collectors.joining("", "BuildName,ServerName,SDK,SLOTName,InternalSLOT,URL,Status,Environment,IssueType,user,Language,Browser,UserName" + "\n", ""));
        try (var fw = new FileWriter(currentPath + "/" + supporterSetting.get(0).getSettingFileName(), StandardCharsets.UTF_8)) {
            fw.write(exportContent);
//            exportSuccessAlert.showAndWait();
        } catch (IOException e) {
        }
    }

    public void onSettingTextBoxValueChange(KeyEvent keyEvent) {
        TextField actionSettingTextField = (TextField) keyEvent.getSource();
        String actionSettingTextFieldId = actionSettingTextField.getId();
        String actionSettingTextFieldValue = actionSettingTextField.getText();
        IntStream.range(0,10).forEach(index -> {
            if (settingBuildNameTextFields.get(index).getId().equals(actionSettingTextFieldId)) supporterSetting.get(index).setBuildName(actionSettingTextFieldValue);
        });
        IntStream.range(0,10).forEach(index -> {
            if (settingServerNameTextFields.get(index).getId().equals(actionSettingTextFieldId)) supporterSetting.get(index).setServerName(actionSettingTextFieldValue);
        });
        IntStream.range(0,10).forEach(index -> {
            if (settingSDKTextFields.get(index).getId().equals(actionSettingTextFieldId)) supporterSetting.get(index).setSdk(actionSettingTextFieldValue);
        });
        IntStream.range(0,10).forEach(index -> {
            if (settingSLOTTextFields.get(index).getId().equals(actionSettingTextFieldId)) supporterSetting.get(index).setSlotName(actionSettingTextFieldValue);
        });
        IntStream.range(0,10).forEach(index -> {
            if (settingInternalSLOTTextFields.get(index).getId().equals(actionSettingTextFieldId)) supporterSetting.get(index).setInternalSlot(actionSettingTextFieldValue);
        });
        IntStream.range(0,10).forEach(index -> {
            if (settingURLTextFields.get(index).getId().equals(actionSettingTextFieldId)) supporterSetting.get(index).setUrl(actionSettingTextFieldValue);
        });
        IntStream.range(0,10).forEach(index -> {
            if (settingItemStatusTextFields.get(index).getId().equals(actionSettingTextFieldId)) supporterSetting.get(index).setStatus(actionSettingTextFieldValue);
        });
        IntStream.range(0,10).forEach(index -> {
            if (settingTestingEnvironmentTextFields.get(index).getId().equals(actionSettingTextFieldId)) supporterSetting.get(index).setEnvironment(actionSettingTextFieldValue);
        });
        IntStream.range(0,10).forEach(index -> {
            if (settingIssueTypeTextFields.get(index).getId().equals(actionSettingTextFieldId)) supporterSetting.get(index).setIssueType(actionSettingTextFieldValue);
        });
        IntStream.range(0,10).forEach(index -> {
            if (settingTestingCredentialTextFields.get(index).getId().equals(actionSettingTextFieldId)) supporterSetting.get(index).setTestUser(actionSettingTextFieldValue);
        });
        IntStream.range(0,10).forEach(index -> {
            if (settingTestingLanguageTextFields.get(index).getId().equals(actionSettingTextFieldId)) supporterSetting.get(index).setLanguage(actionSettingTextFieldValue);
        });
        IntStream.range(0,10).forEach(index -> {
            if (settingTestingTypeAndBrowserTextFields.get(index).getId().equals(actionSettingTextFieldId)) supporterSetting.get(index).setBrowser(actionSettingTextFieldValue);
        });
    }
}
