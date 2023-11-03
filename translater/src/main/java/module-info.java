module ru.translatestalker {
    requires javafx.controls;
    requires javafx.fxml;

    opens ru.translatestalker to javafx.fxml;

    exports ru.translatestalker;
}
