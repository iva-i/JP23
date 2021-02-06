module zzproba {
	requires java.desktop;
	requires com.google.gson;
	opens firebase.trgovina to com.google.gson;
}