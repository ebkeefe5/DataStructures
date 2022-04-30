// class Solution {
//     public String decodeString(String s) {
        
//         Stack<Integer> counts = new Stack();
//         Stack<String> words = new Stack();
//         String result = "";
//         int index = 0;
        
//         while (index < s.length())
//         {
//             Character curr = s.charAt(index);
//             if (Character.isDigit(curr))
//             {
//                 int num = 0;
//                 while(Character.isDigit(curr))
//                 {
//                     num = num * 10 + curr - '0';
//                     index ++;
//                     curr = s.charAt(index);
//                 }
//                 counts.push(num);
//             }
//             else if (curr == '[')
//             {
//                 words.push(result);
//                 result = "";
//                 index++;
//             }
//             else if (curr == ']')
//             {
//                 StringBuilder sb = new StringBuilder();
//                 sb.append(words.pop());
//                 int times = counts.pop();
//                 for (int i = 0; i < times; i++)
//                 {
//                     sb.append(result);
//                 }
//                 result = sb.toString();
//                 index++;
//             }
//             else
//             {
//                 result += s.charAt(index);
//                 index++;
//             }
//         }
//         return result;
//     }
// }