// Tree Set
// - sorted from lowest to highest
// - only one copy of each object
// - no array index
// Features
// - ADD
// - REMOVE
// - INCLUDE

import java.util.TreeSet;
import java.util.*;

// based on a TreeMap
class TreeSetExample {

public static void main(String [] arguments){
        // initialize a new Tree Set object
        TreeSet<String> colors = new TreeSet<String>();

        // add to the Tree Set object
        colors.add("blue");
        colors.add("yellow");
        colors.add("green");
        colors.add("red");

        System.out.println(colors.size());

        //
        System.out.println(colors.first());
        System.out.println(colors.last());

        colors.remove("yellow");

        System.out.println("After yellow was removed: ");

        for(String color : colors) {
                System.out.println(color);
        }

        System.out.println("Traveresing the Tree Set with a while loop:");

        Iterator <String> iterator = colors.iterator();
        while(iterator.hasNext()) {
                System.out.println(iterator.next());
        }
}





}
