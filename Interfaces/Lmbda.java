package Interfaces;
public class Lmbda {
    public static void main(String[] args) {
		Animal ani=(a,b)->{System.out.println(a+b);};
			
		
		ani.sound(1,2);

	}

}

interface Animal{
	void sound(int a,int b);
}




