
public interface Shape {
    double calculateArea();
}

/*
KELOMPOK 10 LG01
2502005912 - Emmanuel Clement
2502016475 - Haliza Syafa Oktaviani
2502024382 - Bunga Aura Prameswari

Alasan refactor Unnecessary Hierarchy:
- terdapat hierarki abstrak yang tidak memberikan manfaat tambahan,
  sehingga dapat diubah menjadi kelas interface dari kelas abstrak 
  karena memberikan fleksibilitas sama tanpa adanya hierarki yang 
  kompleks
- dapat memisahkan tanggung jawab masing2 bentuk (shape) dan dimensinya,
  sehingga meningkatkan keterbacaan struktur dan pemeliharaan kode
- didukungnya polimorfisme untuk memperlakukan objek dari berbagai 
  bentuk sebagai bentuk umum (menyimpan objek Sphere dan Cube dari 
  ThreeDimensionalShape
 */
