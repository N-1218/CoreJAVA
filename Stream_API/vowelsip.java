package stream_API;

public class vowelsip {
    public static void main(String[] args) {
		String input ="Hello World";
		String vowels="AEIOUaeiou";
		
		StringBuffer re=new StringBuffer();
		
		for(char ch:input.toCharArray()) {
			if(vowels.indexOf(ch)==-1) {
				re.append(ch);
			}
		}
		System.out.println(re);
	}

}
