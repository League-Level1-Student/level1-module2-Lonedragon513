
public class JB {
	public static void main(String[] args) {
		JB k = new JB();

		Vault hi = new Vault();
		System.out.println(k.findCode(hi));

	}

	int findCode(Vault hi) {

		for (int i = 0; i < 10000000; i++) {
			if (hi.tryCode(i) == true)
				return i;
			}
		
		return -1;

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
