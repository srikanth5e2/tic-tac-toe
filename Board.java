package project1;

public class Board {
	static char[][] dashboard;
	public Board() {
		dashboard=new char[3][3];
		inval();
	}
	void inval() {
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				dashboard[i][j]= ' ';
			}
		}
	}
	static void display() {
		System.out.println("------------");
		for(int i=0;i<3;i++){
			System.out.print("|");
			for(int j=0;j<3;j++) {
				System.out.print(dashboard[i][j]+" | ");
			}
			System.out.println();
			System.out.println("------------");
		}
	}
	 static void placemark(int row,int col,char ch) {
		if(row>=0&&row<3&&col>=0&&col<3) {
			dashboard[row][col]=ch;
		} 
		else {
			System.out.println("Indexout of bound");
		}
		
	}
	static boolean checkcolwin() {
		for(int i=0;i<3;i++) {
			if(dashboard[0][i]!=' '&&dashboard[0][i]==dashboard[1][i]&&dashboard[1][i]==dashboard[2][i]) {
				return true;
			}
		}
		return false;
	}
	static boolean checkrowwin() {
		for(int i=0;i<3;i++) {
			if(dashboard[i][0]!=' ' &&dashboard[i][0]==dashboard[i][1]&&dashboard[i][1]==dashboard[i][2]) {
				return true;
			}
		}
		return false;
	}
	static boolean checkdigwin() {
		if(dashboard[1][1]!=' '&&((dashboard[0][0]==dashboard[1][1]&&dashboard[1][1]==dashboard[2][2])||(dashboard[0][2]==dashboard[1][1]&&dashboard[1][1]==dashboard[2][0]))) {
			return true;
		}
		return false;
	}
}
