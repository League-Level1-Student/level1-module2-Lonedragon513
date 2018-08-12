import javax.swing.JOptionPane;



public class tew {
public static void main(String[] args) {
	String f =JOptionPane.showInputDialog("flav");
	TeaBag hiBag = new TeaBag(f);
	hiBag.getFlavor();
	
	Kettle ket  = new Kettle ();
	
	ket.boil();
	
 	
	
	Cup cup= new Cup ();
	cup.makeTea(hiBag, ket.getWater());
}
}
