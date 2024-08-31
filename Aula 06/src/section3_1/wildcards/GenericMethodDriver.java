package section3_1.wildcards;
import java.util.ArrayList;

public class GenericMethodDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] stringArray= {"Este","é","uma","matriz"};
		Integer[] intArray= {1,2,3,4};
		
		GenericMethodClass gmc=new GenericMethodClass();
		gmc.printArray(stringArray);
		gmc.printArray(intArray);
		
		
		ArrayList<Double>array1=new ArrayList<>();
		
		array1.add(25.84);
		array1.add(34.58);
		array1.add(89.58);
		array1.add(95.41);
		gmc.printArrayList(array1);
		
		gmc.displayArrayList(array1);
		
		System.out.println(gmc.sumArrayList(array1));
		
	}

}
