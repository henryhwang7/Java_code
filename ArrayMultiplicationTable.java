package java_practice;
import java.text.DecimalFormat;
public class ArrayMultiplicationTable {
	public static void main(String[] args) {
		int [][] array = new int[8][9];
		DecimalFormat df = new DecimalFormat("00 ");
		
		for (int i=0; i<array.length;i++) {
			System.out.print((i+2)+" Multiplier: ");
			for (int j=0; j<9; j++) {
				array[i][j] = (i+2)*(j+1);
				System.out.print(df.format(array[i][j])+"");
			}
			System.out.println();
		}
	}
}
