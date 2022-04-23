// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

// An input string is valid if:

// Open brackets must be closed by the same type of brackets.
// Open brackets must be closed in the correct order.

// class Solution 
// {
//     public boolean isValid(String s) 
//     {
//         List<Character> stack = new ArrayList<>();
//         Map<Character, Character> match = new HashMap<>();
//         match.put('(', ')');
//         match.put('[', ']');
//         match.put('{', '}');
        
//         for (char c: s.toCharArray())
//         {
//             if (c == '(' || c == '[' || c == '{')
//                 stack.add(c);
//             else
//             {
//                 if (stack.size() == 0)
//                     return false;
//                 char left = stack.remove(stack.size() - 1);
//                 if (match.get(left) != c)
//                     return false;
//             }
//         }
//         if (stack.isEmpty())
//             return true;
//         return false;
//     }
// }