public class Main {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        t1.start(); //start method is used to confirm the jvm that the given thread is ready for creation.


        Thread2 t2 = new Thread2();

        Thread t = new Thread(t2);
        t.start();

        for(int i=0;i<3;i++){
            System.out.println(Thread.currentThread().getName()+ " mn -> " +i); //This will give the main thread.
        }
    }
}
//So the Threads(main thread & user defined thread) will print in random order.
