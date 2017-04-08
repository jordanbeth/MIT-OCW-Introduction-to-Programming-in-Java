# Good Programming Design

### Elements of a good program
1. Correct / no errors
2. Easy to understand
3. Easy to modify / extend
4. Good performance (speed)
---
### Consistency
* Writing code in a consistent way makes it easier to write and understand
* Importance of programming "style" guides
* Java has some widely accepted "standard" style guidelines -- Use them
---
### Naming
* Variables
  - use **nouns** for names and **camelCase** for composition
  - __**ex**__: x, shape, highScore, fileName

* Methods
  - use **verbs** for names and **camelCase** for composition
  - __**ex**__: getSize(), draw(), drawWithColor()

* Classes
  - use **nouns** for names and **capitalize** each word in the name
  - __**ex**__: Shape, WebPage, EmailAddress

### Good Class Design

Good classes are easy to understand and use.

* Make **fields** and **methods** private by default
* Only make public methods if you need to
* If you need to access a field, create a method
  - __**ex**__: ''' java public int getBar(){return bar;} '''
