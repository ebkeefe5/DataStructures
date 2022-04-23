Module containing implementations of basic data structures and a few hidden algorithms within them
* MyGraph contains DFS and BFS implementations
* BinarySearchTree contains implementations of inOrder, postOrder, preOrder, and levelOrder traversals

Time complexity notes
* O(1) constant no loop
* retrieving an item from a list at an index

O(log N) logorithmetic -
* usually searching algorithms take log(n) time 
* searching for a number in a balanced binary search tree

O(n) linear
* looping over the elements in a list
* iterating over all the values in a tree
* Iterating through half a collection is still O(n) Iterating over two collections is O(a + b)

O(n*log(n)) Log linear
* sorting operations are often of this time complexity

O(2^n) Exponential-recurisve algorithms that solve a problem of size n
* We try never to do this

O(n!)
* We should never do this
