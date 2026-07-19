public class Triangle implements Polygon{
    double a;
    double b;
    double c;

    public Triangle(double koxm1,double koxm2, double koxm3){
        a = koxm1;
        b = koxm2;
        c = koxm3;
    }

    public double perimeter(){
        return a + b + c;
    }
    public double area(){
        double s = perimeter() / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
