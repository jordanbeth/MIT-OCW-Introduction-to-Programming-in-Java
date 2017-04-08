# Pseudocode
* A high-level, understandable description of what a program is supposed to do
* Focus on structure, NOT details
  + __**example**__: Is a number within the interval [x, y)?
  + __**pseudocode**__:
     - If number < x return false
     - If number >= y return false
     - Return true

# Debugging

### 1. Don't Make Mistakes
* Do NOT introduce errors in the first place
  - __**Reuse**__: find existing code that does what you want
  - __**Design**__: think before you code - **Pseudocode**
  - __**Best Practices__: Recommended procedures / techniques to avoid common problems

### 2. Find Mistakes Early
* It is easier to fix errors the earlier you find them
  - Test your design
  - Tools: Detect potential errors
  - Test your implementation
  - Check your work: [assertions](http://docs.oracle.com/javase/7/docs/technotes/guides/language/assert.html)

### 3. Reproduce the Error
* Figure out how to repeat the error
* Create a minimal test case
  - go back to a working version
  - introduce changes one at a time until the error reappears
  - eliminate extra stuff that is not used

### 4. Generate Hypothesis
* What is going wrong?
* What might be causing the error?
* Question your assumptions

### 5. Collect Information
* Get information about what is going on inside the program
* `System.out.println()` is a very powerful debugging tool

---
### JUnit Testing (Eclipse, Ant, or Maven)
* Use this regression testing framework to implement unit testing in Java
