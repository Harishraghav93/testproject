package file_io;


import java.io.*;
import java.util.*;

public class Main {
	
	public static void copy_with_streams() {

	try {
		FileInputStream in = new FileInputStream("input.txt");
	    FileOutputStream out = new FileOutputStream("output.txt");
	
	int c;
		while ((c= in.read()) != -1) {
			out.write(c);
		}
	    in.close();
		out.close();
	}
	
	catch(Exception e) {
		System.out.println("oops some error");
		return;
	}
	}

	public static void main(String[] args) throws IOException{

	
	final String nomeFile= "input.txt";
	File file = new File(nomeFile);
	FileReader file_reader = new FileReader(file);
	//BufferedWriter bufferedWriter;
	
		BufferedReader bufferedReader = new BufferedReader(file_reader);
		//bufferedWriter.write("Prova\n");
		//bufferedWriter.close();
	    String line;
	    while((line=bufferedReader.readLine()) != null) {
	    	System.out.println(line);
	    }
	    bufferedReader.close();
	
	
	}
}

/*String line;
char[] letters = new char[26];
char letter = 'a';
for()
	

	
	for(char c : vowels) {
		line= line.replace(c, '-');
	}
	String[] words = line.split("");
	for(String word : words) {
		
	}*/

