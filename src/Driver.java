
public class Driver {

	public static void main(String[] args) {
		new Driver();
	}
	
	public Driver(){
		System.out.println("Hello World!");
		
		Display("This is Dog.");
	}

	public void Display(String sentence){
		System.out.println(sentence);
	}
}
