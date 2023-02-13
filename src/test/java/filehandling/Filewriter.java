package filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.testng.annotations.Test;

public class Filewriter {

	@Test
	public void filecreation() throws IOException {
		// TODO Auto-generated method stub

		
		File f =new File("/.abc.txt");
		
		
		String data="File handling with DC is simple";
		
		FileWriter fw= new FileWriter(f);
		
		fw.write(data);
		
		fw.close();
		
		
		
		
	}

}
