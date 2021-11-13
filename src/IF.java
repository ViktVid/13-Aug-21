

public class IF {

	public static void main(String[] args) {
	
		/*
		 * && - AND
		 *    - OR
		 * != - NOT
		 */
		
		int broj = 5;
		
		if(broj > 10 && broj < 100) {
			System.out.println("Uslov je zadovoljen.");
		} else {
			System.out.println("Uslov nije zadovoljen.");
		}
		System.out.println("Kraj programa."); 
		
		
		if(broj < 10 || broj > 100) {
			System.out.println("Uslov je zadovoljen.");
		} else {
			System.out.println("Uslov nije zadovoljen.");
		}
		System.out.println("Kraj programa.");
		
		if( !(broj > 2) ) {
			System.out.println("Uslov je zadovoljen.");
		} else {
			System.out.println("Uslov nije zadovoljen.");
		}
		System.out.println("Kraj programa.");
		
		boolean condition = true;
		
		 if( condition ) {
			System.out.println("Uslov je zadovoljen.");
		} else {
			System.out.println("Uslov nije zadovoljen.");
		}
		System.out.println("Kraj programa.");
		
		if( !condition ) {
			System.out.println("Uslov je zadovoljen.");
		} else {
			System.out.println("Uslov nije zadovoljen.");
		}
		System.out.println("Kraj programa.");
		
		
	}
/*
 	AND  ->  *
 0 0	-> 	0
 0 1  ->  1
 1 0  ->  1
 1 1  ->  1
	  
	 OR   -> +
	 
  0 0  ->  0
  0 1  ->  1
  1 0  ->  1
  1 1  ->  1
 */
	
	

}
