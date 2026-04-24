module com.phantomstormx.ceasercypherjava {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.phantomstormx.ceasercypherjava to javafx.fxml;
    exports com.phantomstormx.ceasercypherjava;
}