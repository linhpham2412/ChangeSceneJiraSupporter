module com.test.changescene.changescene {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.test.changescene to javafx.fxml;
    exports com.test.changescene;
}