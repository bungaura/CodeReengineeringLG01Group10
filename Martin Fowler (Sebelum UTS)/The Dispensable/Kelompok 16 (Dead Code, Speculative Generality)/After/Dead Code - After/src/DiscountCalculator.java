
public class DiscountCalculator {
	
	public static double setPrice10PercentOff(int priceBefore) {
		
		double finalPrice = 0;
	
		finalPrice = priceBefore - (priceBefore * 0.1);
		
		return finalPrice;
	}
		
	public static void main(String[] args) {
		System.out.println(setPrice10PercentOff(100000));
	}
}

/*
KELOMPOK 10 LG01
2502005912 - Emmanuel Clement
2502016475 - Haliza Syafa Oktaviani
2502024382 - Bunga Aura Prameswari

Dead Code Treatment:
- Menghapus conditional if yang menghitung diskon pembelian baju
  pada saat toko baru dibuka, karena code tersebut sudah tidak
  digunakan lagi (termasuk dead code)

Treatment Tambahan:
- Melakukan rename method dari setFinalPrice() ke setPriceTo10PercentOff() 
  agar pembaca mengerti apa maksud dari perhitungan pada method tersebut
*/