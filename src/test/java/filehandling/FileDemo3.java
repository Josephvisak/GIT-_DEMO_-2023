package filehandling;

import java.io.File;
import java.io.IOException;

public class FileDemo3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		
		
		  File f= new File("./pqr.txt");
		  
		  
		  
		  f.createNewFile();
		  
		  System.out.println(f.exists());
		 
		
		
		
		File folder= new File("folder2");
		//File f = new File("folder2","pqr.txt");
		
		folder.mkdir();
		
		System.out.println("Status of the folder:"+folder.exists());
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
