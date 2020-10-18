package vsu.cs.tasks;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;

public class Foreground extends SimpleDrawObject {
    public Foreground() {
        //Home
        Rectangle home = new Rectangle(400,370,250,150);
        home.setFill(new Color(0.8,0.5,0.1,1));
        Polygon polygon = new Polygon(   400,370,650,370,525,250);
        polygon.setFill(new Color(0.7,0.2,0.2,1));
        Polygon polygon1 = new Polygon(550, 400, 550, 500, 600, 500,600, 400 );
        polygon1.setFill(new Color(0.8,0.5,0.5,1));
        Polygon polygon2 = new Polygon(450, 400, 450, 450, 500,450,500, 400 );
        polygon2.setFill(Color. YELLOW);
        //Fence
        Polygon polygon3 = new Polygon(665, 375,655, 385, 655, 520, 675, 520, 675, 385);
        polygon3.setFill(Color. BROWN);
        Polygon polygon4 = new Polygon(695,375,685, 385, 685, 520, 705, 520, 705, 385);
        polygon4.setFill(Color. BROWN);
        Polygon polygon5 = new Polygon(725,375,715, 385, 715, 520, 735, 520, 735, 385);
        polygon5.setFill(Color. BROWN);
        Polygon polygon6 = new Polygon(755, 375,745, 385, 745, 520, 765, 520, 765, 385);
        polygon6.setFill(Color. BROWN);
        Polygon polygon7 = new Polygon(785, 375,775, 385, 775, 520, 795, 520, 795, 385);
        polygon7.setFill(Color. BROWN);
        Polygon polygon8 = new Polygon(815, 375,805, 385, 805, 520, 825, 520, 825, 385);
        polygon8.setFill(Color. BROWN);
        Polygon polygon9 = new Polygon(450,400,450,450,500,450,500,400,497,400,497,447,453,447,453,403,497,403,497,400,450,400);
        polygon9.setFill(Color. BROWN);
        Polygon polygon10 = new Polygon(473,400,477,400,477, 423, 500,423, 500,427,477,427,477,450,473,450,473,427,450,427,450,423,473,423,473,400);
        polygon10.setFill(Color. BROWN);
        Polygon polygon11 = new Polygon(650, 415,650, 425, 825, 425, 825,415);
        polygon11.setFill(Color. BROWN);
        Polygon polygon12 = new Polygon(650, 495,650, 505, 825, 505, 825,495);
        polygon12.setFill(Color. BROWN);

       //Snowman
        Circle circle1=new Circle(200, 500, 70);
        circle1.setFill(Color.SNOW);
        Circle circle2=new Circle(200, 400, 50);
        circle2.setFill(Color.SNOW);
        Circle circle3=new Circle(200, 325, 35);
        circle3.setFill(Color.SNOW);
        Circle circle4=new Circle(194, 318, 3);
        circle4.setFill(Color.BLACK);
        Circle circle5=new Circle(206, 318, 3);
        circle5.setFill(Color.BLACK);
        Polygon polygon13 = new Polygon(593,448,595,448,595,452,593,452);
        polygon13.setFill(Color.rgb(50, 50, 50));
        Polygon polygon14 = new Polygon(200,325,200,335,225,330);
        polygon14.setFill(Color.ORANGE);
        Polygon polygon15 = new Polygon(165,305,235,305,220,240,175,240);
        polygon15.setFill(Color.GRAY);

        holst.getChildren().addAll(circle1,circle2,circle3,circle4,circle5);
        holst.getChildren().addAll(polygon14,polygon15,home,polygon,polygon1,polygon2,polygon3,polygon4,polygon5,polygon6,polygon7,polygon8,polygon9,polygon10,polygon11,polygon12,polygon13);

    }
}
