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

    public void changeScreenToMenuScreen(){ root.getChildren().set(0,new Menu(this)); }

}
