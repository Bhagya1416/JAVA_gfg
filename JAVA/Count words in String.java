class Solution {
// Complete the function
// str: input string
  public static int countWords (String str) {
  // find and return the number of words
  // present in the string
  if(str==null || str.isEmpty())
  {
    return 0;
  }
  String[] words=str.split(" ");
  return words.length;
  }
}
