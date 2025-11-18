package Abstraction;

public class anonymous {
    public static void main(String[] args) {
	java jav=new java() {
		
		@Override
		public void Interface() {
			System.out.println();
			System.out.println("Multiple Inheritance allowed! In java...");
			
		}

		@Override
		public void Class() {
			System.out.println();
			System.out.println("Multiple Inheritance Not allowed! In java...");
			
		}
	
	};
    java.Inheritance();
	jav.Interface();
	jav.Class();
	}
	
}
interface java
{
	public static void Inheritance() {
		System.out.println("//......Multiple Inheritance allowed or not......//");
	}
	void Interface();
	void Class();
}


