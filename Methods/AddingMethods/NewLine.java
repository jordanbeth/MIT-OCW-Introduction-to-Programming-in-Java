// Conversion by casting
/*
int a = 2; // a = 2

double
a = 2; // a =
2.0 (Imp
licit)

int a = 18.7; // ERROR

int a = (int)18.7; // a = 18

double a = 2/3; // a = 0.0

double a = (double)2/3; // a = 0.6666…
*/

// Methods
class NewLine{
  public static void newLine(){
    System.out.println("");
  }

  public static void threeLines(){
    newLine(); newLine(); newLine();
  }

  public static void main(String[] arguments){
    System.out.println("Line 1");
    threeLines();
    System.out.println("Line 2");
  }
}
