import java.util.ArrayList;


class ArrayListExample {


public static void main(String[] args){

        // instantiate a new array list called strings, which holds a collection of elements of the string data type
        ArrayList<String>strings = new ArrayList<String>();

        // add method for an Array List
        strings.add("blue");
        strings.add("yellow");
        strings.add("green");

        // size(): gives you the number of elements in the Array List
        System.out.println(strings.size());

        // get(): returns the element at a given index
        System.out.println(strings.get(0));
        System.out.println(strings.get(1));

        // set(): assigns a given value to a given index
        strings.set(0, "Goodbye");

        // remove(): deletes the element at the given index
        strings.remove(1);

        System.out.println("First for loop output:");
        // print each element in the Array List
        for (int i = 0; i < strings.size(); i++) {
                System.out.println(strings.get(i));
        }
        System.out.println("Short hand for loop output:");
        // short hand for iterating through an Array List
        for (String s : strings) {
                System.out.println(s);
        }

}






}
