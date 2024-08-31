package section4_1.StringBuilderVsString;

public class BuilderVsString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sbr=new StringBuilder("Teste de Imutabilidade");
		String str="Teste de Imutabilidade";
		
		System.out.println("Endereço da StringBuilder: "+sbr.hashCode());
		System.out.println("Endereço da Sring: "+str.hashCode());
		
		sbr.replace(0, sbr.length(), "Hello Word");
		str="Hello Word";
		
		System.out.println("Endereço da StringBuilder: "+sbr.hashCode());
		System.out.println("Endereço da Sring: "+str.hashCode());
		
	}	

}
