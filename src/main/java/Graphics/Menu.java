package Graphics;

import Graphics.ScreenManager;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Menu extends Pane {

    Image backgroundImage;
    ImageView backgroundImageView;

    private Stage primaryStage;

    Button startPlayButton;
    Button exitButton;

    ScreenManager screenManager;

    public Menu(ScreenManager screenManager){
        this.primaryStage = screenManager.stage;
        this.screenManager = screenManager;

        handlingMenu();
    }


    private void handlingMenu()
    {
        backgroundImage = new Image("background.png");
        backgroundImageView = new ImageView(backgroundImage);

        startPlayButton = new Button("Graj");
        exitButton = new Button("Wyjdz");

        startPlayButton.setStyle("-fx-background-color: \n"+
                "linear-gradient(#f2f2f2, #d6d6d6), \n"+
                "linear-gradient(#fcfcfc 0%, #d9d9d9 20%, #d6d6d6 100%), \n"+
                "linear-gradient(#dddddd 0%, #f6f6f6 50%); \n" +
                "-fx-background-radius: 8,7,6; \n" +
                "-fx-background-insets: 0,1,2; \n" +
                "-fx-text-fill: black; \n" +
                "-fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
        

        exitButton.setStyle("-fx-background-color: \n"+
                "linear-gradient(#f2f2f2, #d6d6d6), \n"+
                "linear-gradient(#fcfcfc 0%, #d9d9d9 20%, #d6d6d6 100%), \n"+
                "linear-gradient(#dddddd 0%, #f6f6f6 50%); \n" +
                "-fx-background-radius: 8,7,6; \n" +
                "-fx-background-insets: 0,1,2; \n" +
                "-fx-text-fill: black; \n" +
                "-fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
        startPlayButton.setPrefSize(200,80);
        exitButton.setPrefSize(200,80);


        VBox buttonsVBox = new VBox();
        buttonsVBox.setSpacing(30);
        buttonsVBox.setPadding(new Insets(300,0,0,700));
        buttonsVBox.getChildren().addAll(startPlayButton,exitButton);



       /* startPlayButton.setOnMouseClicked(event -> {
            screenManager.changeScreenToPlayScreen();
        });*/

        exitButton.setOnMouseClicked(event -> {primaryStage.close();});

        this.getChildren().addAll(backgroundImageView,buttonsVBox);
    }
}
