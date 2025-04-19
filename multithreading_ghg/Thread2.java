//Threads using runnable interface -> create the user-defined thread class(Thread2) -> Then create the object of that class. -> Then create the object of Thread class ->  and then the the object of user-defined class in the constructor of Thread class. 
public class Thread2 implements Runnable{
    public void run(){
        for(int  i=0;i<7;i++){
            System.out.println(Thread.currentThread().getName()+" th2 => "+i);
        }
    }
}
//It is preferred that create the thread using runnable interface.
