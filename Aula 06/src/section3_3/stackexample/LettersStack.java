package section3_3.stackexample;

import java.util.Stack;

public class LettersStack {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String>lettersSTK=new Stack<>();
		
		
		lettersSTK.push("A");
		
		lettersSTK.push("B");
		lettersSTK.push("C");
		lettersSTK.push("D");
		lettersSTK.push("E");
		lettersSTK.push("F");
		
		System.out.println("Linked List: "+ lettersSTK);
		System.out.println("Tamanho da fila: "+ lettersSTK.size());
		lettersSTK.pop();
		System.out.println("Linked List: "+ lettersSTK);
		System.out.println("Tamanho da fila: "+ lettersSTK.size());
		
	}
}
