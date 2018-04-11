package fileReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class fileReader {
	

	
	public static void main(String[] args) {
		String result="";
		try {
			Scanner sc =new Scanner(new File("data.txt"));
			while(sc.hasNextLine()) {
				result+=sc.nextLine();
				result+="\r";
			}
			
			System.out.println(result);		///파일 그대로를 출
			
			String tmp[]=result.split(" ");	///공백을 기준으로 잘라서 tmp에 저
			
			int n=1;
			
			for(String i: tmp) {
				System.out.print(n++ +". "+i+ " ");;
			}
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
