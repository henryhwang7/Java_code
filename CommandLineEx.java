package java_practice;
import javax.swing.JOptionPane;
public class CommandLineEx {
	public static void main(String[] args) {
		int input = 0;
		String temp = "";
		int count = 0;
		int answer = 80;
		do {
			count++;
			temp = JOptionPane.showInputDialog("Type number b/w 1 and 100 and type -1 to terminate");
			if (!temp.equals("")) {
				input = Integer.parseInt(temp);
				if (input > answer) 
					JOptionPane.showMessageDialog(null, "Input value: "+input+"\n"+"Type smaller value!");
				else if (input < answer)
					JOptionPane.showMessageDialog(null, "Input value: "+input+"\n"+"Type bigger value!");
				else {
					JOptionPane.showMessageDialog(null, "Input value: "+input+"\n"+"Correct!"+"\n"+"Total Attempts: "+count);
					return;
				}
			}
			if (temp.equals("") || input == -1) {
				System.out.println("You either didn't type anything or typed -1");
				return;
			}
			else if (input <=0 || input > 100) {
				System.out.println("The number you typed is not b/w 1 and 100");
				return;
			}
		} while (true);
	}
}
