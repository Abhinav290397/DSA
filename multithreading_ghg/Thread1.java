//user defined thread.
public class Thread1 extends Thread{   
    public void run(){ //run method is used to write the code/logic which we want to execute when thread is running.
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+" th1 "+i);
        }
    }
}
