package section3_4;

public class sortExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]numbers= {40,7,59,4,1,55,98,45,65,71};
		//displayNumbers(numbers);
		selectionSort(numbers);
		//System.out.println("Depois");
		//displayNumbers(numbers);
		binarySearch(numbers,7);
	}

	public static void displayNumbers(int [] numbers) {
		for(int arrTemp: numbers) {
			System.out.println(arrTemp);
		}
	}
	public static void selectionSort(int[] numbers) {
		int IndexMin=0;
		
		for (int i=0;i<numbers.length;i++) {
			IndexMin=i;
			for(int j=i+1;j<numbers.length;j++ ) {
				if(numbers[j]<numbers[IndexMin]) {
					IndexMin=j;
				}
			}
			int temp=numbers[i];
			numbers[i]=numbers[IndexMin];
			numbers[IndexMin]=temp;
		}
	}
	
	public static int binarySearch(int[]numbers,int target) {
		
		int IndexMin=0;
		int IndexMax=numbers.length-1;
		
		while (IndexMin<=IndexMax) {
			int IndexMid=(IndexMin+IndexMax)/2;
			
			if(numbers[IndexMid]==target) {
				
				System.out.println("O número "+numbers[IndexMid]+" está na posição "+IndexMid+" da lista.");
				return IndexMid;
			}
			else if(numbers[IndexMid]>target) {
				IndexMax=IndexMid-1;
			}
			else {
				IndexMin=IndexMid+1;
			}
			
		}
		System.out.println("O valor "+target+"Valor não está na lista");
		return -1;
	}
	
	
}
