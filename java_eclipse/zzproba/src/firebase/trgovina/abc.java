package firebase.trgovina;

import com.google.gson.Gson;

public class abc {
	
	public static void main(String[] args) {
		
		Gson gson = new Gson();
		
//		System.out.println(gson.toJson(1));
		
		int[] arr = {1,2,3};
//		
		System.out.println(gson.toJson(arr));
		
		Objekt obj = new Objekt();
		
		String json = gson.toJson(obj);
		
		System.out.println(json);
		
				
		
		
		
		
	}

}
