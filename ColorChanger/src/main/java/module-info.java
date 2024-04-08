module com.example.colorchanger {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.colorchanger to javafx.fxml;
    exports com.example.colorchanger;
}