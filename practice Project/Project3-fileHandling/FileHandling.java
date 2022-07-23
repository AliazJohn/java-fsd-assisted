package PracticeProject;

import java.io.*; 
public class FileHandling {

	public static void writefile() throws IOException
	{
		//create file
		File file= new File("E:\\java\\phasse1-practiceproject-2\\practice-proj2\\src\\PracticeProject\\file.txt");
		
		
		//write data to that file
		FileWriter  writer= new  FileWriter(file,false);//overWrites file
		//FileWriter  writer= new  FileWriter(file,true);//appends File
		writer.write("Welcome to filehandling...!");
		writer.close();
		
		
	}
	public static void readfile() throws IOException
	{ 
		FileReader reader= new FileReader("E:\\java\\phasse1-practiceproject-2\\practice-proj2\\src\\PracticeProject\\file.txt");
		
		int data;
		
		while((data=reader.read())!=-1){
			
			System.out.print((char)data);
		}
		reader.close();
		
	}
	public static void append() throws IOException
	{
	File  file= new File("E:\\java\\phasse1-practiceproject-2\\practice-proj2\\src\\PracticeProject\\file.txt");
		
	
		
		FileWriter  writer= new  FileWriter(file,true);//appends File
		writer.write("\nHappy coding...");
		writer.close();
		
		
	}
	public static void main(String[] args) {
		try {
			System.out.println("Writing to file:\n");
			 writefile();
			 readfile();
			 System.out.println("\n\nAfter appending to file to file:\n");
			 append();
			 readfile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}