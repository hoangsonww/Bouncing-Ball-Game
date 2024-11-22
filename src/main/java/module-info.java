module com.example.bouncingballgamejavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bouncingballgamejavafx to javafx.fxml;
    exports com.example.bouncingballgamejavafx;
}