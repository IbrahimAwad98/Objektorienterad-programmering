package TEN20211027;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        /*
        Triangle triangle = new Triangle(3,4,5);
        System.out.println(triangle);
        System.out.println("Area = " + triangle.getArea());
        Triangle triangle1 = new Triangle(5,6,7);
        System.out.println("Area = " + triangle1.getArea());
        System.out.println(triangle.compareTo(triangle1));
        System.out.println(triangle.equals(triangle1));
         */

        DairyProduct cream = new DairyProduct("Cream", 20, 100, LocalDate.of(2025, 12, 3));
        PastaProduct pastaProduct = new PastaProduct("Barella", 21, 500, Type.SPAGETTI);
        CompoundProduct compoundProduct = new CompoundProduct("Creamy sauce");
        compoundProduct.addProduct(cream);
        compoundProduct.addProduct(pastaProduct);
        System.out.println(compoundProduct);
    }
}
