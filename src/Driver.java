
public class Driver {

	public static void main(String[] args) {
		new Driver();
	}
	
	public Driver(){
		System.out.println("Hello Cat World!");
		
		Display("Cat invades.");
	}

	public void Display(String sentence){
		System.out.println(sentence);
	}
}
