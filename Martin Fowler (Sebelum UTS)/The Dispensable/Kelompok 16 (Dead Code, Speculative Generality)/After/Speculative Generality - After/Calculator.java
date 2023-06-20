public class Calculator {
    
    public static void sum(double num1, double num2) {
    	System.out.println(num1 + num2);
    }
    
    public static void substract(double num1, double num2) {
    	System.out.println(num1 - num2);
    }
    
    public static void multiplicate(double num1, double num2) {
    	System.out.println(num1 * num2);
    }
    
    public static void divide(double num1, double num2) {
    	System.out.println(num1 / num2);
    }

    public static void main(String[] args) {    	
    	Calculator.sum(10, 5);
    	Calculator.substract(10, 5);
    	Calculator.multiplicate(10, 5);
    	Calculator.divide(10, 5);
    }
}

/*
KELOMPOK 10 LG01
2502005912 - Emmanuel Clement
2502016475 - Haliza Syafa Oktaviani
2502024382 - Bunga Aura Prameswari

Speculative Generality Treatment:
- Membuat method baru untuk masing-masing perhitungan matematika,
  sehingga tidak perlu meng-assign parameter tambahan yaitu 
  operator/simbol perhitungan matematika
*/
