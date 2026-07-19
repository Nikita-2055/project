public class Main {
    public static void main(String argv[]){
        Square s = new Square(5);
        System.out.println("square area = "+s.area());
        System.out.println("square perimeter = "+s.perimeter());

        Rectangle r = new Rectangle(4,5);
        System.out.println("Rectangle area = "+r.area());
        System.out.println("Rectangle perimeter = "+r.perimeter());

        Triangle t = new Triangle(3,5,7);
        System.out.println("Triangle area = "+t.area());
        System.out.println("Triangle perimeter = "+t.perimeter());

        Polygon p = new Rectangle(3,6);
        System.out.println("area = "+p.area());
        System.out.println("perimeter = "+p.perimeter());


        MercedesCls63 m = new MercedesCls63(2000000,false,"Mercedes-Benz");
        System.out.println("brend = " + m.brend);
        System.out.println("Enginge = "+ m.Engine());
        System.out.println("price = "+m.price()+"$");

        SmartPhone sm = new SmartPhone(500000,"WiFi",true);
        System.out.println("price in SmartPhone = "+ sm.gin()+"$");
        System.out.println("connected in = "+sm.connect());
        System.out.println("the smartphone = "+sm.powerOnOff());

    }
}
