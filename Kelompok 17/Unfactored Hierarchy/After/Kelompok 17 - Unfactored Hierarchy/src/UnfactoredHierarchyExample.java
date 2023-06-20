
public class UnfactoredHierarchyExample {
	
    public static void main(String[] args) {
        Employee ceo = new Employee("John (CEO)");
        
        Employee manager1 = new Employee("Mike (Manager 1)");
        Employee manager2 = new Employee("Lisa (Manager 2)");
        
        Employee employee1 = new Employee("Alice (Employee 1)");
        Employee employee2 = new Employee("Bob (Employee 2)");
        Employee employee3 = new Employee("Eve (Employee 3)");
        
        ceo.addSubordinate(manager1);
        ceo.addSubordinate(manager2);
        
        manager1.addSubordinate(employee1);
        manager1.addSubordinate(employee2);
        manager2.addSubordinate(employee3);
       
        ceo.traverseHierarchy(0);
    }
   
}

/*
KELOMPOK 10 LG01
2502005912 - Emmanuel Clement
2502016475 - Haliza Syafa Oktaviani
2502024382 - Bunga Aura Prameswari

Alasan refactor Unfactored Hierarchy:
- Metode traverseHierarchy() dipindahkan ke dalam kelas Employee sebagai metode instance.
- Pemanggilan metode traverseHierarchy() di main() diganti menjadi pemanggilan pada objek ceo langsung,
  hal ini menghilangkan kebutuhan untuk menggunakan metode statis dan memperjelas bahwa metode ini adalah
  metode yang dimiliki oleh objek ceo.
- Metode traverseHierarchy() sekarang menggunakan getName() dan getSubordinates() langsung dari
  objek Employee karena objek tersebut adalah objek yang bersangkutan, hal ini mengurangi kebutuhan
  untuk menyebutkan employee secara eksplisit dan membuat metode ini lebih kohesif
- Dengan refaktorisasi ini, kode menjadi lebih bersih, lebih terstruktur, dan memenuhi prinsip pengelolaan hierarki yang lebih baik.

 */
