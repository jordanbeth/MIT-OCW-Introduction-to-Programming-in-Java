import java.util.ArrayList;

public class Library {
// Add the implementation to this class based on main()
  String address;
  ArrayList<Book> inventory = new ArrayList<Book>();
  static String openingHours = "9 AM";
  static String closingHours = "5 PM";

  public Library(String location){
    address = location;
  }

  public void addBook(Book newBook){
    inventory.add(newBook);
  }

  public static void printOpeningHours(){
    System.out.println(openingHours);
  }

  public void printAddress(){
    System.out.println(address);
  }

  public void borrowBook(String bookTitle){
    for(int i = 0; i < inventory.size(); i++){
      if ((inventory.get(i).title == bookTitle) && (inventory.get(i).isRented == false)){
        inventory.get(i).isRented = true;
        System.out.println("You borrowed " + bookTitle);
      }else{
        System.out.println("Sorry, we don't have that book right now.");
      }
    }
  }

  public void printAvailableBooks(){
    for(int i = 0; i < inventory.size(); i++){
      if (inventory.get(i).isRented == false){
        System.out.println(inventory.get(i).title);
      }
    }
  }

  public void returnBook(String bookTitle){
    for(int i = 0; i < inventory.size(); i++){
      if (inventory.get(i).title == bookTitle){
        inventory.get(i).isRented = false;
      }
    }
  }

public static void main(String[] args) {
// Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");
// Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));
// Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();
        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();
// Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();
// Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();
// Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();
// Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
}
}
