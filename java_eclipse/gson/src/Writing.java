import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import com.google.gson.Gson;

public class Writing {
	
	public static void main(String[] args) throws IOException {
		
		Data data = new Data("abc",2);
		
		//create file
		File myFile = new File("data.json");
		
		myFile.createNewFile();
		
		//write file
		FileWriter fileWriter = new FileWriter(myFile);
		
		fileWriter.write(new Gson().toJson(data));
		
		fileWriter.close();
		
		
		
		//read file
		Scanner reader = new Scanner(myFile);
		
		
		while(reader.hasNextLine()) {
			System.out.println(reader.nextLine());
		}
		
		reader.close();
		
		
	}
	
	

}
