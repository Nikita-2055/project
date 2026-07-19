public class ATM extends Thread{
    int money;
    BankUser a;
    public int out;
    public static boolean flag;
    public ATM(BankUser a,int out){
        this.a = a;
        this.out = out;
        start();
    }

    public void run(){
        flag = a.getMoney(out);
        money = a.money;
    }
    public static boolean Flag(){
        return flag;
    }
    /*public int getOut(){
        return out;
    }
    public int getMoney(){
        return money;
    }

     */
}


