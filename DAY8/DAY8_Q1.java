import java.util.ArrayList;
import java.util.Scanner;
public class DAY8_Q1
{
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        System.out.println("list size is"+list.size());
        list.add(100);
        list.add("Hello ");
        list.add(34900.20);
        list.add(true);
        list.add(k);
        System.out.println(list);
        System.out.println("list size is"+list.size());
        list.add(100);
        list.add("Hello");
        System.out.println(list);
        System.out.println("list size is"+list.size();
        System.out.println("find element at 4th position is +list.get(4");

        );
        System.out.println("list is");
        for(int i=0;i<list.size();i++){
            System.out.println("element is"+list.get(i));
        }
        if(list.contains("hello")){
            list.set(1,"hi");
        }
        System.out.println("after update lis is"+list);
        list.remove("hi");

        System.out.println("after remove lis is"+list);
    }
}