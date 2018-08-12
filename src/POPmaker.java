import javax.swing.JOptionPane;

public class POPmaker {
	
	// I CAN FLYYYYYY !!!  ____
	
public static void main(String[] args) {
	
	String flav = JOptionPane.showInputDialog("whta falv");
	String num = JOptionPane.showInputDialog("much??");
	int go =Integer.parseInt(num);
	Popcorn hi = new Popcorn(flav);
	
	Microwave me = new Microwave ();
	me.putInMicrowave(hi);
	me.setTime(go);
	me.startMicrowave();
}
}
