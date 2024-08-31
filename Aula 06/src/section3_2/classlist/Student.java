package section3_2.classlist;

import java.util.ArrayList;
import java.util.Collections;

public class Student {
	

	public static void main(String[] args) {
		
		ArrayList<String> studentsName = new ArrayList<>();
		
		addStudents(studentsName);
	}
	
	private static void addStudents(ArrayList<String> studentNames) {
		
		studentNames.add("Carlos");
		studentNames.add("Henrique");
		studentNames.add("Marco");
		Collections.sort(studentNames);
	}
	
private static void displayStudents(ArrayList<String> studentNames) {
		
		for(String arrTemp:studentNames) {
			
			System.out.println("Nome do Estudnate: "+arrTemp);
		};
}
}
