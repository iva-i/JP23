package gsonTest;

import com.google.gson.Gson;

public class Start {

	public Start() {
		DataTest myData = new DataTest("foo", 1234);
		System.out.print(serialise(myData));
		
		DataTest myd = deser(serialise(myData));
		
	}
	
	public static void main(String[] args) {
		new Start();
		
	}
	
	public static String serialise(DataTest data) {
		return new Gson().toJson(data);
	}
	
	public static DataTest deser(String json) {
		return new Gson().fromJson(json, DataTest.class);
	}
}
