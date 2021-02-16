package IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.google.gson.Gson;
import trgovina.Proizvod;

public class IOProizvod {
	
	//TODO preimenovat klasu
	  
	static File fileProizvodi;
	private static Gson gson;

	public IOProizvod() {
		
		
		
		
		
		
	}
	
	public static void initialize() {

		gson = new Gson();
		
		fileProizvodi = new File("proizvodi.json");
		
		if(!fileProizvodi.exists()) {
			try {
				fileProizvodi.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		ucitajProizvode();
		
	}
	
	public static void ucitajProizvode() {

		List<Proizvod> listaProizvodi = new ArrayList<>();

		try {
			Scanner reader = new Scanner(fileProizvodi);
			while(reader.hasNextLine()){
				listaProizvodi.add(gson.fromJson(reader.nextLine(),Proizvod.class));
			}
			//TODO koristiti settere
			trgovina.Start.setProizvodi(listaProizvodi);
		}catch (FileNotFoundException e){
			e.printStackTrace();
			System.exit(1);
		}
		
	}
	
	public static void spremiProizvode(List<trgovina.Proizvod> proizvodi) {
		try {
			FileWriter fileWriter = new FileWriter(fileProizvodi);
			for(Proizvod proizvod : proizvodi){
				fileWriter.write(gson.toJson(proizvod));
				fileWriter.write("\n");
			}
			fileWriter.close();
		}catch (IOException e){
			e.printStackTrace();
		}
		
	}
	
	
	

}
