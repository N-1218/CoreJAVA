package PatternProgram;

public class abcd {
    public static void main(String[] args) {
		int rows=5;
		char alpha='A';
		for( int i=1;i<=rows;i++) {
			for(int j=1;j<=rows;j++) {
				System.out.print(alpha+" ");
			}
			alpha++;
			System.out.println();
		}

	}
}
