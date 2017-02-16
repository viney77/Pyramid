package primenumber;

import java.io.File;
import java.io.IOException;

public class TestFile {

	public static void main(String[] args) {
		File f = new File("C:\\Temp\\1.txt");
		System.out.println(f.getAbsolutePath());
        try {
			if(!f.exists()){
				f.createNewFile();
				System.out.println("File Created");
			}else{
				System.out.println("File Already Exists");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
			
		}
	}


