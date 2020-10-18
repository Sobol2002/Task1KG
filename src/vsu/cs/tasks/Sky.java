package vsu.cs.tasks;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;


public class Sky extends SimpleDrawObject {
    private Rectangle rectangle;

    public Sky(int x, int y, int width, int height) {
        rectangle = new Rectangle(x,y,width,height);
        rectangle.setFill(Color.MIDNIGHTBLUE );
        holst.getChildren().addAll(rectangle);
        for(int i=0;i<1+Math.random()*(width/100);i++) {
            Cloud cloud = new Cloud(Math.random()*width, 70+Math.random()*100, (int)(20+Math.random()*10));
            cloud.putOnGroup(holst);
        }
    }
}
