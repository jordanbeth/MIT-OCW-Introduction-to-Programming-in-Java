// 1 Class = 1 file
// Having a main method means the class can be run

// class DEFINITION
public class Baby {
// FIELDS
String name;
boolean isMale;
double weight = 5.0;
double decibels;
int numPoops = 0;
Baby[] siblings;

// constructor name is the class name
Baby(String myname, boolean maleBaby){
        name = myname;
        isMale = maleBaby;
}

// METHODS
void poop(){
        numPoops += 1;
        System.out.println("Dear mother, " + "I have pooped. Ready the diaper.");
}

void sayHi(){
        System.out.println("Hi, my name is " + name);
}

void eat(double foodWeight){
        if (foodWeight >= 0 && foodWeight < weight) {
                weight += foodWeight;
        }
}


public static void main(String[] args){

        // Baby myBaby = new Baby();

        Baby kevin = new Baby("Kevin The Baby", true);

        Baby kate = new Baby("Kate Kately", true);

        // Access fields with OBJECT.FIELDNAME
        System.out.println(kevin.name);
        System.out.println(kevin.numPoops);

        kate.sayHi();
        kate.eat(1);
        System.out.println(kate.weight);
}
}
