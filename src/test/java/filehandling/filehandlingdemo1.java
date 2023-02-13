package filehandling;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

public class filehandlingdemo1 {

	@Test(groups={"smoke"})
	public void file() throws IOException {
		// TODO Auto-generated method stub

		
		File f= new File("./abc.txt");
		
		f.createNewFile();
		
		System.out.println("Status of the file:"+f.exists());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
