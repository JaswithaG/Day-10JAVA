import java.util.*;
public class thiskeywordtwo{
    void display(){
        System.out.println("Hello Jashwitha");
    }
    void dis1(){
        this.display();
    }
    public static void main(String[]args){
        thiskeywordtwo o=new thiskeywordtwo();
        o.dis1();
    }
}