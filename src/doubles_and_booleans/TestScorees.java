package doubles_and_booleans;

import javax.swing.JOptionPane;

public class TestScorees {
	public static void main(String[] args) {
		
	String score =	JOptionPane.showInputDialog("What is yo test score?");
double test = Double.parseDouble(score);
		
if (test <=  75.5) {
	JOptionPane.showMessageDialog(null,"Study harder!!");
}
else if (test==100) {
	JOptionPane.showMessageDialog(null,"BING0!!!");
}
else if (test >= 90) {
	JOptionPane.showMessageDialog(null,"You did good...");
}
 
else  {
JOptionPane.showMessageDialog(null,"Meh...");
	
}
}

} 