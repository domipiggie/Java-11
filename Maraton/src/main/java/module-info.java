module com.example.maraton {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.maraton to javafx.fxml;
    exports com.example.maraton;
}