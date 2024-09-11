package _3Dec_2023;

import java.util.HashMap;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Businesse_Name_Genrator {

	public static void main(String[] args) {
		
		HashMap<Double, String> obj1=new HashMap();
		obj1.put(1.0, "Crazy");
		obj1.put(2.0,"Amazing");
		obj1.put(3.0,"Wonder");
		
		HashMap<Double, String> obj2=new HashMap();
		obj2.put(1.0, "Engine");
		obj2.put(2.0,"Foods");
		obj2.put(3.0,"Garments");
		
		HashMap<Double, String> obj3=new HashMap();
		obj3.put(1.0, "Limited");
		obj3.put(2.0,"Services");
		obj3.put(3.0,"Hub");
		
		String name = genrateNameMethod(obj1, obj2, obj3);
	
		System.out.println(name);
		
		
	
	
	
	
	
	
		
	}
	public static double getRandomKey()
	{
		double key=(Math.floor(Math.random()*3)+1);
		return key;
	}
	
	public static String genrateNameMethod(HashMap<Double, String> obj1,	HashMap<Double, String> obj2,HashMap<Double, String> obj3)
	{
		double key1 = getRandomKey();
		double key2 = getRandomKey();
		double key3 = getRandomKey();
		
		String name = obj1.get(key1) + " " +obj2.get(key2) +" "+ obj3.get(key3);
		return name;
	}
}
