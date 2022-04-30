package Puzzles.GoogleTechDev;

import java.util.Stack;

//implement a queue using two stacks

class QueueUsingStacks {
    
    private Stack<Integer> pushStack;
    private Stack<Integer> popStack;

    public QueueUsingStacks() {
        pushStack = new Stack<>();
        popStack = new Stack<>();
    }
    
    public void push(int x) {
        pushStack.push(x);
    }
    
    public int poll() {
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