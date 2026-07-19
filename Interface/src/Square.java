public class Square implements Polygon{
    double a;
    public  Square(double koxm){
        a = koxm;
    }
    public double area(){
        return a * a;
    }
    public double perimeter(){
        return 4 * a;
    }
}
