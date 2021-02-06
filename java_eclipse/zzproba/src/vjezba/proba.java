package vjezba;

import com.google.gson.Gson;

public class proba {

	//ime, prezime, 5 brojeva u nizu, godina rođenja (int)
	//spremit na disk, učitat i isprintat
	
	public static void main(String[] args) {
		
		Objekt obj = new Objekt("Iva", "Ivezic", 1995);
		
		String json = createJson(obj);
		printGson(json);
		
	}
	
	public static String createJson(Objekt obj) {
		
		return new Gson().toJson(obj);		
		
	}
	
	public static void printGson(String json) {
		
		System.out.println(json);
	}

}	
