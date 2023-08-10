import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		password();

	}
	
	private static void password(){
		Scanner input = new Scanner(System.in);
		System.out.println("How many digits do you want?");
		int digits = input.nextInt();
		
		String lower_cases_words = "qwertyuicopasdfghjklzxcvbnm";
		String upper_cases_words = "QWERTYUIOPADSFGHJKLZXCVBNM";
		String numbers = "1234567890";  
		String special_words = "!@#$%^&";
		
		
		String password = "";
		
		for(int i =0; i< digits; i++) {
			int rand = (int) (4 * Math.random());
			switch(rand) {
				case 0:
					rand = (int) ( lower_cases_words.length()* Math.random());
					password += String.valueOf(lower_cases_words.charAt(rand)); 
					break;
				case 1:
					rand = (int) ( upper_cases_words.length()* Math.random());
					password += String.valueOf(upper_cases_words.charAt(rand)); 
					break;
				case 2:
					rand = (int)(numbers.length() * Math.random());
					password += String.valueOf(numbers.charAt(rand));
					break;
				case 3:
					rand = (int)(special_words.length() * Math.random());
					password += String.valueOf(special_words.charAt(rand));
					break;
				
			}
				
			
		}
		
		System.out.println(password);
		input.close();
	}

}
