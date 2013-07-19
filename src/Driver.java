import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		new Driver();
	}
	
	public Driver(){
		System.out.println("Hello Cat World!");
		System.out.println("Hello World!");
		String str = EnterString();
		Display("Cat invades."); 
		
		Display(str);
		Display(str.toUpperCase());
	}

	public void Display(String sentence){
		System.out.println(sentence);
	}
	
	public String EnterString(){
		Scanner s = new Scanner(System.in);
		
		return s.nextLine();
	}
}
