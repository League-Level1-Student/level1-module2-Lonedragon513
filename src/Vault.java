import java.util.Random;

import javax.swing.JOptionPane;

public class Vault {
private int code;
	

	Vault() {
		code = new Random().nextInt(1000000);

	}

	boolean tryCode(int code) {
		if (this.code == code) {
			
			return true;
		} else {

			return false;
		}

	}
}
