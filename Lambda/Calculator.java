package Lambda;

public class Calculator {
    public static void main(String[] args) {
		//1
		Calculator<Integer> Cal=(a,b)-> {return a+b;};
		System.out.println("Addition  is : "+Cal.Calculate(20, 89));
		//2
		Calculator <Double> Cal2=(a,b)->{return a-b;};
		System.out.println("Substraction is : "+Cal2.Calculate(78.0, 77.0));
		
		//3
		Calculator<Float>Cal3=(a,b)->{return a/b;};
		System.out.println("Dividation is : "+Cal3.Calculate(34f, 44f));
		
		//4
		Calculator<Integer>Cal4=(a,b)->{return a*b;};
		System.out.println("Muliplication is : "+Cal4.Calculate(44, 33));
		
		

  }
}
@FunctionalInterface
interface Calculator <T>{
	 T Calculate(T t1,T t2);
}


