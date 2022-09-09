package com.test.changescene;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.geometry.NodeOrientation;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class supporterUtils {
    SettingData setting1Local = new SettingData();
    SettingData setting2Local = new SettingData();
    SettingData setting3Local = new SettingData();
    SettingData setting4Local = new SettingData();
    SettingData setting5Local = new SettingData();
    SettingData setting6Local = new SettingData();
    SettingData setting7Local = new SettingData();
    SettingData setting8Local = new SettingData();
    SettingData setting9Local = new SettingData();
    SettingData setting10Local = new SettingData();
    List<SettingData> listOfSettingToGetDataFromImport = new ArrayList<>(List.of(setting1Local, setting2Local, setting3Local, setting4Local, setting5Local, setting6Local, setting7Local, setting8Local, setting9Local, setting10Local));
    private String currentPath;
    {
        try {
            currentPath = new java.io.File(".").getCanonicalPath();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private String settingFileName = "supporterSettings.csv";

    public List<SettingData> importSettingsFromFile() {
        try (FileReader fr = new FileReader(currentPath + "/" + settingFileName, StandardCharsets.UTF_8); BufferedReader reader = new BufferedReader(fr)) {
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
                                listOfSettingToGetDataFromImport.get(rowIndex).setBuildName(importedLine.substring(0, i).trim());
                                previousDelimiterIndex = i + 1;
                                columnIndex += 1;
                            }
                            case 1 -> {
                                listOfSettingToGetDataFromImport.get(rowIndex).setServerName(importedLine.substring(previousDelimiterIndex, i).trim());
                                previousDelimiterIndex = i + 1;
                                columnIndex += 1;
                            }
                            case 2 -> {
                                listOfSettingToGetDataFromImport.get(rowIndex).setSdk(importedLine.substring(previousDelimiterIndex, i).trim());
                                previousDelimiterIndex = i + 1;
                                columnIndex += 1;
                            }
                            case 3 -> {
                                listOfSettingToGetDataFromImport.get(rowIndex).setSlotName(importedLine.substring(previousDelimiterIndex, i).trim());
                                previousDelimiterIndex = i + 1;
                                columnIndex += 1;
                            }
                            case 4 -> {
                                listOfSettingToGetDataFromImport.get(rowIndex).setInternalSlot(importedLine.substring(previousDelimiterIndex, i).trim());
                                previousDelimiterIndex = i + 1;
                                columnIndex += 1;
                            }
                            case 5 -> {
                                listOfSettingToGetDataFromImport.get(rowIndex).setUrl(importedLine.substring(previousDelimiterIndex, i).trim());
                                previousDelimiterIndex = i + 1;
                                columnIndex += 1;
                            }
                            case 6 -> {
                                listOfSettingToGetDataFromImport.get(rowIndex).setStatus(importedLine.substring(previousDelimiterIndex, i).trim());
                                previousDelimiterIndex = i + 1;
                                columnIndex += 1;
                            }
                            case 7 -> {
                                listOfSettingToGetDataFromImport.get(rowIndex).setEnvironment(importedLine.substring(previousDelimiterIndex, i).trim());
                                previousDelimiterIndex = i + 1;
                                columnIndex += 1;
                            }
                            case 8 -> {
                                listOfSettingToGetDataFromImport.get(rowIndex).setIssueType(importedLine.substring(previousDelimiterIndex, i).trim());
                                previousDelimiterIndex = i + 1;
                                columnIndex += 1;
                            }
                            case 9 -> {
                                listOfSettingToGetDataFromImport.get(rowIndex).setTestUser(importedLine.substring(previousDelimiterIndex, i).trim());
                                previousDelimiterIndex = i + 1;
                                columnIndex += 1;
                            }
                            case 10 -> {
                                listOfSettingToGetDataFromImport.get(rowIndex).setLanguage(importedLine.substring(previousDelimiterIndex, i).trim());
                                previousDelimiterIndex = i + 1;
                                columnIndex += 1;
                            }
                            case 11 -> {
                                listOfSettingToGetDataFromImport.get(rowIndex).setBrowser(importedLine.substring(previousDelimiterIndex, i).trim());
                                listOfSettingToGetDataFromImport.get(rowIndex).setUserName(importedLine.substring(i + 1));
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
            try (var fw = new FileWriter(currentPath + "/" + settingFileName, StandardCharsets.UTF_8)) {
                fw.write(String.valueOf(sb));
            } catch (IOException ignored) {
            }
        }
        return listOfSettingToGetDataFromImport;
    }

    public void exportSettingsToFile(List<SettingData> listOfSettingToExportData) throws IOException {
        //check for empty value and replace with blank in order to avoid exception while import with empty value
        try {
            for (SettingData sd : listOfSettingToExportData) {
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
            for (SettingData sd : listOfSettingToExportData) {
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
        String exportContent = listOfSettingToExportData.stream().map(sd -> sd.getBuildName() + "," + sd.getServerName() + "," + sd.getSdk() + "," + sd.getSlotName() + "," + sd.getInternalSlot() + "," + sd.getUrl() + "," + sd.getStatus() + "," + sd.getEnvironment() + "," + sd.getIssueType() + "," + sd.getTestUser() + "," + sd.getLanguage() + "," + sd.getBrowser() + "," + sd.getUserName() + "\n").collect(Collectors.joining("", "BuildName,ServerName,SDK,SLOTName,InternalSLOT,URL,Status,Environment,IssueType,user,Language,Browser,UserName" + "\n", ""));
        try (var fw = new FileWriter(currentPath + "/" + settingFileName, StandardCharsets.UTF_8)) {
            fw.write(exportContent);
//            exportSuccessAlert.showAndWait();
        } catch (IOException e) {
        }
    }

    public String getUserName(){
        importSettingsFromFile();
        return setting1Local.getUserName();
    }

    public List<CheckBox> autoAdd10SelectCheckboxes(VBox containerVBox, String titleName, String prefixCheckBoxName){
        List<CheckBox> listOfElementCheckBoxesToReturn = new ArrayList<>();
        CheckBox titleCheckBox = new CheckBox(titleName);
        titleCheckBox.setId(prefixCheckBoxName+"Title");
        titleCheckBox.getStylesheets().add(getClass().getResource("changeSceneStyleSheet.css").toExternalForm());
        titleCheckBox.getStyleClass().add("CheckBox");
        titleCheckBox.setNodeOrientation(NodeOrientation.RIGHT_TO_LEFT);
        containerVBox.getChildren().add(titleCheckBox);
        IntStream.range(0,10).forEach(index -> {
            CheckBox elementCheckBox = new CheckBox();
            elementCheckBox.setId(prefixCheckBoxName+index);
            elementCheckBox.getStyleClass().add("CheckBox");
            containerVBox.getChildren().add(elementCheckBox);
            listOfElementCheckBoxesToReturn.add(elementCheckBox);
        });
        titleCheckBox.setOnAction(event -> {
            if (titleCheckBox.isSelected()) listOfElementCheckBoxesToReturn.forEach(checkBox -> checkBox.setSelected(true));
            else listOfElementCheckBoxesToReturn.forEach(checkBox -> checkBox.setSelected(false));
        });
        return listOfElementCheckBoxesToReturn;
    }
}
