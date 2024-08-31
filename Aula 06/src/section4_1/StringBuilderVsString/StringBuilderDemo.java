package section4_1.StringBuilderVsString;

public class StringBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sbr=new StringBuilder("Aprendendo Java com a Oracle");
		
		System.out.println(sbr);
		System.out.println(sbr.reverse());
		sbr.reverse();
		System.out.println(sbr);
		sbr.append(" é legal");
		System.out.println(sbr);
		
		sbr.delete(10,15);
		System.out.println(sbr);
		
		sbr.insert(0,"Testando ");
		System.out.println(sbr);
		
		System.out.println(sbr.indexOf(" ",5));
		
		String str ="10";
		Integer.parseInt(str);
		System.out.println(str+3);
		
		
		StringBuilder str2 =new StringBuilder("10");
		int str1=Integer.parseInt(str2.toString());
		System.out.println(str1+3);
	}

}
