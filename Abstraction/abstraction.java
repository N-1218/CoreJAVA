package Abstraction;

public class abstraction {
    public static void main(String[]args){

    }
}
abstract class Animal{
    abstract void speak(String voice);
    abstract String whatyoueat(String eat);
} 
class Tiger extends Animal{
    public void speak(String voice){
        System.out.println("eeeeeee");
    }
}

