module com.mypersonalcalendar {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.xml.crypto;

    opens com.mypersonalcalendar.modell to javafx.base;

    opens com.mypersonalcalendar to javafx.fxml;
    exports com.mypersonalcalendar;
}