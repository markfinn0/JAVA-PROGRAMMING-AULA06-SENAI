package section3_2.queueexample;

import java.util.LinkedList;

public class LettersQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>lettersq=new LinkedList<>();
		
		
		lettersq.add("A");
		
		lettersq.add("B");
		lettersq.add("C");
		lettersq.add("D");
		lettersq.add("E");
		lettersq.add("F");
		
		System.out.println("Linked List: "+ lettersq);
		System.out.println("Tamanho da fila: "+ lettersq.size());
		lettersq.remove();
		System.out.println("Linked List: "+ lettersq);
		System.out.println("Tamanho da fila: "+ lettersq.size());
	}

}
