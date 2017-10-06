package java_practice;
import java.text.DecimalFormat;
public class Array {
	public static void main(String[] args) {
		int[] score = {75,89,96,0,0};
		String[] subject = {"Sci","Eng","Math","Sum","Avg"};
		
		for (int i=0; i<score.length; i++) {
			System.out.print(subject[i]+"\t");
		}
		for (int i=0; i<score.length-2; i++) {
			score[score.length-2] +=score[i];
		}
		score[score.length-1] = score[score.length-2]/(score.length-2);
		
		System.out.println();
		for (int i=0; i<score.length; i++)
			System.out.print("--------");
		
		System.out.println();
		
		DecimalFormat df = new DecimalFormat("###");
		for (int i=0; i<score.length; i++)
			System.out.print(df.format(score[i])+"\t");
	}
}
