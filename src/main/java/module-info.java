module com.example.standapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.standapp to javafx.fxml;
    exports com.example.standapp;
}