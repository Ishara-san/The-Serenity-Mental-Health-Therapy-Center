module lk.project.ijse.project {
    requires javafx.controls;
    requires javafx.fxml;


    opens lk.project.ijse.project to javafx.fxml;
    exports lk.project.ijse.project;
}