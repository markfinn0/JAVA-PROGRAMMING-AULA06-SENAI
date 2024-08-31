package section3_2.hashsetexample.hashmapexample;
import java.util.HashMap;
public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,String>fruitBowl=new HashMap<>();
		
		fruitBowl.put("Maça","Verde");
		fruitBowl.put("Cereja","Vermelha");
		fruitBowl.put("Laranja","Laranja");
		fruitBowl.put("Banana","Amarela");

		System.out.println(fruitBowl);
		
		
//		for (String arrTemp:fruitBowl.keySet()) {
//			System.out.println(arrTemp+": "+fruitBowl.get(arrTemp))
//		}
		
		for (HashMap.Entry<String,String>arrTemp:fruitBowl.entrySet()) {
			System.out.println(arrTemp.getKey()+": "+arrTemp.getValue());
		}
		
		findElement(fruitBowl,"Banana");
		
	}
	
	
	private static void findElement(HashMap<String,String>fruitBowl,String fruit) {
		
		if(fruitBowl.containsKey(fruit)) {
			System.out.println("A "+ fruit+" é "+fruitBowl.get(fruit)+".");
		}else {
			
			System.out.println("Não há "+fruit+"s na cesta.");
		}
		
	}
	
}
