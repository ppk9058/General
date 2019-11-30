package exception;

import java.io.FileWriter;
import java.io.IOException;

public class file1 {

	  public static void main(String[] args) throws IOException
	  {
	    
	           FileWriter file = new FileWriter("E:\\Data1.txt");
	           file.write("Praveen KHud ka guru");
	           file.close();
	    
	

}
}
