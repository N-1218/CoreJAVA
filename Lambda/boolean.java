package Lambda;

public class boolean {
    
public static void main(String[] args) {
		//1
       Check<Integer>check=(a,b)->{return a.equals(b); }; 
       System.out.println(" equals or not : "+check.test(1, 10));
       //2
       Check <String>check2=(a,b)->{return a.equals(b);};
       System.out.println("String eqauls or not :  "+check2.test("java", "java"));
       //3
       Check <String>check3=(v,w)->{return v.charAt(0)==w.charAt(0);};
       
       System.out.println("first letter are same : "+check3.test("java", "javscript"));
       
	//4
	Check <Integer>check4=(y,z)->{return y>=z;};
		System.out.println("grater value : "+check4.test(122, 100));
		
	}
}
@FunctionalInterface
interface Check<T> {
    boolean test(T t1, T t2);
}

