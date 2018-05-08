package FileAnalysis;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class FileAnalysis {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("<Enter the input file name>");
		String input=sc.nextLine();
		FileReader FR=new FileReader(input);
		System.out.println("<Enter the output file name>");
		String output=sc.nextLine();
		FileWriter FW=new FileWriter(output);
		BufferedWriter BW =new BufferedWriter(FW);
		
		System.out.println("<File read successfully>");
		
		while(true) {
			System.out.println("<Select Option>");
			System.out.println("1 - Determine word statistics");
			System.out.println("2 - List shortest words");
			System.out.println("3 - List longest words");
			System.out.println("4 - Search for a word");
			System.out.println("5 - Exit");
			System.out.print("Enter your selection");
			
			String choice = sc.next();
			if(choice.equals("1")) {
				FR=new FileReader(input);
				Statistics(FR,BW);
			}else if(choice.equals("2")) {
				FR=new FileReader(input);
				ShortestWords(FR,BW,input);
			}else if(choice.equals("3")) {
				FR = new FileReader(input);
				LongestWords(FR,BW,input);
			}else if(choice.equals("4")) {
				FR=new FileReader(input);
				System.out.println("Enter word to find in file");
				sc=new Scanner(System.in);
				String txt=sc.nextLine();
				Searching(FR,BW,txt);
			}else if(choice.equals("5")) {
				FR.close();
				BW.close();
				FW.close();
				System.out.println("<Program exit>");
				System.exit(1);
			}
		}
	}

	

	private static void Statistics(FileReader FR, BufferedWriter BW) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader BR=new BufferedReader(FR);
		
		int TotalWords=0;
		int TotalCharacters=0;
		int TotalPunctuations=0;
		int ShortestWord=100;
		int LongestWord=0;
		
		String Line;
		StringTokenizer Token;
		
		while((Line=BR.readLine())!=null) {
			Token=new StringTokenizer(Line, " ");
			while(Token.hasMoreTokens()) {
				TotalWords++;
				String Word=Token.nextToken();
				TotalCharacters+=Word.length();
				if(ShortestWord>Word.length()) {
					ShortestWord=Word.length();
				}
				if(LongestWord<Word.length()) {
					LongestWord=Word.length();
				}
				
				for(int i=0; i<Word.length(); i++) {
					char P = Word.charAt(i);
				     if (!(((int) P >= 97 && (int) P <= 122) || ((int) P >= 65 && (int) P <= 90))) {
				      if (i == 0 || i == Word.length() - 1) {
				       TotalCharacters--;
				       TotalPunctuations++;
				      } else if (!( (((int) Word.charAt(i - 1) >= 97 && (int) Word.charAt(i - 1) <= 122) 
				    		  || ((int) Word.charAt(i - 1) >= 65  && (int) Word .charAt(i - 1) <= 90)) 
				    		  && (((int) Word.charAt(i + 1) >= 97 && (int) Word.charAt(i + 1) <= 122) 
				    		  || ((int) Word.charAt(i + 1) >= 65 && (int) Word.charAt(i + 1) <= 90)))) {
						       TotalCharacters--;
						       TotalPunctuations++;
				      }
				     }
				    }
				   }
				  }
				  System.out.println("< File Statistics >");
				  System.out.println("Total number of words : " + TotalWords);
				  System.out.println("Average word length : " + (double) TotalCharacters
				    / TotalWords + " characters");
				  System.out.println("Total number of word characters : "
				    + TotalCharacters);
				  System.out.println("Total number of punctuation characters : "
				    + TotalPunctuations);
				  System.out.println("Shortest word length : " + ShortestWord);
				  System.out.println("Longest word length : " + LongestWord);
				  BW.write("< File Statistics >");
				  BW.newLine();
				  BW.write("Total number of words : " + TotalWords);
				  BW.newLine();
				  BW.write("Average word length : " + (double) TotalCharacters
				    / TotalWords + " characters");
				  BW.newLine();
				  BW.write("Total number of word characters : " + TotalCharacters);
				  BW.newLine();
				  BW.write("Total number of punctuation characters : "
				    + TotalPunctuations);
				  BW.newLine();
				  BW.write("Shortest word length : " + ShortestWord);
				  BW.newLine();
				  BW.write("Longest word length : " + LongestWord);
				  BW.newLine();
				  BR.close();
				}
	
	
	public static void ShortestWords(FileReader FR, BufferedWriter BW, String FN)
			   throws IOException {
			  BufferedReader BR = new BufferedReader(FR);
			  // Compute the shortest word length.
			  int ShortestWord = 100;
			  String Line;
			  StringTokenizer Token;
			  while ((Line = BR.readLine()) != null) {
			   Token = new StringTokenizer(Line, " ");
			   while (Token.hasMoreTokens()) {
			    String Word = Token.nextToken();
			    if (ShortestWord > Word.length())
			     ShortestWord = Word.length();
			   }
			  }
			  FR = new FileReader(FN);
			  BR = new BufferedReader(FR);
			  BW.write("< Shortest Words >");
			  BW.newLine();
			  // Get the shortest words.
			  System.out.println("< Shortest Words >");
			  while ((Line = BR.readLine()) != null) {
			   Token = new StringTokenizer(Line, " ");
			   while (Token.hasMoreTokens()) {
			    String Word = Token.nextToken();
			    if (Word.length() == ShortestWord || Word.contains("I")) {
			     if (Word.contains("I")) {
			      System.out.println("I");
			      BW.write("I");
			      BW.newLine();
			     } else {
			      System.out.println(Word);
			      BW.write(Word);
			      BW.newLine();
			     }
			    }
			   }
			  }
			 }
			 public static void LongestWords(FileReader FR, BufferedWriter BW, String FN)
			   throws IOException {
			  BufferedReader BR = new BufferedReader(FR);
			  // Compute the Longest word length.
			  int LongestWord = 0;
			  String Line;
			  StringTokenizer Token;
			  while ((Line = BR.readLine()) != null) {
			   Token = new StringTokenizer(Line, " ");
			   while (Token.hasMoreTokens()) {
			    String Word = Token.nextToken();
			    if (LongestWord < Word.length())
			     LongestWord = Word.length();
			   }
			  }
			  FR = new FileReader(FN);
			  BR = new BufferedReader(FR);
			  BW.write("< Longest Words >");
			  BW.newLine();
			  // Get the shortest words.
			  System.out.println("< Longest Words >");
			  while ((Line = BR.readLine()) != null) {
			   Token = new StringTokenizer(Line, " ");
			   while (Token.hasMoreTokens()) {
			    String Word = Token.nextToken();
			    int Pure = 0;
			    if (Word.length() == LongestWord) {
			     for (int i = 0; i < Word.length(); i++) {
			      char P = Word.charAt(i);
			      if (!(((int) P >= 97 && (int) P <= 122) || ((int) P >= 65 && (int) P <= 90))) {
			       Pure--;
			      }
			     }
			     if (Pure == 0) {
			      System.out.println(Word);
			      BW.write(Word);
			      BW.newLine();
			     }
			    }
			   }
			  }
			 }
			 public static void Searching(FileReader FR, BufferedWriter BW, String Search)
			   throws IOException {
			  BufferedReader BR = new BufferedReader(FR);
			  int Appear = 0;
			  String Line;
			  StringTokenizer Token;
			  BW.write("< Searching the file >");
			  BW.newLine();
			  System.out.println("< Searching the file >");
			  while ((Line = BR.readLine()) != null) {
			   Token = new StringTokenizer(Line, " ");
			   while (Token.hasMoreTokens()) {
			    String Word = Token.nextToken();
			    if (Search.equals(Word)) {
			     Appear++;
			    }
			   }
			  }
			  System.out.println("This word appears " + Appear + " time(s) in the file.");
			  BW.write("This word appears " + Appear + " time(s) in the file.");
			  BW.newLine();
			 }
}

