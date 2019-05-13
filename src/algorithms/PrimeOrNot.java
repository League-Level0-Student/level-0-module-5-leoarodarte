package algorithms;

import javax.swing.JOptionPane;

public class PrimeOrNot {
	
	public static void main(String[] args) {
		String a=JOptionPane.showInputDialog("Type a number.");
		int b =Integer.parseInt(a);
		for(int c=0; c<100; c++) {
		for(int i=2; i<b; i++) {
if(b%i==0) {
	JOptionPane.showMessageDialog(null, "Not prime");
	break;
}else {
	JOptionPane.showMessageDialog(null, "Prime");
	break;
	
}
	}
		}
}
}

