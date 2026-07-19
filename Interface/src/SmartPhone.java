public class SmartPhone extends Price implements Device,Connectable{
    double arjeq;
    String  miacvac;
    boolean ashxatanq;

    public SmartPhone(double a,String b,boolean c ){
        arjeq = a;
        miacvac = b;
        ashxatanq = c;
    }

    public String powerOnOff(){
        if(ashxatanq){
            return "powerOn";
        }else{
            return "powerOff";
        }
    }
    public String connect(){
        return miacvac;
    }
    public double gin(){
        return arjeq/378;
    }
}
