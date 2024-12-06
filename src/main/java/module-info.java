module com.example.ramonika_catdecorator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ramonika_catdecorator to javafx.fxml;
    exports com.example.ramonika_catdecorator;
}