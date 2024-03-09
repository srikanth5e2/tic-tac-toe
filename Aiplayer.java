package project1;
import java.util.Random;
import java.util.*;

public class Aiplayer extends Player{
	Aiplayer(String name,char mark){
		this.name=name;
		this.mark=mark;
	}
	 void makemove() {
		Scanner sc=new Scanner(System.in);
		int row,col;
		do {
			Random r=new Random();
			row=r.nextInt(3);
			col=r.nextInt(3);
		}while(!isvalidmove(row,col));
		Board.placemark(row,col,mark);
	}
	/*boolean isvalidmove (int row ,int col) {
		if(row>=0&&col<=2&&col>=0&&col<=2) {
			if(Board.dashboard[row][col]==' ') {
				return true;
			}
		}
		return false;
	}*/
}
