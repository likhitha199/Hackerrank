public class Solution {

    // Complete the beautifulDays function below.
    static int beautifulDays(int i, int j, int k) 
    {
        int temp,r,rev=0,p,tot=0;
        for(int g=i;g<=j;g++)
        {
            temp=g;
            rev=0;
            while(temp!=0)
            {
            r=temp%10;
            rev=rev*10+r;
            temp=temp/10;

            }
            p=Math.abs(rev-g);
            if(p%k==0)
            {
             tot++;
            }
           
        }
        return tot;


    }
