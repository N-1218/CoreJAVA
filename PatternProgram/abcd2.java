package PatternProgram;

public class abcd2 {
   public static void main(String[] args) {
		int row=5;
		for(int i=1;i<=row;i++) {
			char ch='A';
			for(int j=1;j<=row;j++) {
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}

	}
}
