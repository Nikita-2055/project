public class BankUser{
    public int money;
    public int cashout=0;
    public  BankUser(int money){
        this.money = money;
    }

    public boolean  getMoney(int out){
        synchronized (this) {
            if (money >= out) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                money = money - out;
                cashout = cashout + out;
            }
            if (money > 0) {
                return true;
            }
            return false;
        }
    }
    public int getCashout(){
        return cashout;
    }
    public int getMoney(){
        return money;
    }




}
