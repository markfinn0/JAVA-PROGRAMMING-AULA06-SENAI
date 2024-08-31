package section4_1;
import java.util.ArrayList;
public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Um texto qualquer";
		
		//String str1=str.replace(" ", "");
		
		
		//System.out.println(str1);
		
		ArrayList<String> list=new ArrayList<>();
		String[] lista=str.split(" ");
		
		
		for (String arrTemp:lista) {
			System.out.println(arrTemp);
		}
		
		//parseString(str);
		
		//String str1=str.substring(0,2);
		//String str2=str.substring(3,8);
		
		//System.out.printf(str1+str2);
		
		//for (int i=str.length()-1;i>=0;i--) {
			
		//System.out.println(str.charAt(i));
			
		//}
		
		//int count=0;
		//for(int i=0;i<str.length();i++) {
		//if (str.charAt(i)=='u') {
		//	count++;
		//}
		//}
		
		//searchChar(str,'a');
	}
	
	public static void searchChar(String str,char c) {
		int count=0;
		for(int i=0;i<str.length();i++) {
			if (str.charAt(i)=='u') {
				count++;
			}
		}
		System.out.println("Quantidade "+ count);
		
	}
	
	public static void parseString(String str) {
		ArrayList<String> lista = new ArrayList();
		int index = str.indexOf(" ");
		if(index>-1) {
			lista.add(str.substring(0,index));
			str=str.substring(index +1);
			
		}
		
		
		
	}

}
