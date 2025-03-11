import java.util.*;
public class DAY12_Q4 {
    public static void main(String[] args) {
        Runnable r1=()->{
            try {
                for (int i = 1; i <= 10; i++) {
                    System.out.println("Num is" + i);
                    Thread.sleep(500);

                }
            }catch (InterruptedException ie){
                ie.printStackTrace();
            }
        };
        Thread t1=new Thread(r1);
        t1.start();
        Runnable r2=()->{
            try{
                for(int i=10;i>=1;i--){
                    System.out.println("Num reverse is "+i);
                    Thread.sleep(200);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        Thread t2=new Thread(r2);
        t2.start();


    }
}
