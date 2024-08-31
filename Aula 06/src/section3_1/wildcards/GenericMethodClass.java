package section3_1.wildcards;import java.util.ArrayList;


public class GenericMethodClass {
	
	public <T> void printArray(T[]array) {
	
		for(T arrTemp: array) {
			System.out.print(arrTemp+" ");
		}
		System.out.println();
		
	}
	
	public <T> void printArrayList(ArrayList<T> arrayList) {
		
		for(T arrTemp: arrayList) {
			System.out.print(arrTemp+" ");
		}
		System.out.println();
		
	}
	

public void displayArrayList(ArrayList<?> arrayList) {
		
		for(Object arrTemp: arrayList) {
			System.out.print(arrTemp+" ");
		}
		System.out.println();
		
	}
	


public double sumArrayList(ArrayList<?> arrayList) {
	
		double sum=0.0;
				
		for(Object arrTemp: arrayList) {
			sum+=(double)arrTemp;
		}
return sum;
	}



public double sumArrayListSuperior(ArrayList<? extends Number> arrayList) {
	
	double sum=0.0;
			
	for(Number arrTemp: arrayList) {
		sum+=arrTemp.doubleValue();
	}
	return sum;
}


public void addNumbers(ArrayList<? super Integer> arrayList) {
	
	double sum=0.0;
			
	for(int i=0;i<10;i++) {
		arrayList.add(i);
	}
	
}

}
