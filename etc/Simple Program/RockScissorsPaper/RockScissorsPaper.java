package RockScissorsPaper;

import java.util.Scanner;

public class RockScissorsPaper {

	public static void main(String[] args) {
		
		System.out.println("----------------------");
		System.out.println("           가위바위보 게임");
		System.out.println("----------------------");
		
		System.out.println("1. 가위");
		System.out.println("2. 바위");
		System.out.println("3. 보");
		
		System.out.print("무엇을 내면 이길까? : ");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		Player player=new Player(n);
		
		
		if(n==1) {
			player=new Scissors(1);
		}else if(n==2) {
			player=new Rock(2);
		}else {
			player=new Paper(3);
		}
		
		
		Player computer = new Player((int) (Math.random()*3)+1);
		if(computer.Number==1) {
			computer=new Scissors(1);	//가위
		}else if(computer.Number==2) {
			computer=new Rock(2);		//바위
		}else {
			computer=new Paper(3);		//보
		}
		
		
		System.out.println("플레이어 : "+player.Name);
		System.out.println("컴퓨터  : "+computer.Name);
		
		
		if(computer.Number==player.Number) {
			System.out.println("비겼습니다...");
		}else if((player.Number==1 && computer.Number==3) || (player.Number==2 && computer.Number==1) || 
				(player.Number==3 && computer.Number==2)){
			System.out.println("이겼습니다!!!");
		}else {
			System.out.println("패배했습니다...");
		}
		
	}
}
