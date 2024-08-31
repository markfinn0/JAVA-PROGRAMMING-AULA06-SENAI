package section4_2.regularexpression;
import java.util.Scanner;
public class RegularExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		String resposta="não";
		Scanner sc = new Scanner(System.in);
		
		if(getResposta(resposta)) 
		{
			System.out.println("Essa é uma resposta válida");
			
		}else {
			
			System.out.println("Essa não é uma resposta válida");
		}
		
		System.out.println("Digite uma palavra que rima com mar.");
				String palavra=sc.next();
		if(rhymniWord(palavra)) {
			System.out.println(palavra+" rima com mar.");
			}else {
				
				System.out.println(palavra+" Não rima com mar");
			}
		
		
		System.out.println("Digite uma data.");
		String data=sc.next();
if(getData(data)) {
	System.out.println(data+" A data está correta");
	}else {
		
		System.out.println(data+" A data não está no padrão correto.");
	}

		
		
		
	}
	public static boolean getResposta(String animal){
		
		return animal.matches("[Ss]im|[Nn]ão");
	}
	
	public static boolean rhymniWord(String palavra) {
		
		return palavra.matches("[a-z|A-Z]*(ar|AR)");
	}
	
public static boolean getData(String data) {
		
		return data.matches("[0-9]{2}/[0-9]{2}/[0-9]{4}");
	}
	
}
