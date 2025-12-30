public class Lensorting {
    public static void main(String[]args){
List<String>list=Arrays.asList("Javascript","java","Springbot");
		
		list.stream()
		.sorted(Length::len)
		.forEach(System.out::println);

	}

}
class Length{
	public static int len(String a,String b) {
		return a.length()-b.length();
	}
}
