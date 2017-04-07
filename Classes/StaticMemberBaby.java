/*
 - A static member is a member of a class that isn't associated with an instance of a class.

 - Instead, the member belongs to the class itself.

 - Refers to the field / method itsself
    - Not unique for each instance
    - Defined for the class declaration
*/

public class StaticMemberBaby {
  static int numBabiesMade = 0;


  public static void main(String[] args){
    StaticMemberBaby.numBabiesMade = 100;

    StaticMemberBaby b1 = new StaticMemberBaby();
    StaticMemberBaby b2 = new StaticMemberBaby();
    StaticMemberBaby.numBabiesMade = 2;

    // b1.numBabiesMade equals 2
    // b2.numBabiesMade equals 2
    System.out.println("b1.numBabiesMade = " + b1.numBabiesMade + "\n" + "b2.numBabiesMade = " + b2.numBabiesMade);

  }

}
