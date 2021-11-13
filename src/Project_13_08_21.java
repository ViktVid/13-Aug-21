
public class Project_13_08_21 {

	public static void main(String[] args) {

		int broj = 10;
		boolean b1 = broj >= 9;
		System.out.println("b1: " + b1);
		
		//			  012
		String txt = "ABC";
		char c = txt.charAt(1);
		System.out.println("c: " + c);
		
		String txt2 = "FGH";
		String s1 = txt.concat(txt2);		// s1 = txt + txt2;
		System.out.println("s1: " + s1);
		
		b1 = txt.isEmpty();
		System.out.println("b1: " + b1);

		//b1 = txt.isBlank();
		//b1 = txt.isBlank();
		
			txt = " ";
			b1 = txt.isEmpty();
			System.out.println("b1: " + b1);
			System.out.println("length: " + txt.length());
				
		txt2 = "BC";
		b1 = txt.contains(txt2);
		System.out.println("b1: " + b1); 

	/*	txt2 = txt.replace("AB", "BD");
		System.out.println("txt2: " + txt2); 

		txt2 = "AB AC AD AG";
		txt2 = txt.replaceAll("A", "X");
		System.out.println("txt2: " + txt2); 

		txt2 = "AB AC AD AG";
		txt2 = txt.substring(7, 9);
		System.out.println("txt2: " + txt2);
		
		txt2 = "AB AC AD AG";
		
		System.out.println("txt.length= " + txt.length());
		int t = txt.length()-1;
		txt2 = txt.substring("A", "X");
		System.out.println("txt2: " + txt2);	*/

		txt = "A,B,C,D";
		txt.split(",");
		System.out.println("txt: " + txt);
		
		
		System.out.println("txt.length= " + txt.length());
		int t = txt.length();
		txt2 = txt.substring(4, t);
		System.out.println("txt2: " + txt.substring(4, t));
		
		
		
		
		
	}

}
