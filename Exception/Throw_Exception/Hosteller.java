package Exception.Throw_Exception;

public class Hosteller {
    public static void main(String[] args) {
		final String name="hosteller";
		try {
			String name1="not";
			if(name!=name1) {
				throw new Exception("you are not enter in hostel!");
			}else{
				System.out.println("entered!");
			}
		}catch(Throwable e){
			System.out.println(e.getMessage());
		}finally {
			System.out.println("program end!");
		}

	}

}

