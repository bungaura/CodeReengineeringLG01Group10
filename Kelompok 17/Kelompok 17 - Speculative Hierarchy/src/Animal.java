
public interface Animal {
	
	void eat();
    void sleep();
    void giveBirthOrLayEggs();
}

/*
KELOMPOK 10 LG01
2502005912 - Emmanuel Clement
2502016475 - Haliza Syafa Oktaviani
2502024382 - Bunga Aura Prameswari

Alasan refactor Speculative Hierarchy:
- menambahkan metode giveBirthOrLayEggs() ke dalam antarmuka Animal
- metode tersebut diimplementasi ke kelas Mammal dan Reptile
- dengan adanya perubahan ini, kita menciptakan speculative hierarchy dengan
  menambahkan metode baru untuk menggambarkan kemampuan hewan dalam melahirkan,
  hal ini memberikan fleksibilitas dalam mengatur hierarki dan memperluas fungsionalitas
  untuk kedepannya jika diperlukan.
 */
