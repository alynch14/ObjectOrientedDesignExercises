package Adapter;

public class RectangleAdapter implements Shape {
    Rectangle adaptee;

    public RectangleAdapter(Rectangle rectangle){
        adaptee=rectangle;
    }
    @Override
    public void draw(int x1, int y1, int x2, int y2) {
        adaptee.draw(x1, y1, (x2-x1),(y2-y1));
    }
}
