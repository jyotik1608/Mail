package pk;

public class MazeCount {
	private void psvm() {

		int n=3; int m=3;
		System.out.println(countMazePath(0,n-1,0,m-1,new int[n+2][m+2]));

	}


public static int countMazePath(int cr,int er,int cc,int ec,int[][] strg){

	if(cr==er && cc==ec) {
		return 1;
		
}
	if(cr>er || cc>ec) {
		return 0;
} 
	if(strg[cr][cc]!=0) {
		return strg[cr][cc];
	}
	int count=0;
	count+=countMazePath(cr,er,cc+1,ec,strg);
	count+=countMazePath(cr+1,er,cc,ec,strg);
	strg[cr][cc]=count;
	return count;
	
}
}