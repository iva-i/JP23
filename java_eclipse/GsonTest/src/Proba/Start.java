package Proba;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Start {

	public static void main(String[] args) throws IOException {
		
		String test = "Test";
		
		File myFile = new File("textFile.txt");
		
		myFile.createNewFile();
		
		FileWriter fileWriter = new FileWriter(myFile);
		
		fileWriter.write("abc");
		
		fileWriter.write(test);
		
		fileWriter.append('R');
		
		fileWriter.close();
		
		//*****
		Scanner reader = new Scanner(myFile);
		
		System.out.println(reader.nextLine());
		
		
		
		
		
		
		

	}

}
