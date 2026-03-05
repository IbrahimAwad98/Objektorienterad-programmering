package TEN20241021;

import java.util.ArrayList;
import java.util.List;

public class Group implements IShape {
    private List<IShape> shapeList;

    public Group() {
        shapeList = new ArrayList<>();
    }

    public void add(IShape shape) {
        shapeList.add(shape);
    }

    public void move(int dx, int dy){
        for (IShape shape: shapeList){
            shape.move(dx,dy);
        }
    }

    public void draw(){
        for (IShape shape: shapeList){
            shape.draw();
        }
    }
}