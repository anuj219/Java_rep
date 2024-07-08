import java.util.Scanner;
public class inout {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String s = sc.nextLine();		//String in in built class
		System.out.println("You entered : " + s);
		System.out.println(s.toUpperCase());
		System.out.println(s);
		//s = s.replace(s, "yellow");   //(target , replacement)
		System.out.println(s);
		System.out.println(s.contains("a"));  //returns Boolean
		System.out.println(s.compareTo(s));
		
		
		
	}
}
