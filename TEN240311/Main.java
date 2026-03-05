package TEN240311;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
        Vector2D vector2D = new Vector2D(2, 3);
        Vector2D vector2D1 = new Vector2D(2, 3);
        Vector2D vector2D2 = new Vector2D(4, 4);
        Vector2D vector2D3 = new Vector2D();
        System.out.println(vector2D);
        System.out.println("Length= " + vector2D.length());
        System.out.println(vector2D.equals(vector2D1)); //true
        System.out.println(vector2D.equals(vector2D2)); //false
        vector2D.add(vector2D1);
        System.out.println("Sum= " + vector2D.add(vector2D2));
        System.out.println("Scale= "+ vector2D.scale(10));
        System.out.println("X= " + vector2D3.getX());
        System.out.println("Y= " + vector2D3.getY());
         */

        /*
         SmsMsg smsMsg = new SmsMsg("Ibrahim", "Anders");
        smsMsg.setMessage("Hi! how are you? ");
        MmsMsg mmsMsg = new MmsMsg("Ibrahim", "Daniel", "https://canvas.se");
        mmsMsg.setMessage("This is canvas link -> ");
        List<AbstractMsg> abstractMsgs = new ArrayList<>();
        abstractMsgs.add(smsMsg);
        abstractMsgs.add(mmsMsg);
        for (AbstractMsg a: abstractMsgs){
            System.out.println(a);
        }
         */

        /*
        List<String> stringList = new List<>(4);
        System.out.println("Empty? " + stringList.isEmpty());
        stringList.addLast("D");
        stringList.addLast("C");
        stringList.addLast("B");
        stringList.addLast("A");
        System.out.println(stringList);
        System.out.println("Empty? " + stringList.isEmpty());
        System.out.println("Value of index (3)= " + stringList.get(3));

        IList<String> copy = stringList.copy();
        System.out.println(copy.get(0));

        stringList.clear();
        System.out.println("Empty? " + stringList.isEmpty());
        System.out.println(stringList);

        try {
            stringList.get(-1);
        }catch (IndexOutOfBoundsException e){
            System.out.println("Error -> " + e.getMessage());
        }
         */

        Circle c1 = new Circle(0, 0, 5);
        Circle c2 = new Circle(10, 10, 3);
        Circle c3 = new Circle(1, 1, 2);
        Group group = new Group();
        group.add(c1);
        group.add(c2);
        group.add(c3);

        ArrayList<GraphicsObj> graphicsObjList = new ArrayList<>();
        graphicsObjList.add(new Circle(5,5,10));
        graphicsObjList.add(group);
        for (GraphicsObj go: graphicsObjList){
            System.out.println(go);
            System.out.println("Area: " + go.area());
        }

    }
}
