import java.util.*;
import java.io.*;
import java.math.*;

/*
 * I think that puzzle is kinda dumb with last test.
 * You shouldnt give default value as 0.
 *
 */
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // the number of temperatures to analyse
        int result;
        if(n==0){
            result =0;
        } else {
            result =5526; // Bigges possible value
        }

        int positiveT,positiveResult=result;
        for (int i = 0; i < n; i++) {
            int t = in.nextInt();
            System.err.println("Number: "+t);
            if(t>=0){
                positiveT = t;
            } else{
                positiveT = t-2*t;
            }
            if(positiveT<positiveResult){
                result = t;
                positiveResult = positiveT;
            } else if(positiveT == positiveResult){
                if(t>0){
                    result = t;
                }
            }
        }
        System.out.println(result);
    }
}