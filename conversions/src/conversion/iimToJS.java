package conversion;

import java.util.Scanner;

public class iimToJS {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Name of var: ");
		String macro = in.next();

	    System.out.printf("Please specify how many lines you want to enter: ");        
	    String[] input = new String[in.nextInt()];
	    in.nextLine(); //consuming the <enter> from input above

	    for (int i = 0; i < input.length; i++) {
	        input[i] = in.nextLine();
	    }

	    in.close();
	    
	    System.out.println("\nvar " + macro + ";\n");
	    System.out.println(macro + " = \"CODE:\"");
	    
	    for (String s : input) {
	        System.out.println(macro + " += \"" + s + "\" + \"\\n\";");
	        }
	    System.out.println("iimPlay(" + macro + ");");
	    }
		
	}