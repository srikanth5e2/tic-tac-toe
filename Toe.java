package project1;
import java.util.*;

public class Toe {

	public static void main(String[] args) {
		//System.out.println("ghj");
		String str1,str2;
		Scanner a=new Scanner(System.in);
		Board b=new Board();
		System.out.println("enter the first player name :-");
		 str1=a.next();
		System.out.println("enter the second player name :-");
		str2=a.next();
		
		Humanplayer h1=new Humanplayer(str1,'x');
		Aiplayer h2=new Aiplayer(str2,'0');
		Player cp;
		cp=h1;
		for(int i=0;i<9;i++) {
			System.out.println(cp.name+" turn");
			cp.makemove();
			Board.display();
			if((Board.checkrowwin()||Board.checkcolwin()||Board.checkdigwin())) {
				System.out.println(cp.name+" has won the match");
				break;
			}
			else {
				if(cp==h1) {
					cp=h2;
				}
				else {
					cp=h1;
				}
			}
		}
	}

}
