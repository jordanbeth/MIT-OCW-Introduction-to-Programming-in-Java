class Square {
  public static void printSquare(int x){
    System.out.println(x*x);
  }

  public static void main(String[] arguments){
    int value = 2;
    printSquare(value);
    printSquare(3);
    printSquare(value*2);
    // printSquare("hello"); -> strings cannot be converted to integers - NO MULTIPLICATION ON STRINGS
    // printSquare(5.5); -> double is not converted to integer
    
  }



}
