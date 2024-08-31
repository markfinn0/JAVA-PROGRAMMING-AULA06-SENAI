package section3_3;
import java.util.ArrayList;
import java.util.Collections;
public class StudentDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student stu1=new Student("Marcus","Vinicius",100);
		Student stu2=new Student("Mark","Musk",95);
		Student stu3=new Student("Beth","Tween",78);
		Student stu4=new Student("Andrew","Apic",45);
		
		
		//System.out.println(stu1.toString());
		
		ArrayList<Student>lista= new ArrayList<>();
		
		lista.add(stu1);
		lista.add(stu2);
		lista.add(stu3);
		lista.add(stu4);
		
		displayLista(lista);
		
		Collections.sort(lista);
		
		System.out.println("TESTE DEPOIS");
		
		displayLista(lista);
		
		//System.out.println(stu1);
		
		String str1 ="Carlos";
		String str2 ="Eduardo";
		//System.out.println(str1.compareTo(str2));
		
		
	}
	public static void displayLista(ArrayList<Student>lista) {
		for (Student arrTemp:lista) {
			System.out.println(arrTemp);
		}
	}

}
