package com.test.changescene;

import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class TestingScopeContent {
    private final String labelPrefixName = "lblTestScope";
    private final String textFieldPrefixName = "txtTestScope";
    private final String checkboxPrefixName = "cbxTestScope";
    private final String buttonPrefixName = "btnTestScope";
    private final String searchHeaderEndSignal = "**\n";
    private final HashMap<Integer, String> testingScopeHeader = new HashMap<>();
    private final HashMap<Integer, String> testingScopeContent = new HashMap<>();
    private final HashMap<Integer, VBox> tcVboxes = new HashMap<>();
    HashMap<Integer, Integer> textMapping = new HashMap<>();
    private String searchHeaderStartSignal = "#! **";
    private TextArea textareaTestScope = new TextArea();

    public void getTextArea(TextArea txaTCEditor) {
        textareaTestScope = txaTCEditor;
    }

    public void setTestingScope(Integer number, String header, String content) {
        testingScopeHeader.put(number, header);
        try {
            if (content.charAt(content.length()-1) == '\n') testingScopeContent.put(number, content);
            else testingScopeContent.put(number,content+"\n");
        } catch (Exception e) {
            testingScopeContent.put(number,content+"\n");
        }
    }

    public void removeTestingScope(Integer number) {
        testingScopeHeader.remove(number);
        testingScopeContent.remove(number);
    }

    public String getHeaderById(Integer number) {
        return testingScopeHeader.get(number);
    }

    public String getICHeaderById(Integer number){
        return testingScopeHeader.get(number).replaceFirst("#! ","---");
    }

    public String getTestingScopeContentById(Integer number) {
        return testingScopeContent.get(number);
    }

    public String getShortHeaderById(Integer number) {
        String returnContent = testingScopeHeader.get(number);
        return returnContent.substring(5, returnContent.length() - 2);
    }

    public void setShortHeaderById(Integer number, String headerName) {
        testingScopeHeader.put(number, "#! **" + headerName + "**");
    }

    public HashMap<Integer, CheckBox> getCheckBoxList() {
        HBox hb = new HBox();
        HashMap<Integer, CheckBox> checkboxList = new HashMap<>();
        int index = 0;
        for (VBox vb : tcVboxes.values()) {
            hb = (HBox) vb.getChildren().get(0);
            checkboxList.put(index, (CheckBox) hb.getChildren().get(1));
            index++;
        }
        return checkboxList;
    }

    public Integer getMaxItemNumber() {
        return tcVboxes.size();
    }

    public Integer getHeaderPositionInTextAreaByTCIndex(int index, String searchtext) {
        //get all index of headers
        int indexHeader = 0;
        int wordLength = 0;
        String searchText = searchtext;
        List<Integer> indexes = new ArrayList<>();
        while (indexHeader != -1) {
            indexHeader = textareaTestScope.getText().indexOf(searchText, indexHeader + wordLength);
            if (indexHeader != -1) {
                indexes.add(indexHeader);
            }
            wordLength = searchText.length();
        }
        return indexes.get(index);
    }

    public void saveDataWithTextIndexInTextArea(HashMap<Integer, Integer> textmappingList) {
        HashMap<Integer, Integer> tempTextMapping = textmappingList;
        Object[] tempKeyList = tempTextMapping.keySet().toArray();
        List<Integer> headerStartIndexes = getListOfIndexBySearchText(searchHeaderStartSignal);
        List<Integer> headerEndIndexes = getListOfIndexBySearchText(searchHeaderEndSignal);
        AtomicReference<String> tempHeader = new AtomicReference<>("");
        AtomicReference<String> tempContent = new AtomicReference<>("");

        //get data based on header indexes
        for (int i = 0; i < tempKeyList.length; i++) {
            tempHeader.set(textareaTestScope.getText().substring(headerStartIndexes.get(i), headerEndIndexes.get(i) + searchHeaderEndSignal.length()));
            if (i < headerStartIndexes.size() - 1) {
                tempContent.set(textareaTestScope.getText().substring(headerEndIndexes.get(i) + searchHeaderEndSignal.length(), headerStartIndexes.get(i + 1)));
            } else {
                tempContent.set(textareaTestScope.getText().substring(headerEndIndexes.get(i) + searchHeaderEndSignal.length(), textareaTestScope.getLength()));
            }
            setTestingScope((Integer) tempKeyList[i], tempHeader.toString().replace("\n", ""), tempContent.toString());
        }
    }

    public List<Integer> getListOfIndexBySearchText(String searchText) {
        //get all index of headers
        int indexHeader = 0;
        int wordLength = 0;
        String tempsearchText = searchText;
        List<Integer> indexes = new ArrayList<>();
        while (indexHeader != -1) {
            indexHeader = textareaTestScope.getText().indexOf(tempsearchText, indexHeader + wordLength);
            if (indexHeader != -1) {
                indexes.add(indexHeader);
            }
            wordLength = tempsearchText.length();
        }
        return indexes;
    }

    public HashMap<Integer, Integer> checkAndSetTextAreaFollowOrder(TextArea textareaToWriteTestScope) {
        HashMap<Integer, Integer> testingScopeMapToTextArea = new HashMap<>();
        int textIndex = 0;
        HBox tempHBox;
        CheckBox tempCheckBox;
        textareaToWriteTestScope.setText("");
        for (int i = 0; i < tcVboxes.size(); i++) {
            tempHBox = (HBox) tcVboxes.get(i).getChildren().get(0);
            tempCheckBox = (CheckBox) tempHBox.getChildren().get(1);
            if (tempCheckBox.isSelected()) {
                String textAreaContent = textareaToWriteTestScope.getText();
                testingScopeMapToTextArea.put(i, textIndex);
                textIndex++;
                textareaToWriteTestScope.setText(textareaToWriteTestScope.getText() + getHeaderById(i) + "\n" + getTestingScopeContentById(i));
            }
        }
        return testingScopeMapToTextArea;
    }

    public void removePanel(int number) {
        VBox vbox = tcVboxes.get(number);
        Pane panel = (Pane) tcVboxes.get(number).getParent();
        int removeSize = vbox.getChildren().size();
        if (removeSize > 0) {
            vbox.getChildren().subList(0, removeSize).clear();
        }
        panel.getChildren().remove(number);
    }

    public void reorderTestScopeFromIndex(int index) {
        //if remove item is not the last one do reorder
        if (index < getMaxItemNumber()) {
            if (index == 0 && getMaxItemNumber() == 1) {
                tcVboxes.remove(0);
                removeTestingScope(0);
            } else if (index == getMaxItemNumber() - 1) {
                tcVboxes.remove(index);
                removeTestingScope(index);
            } else {
                for (int i = index; i < getMaxItemNumber(); i++) {
                    VBox vbox = tcVboxes.get(i + 1);
                    HBox hbox = (HBox) vbox.getChildren().get(1);
                    Label label = (Label) vbox.getChildren().get(0);
                    TextField textField = (TextField) hbox.getChildren().get(0);
                    CheckBox checkBox = (CheckBox) hbox.getChildren().get(1);
                    Button button = (Button) hbox.getChildren().get(2);

                    label.setId(labelPrefixName + i);
                    try {
                        label.setText(i + ". Testing scope of " + getShortHeaderById(i + 1));
                    } catch (Exception e) {
                        label.setText(i + ". Testing scope of Header_Name_here");
                    }
                    textField.setId(textFieldPrefixName + i);
                    checkBox.setId(checkboxPrefixName + i);
                    button.setId(buttonPrefixName + i);
                    tcVboxes.put(i, vbox);
                    tcVboxes.remove(i + 1);
                    setTestingScope(i, getHeaderById(i + 1), getTestingScopeContentById(i + 1));
                    removeTestingScope(i + 1);
                    vbox.setLayoutY(vbox.getPrefHeight() * i);
                }
            }
        }
    }

    public void resetTestingScope() {
        textareaTestScope.setText("");
        int removeSize = tcVboxes.size();
        for (int i = 0; i < removeSize; i++) {
            removePanel(0);
            reorderTestScopeFromIndex(0);
        }
    }

    public Node addNewTestingScopeWithData(Integer number, String fullHeader, String fullContent) {
        HBox hbox = new HBox();
        VBox vbox = new VBox();
        TextField textField = new TextField();
        CheckBox checkBox = new CheckBox();
        Label label = new Label();
        Button button = new Button();
        Pane panel = new Pane();
        String header = fullHeader;
        String content = fullContent;
        setTestingScope(number, header, content);

        textField.setFont(Font.font("System", FontWeight.BOLD, 14));
        textField.setPrefWidth(300);
        textField.setPrefHeight(30);
        textField.setId(textFieldPrefixName + number);
        try {
            textField.setText(getShortHeaderById(number));
        } catch (Exception e) {
            textField.setText("Header_Name_Here");
        }
        textField.setEditable(false);
        textField.setDisable(true);
        textField.textProperty().addListener((observable, oldValue, newValue) -> {
            int index = Integer.parseInt(textField.getId().substring(textFieldPrefixName.length()));
            Label tf = (Label) tcVboxes.get(index).getChildren().get(1);
            tf.setText(number + ". Testing scope of " + newValue);
        });
        textField.addEventFilter(MouseEvent.MOUSE_ENTERED, e -> {
            String fieldName = e.getTarget().toString();
            int index = Integer.parseInt(fieldName.substring(fieldName.indexOf("id=") + textFieldPrefixName.length() + 3, fieldName.indexOf(",")));
            Pane parentPanel = tcVboxes.get(index);
            parentPanel.setStyle("-fx-background-color: #8D9AF2");
        });
        textField.addEventFilter(MouseEvent.MOUSE_EXITED, e -> {
            TextField tf = (TextField) e.getSource();
            CheckBox cb = (CheckBox) tf.getParent().getChildrenUnmodifiable().get(1);
            VBox parentVbox = (VBox) cb.getParent().getParent();
            if (!cb.isSelected()) {
                parentVbox.setStyle(null);
            }
        });

        checkBox.setId(checkboxPrefixName + number);
        checkBox.setPrefWidth(20);
        checkBox.setPrefHeight(20);
        checkBox.setScaleX(1.9);
        checkBox.setScaleY(1.9);
        checkBox.setScaleZ(1.9);
        checkBox.setStyle("CheckBox");
        checkBox.addEventFilter(MouseEvent.MOUSE_ENTERED, e -> {
            String fieldName = e.getTarget().toString();
            int index = Integer.parseInt(fieldName.substring(fieldName.indexOf("id=") + checkboxPrefixName.length() + 3, fieldName.indexOf(",")));
            Pane parentPanel = tcVboxes.get(index);
            parentPanel.setStyle("-fx-background-color: #8D9AF2");
        });
        checkBox.addEventFilter(MouseEvent.MOUSE_EXITED, e -> {
            CheckBox cb = (CheckBox) e.getSource();
            VBox parentVbox = (VBox) cb.getParent().getParent();
            if (!cb.isSelected()) {
                parentVbox.setStyle(null);
            }
        });
        checkBox.addEventFilter(MouseEvent.MOUSE_CLICKED, e -> {
            CheckBox cb = (CheckBox) e.getSource();
            IndexRange selected = textareaTestScope.getSelection();
            String fieldName = e.getSource().toString();
            VBox parentVbox = (VBox) cb.getParent().getParent();
            TextField tf = (TextField) cb.getParent().getChildrenUnmodifiable().get(0);
            int index = Integer.parseInt(fieldName.substring(fieldName.indexOf("id=") + checkboxPrefixName.length() + 3, fieldName.indexOf(",")));
            if (cb.isSelected()) {
                parentVbox.setStyle("-fx-background-color: #8D9AF2");
            } else {
                parentVbox.setStyle(null);
            }
            //update textfield value to class
            setShortHeaderById(index, tf.getText());
            //add data to textbox
            try {
                saveDataWithTextIndexInTextArea(textMapping);
                textMapping = checkAndSetTextAreaFollowOrder(textareaTestScope);
            } catch (Exception ex) {
                textMapping = checkAndSetTextAreaFollowOrder(textareaTestScope);
                saveDataWithTextIndexInTextArea(textMapping);
            }
            //change textbox text
            tf.setText(getShortHeaderById(number));
        });

        button.setId(buttonPrefixName + number);
        button.setStyle("-fx-background-color: #E14463");
        button.setPrefHeight(15);
        button.setMinHeight(15);
        button.setMaxHeight(15);
        button.setPrefWidth(25);
        button.addEventFilter(MouseEvent.MOUSE_ENTERED, e -> {
            try {
                String fieldName = e.getTarget().toString();
                int index = Integer.parseInt(fieldName.substring(fieldName.indexOf("id=") + buttonPrefixName.length() + 3, fieldName.indexOf(",")));
                Pane parentPanel = tcVboxes.get(index);
                parentPanel.setStyle("-fx-background-color: #8D9AF2");
            } catch (Exception ignored) {
            }
        });
        button.addEventFilter(MouseEvent.MOUSE_EXITED, e -> {
            try {
                Button bt = (Button) e.getSource();
                CheckBox cb = (CheckBox) bt.getParent().getChildrenUnmodifiable().get(1);
                VBox parentVbox = (VBox) cb.getParent().getParent();
                if (!cb.isSelected()) {
                    parentVbox.setStyle(null);
                }
            } catch (Exception ignored) {
            }
        });
        button.addEventFilter(MouseEvent.MOUSE_CLICKED, e -> {
            try {
                String fieldName = e.getTarget().toString();
                int index = Integer.parseInt(fieldName.substring(fieldName.indexOf("id=") + buttonPrefixName.length() + 3, fieldName.indexOf(",")));
                removePanel(index);
                reorderTestScopeFromIndex(index);
                //add data to textbox
                saveDataWithTextIndexInTextArea(textMapping);
                textMapping = checkAndSetTextAreaFollowOrder(textareaTestScope);
            } catch (Exception ignored) {
            }
        });

        label.setId(labelPrefixName + number);
        label.setFont(Font.font("System", FontWeight.NORMAL, 13));
        try {
            label.setText(number + ". Testing scope of " + getShortHeaderById(number));
        } catch (Exception e) {
            label.setText(number + ". Testing scope of " + "Header_Name_here");
        }

        hbox.setPrefWidth(370);
        hbox.setPrefHeight(60);
        hbox.setPadding(new Insets(5, 5, 5, 5));
        vbox.setPrefWidth(370);
        vbox.setPrefHeight(60);
        vbox.setLayoutY(vbox.getPrefHeight() * number);

        hbox.getChildren().add(textField);
        hbox.getChildren().add(checkBox);
        HBox.setMargin(checkBox, new Insets(5, 5, 5, 15));
        hbox.getChildren().add(button);
        HBox.setMargin(button, new Insets(7, 5, 5, 5));
        vbox.getChildren().add(label);
        VBox.setMargin(label, new Insets(0,0,0,3));
        vbox.getChildren().add(hbox);

        tcVboxes.put(number, vbox);
        for (int i = 0; i < tcVboxes.size(); i++) {
            panel.getChildren().add(i, tcVboxes.get(i));
        }
        return panel;
    }
}
