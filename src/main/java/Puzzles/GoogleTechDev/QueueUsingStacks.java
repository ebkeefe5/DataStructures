package Puzzles.GoogleTechDev;

import java.util.Stack;

//I somehow guess the better solution
//the slower solution is 
//when pushing O(n) move everything from s1 into s2, then
//push the element into s1, then move the elements on s2 back on top
//popping is just an O(1) operation

//remember stacks and queues are very restritive of 
//the operations allowed but they are very efficent for the
//allowed operation, namely push, pop, peek, and isEmpty

class MyQueue {
    
    private Stack<Integer> pushStack;
    private Stack<Integer> popStack;

    public MyQueue() {
        pushStack = new Stack<>();
        popStack = new Stack<>();
    }
    
    public void push(int x) {
        pushStack.push(x);
    }
    
    public int pop() {
        if (!popStack.isEmpty())
            return popStack.pop();
        while (!pushStack.isEmpty())
        {
            popStack.push(pushStack.pop());                
        }
        return popStack.pop();
    }
    
    public int peek() {
        if (!popStack.isEmpty())
            return popStack.peek();
        while(!pushStack.isEmpty())
        {
             popStack.push(pushStack.pop());         
        }
        return popStack.peek();
    }
    
    public boolean empty() {
        return popStack.isEmpty() && pushStack.isEmpty();
    }
}