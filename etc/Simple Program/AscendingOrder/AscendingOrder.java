package AscendingOrder;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class AscendingOrder {

	public static void main(String[] args) throws IOException {
		System.out.println("<텍스트 파일 불러오기>");
		FileReader FR=new FileReader("input.txt");
		BufferedReader BR=new BufferedReader(FR);
		ArrayList<String> ArrayList=new ArrayList<>();
		String Line;
		
		while((Line=BR.readLine()) != null) {
			ArrayList.add(Line);
		}
		System.out.println("<정렬 전>");
		for(String s:ArrayList) {
			System.out.println(s);
		}
		ArrayList=AscendingOrder(ArrayList);
		
		System.out.println("<정렬 >");
		for(String s:ArrayList) {
			System.out.println(s);
		}
		
		System.out.println("------텍스트 파일 내보내기------");
		
		
		FileWriter FW=new FileWriter("Output.txt");
		BufferedWriter BW=new BufferedWriter(FW);
		
		for(int i=0; i<ArrayList.size(); i++) {
			BW.write(ArrayList.get(i));
			BW.newLine();
		}
		BR.close();
		BW.close();
		FR.close();
		FW.close();
		
		
	}
	
	public static ArrayList AscendingOrder(ArrayList<String> ArrayList) {
		String tmp;
		ArrayList<String> newArray=new ArrayList<>();
		for(int i=0; i<ArrayList.size(); i++) {
			for(int j=i+1; j<ArrayList.size(); j++) {
				if(ArrayList.get(i).compareTo(ArrayList.get(j))>0) {
					tmp=ArrayList.get(i);
					ArrayList.set(i, ArrayList.get(j));
					ArrayList.set(j, tmp);
				}
			}
		}
		newArray=ArrayList;
		return newArray;
	}
}
