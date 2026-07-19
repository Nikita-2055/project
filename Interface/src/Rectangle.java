public class Rectangle implements Polygon {
    double a;
    double b;

    public Rectangle(double koxm1,double koxm2){
        a = koxm1;
        b = koxm2;
    }

    public double area(){
        return a * b;
    }
    public double perimeter(){
        return 2 * (a + b);
    }
}
