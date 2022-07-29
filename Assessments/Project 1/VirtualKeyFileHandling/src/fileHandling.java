import java.util.Scanner;
import java.util.Arrays;
import java.io.*;
public class fileHandling {
	public static void main(String args[]) throws IOException {
		System.out.println("VIRTUAL KEY FOR YOUR REPOSITORIES\nDeveloped by: Aliyas John");
		mainOptions();
		
		
	}
	public static void mainOptions() throws IOException
	{
		System.out.println("\n_______choose your option_______\n1. Retrieve filenames \n2. Business level operation menu \n3. Exit\n");
		try (Scanner sc = new Scanner(System.in)) {
			int choice;
			choice=sc.nextInt();
			switch(choice){
			case 1:
				retrieveFileNames();
				mainOptions();
				break;
			case 2:
				subOptions();
				mainOptions();
				break;
			case 3:
				System.out.println("Good Bye!!!");
				System.exit(0);
			default:
				System.out.println("Invalid input! Enter a valid input");
				mainOptions();
				break;
				
}
		}
	}
	public static void subOptions() throws IOException
	{
		System.out.println("\n_______choose your option_______\n1. Add a file to directory \n2. Delete a file \n3. Search a file\n4. Exit and goto main menu\n");
		try (Scanner sc = new Scanner(System.in)) {
			int choice;
			choice=sc.nextInt();
			switch(choice){
			case 1:
				addFile();
				subOptions();
				break;
			case 2:
				deleteFile();
				subOptions();
				break;
			case 3:
				searchFile();
				subOptions();
				break;
			case 4:
				mainOptions();
				break;
			default:
				System.out.println("Invalid input! Enter a valid input");
				subOptions();
				break;
}
		}
	}
	
	public static void addFile() throws IOException{
		System.out.println("Enter the filename you want to create");
		Scanner sc = new Scanner(System.in);
			String fname;
			String text;
			try {
			fname=sc.nextLine();
			File path= new File("E:\\java\\VirtualKeyProject\\VirtualKeyFileHandling\\src");
			String[] list=path.list();
			
			for(String files: list) {
				if(fname.equalsIgnoreCase(files)) {
					System.out.println("File" +fname +" already exists");
					subOptions();
					return;
				}
			}
			
			File file= new File("E:\\java\\VirtualKeyProject\\VirtualKeyFileHandling\\src\\"+fname);
			
			FileWriter  writer= new  FileWriter(file,true);
			
			System.out.println("Do you want to add any contents to the file? \n1. Yes \n2. No \n");
			int ch;
			ch=sc.nextInt();
			if(ch==1 ) {
				System.out.println("Enter the input you want add\n");
				sc.nextLine();
				text=sc.nextLine();
				//text="hey jude how yaa";
				writer.write(text);
				writer.close();
				System.out.println("File Created Successfully!");
			}
			else {
				System.out.println("File Created Successfully!");
			}
			}
			catch(IOException ioe) {
				System.out.println(ioe);
			}
			
		}
	
	public static void retrieveFileNames() throws IOException
	{	
		File path= new File("E:\\java\\VirtualKeyProject\\VirtualKeyFileHandling\\src");
		String contents[]=path.list();
		Arrays.sort(contents);
		System.out.println("The list of files are: ");
		for(int i=0;i<contents.length;i++)
			System.out.println(contents[i]);
	}
	
	public static void deleteFile() throws IOException{
		try {
		System.out.println("Enter the file name to be deleted?");
		Scanner sc = new Scanner(System.in);
			String filename;
			filename=sc.next();
			File file = new File("E:\\java\\VirtualKeyProject\\VirtualKeyFileHandling\\src\\"+filename); 
			if(file.exists()) {
				file.delete();
				System.out.println("File deleted succesfully");}
				else
					System.out.println("File not found! error!!!");
		}catch (Exception e) {
			System.out.println(e);
		}
	
}

	public static void searchFile() throws IOException{
		try {
		System.out.println("Enter the file name to be searched?");
		Scanner sc = new Scanner(System.in);
			String filename;
			filename=sc.next();
			File file = new File("E:\\java\\VirtualKeyProject\\VirtualKeyFileHandling\\src\\"+filename); 
			if(file.exists()) {
				System.out.println("The file is availabble and the contents of the files are:\n");
				FileReader reader= new FileReader(file);
				int data;
				while((data=reader.read())!=-1){
					System.out.print((char)data);
				}
				reader.close();
				}
				else
					System.out.println("File not found! error!!!");
		}catch (Exception e) {
			System.out.println(e);
		}
	
}

}