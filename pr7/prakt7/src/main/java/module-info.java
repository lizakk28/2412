module ru.gorodetskaya.prakt7 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.gorodetskaya.prakt7 to javafx.fxml;
    exports ru.gorodetskaya.prakt7;
}