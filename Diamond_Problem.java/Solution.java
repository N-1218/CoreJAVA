package Diamond_Problem.java;

public class Solution {
    public static void main(String[] args) {
			World w=new World();
			w.show();
			
		}

	}


	interface Universe1{
		default void show() {
			System.out.println("interface universe");
		}
	}
	interface galaxy1 extends Universe1{
		default void show() {
			Universe1.super.show();
			System.out.println("interface galaxy");
		}
	}
	class World implements  Universe1, galaxy1 {
		 public  void show () {
			 galaxy1.super.show();
			 System.out.println("class world");
		 }
	}

