public class Solution {

    // Complete the bonAppetit function below.
    static void bonAppetit(List<Integer> bill, int k, int b) 
    {
        int i,sum=0;
      for( i=0;i<bill.size();i++)
      {
           sum=sum+bill.get(i);
      }
      
      int p=(sum-bill.get(k))/2;
      int g=bill.get(k)/2;
      if(p==b)
      System.out.println("Bon Appetit");
      else
      System.out.println(g);
    }
   
