package StringPrograms;

public class StringExampleProgram {

	
	public String doubleChar(String str) {
		String resultString="";
		for(int i=0;i<str.length();i++) {
			String eachCharacter=String.valueOf(str.charAt(i));
			resultString+=eachCharacter.concat(eachCharacter);
		}
		return resultString;
	}
	public static void main(String[] args) {
		StringExampleProgram p=new StringExampleProgram();
		System.out.println(p.doubleChar("Hello"));
		
		
		int a=10;//primitive data type
		Integer c=Integer.valueOf(a);//autoboxing
		Integer b=30;
//		Integer b=Integer.valueOf(30);
	}
}
