package TextInformation;

import java.util.Scanner;

public class TextInfo {

	public static void main(String[] args) {
		///출력요소 1.대문자의 개수 2.소문자의 개수 3.숫자의 개수
		///4.공백의 개수 5.기타 요소의 개수 6.총 char문자의 개수
		
		int Upper=0;
		int Lower=0;
		int num=0;
		int gap=0;
		int etc=0;
		int total=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("please enter text sentences");
		String str=sc.nextLine();
		char inputStr[]=str.toCharArray();
		
		for(int i=0; i<inputStr.length; i++) {
			if(inputStr[i]>='A' && inputStr[i]<='Z') {
				Upper++;
				total++;
			}else if(inputStr[i]>='a' && inputStr[i]<='z') {
				Lower++;
				total++;
			}else if(inputStr[i]>='0' && inputStr[i]<='9') {
				num++;
				total++;
			}else if(inputStr[i]=='\n' || inputStr[i]==' ') {
				gap++;
				total++;
			}else {
				etc++;
				total++;
			}
		}
		
		System.out.println(" Upper : "+Upper+"\n Lower : "+Lower+"\n Num : "+num+"\n Gap : "+gap+"\n etc : "+etc+"\n total : "+total);
	}
}
