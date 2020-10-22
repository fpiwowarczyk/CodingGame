import java.util.*;

import net.sourceforge.pmd.lang.vm.directive.Break;

import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Player {

    public static void main(String args[]) {  // x -->i
        Scanner in = new Scanner(System.in);  // y -->j
        String arr[][] = new String[16][30];
        String safeHit = "15 8 3 4 3 5";
        System.out.println(safeHit);
        // game loop
        while (true) {
            for (int i = 0; i < 16; i++) {
                for (int j = 0; j < 30; j++) {
                    String cell = in.next(); // '?' if unknown, '.' if no mines nearby, '1'-'8' otherwise
                    arr[i][j]=cell;
                }
            }
            for (int i = 0; i < 16; i++) {
                for (int j = 0; j < 30; j++) {
                    if(arr[i][j]!="."&&arr[i][j]!="?"){
                        checkForSureOnes(arr,i,j);
                    }
                }
            }





            //System.err.print(printBoard(arr));
        }
    }
    public static String checkForSureOnes(String[][] arr,int x,int y){
        String output="";
        // surroundings U->UR->R->DR->D->DL->L->UL
        String surroundings = lookAround(arr,x,y);
        int
        return output;
    }

    public static String lookAround(String[][] arr,int x,int y){
        String output="";
        for(int i=0;i<=7;i++){
            switch(i){
                case 0:
                    output +=arr[x][y-1]; // UP
                    break;
                case 1:
                    output += arr[x+1][y-1]; //UP RIGHT
                    break;
                case 2:
                    output += arr[x+1][y]; // RIGHT
                    break;
                case 3:
                    output += arr[x+1][y+1];// DOWN RIGHT
                    break;
                case 4:
                    output += arr[x][y+1]; // DOWN
                    break;
                case 5:
                    output += arr[x-1][y+1]; // DOWN LEFT
                    break;
                case 6:
                    output += arr[x-1][y]; // LEFT
                    break;
                case 7:
                    output += arr[x-1][y-1]; // LEFT UP
                    break;
            }
        }
        return output;
    }


    public static String printBoard(String[][] arr){
        String output="";

        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 30; j++) {
                output+=arr[i][j];
            }
            output+="\n";
        }
        return output;
    }
}