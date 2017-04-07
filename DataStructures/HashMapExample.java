// Stores a (key, value) pair of objets
// Search Complexity: Constant Time => O(1)
import java.util.*;

class HashMapExample{

  public static void main(String[] arguments){
    HashMap<String, String> phoneBook = new HashMap<String, String>();

    // Adding to the Hash Map
    phoneBook.put("Eilert Cuth", "123-123-1234");
    phoneBook.put("Marcel Douglas", "997-456-7463");
    phoneBook.put("Daniel Mosi", "245-134-6423");
    phoneBook.put("Linzi Tia", "234-654-3333");
    phoneBook.put("Jen Norah", "748-787-2345");
    phoneBook.put("Dani Lorena", "824-540-0391");

    // Prints the number of elements in the Hash Map
    System.out.println(phoneBook.size());

    // Removes the element with key 'Eilert Cuth'
    phoneBook.remove("Eilert Cuth");

    // Prints the key, value pair that has the key 'Jen Norah'
    System.out.println(phoneBook.get("Jen Norah"));

    // Iterates through the keys in the Hash Map and prints them
    for(String person : phoneBook.keySet()){
      System.out.println(person);
    }

    // Iterates through the values in the Hash Map and prints them
    for(String number : phoneBook.values()){
      System.out.println(number);
    }

    // Iterates through the pairs in the Hash Map and prints them
    for(Map.Entry<String, String> pairs : phoneBook.entrySet()){
      System.out.println(pairs);
    }
  }
}
