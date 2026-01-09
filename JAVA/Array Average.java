class Solution {
public static double posAverage (int[] arr) {
// Code here
  double sum=0;
  double count=0;
  for(int i = 0 ;i<arr.length;i++)
  {
    if(arr[i]>=0)
    {
      sum+=arr[i];
      count++;
    }
  }
  if(count==0)
  {
    return 0.0;
  }
  return (sum/count);
}
}
