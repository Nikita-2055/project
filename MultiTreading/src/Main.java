public class Main {
    public static void main(String argv[]) throws InterruptedException {
        ImHosq mek = new ImHosq("one");
        ImHosq erku = new ImHosq("two");
        ImHosq ereq = new ImHosq("three");
        ImHosq chors = new ImHosq("four");
        ImHosq hing = new ImHosq("five");


        for(int i=0; i<10; i++){
            System.out.println("i="+i + " :"+ Thread.currentThread().getName());
            Thread.sleep(1000);
        }


    }
}
