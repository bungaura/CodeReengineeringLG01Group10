package leaky_Encapsulation_Before;

import java.util.List;

public class ToDoListTest {
	void test() {
        ToDoList toDoList = new ToDoList();

        toDoList.add(new ToDo("a"));
        assert (toDoList.getByName("a") != null);

        List<ToDo> list = toDoList.getlist();
        list.get(0).setName("b");

        assert (toDoList.getByName("b") != null);
    }

}

/*
KELOMPOK 10 LG01
2502005912 - Emmanuel Clement
2502016475 - Haliza Syafa Oktaviani
2502024382 - Bunga Aura Prameswari

Alasan refactor Leaky Encapsulation:
- Perubahan dari Vector menjadi ArrayList karena ArrayList lebih umum digunakan dan lebih fleksibel.
- Metode getList() sekarang mengembalikan deep copy dari daftar tugas, bukan shallow copy;
  Dengan menggunakan deep copy, perubahan pada salinan tidak akan mempengaruhi objek asli dalam daftar
- Menggunakan getlist() untuk mendapatkan daftar tugas, yang mengembalikan deep copy,
  sehingga perubahan pada elemen daftar tidak akan mempengaruhi hasil tes yang diharapkan
 */