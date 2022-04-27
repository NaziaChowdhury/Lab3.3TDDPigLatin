	import java.util.Scanner;

	public class PigLatinPrompt {
	    static PigLatin ob = new PigLatin();
	    public static void main(String[] args){
	        System.out.println("Enter a word/phrase:");
	        Scanner input = new Scanner(System.in);
	        //asking for the input from the user
	        String s=input.nextLine();
	        ob.translate(s);


	    }
	}


