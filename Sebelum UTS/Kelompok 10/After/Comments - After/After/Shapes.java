
public class Shapes {
	
	public static void calculateArea(String shapeType, int side, int width) {
	    int area = 0;
	    
	    if (shapeType == "Square") {
	        area = side * side;
	    } else if (shapeType == "Rectangle") {
	        area = side * width;
	    } else if (shapeType == "Circle") {
	        area = (int)(3.14 * side * side);
	    }
	    printArea(shapeType, area);
	   
	}
	
	public static void printArea(String shapeType, int area) {
		System.out.println("Area of " + shapeType + " : " + area);
	}
	
    public static void main(String[] args) {
        int squareSide = 7;
        int rectangleWidth = 8;
        int rectangleHeight = 3;
        int circleRadius = 10;
        
        calculateArea("Square", squareSide, 0);
        calculateArea("Rectangle", rectangleWidth, rectangleHeight);
        calculateArea("Circle", circleRadius, 0);
    }
}

/*
KELOMPOK 10 LQ01
2502005912 - Emmanuel Clement
2502016475 - Haliza Syafa Oktaviani
2502024382 - Bunga Aura Prameswari

Comments Treatment:
- Menghapus penjelasan comment-comment
- Melakukan rename method dari calc() menjadi calculateArea()
- Mengubah tipe data type (direname menjadi shapeType) dari int ke String
- Dalam if else pada method calculateArea(), sesuaikan dengan tipe data baru
  yaitu String (sebelumnya int 1 2 3), ubah menjadi masing-masing nama bentuk
  yang ada yaitu 'Square', 'Rectangle', dan 'Circle'
- Dengan demikian, pembaca dapat lebih memahami code tanpa perlu
  menambahkan penjelasan comments
  
Treatment Tambahan:
- Melakukan extract method
- Membuat method baru printArea()
 */
