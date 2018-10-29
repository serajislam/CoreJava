package coreJava;

public class TwoDiArray {

	public static void main(String[] args) {
		
		
		int [][] twoDiArray = new int [3][5];
		
		twoDiArray[0][0] = 10;
		twoDiArray[0][1] = 20;
		twoDiArray[0][2] = 30;
		twoDiArray[0][3] = 40;
		twoDiArray[0][4] = 50;
		
		twoDiArray[1][0] = 60;
		twoDiArray[1][1] = 70;
		twoDiArray[1][2] = 80;
		twoDiArray[1][3] = 90;
		twoDiArray[1][4] = 100;
		
		twoDiArray[2][0] = 110;
		twoDiArray[2][1] = 120;
		twoDiArray[2][2] = 130;
		twoDiArray[2][3] = 140;
		twoDiArray[2][4] = 150;
		
		
		
		System.out.println("total rows are "+twoDiArray.length);
		System.out.println("total columns are "+twoDiArray[0].length);
		
		for(int row=0;row<twoDiArray.length;row++)
		{
			for(int col=0;col<twoDiArray[row].length;col++)
			{
				System.out.println("total array value is "+twoDiArray[row][col]);
			}
		}
		
		
	}

}
