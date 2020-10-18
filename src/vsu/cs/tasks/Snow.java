package vsu.cs.tasks;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;


public class Snow extends SimpleDrawObject {
    public Snow(int x, int y, int width, int height) {
        Rectangle rectangle = new Rectangle(x,y,width,height);
        rectangle.setFill(Color.rgb(235, 235, 235));
        holst.getChildren().addAll(rectangle);
    }
}
