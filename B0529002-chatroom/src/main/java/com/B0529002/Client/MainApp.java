package com.B0529002.Client;
import com.B0529002.Client.stage.StageController;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class MainApp extends Application {
    public static String mainViewID = "MainView";
    public static String mainViewRes = "/MainView.fxml";

    public static String loginViewID = "LoginView";
    public static String loginViewRes = "/LoginView.fxml";


    private StageController stageController;


    @Override
    public void start(Stage primaryStage) {
        //新建一个StageController控制器
        stageController = new StageController();

        //将主stage交给控制器处理
        stageController.setPrimaryStage("primaryStage", primaryStage);

        //加载两个stage，每个界面一个stage
        stageController.loadStage(loginViewID, loginViewRes, StageStyle.UNDECORATED);

        //显示MainView stage
        stageController.setStage(loginViewID);
    }


    public static void main(String[] args) {
        launch(args);
    }
}