##### Methods
* A method can be used without understanding *how* it works. __**ex**__: `System.out.println()`
  - **encapsulation** (which provides a layer of abstraction)
  - **information hiding**

##### Objects
* An Object combines a related set of variables and methods
* Provides a simple interface
  - **encapsulation** (provides a layer of abstraction)

# Java Interfaces

1. Allow you to **manipulate objects**, without knowing how they work
  - Useful when you have similar, but not identical, objects
  - Useful when you want to use code written by others

2. *If you have a set of classes that share methods*
  - Declare an *interface* with common methods

3. Interfaces can be used without knowing an object's specific type
  - __**ex**__: Drawable Interface
    ```java
      import java.awt.Graphics;

      interface Drawable {
        void draw(Graphics surface);
        void setColor(Color color);
      }
    ```
  - __**ex**__: Implementing the Drawable Interface
    ```java
       import java.awt.Graphics;

       class Flower implements Drawable {
         //...other code...
         public void draw(Graphics Surface){
           //... code to draw a flower here
         }
       }
    ```

### Interface Notes
* Interfaces only have methods (mostly true)
* They do not provide code, only definitions (called *signatures*)
* A class can implement any number of interfaces

### Using Interfaces
* Can only access stuff in the interface
__**ex**__:
    ```java
      Drawable d = new BouncingBox(...);
      d.setMovementVector(1, 1); // this method is UNDEFINED for the type Drawable
    ```

# Casting
* Casting allows you to take an Object of one particular type and "turn it into" another Object type
* Downcast - taking the Object and casing it into a more **specific** type of Object
  - __**ex**__:
        ```java
           Object aSentenceObject = "This is a regular sentence";
           String aSentenceString = (String)aSentenceObject;
        ```
* Downcast - taking the variable with a *more specific type* and casing it into a variable type that is more generic
  - __**ex**__:
        ```java
           Object aSentenceString = "This is a regular sentence";
           String aSentenceObject = (Object)aSentenceString;
        ```
* If you know that a variable holds a specific type, you can use a cast:
  - __**ex**__:
      ```java
         Drawable d = new BouncingBox(...);
         BouncingBox box = (BouncingBox) d;
         d.setMovementVector(1, 1); // now this works because this method is DEFINED for the type BouncingBox
      ```
