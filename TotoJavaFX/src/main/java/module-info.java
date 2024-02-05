module com.domipiggie.totojavafx {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.domipiggie.totojavafx to javafx.fxml;
    exports com.domipiggie.totojavafx;
}