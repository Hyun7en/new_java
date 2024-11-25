package org.example.javafxTest;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // fxml/testFX.fxml을 불러온다.
        Parent root = FXMLLoader.load(Objects.requireNonNull(
                getClass().getClassLoader().getResource("fxml/main.fxml")
        ));

        // GUI에 보일 프로그램 제목을 설정한다.
        primaryStage.setTitle("Pickypal");

        // 화면을 설정한다. 두번째 파라미터는 프로그램의 Width, 세번째는 Height를 설정한다
        primaryStage.setScene(new Scene(root, 800, 600));

        // 화면을 보여주는 작업을 실행한다
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}