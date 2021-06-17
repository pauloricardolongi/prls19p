package aplicacao;

import java.util.Map;
import java.util.TreeMap;

public class App01 {

	public static void main(String[] args) {
		
		Map<String, String> cookies= new TreeMap<>();
		
		cookies.put("usuario","Maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("fone","99711122");
		cookies.remove("email");
		
		System.out.println("Contain 'fone' key: "+ cookies.containsKey("fone"));		
		System.out.println("Numero Fone: "+ cookies.get("fone"));
		System.out.println("Email:" + cookies.get("email"));
		System.out.println("Size: "+ cookies.size());
		
		cookies.put("fone","99771133");
		System.out.println("ALL COOKIES:");
		for(String key : cookies.keySet()) {
			System.out.println(key + ": "+ cookies.get(key));
		}

	}

}
