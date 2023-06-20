package LongParameterList.After;

public class Main {
	
	public static void main(String[] args) {
		Menu m = new Menu();
		m.menuUserProfiles();
	}

}

/*
KELOMPOK 10 LQ01
2502005912 - Emmanuel Clement
2502016475 - Haliza Syafa Oktaviani
2502024382 - Bunga Aura Prameswari

Long Parameter List Treatment:
- Membuat class baru "Menu.java"
- Menugaskan parameter nama dan email langsung ke object user;
  dan parameter penambahanSaldo/penguranganSaldo dan getBalance
  ke object wallet
- Melakukan preserve whole object, maka pada method menuUserProfiles(),
  object user yang berisi nama dan email ditambahkan ke object walletNotif,
  sehingga parameter walletNotif.balanceNotif menjadi lebih sedikit
  
Treatment Tambahan:
- Menambahkan method printHeader() sebagai penamaan
  atas apa yang ingin dilakukan, yaitu print email header 
- Menambahkan method CekTambahTarikSaldo() untuk memastikan
  apakah saldo tersebut termasuk saldo masuk atau saldo keluar,
  sehingga print BalanceNotif tereksekusi dengan baik (sebelumnya
  saldo keluar terbaca ke saldo masuk)
- Memindahkan method-method yang terdapat pada class "Main.java",
  seperti mainMenu(), menuUserProfiles(), pressEnterToContinue(),
  cekSaldo(), tambahSaldo(), tarikSaldo()
*/
