package FileHandling;

import java.io.File;
import java.io.IOException;

public class Filedemo1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		File f =new File("./abc.txt");
		
		f.createNewFile();
		
		
		System.out.println("Status of the new file:"+f.exists());
		
		
		
		
		
		
		
		
		
		
	}

}
