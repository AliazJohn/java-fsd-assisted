import java.util.*;
public class EmailValidation {
	//check() Method to check if the email id is present in the array list
	public static void check(String email, ArrayList<String> list ) {
		if(list.contains(email)==false)
			System.out.println(email +" is not in the list");
		else
			System.out.println(email +" is in the list");
		}
	//Main function 
	//list of email id has declared
	//input from user is taken
	//check() function is called
	
	public static void main(String[] args) {
		ArrayList<String> list= new ArrayList<String>();
		list.add("apple517@gmail.com");
		list.add("nana@ymail.com");
		list.add("harry@ymail.com");
		
		
		System.out.println("Enter an email id:");
		Scanner sc = new Scanner(System.in);
		String email=sc.nextLine();
		check(email,list);
	}
}
