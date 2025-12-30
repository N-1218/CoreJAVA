package stream_API;

public class API_2 {
    
public static void main(String[] args) {
		List <String>string=List.of("namrata","abhilasha","vinayk","viraj","sahil");
		System.out.println(string);
		
		string.stream().filter((i)->{return i.startsWith("v");}).forEach((i)->{System.out.println(i.toUpperCase());});
	}

}
