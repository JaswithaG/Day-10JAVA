import java.util.*;
class A{
    int c;
    String b;
    A(int c,String b){
        this.c=c;
        this.b=b;
    }
    void display(){
        System.out.println(b+" "+c);
    }
}
public class parameterisedconstructor{
    public static void main(String[]args){
        A s=new A(18,"Jashwitha");
        s.display();
    }
}