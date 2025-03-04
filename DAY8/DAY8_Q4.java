import java.util.*;
class DAY8_Q4{
public String name;
private int age;

public DAY8_Q4(String name,int age){
    this.name=name;
    this.age=age;
}
public String toString(){
    return this.name+" "+this.age;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextByte();
        DAY8_Q4 obj = new DAY8_Q4(name, age);
        System.out.println(obj.toString());
        sc.close();
    }
    }