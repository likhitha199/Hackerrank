  
//This is java code snippet for apple and oranges problem

public class Solution {

    // Complete the countApplesAndOranges function below.
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int count=0,count1=0,i;
        for( i=0;i<apples.length;i++)
        {
            if(a+apples[i]>=s && a+apples[i]<=t)
             count++;
        }
        for(i=0;i<oranges.length;i++)
        {
            if(b+oranges[i]>=s && b+oranges[i]<=t)
             count1++;
        }
  System.out.println(count);
  System.out.println(count1);


    }
