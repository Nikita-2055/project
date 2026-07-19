public class MercedesCls63 implements Car,Product{
    String brend;
    Double price;
    Boolean EngineRunning;

    public MercedesCls63(double price,boolean t,String s){
        EngineRunning = t;
        this.price = price;
        brend = s;
    }

    public String Engine(){
        if(EngineRunning){
            return "start";
        }else{
            return "stop";
        }
    }

    public double price(){
        return price/378;

    }
    public String brend(){
        return brend;
    }



}
