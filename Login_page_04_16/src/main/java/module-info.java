module com.example.login_page_04_16 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.login_page_04_16 to javafx.fxml;
    exports com.example.login_page_04_16;
}