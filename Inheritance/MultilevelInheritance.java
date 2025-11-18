package Inheritance;

class Animal {
    String name;

    public void speak() {
        System.out.println(name + " makes a sound.");
    }
}

class Tiger extends Animal {
    public void place() {
        System.out.println(name + " lives in the jungle.");
    }
}

class Bengal_tiger extends Tiger {
    public void type() {
        System.out.println(name + " is a Bengal Tiger.");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Bengal_tiger bt = new Bengal_tiger();
        bt.name = "Stripy";
        bt.speak();     // Inherited from Animal
        bt.place();     // Inherited from Tiger
        bt.type();      // Defined in Bengal_tiger
    }
}