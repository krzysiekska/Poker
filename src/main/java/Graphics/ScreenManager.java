package Graphics;

import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ScreenManager {
    Pane root;
    Stage stage;


    public ScreenManager(Pane root, Stage stage) {
        this.root = root;
        this.stage = stage;
        root.getChildren().add(new Pane());
    }

    /*public void changeScreenToMenuScreen(){ root.getChildren().set(0,new Menu(this)); }
    public void changeScreenToEnigmaScreen(){
        root.getChildren().set(0,new EnigmaViev(this));
    }
    public void changeScreenToVisualisation(){
        root.getChildren().set(0,new Visualisation(this));
    }*/
}
