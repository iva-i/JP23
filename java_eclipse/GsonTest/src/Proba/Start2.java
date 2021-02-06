package Proba;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.sun.jdi.Value;

public class Start2 {
	
	public static void main(String[] args) throws IOException {
		
		File myFile = new File("brojevi.txt");
		
		myFile.createNewFile();
		
		FileWriter fileWriter = new FileWriter(myFile);
		
		for(int i = 1; i<=100; i++) {
			fileWriter.write(String.valueOf(i));
			fileWriter.write("\n");
		}
		
		FileReader reader = new FileReader(myFile);
		
		fileWriter.close();
		
		printFile(myFile);
		
		System.out.println(myFile.length());
		
	}
	
	public static void printFile(File file) throws FileNotFoundException {
        Scanner input = new Scanner(file);
        while (input.hasNextLine())    {
            String line = input.nextLine();    
            if (Integer.valueOf(line) %  2 == 0) {
                System.out.print(line);
            }
        }
        
    } 
}
