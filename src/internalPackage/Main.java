package internalPackage;

import java.util.List;
import java.util.Map;
import externalPackage.ExternalLibrary;
import util.Service;
import util.ServiceImpl;

public class Main {
	public static void main(String[] args) {
		ExternalLibrary el = new ExternalLibrary();
		Service service= new ServiceImpl();
		char[] temp=el.charArray("abcd");
		System.out.print("char배열: ");
		for(char i:temp){
			System.out.print(i);
		}
		System.out.println();
		List<String> list =service.convertToList(temp);
		System.out.println("char배열 -> list: "+list);
		Map<Integer,String> map=service.converToMap(list);
		System.out.println("list -> map: "+ map);
		System.out.println("map -> list: "+service.converToList(map));
		System.out.println();
		double temp2=el.getRandomDouble();
		System.out.println("랜덤 double 수: "+temp2);
		System.out.println("소수점 둘째자리까지 자른 수: "+service.decimalFormat(temp2));
	}
}
