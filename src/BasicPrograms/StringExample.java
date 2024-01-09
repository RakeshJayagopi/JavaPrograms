package BasicPrograms;

public class StringExample {
	public static void main(String args[]) {
		String s="ocean academy";
//		String a;
//		a="ocean";
//		System.out.println(a);
//		System.out.println(s);
//		System.out.println(s.charAt(3));
//		System.out.println(s.length();
//		System.out.println(s.equalsIgnoreCase(a));
//		for(int i=0;i<s.length();i++) {
//			System.out.println(s.charAt(i));
//		}
		System.out.println(s.substring(0,5));
		int i=0;
		while(i<s.length()) {
			System.out.println(s.charAt(i));
			i++;
		}	
	}
}
