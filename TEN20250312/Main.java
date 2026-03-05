package TEN20250312;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        /*
        double[] vector = {1.0, 2.0, 3.0};
        Vector3D vector3D = new Vector3D(vector);
        System.out.println(vector3D);
        Vector3D v2  = new Vector3D(4,5,6);
        System.out.println(v2);
        System.out.println("Length of v2= " + v2.length());
        System.out.println("Get: " + v2.get(Index.X));
        Vector3D v3 = vector3D.add(v2);
        System.out.println(v3);
        Vector3D v1 = new Vector3D(1,3,4);
        double[] copy = v1.getValues();
        for (double v: copy){
            System.out.println(v);
        }
         */

        UList<String> stringUList = new UList<>();
        stringUList.add("A");
        stringUList.add("B");
        stringUList.add("C");
        System.out.println("Size= " + stringUList.size());
        System.out.println(stringUList);
        try {
            stringUList.get(-1);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
        for (String s: stringUList){
            System.out.println(s);
        }
        Iterator<String> it = stringUList.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
    }
}
