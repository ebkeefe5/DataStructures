package Puzzles.GoogleTechDev;//3[abc]4[ab]c
//gets mapped to abcabcabcababababc

//10[a]
//aaaaaaaaaa

//2[3[a]4[c]b]

//b
//aaacccc

//2





//4
//2    //"aaa"


//String answer = ''
//

//3
//2

import java.util.Stack;

class DecompressCompressedString
{
  public DecompressCompressedString(){};
  
  public void decompress(String s)
  {
    Stack<Integer> numberStack = new Stack<>();
    
    Stack<String> answerStack = new Stack<>();
    //21[3[a]4[c]b]
    String freq = "";
    for (char c: s.toCharArray())
    {
      if (c == '[')
      {
        numberStack.push(Integer.valueOf(freq));
        freq = "";
      }
      else if (c == ']')
      {
        //pop from the stacks, decompress and combine
      }
      if (Character.isDigit(c))
      {
         freq += c;
      }
      else if (Character.isLetter(c))
      {
        //build up the current character
      }
    }   
  }
}