package vsu.cs.tasks;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Run extends Application {
    public void start(Stage primaryStage) {
        Group root = new Group();
        Scene scene = new Scene(root, 825, 600, Color.BLACK);
        Sky sky = new Sky(0,0,825,600);
        sky.putOnGroup(root);
        Snow snow = new Snow(0,500,825,400);
        snow.putOnGroup(root);
        Foreground foreground = new Foreground();
        foreground.putOnGroup(root);
        primaryStage.setTitle("Task1KG");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}




