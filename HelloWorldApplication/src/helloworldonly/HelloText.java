package helloworldonly;

public class HelloText {
	public String messageText = "HelloWorld";
	public void printText() {
		System.out.println(messageText);
	}
	
	public int addieren (int a, int b)
	{
		int i=a+b;
		return i;
	}
	
	
	
	
	public static void main (String[] args){
		
		HelloText h = new HelloText();
		
		h.printText();
		
		HelloText german = new HelloText();
		german.messageText = "Hallo Welt";
		german.printText();
		
	
		
		System.out.println(h.addieren(1, 2));
		System.out.println(german.addieren(5, 2));
		
	}
	
}
