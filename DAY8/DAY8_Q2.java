import java.util.*;
public class DAY8_Q2
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String>fruitList=new ArrayList<>();
        for(String fruit:fruitList){
            String newfruits=sc.nextLine();
            fruitList.add(newfruits);


        }
        fruitList.add("Apple");
        fruitList.add("Banana");
        fruitList.add("Orange");
        fruitList.add("Watermelon");
        fruitList.add("Pineapple");


        for(int i=0;i<fruitList.length;i++){
            fruitList.replaceAll("apple","cherry");
            fruitList.remove("apple");
            fruitList.remove("orange");

        }
        //find out how many list in the ArrayList collection


    }
}