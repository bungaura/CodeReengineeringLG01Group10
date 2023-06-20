import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    ArrayList<CurrCoordinates> coordinates = new ArrayList<CurrCoordinates>();

    coordinates.add(new CurrCoordinates(5, 3));
    coordinates.add(new CurrCoordinates(16, 10));

    // int delta_X = Math.abs(coordinates.get(1).getX() - coordinates.get(0).getX());
    // int delta_Y = Math.abs(coordinates.get(1).getY() - coordinates.get(0).getY());
    // double distance = Math.sqrt(Math.pow(delta_X, 2) + Math.pow(delta_Y, 2));

    
    int delta_X = coordinates.get(1).getX() - coordinates.get(0).getX();
    int delta_Y = coordinates.get(1).getY() - coordinates.get(0).getY();
    double distance = Math.sqrt(Math.pow(delta_X, 2) + Math.pow(delta_Y, 2));

    //Hapus Math.abs pada delta_X dan delta_Y karena kedua variabel tersebut selalu digunakan dengan pangkat dua pada langkah berikutnya

    System.out.print(distance);
  }
}