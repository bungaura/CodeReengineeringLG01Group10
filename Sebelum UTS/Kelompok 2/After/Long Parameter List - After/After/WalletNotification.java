package LongParameterList.After;

class WalletNotification {
	private User user;

	public WalletNotification(User user) {
		this.user = user;
	}
	
	public void printHeader() {
		System.out.printf("Email terkirim ke %s\n", user.getEmail());
		System.out.println("Isi email: ");
	}
	
	public boolean CekTambahTarikSaldo(String tanda) {
		if (tanda == "+") {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void balanceNotif(int amount, int current, String tanda) {
		printHeader();
		
		String body = "";
		if(amount == 0) {
			body = String.format(
					"Halo %s, Saldo mu sekarang ada %2d ", user.getName(), current);
		}
		
		else if (CekTambahTarikSaldo(tanda) == true) { 
			body = String.format(
					"Halo %s, ada %2d masuk ke akunmu nih. " + 
					"Sekarang balance-mu menjadi %2d", user.getName(), amount, current);
		} 
		
		else {
			body = String.format(
					"Halo %s, ada %2d keluar dari akunmu nih. " + 
					"Sekarang balance-mu menjadi %2d", user.getName(), amount, current);
		}
		
		System.out.println(body);
		
	}
}