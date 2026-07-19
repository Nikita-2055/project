public class MainBank {
  /*  public static void printResult(String name, ATM atm,BankUser user){
        if(atm.Flag()){
            System.out.println(name + "  you out = "+atm.getOut()+" in your balance left = "+atm.getMoney());
        }else{
            System.out.println("you can not out:");
        }
    }
   */
    public static void main(String argv[]) throws InterruptedException {
        //ենթադրենք նախնական ունես 5000 բայց զուգահեռ աշխատանքի հաշվին
        // ստացվել է հանել ավելի շատ քան 5000֊ը
        int x = 200;
        BankUser user = new BankUser(5000);
        ATM a = new ATM(user,1000);
        ATM a1 = new ATM(user,900);
        ATM a2 = new ATM(user,900);
        ATM a3 = new ATM(user,900);
        ATM a4 = new ATM(user,1500);
        ATM a5 = new ATM(user,1500);
        System.out.println(x);
        //System.out.println(a.isAlive());
        a.join();
        a1.join();
        a2.join();
        a3.join();
        a4.join();
        a5.join();
        System.out.println(a.isAlive());

        System.out.println("you out = "+user.getCashout()+" in your balance left = "+user.getMoney());

        /*printResult("ATM",a,user);
        printResult("ATM1",a1,user);
        printResult("ATM2",a2,user);
        printResult("ATM3",a3,user);
        printResult("ATM4",a4,user);
         */
    }
}
