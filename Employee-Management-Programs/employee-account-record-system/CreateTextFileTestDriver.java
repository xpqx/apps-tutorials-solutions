package deitel.ch17;

public class CreateTextFileTestDriver {
	public static void main(String[] args) {
		
		CreateTextFile application = new CreateTextFile();
		
		application.openFile();
		application.addRecord();
		application.closeFile();
	}

}
