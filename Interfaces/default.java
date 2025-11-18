package Interfaces;

public class default {
    public static void main(String []args){
        inter in=new java();
       in.interface();
       in.default();
       in.d();
    }
}
interface java{
    public void interfaces();
    public static void default(){
        System.out.println("static method");
    }
    default void d(){
        System.out.println("in default method..!");
    }
}
class inter implements java{
    public void interfaces(){
        System.out.println("ab method");
    }
}
