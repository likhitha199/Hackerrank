public class Solution {

    // Complete the catAndMouse function below.
    static String catAndMouse(int x, int y, int z) {
        if(Math.abs(z-x)<Math.abs(z-y))
            return "Cat A";
         else if(Math.abs(z-x)==Math.abs(z-y))
            return "Mouse C";
        else
            return"Cat B";


    }
