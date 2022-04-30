package Puzzles.GoogleTechDev;

import java.util.ArrayList;
import java.util.List;

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

class MinStack {

     private List<Integer> stack;
     private List<Integer> min;
    
     public MinStack() {
         stack = new ArrayList<>();
         min = new ArrayList<>();
     }
    
     public void push(int val) {
         stack.add(val);
         if (min.size() == 0)
             min.add(val);
         else if (val < min.get(min.size() - 1))
             min.add(val);
         else
             min.add(min.get(min.size() - 1));
     }
    
     public void pop() {
         min.remove(min.size() - 1);
         stack.remove(stack.size() - 1);
     }
    
     public int top() {
         return stack.get(stack.size() - 1);
     }
    
     public int getMin() {
         return min.get(min.size() - 1);
     }
 }