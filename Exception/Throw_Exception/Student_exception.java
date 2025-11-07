package Exception.Throw_Exception;

public class Student_exception {
    
	public static void main(String[] args) {
		float mark=8;
		try {
			if(mark<35) {
				throw new Exception("you are failed!");
			}else {
				System.out.println("you are Pass for next exam!");
			}
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}finally {
			System.out.println("program end!");
		}

	}

}

}
