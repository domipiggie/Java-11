module com.example.autokjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.autokjavafx to javafx.fxml;
    exports com.example.autokjavafx;
}