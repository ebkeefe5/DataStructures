//O(1) constant no loop
//O(log N) logorithmetic - usually searching algorithms have log(n) if they are sorted (binary search) 
//O(n) linear, such as for loops or while loops
//O(n*log(n)) Log linear, sorting operations usually
//O(2^n) Exponential-recurisve algorithms that solve a problem
//of size n
//O(n!)

//Iterating through half a collection is still O(n)
//Iterating over two collectsion is O(a + b)

//What can cause time in a function
//Operations (+  -, *, /)
//Comparisons (<, >)

//Rule Book
//Always consider the worst case
//Remove constants
//Different inputs should have different variables
  //example iterating over two different arrays is O(a + b)
  //iterating over two different arrays in a nexted way is O(a*b)
//Drop non dominant terms

//What causes space complexity?
//Variables
//Data Structures
//Function Calls
//Allocations