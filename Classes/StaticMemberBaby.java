/*
 - A static member is a member of a class that isn't associated with an instance of a class.

 - Instead, the member belongs to the class itself.

 - Refers to the field / method itsself
    - Not unique for each instance
    - Defined for the class declaration


 - Non-static methods can reference static methods, but not the other way around

 - Q: Why is main static?
 - A: To eliminate ambiguity of which constructor should be called, it can be invoked by the runtime engine without having to instantiate an instance of the parent class. Also, it is convention.
*/

public class StaticMemberBaby {
  static int numBabiesMade = 0;

  static void cry(){
    System.out.println("**cries**");
  }

  public static void main(String[] args){
    StaticMemberBaby.numBabiesMade = 100;

    StaticMemberBaby b1 = new StaticMemberBaby();
    StaticMemberBaby b2 = new StaticMemberBaby();
    StaticMemberBaby.numBabiesMade = 2;

    // b1.numBabiesMade equals 2
    // b2.numBabiesMade equals 2
    System.out.println("b1.numBabiesMade = " + b1.numBabiesMade + "\n" + "b2.numBabiesMade = " + b2.numBabiesMade);

    b1.cry();

  }

}
