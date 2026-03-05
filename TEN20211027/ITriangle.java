package TEN20211027;

public interface ITriangle {
    void setA(int a) throws IllegalSideException;
    void setB(int b) throws IllegalSideException;
    void setC(int c) throws IllegalSideException;
    int getA();
    int getB();
    int getC();
    double getArea();
}
