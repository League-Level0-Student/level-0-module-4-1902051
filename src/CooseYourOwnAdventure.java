import javax.swing.JOptionPane;

public class CooseYourOwnAdventure {
	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, ("Hello, My name is Milan"));
		JOptionPane.showInputDialog(null, ("Whats your name?"));
		JOptionPane.showMessageDialog(null, ("This is a game"));
		int Hi = JOptionPane.showConfirmDialog(null, "Are you ready to play?");
		if (Hi == 1) {
			JOptionPane.showMessageDialog(null, "Sorry, no game for you... Try again later...");
		}
		if (Hi == 0) {
			JOptionPane.showMessageDialog(null, "ALRIGHT! LET THE GAMES BEGIN!!");
			JOptionPane.showMessageDialog(null, "Allow me to explain the rules");
		}
	}

}
