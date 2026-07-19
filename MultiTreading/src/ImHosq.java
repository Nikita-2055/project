public class ImHosq extends Thread{

    public  ImHosq(String s){
        super(s); // threadin anun enq talis
        start();//avtomat kanchum e run function
    }


    public void run(){
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("i=" + i + " :" + Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        }catch(InterruptedException x){}
    }
}
