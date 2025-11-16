package PatternProgram;

public class abcd3 {
    public static void main(String[] args) {
		int n=5;
		for(int i=n;i>=1;i--) {
			char ch='A';
			for(int j=n;j<=i;j++) {
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}

	}
}
