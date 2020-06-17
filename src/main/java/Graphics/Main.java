package Graphics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {
    private Pane root;
    public static Scene scene;
    private Stage primaryStage;
    public static void main(String[] args){
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        root = new Pane();
        scene = new Scene(root,1600,1000);
        this.primaryStage=primaryStage;
        primaryStage.setScene(scene);
        primaryStage.setTitle("Poker");
        primaryStage.show();

        ScreenManager screenManager = new ScreenManager(root,primaryStage);
        //screenManager.changeScreenToMenuScreen();
    }
}
