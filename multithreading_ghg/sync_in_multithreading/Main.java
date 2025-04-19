package sync_in_multithreading;
import java.util.*;

class Brackets{
    /*synchronized*/ public void printBrackets(char open,char close){ //We can use synchronized keyword before the fn.
        synchronized(this){   //We can use synchronized block if we want to sync a particular lines of code..It takes 'this' or any object as args.
            for(int i=0;i<10;i++){
                if(i<5){
                   System.out.print(open); 
                }
                else{
                    System.out.print(close); 
                }
            }
            System.out.println();
            for(int i=0;i<10;i++){
                try {
                    Thread.sleep(250);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
public class Main {
    public static void main(String[] args)throws Exception {
        Brackets b1 = new Brackets();

        Thread t1 = new Thread(new Runnable() {
            public void run(){
                long startTime = System.currentTimeMillis();
                for(int i=0;i<5;i++){ 
                    b1.printBrackets('[', ']');
                }
                long endTime = System.currentTimeMillis();
                
                System.out.println(endTime - startTime);
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run(){
                long startTime = System.currentTimeMillis();
                for(int i=0;i<5;i++){
                    b1.printBrackets('{', '}');
                }
                long endTime = System.currentTimeMillis();

                System.out.println(endTime - startTime);
            }
        });
        t1.start();
        t2.start();
    }
}
