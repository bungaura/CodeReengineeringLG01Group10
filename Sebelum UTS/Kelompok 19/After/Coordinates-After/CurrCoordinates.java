class CurrCoordinates{
  
  private int x, y;

  CurrCoordinates(int x, int y){
    this.x = x;
    this.y = y;
  }

  
  public String toString(){ //ganti ke method toString karena hanya me return nilai dari koordinat
    return x + " " + y ;
  }

  public int getX(){
    return x;
  }

  public int getY(){
    return y;
  }
}