import java.util.*;
public class DAY12_Q1 {
    public static void main(String[] args) {
        Thread currentThread=Thread.currentThread();
        System.out.println("currentThread name is "+currentThread.getName());
        System.out.println("currentThread id is "+currentThread.getId());
        System.out.println("currentThread priority is"+currentThread.getPriority());
        System.out.println("current thread group is"+currentThread.getThreadGroup().getName());

    }



}
