package externalPackage;

import java.util.Random;

public class ExternalLibrary {
	public char[] charArray(String str){
		return str.toCharArray();
	}
	public double getRandomDouble(){
		Random random=new Random();
		return random.nextDouble();
	}
}
