package Puzzles.GoogleTechDev;

import java.util.Stack;

/*
Your input is a compressed string of the format number[string] and the decompressed output form should be the string written number times.

10[a] is allowed, and just means aaaaaaaaaa

One repetition can occur inside another. For example, 2[3[a]b] decompresses into aaabaaab
 */


//TODO recode from scratch and handle invalid inputs
class DecodeStrings {
     public String decodeString(String s) {
        
         Stack<Integer> counts = new Stack();
         Stack<String> words = new Stack();
         String result = "";
         int index = 0;
        
         while (index < s.length())
         {
             Character curr = s.charAt(index);
             if (Character.isDigit(curr))
             {
                 int num = 0;
                 while(Character.isDigit(curr))
                 {
                     num = num * 10 + curr - '0';
                     index ++;
                     curr = s.charAt(index);
                 }
                 counts.push(num);
             }
             else if (curr == '[')
             {
                 words.push(result);
                 result = "";
                 index++;
             }
             else if (curr == ']')
             {
                 StringBuilder sb = new StringBuilder();
                 sb.append(words.pop());
                 int times = counts.pop();
                 for (int i = 0; i < times; i++)
                 {
                     sb.append(result);
                 }
                 result = sb.toString();
                 index++;
             }
             else
             {
                 result += s.charAt(index);
                 index++;
             }
         }
         return result;
     }
 }