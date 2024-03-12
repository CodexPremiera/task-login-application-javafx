module com.example.lesson03javafx_intro {
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;


    opens lesson03JavaFxIntro to javafx.fxml;
    exports lesson03JavaFxIntro;
}