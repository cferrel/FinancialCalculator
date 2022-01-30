module com.example.financialcalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.financialcalculator to javafx.fxml;
    exports com.example.financialcalculator;
}