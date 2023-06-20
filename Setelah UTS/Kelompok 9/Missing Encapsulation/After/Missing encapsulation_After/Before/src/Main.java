public class Main {
    public static void main(String[] args) throws Exception {

        Employee employee1 = new Employee();
        
        employee1.setName("John");
        employee1.setGender("Male");
        employee1.setAge(26);
        employee1.setSalary(10000);
        employee1.salaryIncrease(100);
    
        employee1.display();
    }
}

/*
KELOMPOK 10 LG01
2502005912 - Emmanuel Clement
2502016475 - Haliza Syafa Oktaviani
2502024382 - Bunga Aura Prameswari

Alasan refactor Missing Encapsulation:
- Mengubah akses modifier name, gender, age, salary ke private 
  sehingga tidak dapat diakses secara langsung dari luar kelas
- Menambah getter dan setter untuk mengakses dan mengubah nilai
  variabel name, gender, age, salary
 */

