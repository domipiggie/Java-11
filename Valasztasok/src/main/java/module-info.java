module com.example.valasztasok {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.valasztasok to javafx.fxml;
    exports com.example.valasztasok;
}