package project1;

import java.util.Scanner;

public class Humanplayer extends Player {
	
	Humanplayer(String name,char mark){
		this.name=name;
		this.mark=mark;
	}
	 void makemove() {
		Scanner sc=new Scanner(System.in);
		int row,col;
		do{
			System.out.println("Enter the row and col");
			row=sc.nextInt();
			col=sc.nextInt();
		}
		while(isvalidmove(row,col)!=true);
		Board.placemark(row,col,mark);
	}
	/*static boolean isvalid(int row,int col) {
		if(row>=0&&row<=2&&col>=0&&col<=2) {
			if(Board.dashboard[row][col]==' ') {
				return true ;
			}
		}
		return false;
	}*/
}
