package Missing_Hierarchy;

import Missing_Hierarchy.Pokemons.Charmander;
import Missing_Hierarchy.Pokemons.Mudkip;
import Missing_Hierarchy.Pokemons.Treecko;

public class App {
    public static void main(String[] args) {
        Test();
    }

    private static void Test(){
        Mudkip bob = new Mudkip("Bob");
        Charmander geck = new Charmander("Geck");

        System.out.println(bob.getName() + " " + bob.getHealth());
        System.out.println(geck.getName() + " " + geck.getHealth());

        bob.Attack(geck, bob.getMoveSet().get(0));

        System.out.println(bob.getName() + " " + bob.getHealth());
        System.out.println(geck.getName() + " " + geck.getHealth());
    }
}

/*
KELOMPOK 10 LG01
2502005912 - Emmanuel Clement
2502016475 - Haliza Syafa Oktaviani
2502024382 - Bunga Aura Prameswari

Alasan refactor Missing & Wide Hierarchy:
- menggunakan pewarisan (inheritance) dan polimorfisme yang membuat kode lebih terstruktur dan mudah dipahami
- memanfaatkan konsep "parent-child" relationship antara kelas-kelas Pokemon, hal ini memungkinkan kita untuk
  menentukan sifat umum dari Pokemon dalam kelas abstrak Pokemon dan menambahkan detail khusus untuk setiap Pokemon
  dalam subclass yang sesuai
- mudah menambahkan jenis Pokemon baru atau gerakan baru dengan membuat subclass baru atau menambahkan gerakan baru
  ke dalam daftar gerakan yang dapat dipelajari oleh setiap Pokemon, hal ini memberikan fleksibilitas dan skalabilitas
  untuk mengembangkan permainan Pokemon lebih lanjut tanpa mengganggu atau mengubah banyak bagian kode yang sudah ada
 */
