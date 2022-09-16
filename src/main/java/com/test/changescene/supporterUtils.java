package com.test.changescene;

import javafx.geometry.NodeOrientation;
import javafx.scene.control.CheckBox;
import javafx.scene.control.IndexRange;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
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
    private String settingFileName = "supporterSettings.csv";

    {
        try {
            currentPath = new java.io.File(".").getCanonicalPath();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

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
                                listOfSettingToGetDataFromImport.get(rowIndex).setUserName(importedLine.substring(i + 1).trim());
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

    public String getUserName() {
        importSettingsFromFile();
        return setting1Local.getUserName();
    }

    public List<CheckBox> autoAdd10SelectCheckboxes(VBox containerVBox, String titleName, String prefixCheckBoxName) {
        List<CheckBox> listOfElementCheckBoxesToReturn = new ArrayList<>();
        CheckBox titleCheckBox = new CheckBox(titleName);
        titleCheckBox.setId(prefixCheckBoxName + "Title");
        titleCheckBox.getStylesheets().add(getClass().getResource("changeSceneStyleSheet.css").toExternalForm());
        titleCheckBox.getStyleClass().add("CheckBox");
        titleCheckBox.setNodeOrientation(NodeOrientation.RIGHT_TO_LEFT);
        containerVBox.getChildren().add(titleCheckBox);
        IntStream.range(0, 10).forEach(index -> {
            CheckBox elementCheckBox = new CheckBox();
            elementCheckBox.setId(prefixCheckBoxName + index);
            elementCheckBox.getStyleClass().add("CheckBox");
            containerVBox.getChildren().add(elementCheckBox);
            listOfElementCheckBoxesToReturn.add(elementCheckBox);
        });
        titleCheckBox.setOnAction(event -> {
            if (titleCheckBox.isSelected())
                listOfElementCheckBoxesToReturn.forEach(checkBox -> checkBox.setSelected(true));
            else listOfElementCheckBoxesToReturn.forEach(checkBox -> checkBox.setSelected(false));
        });
        return listOfElementCheckBoxesToReturn;
    }

    public void markdownTextInTextArea(TextArea workingTextArea, String markdownText, String ignoreWhenMarkdown) {
        String prefixIgnore = " " + ignoreWhenMarkdown;
        String postfixIgnore = ignoreWhenMarkdown + " ";
        if (!Objects.equals(workingTextArea.getText(), "")) {
            IndexRange selected = workingTextArea.getSelection();
            if (selected.getStart() != selected.getEnd()) {
                //Check if text already marked down to make it normal
                if (workingTextArea.getText().startsWith(markdownText, selected.getStart() - markdownText.length()) && workingTextArea.getText().startsWith(markdownText, selected.getEnd())) {
                    workingTextArea.setText(workingTextArea.getText(0, selected.getStart() - markdownText.length()) + workingTextArea.getSelectedText() + workingTextArea.getText(selected.getEnd() + markdownText.length(), workingTextArea.getLength()));
                    workingTextArea.positionCaret(selected.getEnd() - markdownText.length());
                } else {
                    try {
                        //check if text is in ignore
                        if (selected.getStart() == 0) {
                            workingTextArea.setText(workingTextArea.getText(0, selected.getStart()) + markdownText + workingTextArea.getSelectedText() + markdownText + workingTextArea.getText(selected.getEnd(), workingTextArea.getLength()));
                            workingTextArea.positionCaret(selected.getEnd() + markdownText.length() * 2);
                        } else if (!(workingTextArea.getText().startsWith(prefixIgnore, selected.getStart() - prefixIgnore.length())) && selected.getEnd() == workingTextArea.getText().length()) {
                            workingTextArea.setText(workingTextArea.getText(0, selected.getStart()) + markdownText + workingTextArea.getSelectedText() + markdownText + workingTextArea.getText(selected.getEnd(), workingTextArea.getLength()));
                            workingTextArea.positionCaret(selected.getEnd() + markdownText.length() * 2);
                        } else if (!(workingTextArea.getText().startsWith(prefixIgnore, selected.getStart() - prefixIgnore.length())) && !(workingTextArea.getText().startsWith(postfixIgnore, selected.getEnd()))) {
                            workingTextArea.setText(workingTextArea.getText(0, selected.getStart()) + markdownText + workingTextArea.getSelectedText() + markdownText + workingTextArea.getText(selected.getEnd(), workingTextArea.getLength()));
                            workingTextArea.positionCaret(selected.getEnd() + markdownText.length() * 2);
                        }
                    } catch (Exception ignored) {
                    }
                }
            } else {
                workingTextArea.setText(workingTextArea.getText(0, selected.getStart()) + markdownText + workingTextArea.getText(selected.getEnd(), workingTextArea.getLength()));
                workingTextArea.positionCaret(selected.getStart() + markdownText.length());
            }
            workingTextArea.requestFocus();
        }
    }

    public void onHandleTextArea(KeyEvent keyEvent, TextArea workingTextArea, Boolean isICJiraMode, AtomicBoolean listMode, AtomicBoolean numberMode, AtomicInteger numericIndex) {
        if (keyEvent.getEventType().equals(KeyEvent.KEY_RELEASED)) {
            if (keyEvent.getCode().equals(KeyCode.SPACE)) {
                String currentText = workingTextArea.getText();
                IndexRange selected = workingTextArea.getSelection();
                try {
                    if (currentText.startsWith("\n* ", selected.getStart() - 3)) {
                        listMode.set(true);
                        workingTextArea.positionCaret(selected.getStart());
                    } else if (currentText.startsWith("* ", selected.getStart() - 2) && !currentText.substring(selected.getStart() - 3, selected.getStart()).matches("[\\w\\d][*]\\s") && !currentText.substring(selected.getStart() - 3, selected.getStart()).matches("[*]{2}\\s")) {
                        listMode.set(true);
                        workingTextArea.positionCaret(selected.getStart());
                    }
                } catch (Exception e) {
                    if (currentText.startsWith("* ", selected.getStart() - 2)) {
                        listMode.set(true);
                        workingTextArea.positionCaret(selected.getStart());
                    }
                }
                if (currentText.startsWith("1. ", selected.getStart() - 3)) {
                    numberMode.set(true);
                    numericIndex.set(1);
                    workingTextArea.positionCaret(selected.getStart());
                }
            }
            if (keyEvent.getCode().equals(KeyCode.ENTER)) {
                String currentText = workingTextArea.getText();
                IndexRange selected = workingTextArea.getSelection();
                if (listMode.get()) {
                    if (currentText.startsWith("* ", selected.getStart() - 3)) {
                        listMode.set(false);
                        workingTextArea.setText(currentText.substring(0, selected.getStart() - 3) + currentText.substring(selected.getStart() - 1));
                        workingTextArea.positionCaret(selected.getStart() - 2);
                    } else {
                        workingTextArea.setText(currentText.substring(0, selected.getStart()) + "* " + currentText.substring(selected.getStart()));
                        workingTextArea.positionCaret(selected.getStart() + 2);
                    }
                }
                if (numberMode.get()) {
                    if (currentText.substring(selected.getStart() - 4, selected.getStart() - 1).matches("\\d.\\s")) {
                        numberMode.set(false);
                        workingTextArea.setText(currentText.substring(0, selected.getStart() - (numericIndex + ". ").length() - 1) + currentText.substring(selected.getStart() - 1));
                        workingTextArea.positionCaret(selected.getStart() - (numericIndex + ". ").length());
                        numericIndex.set(1);
                    } else {
                        numericIndex.set(numericIndex.get() + 1);
                        workingTextArea.setText(currentText.substring(0, selected.getStart()) + numericIndex + ". " + currentText.substring(selected.getStart()));
                        workingTextArea.positionCaret(selected.getStart() + (numericIndex + ". ").length());
                    }
                }
            }
            if (keyEvent.getCode() == KeyCode.DIGIT1 && keyEvent.isControlDown())
                customTextAddMethod(workingTextArea, isICJiraMode, "Given");
            else if (keyEvent.getCode() == KeyCode.DIGIT2 && keyEvent.isControlDown())
                customTextAddMethod(workingTextArea, isICJiraMode, "When");
            else if (keyEvent.getCode() == KeyCode.DIGIT3 && keyEvent.isControlDown())
                customTextAddMethod(workingTextArea, isICJiraMode, "Then");
            else if (keyEvent.getCode() == KeyCode.DIGIT4 && keyEvent.isControlDown())
                customTextAddMethod(workingTextArea, isICJiraMode, "  And");
            else if (keyEvent.getCode() == KeyCode.B && keyEvent.isControlDown()) {
                if (isICJiraMode) markdownTextInTextArea(workingTextArea, "**", "*");
                else markdownTextInTextArea(workingTextArea, "*", null);
            } else if (keyEvent.getCode() == KeyCode.I && keyEvent.isControlDown()) {
                if (isICJiraMode) markdownTextInTextArea(workingTextArea, "_", null);
                else markdownTextInTextArea(workingTextArea, "*", null);
            } else if (keyEvent.getCode() == KeyCode.G && keyEvent.isControlDown()) {
                if (isICJiraMode) markdownTextInTextArea(workingTextArea, "`", null);
            } else if (keyEvent.getCode() == KeyCode.U && keyEvent.isControlDown()) {
                if (!isICJiraMode) markdownTextInTextArea(workingTextArea, "+", null);
            } else if (keyEvent.getCode() == KeyCode.L && keyEvent.isControlDown()) {
                onChangeMultipleLinesToList(workingTextArea, listMode);
            } else if (keyEvent.getCode() == KeyCode.N && keyEvent.isControlDown()) {
                onChangeMultipleLinesToNumeric(workingTextArea, numberMode, numericIndex);
            }
        }
    }

    public void customTextAddMethod(TextArea workingTextArea, Boolean isICJiraMode, String textToAdd) {
        String currentText = workingTextArea.getText();
        IndexRange selected = workingTextArea.getSelection();
        String markdownBoldText = "";
        if (isICJiraMode != null) {
            markdownBoldText = isICJiraMode ? "**" : "*";
        }
        String addText = markdownBoldText + textToAdd + markdownBoldText;
        if (selected.getStart() == selected.getEnd()) {
            workingTextArea.setText(currentText.substring(0, selected.getStart()) + addText + currentText.substring(selected.getStart()));
        } else {
            workingTextArea.setText((currentText.substring(0, selected.getStart())) + addText + currentText.substring(selected.getEnd()));
        }
        workingTextArea.requestFocus();
        workingTextArea.positionCaret(selected.getStart() + addText.length());
    }

    public String pickSelectedCheckBoxesAndPrint(List<CheckBox> checkingCheckBoxList, String
            titleText, String markdownTitleText, String markdownContentList) {
        StringBuilder sb = new StringBuilder();
        AtomicBoolean isCheckingCheckBoxHasAnyCheckedValue = new AtomicBoolean(false);
        checkingCheckBoxList.forEach(checkBox -> {
            if (checkBox.isSelected()) isCheckingCheckBoxHasAnyCheckedValue.set(true);
        });
        if (isCheckingCheckBoxHasAnyCheckedValue.get()) {
            sb.append(markdownTitleText).append(titleText).append(":").append(markdownTitleText).append(" ");
            checkingCheckBoxList.forEach(checkBox -> {
                if (checkBox.isSelected())
                    sb.append(markdownContentList).append(checkBox.getText()).append(markdownContentList).append(", ");
            });
            sb.deleteCharAt(sb.length() - 2);
            sb.append("\n");
        }
        return String.valueOf(sb);
    }

    private List<Integer> getListOfSearchTextIndexInText(String searchText, String textContent) {
        //get all index of headers
        int indexHeader = 0;
        int wordLength = 0;
        String tempsearchText = searchText;
        List<Integer> indexes = new ArrayList<>();
        while (indexHeader != -1) {
            indexHeader = textContent.indexOf(tempsearchText, indexHeader + wordLength);
            if (indexHeader != -1) {
                indexes.add(indexHeader);
            }
            wordLength = tempsearchText.length();
        }
        return indexes;
    }

    public void onChangeMultipleLinesToList(TextArea workingTextArea, AtomicBoolean listMode) {
        IndexRange selected = workingTextArea.getSelection();
        String currentText = workingTextArea.getText();
        String selectedText = currentText.substring(selected.getStart(), selected.getEnd());
        String tempChangeText = "";
        //Check if this block on text is already outlined
        List<Integer> listCheck = getListOfSearchTextIndexInText("* ", selectedText);
        if (listCheck.size() > 0) {
            tempChangeText = selectedText.replaceAll("[*]{2}\\s", "</bold>");
            tempChangeText = tempChangeText.replaceAll("\\w[*]\\s", "</italic>");
            tempChangeText = tempChangeText.replaceAll("[*]\\s", "");
            tempChangeText = tempChangeText.replaceAll("(?:\\<\\/bold\\>)", "** ");
            tempChangeText = tempChangeText.replaceAll("(?:\\<\\/italic\\>)", "* ");
            listMode.set(false);
        } else {
            //Add list outline
            listMode.set(true);
            tempChangeText = "* " + selectedText;
            tempChangeText = tempChangeText.replaceAll("\\n", "\n* ");
        }
        workingTextArea.setText(currentText.substring(0, selected.getStart()) + tempChangeText + currentText.substring(selected.getEnd()));
        workingTextArea.requestFocus();
        workingTextArea.positionCaret(selected.getStart() + tempChangeText.length());
    }

    public void onChangeMultipleLinesToNumeric(TextArea workingTextArea, AtomicBoolean numberListMode, AtomicInteger numericIndexValue) {
        IndexRange selected = workingTextArea.getSelection();
        String currentText = workingTextArea.getText();
        String selectedText = currentText.substring(selected.getStart(), selected.getEnd());
        String tempChangeText = "";
        //Check if this block on text is already outlined
        List<Integer> listCheck = getListOfSearchTextIndexInText("* ", selectedText);
        if (selectedText.substring(0, 3).matches("\\d.\\s")) {
            //do remove list outline
            tempChangeText = selectedText.replaceAll("\\d+.\\s", "");
            numberListMode.set(false);
            numericIndexValue.set(1);
        } else {
            //Add list outline
            numberListMode.set(true);
            numericIndexValue.set(1);
            List<Integer> enterIndex = getListOfSearchTextIndexInText("\n", selectedText);
            int loopIndex = 0;
            do {
                if (loopIndex == 0) {
                    tempChangeText = numericIndexValue + ". " + selectedText.substring(0, enterIndex.get(loopIndex) + 1);
                    numericIndexValue.set(numericIndexValue.get() + 1);
                } else if (loopIndex < enterIndex.size()) {
                    tempChangeText += numericIndexValue + ". " + selectedText.substring(enterIndex.get(loopIndex - 1) + 1, enterIndex.get(loopIndex) + 1);
                    numericIndexValue.set(numericIndexValue.get() + 1);
                } else {
                    tempChangeText += numericIndexValue + ". " + selectedText.substring(enterIndex.get(loopIndex - 1) + 1);
                }
                loopIndex++;
            } while (loopIndex <= enterIndex.size());
        }
        workingTextArea.setText(currentText.substring(0, selected.getStart()) + tempChangeText + currentText.substring(selected.getEnd()));
        workingTextArea.requestFocus();
        workingTextArea.positionCaret(selected.getStart() + tempChangeText.length());
    }

    public void onChangeJiraModeThenSwitchAllMarkdown(TextArea workingTextArea, Boolean isTurningToICJiraMode) {
        String tempChangeText = workingTextArea.getText();
        if (isTurningToICJiraMode) {
            tempChangeText = tempChangeText.replaceAll("[*]", "**");
            tempChangeText = tempChangeText.replaceAll("[_]", "*");
            tempChangeText = tempChangeText.replaceAll("[+]", "`");
        } else {
            tempChangeText = tempChangeText.replaceAll("[*]{2}", "<bold>");
            tempChangeText = tempChangeText.replaceAll("[*]", "<italic>");
            tempChangeText = tempChangeText.replaceAll("[`]", "+");
            tempChangeText = tempChangeText.replaceAll("(?:\\<bold\\>)", "*");
            tempChangeText = tempChangeText.replaceAll("(?:\\<italic\\>)", "_");

        }
        workingTextArea.setText(tempChangeText);
    }

    public String switchMarkDownToICJira(String textToSwitch){
        textToSwitch = textToSwitch.replaceAll("\\[\s\\][*]","[]");
        textToSwitch = textToSwitch.replaceAll("[*]{2}","*");
        textToSwitch = textToSwitch.replaceAll("[*]","**");
        textToSwitch = textToSwitch.replaceAll("[_]","*");
        textToSwitch = textToSwitch.replaceAll("[+]","`");
        textToSwitch = textToSwitch.replaceAll("#!","---");
        return textToSwitch;
    }

    public String switchMarkDownToFXTJira(String textToSwitch){
//        textToSwitch = textToSwitch.replaceAll("[*]{2}","<bold>");
//        textToSwitch = textToSwitch.replaceAll("[*]", "<italic>");
        textToSwitch = textToSwitch.replaceAll("[`]","+");
//        textToSwitch = textToSwitch.replaceAll("(?:\\<bold\\>)", "*");
//        textToSwitch = textToSwitch.replaceAll("(?:\\<italic\\>)", "_");
        textToSwitch = textToSwitch.replaceAll("\\[\\]","[ ]*");
        textToSwitch = textToSwitch.replaceAll("---","#!");
        return textToSwitch;
    }
}
