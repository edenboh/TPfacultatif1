module sio.tpfacultatif {
    requires javafx.controls;
    requires javafx.fxml;


    opens sio.tpfacultatif to javafx.fxml;
    exports sio.tpfacultatif;
}