import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Cooles puzzle i ever had!!!!
 *
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int W = in.nextInt(); // width of the building.
        int H = in.nextInt(); // height of the building.
        int N = in.nextInt(); // maximum number of turns before game over.
        int X0 = in.nextInt();
        int Y0 = in.nextInt();
        int i=0;
        String output;
        int bX=X0;
        int bY=Y0;
        int minH=0;
        int maxH=H;
        int minW=0;
        int maxW=W;
        System.err.println("Width:"+W);
        System.err.println("Height:"+H);
        System.err.println("StartX: "+X0+"  StartY:"+Y0);
        while (true) {
            String bombDir = in.next();
            System.err.println(bombDir);
            switch (bombDir){
                case "UR":
                    maxH=bY;
                    bY=(minH+bY)/2;
                    minW=bX;
                    bX=(maxW+bX)/2;
                    break;
                case "DR":
                    minH=bY;
                    bY=(maxH+bY)/2;
                    minW=bX;
                    bX=(maxW+bX)/2;
                    break;
                case "DL":
                    minH=bY;
                    bY=(maxH+bY)/2;
                    maxW=bX;
                    bX=(minW+bX)/2;
                    break;
                case "UL":
                    maxH=bY;
                    bY=(minH+bY)/2;
                    maxW=bX;
                    bX=(minW+bX)/2;
                    break;
                case "U":
                    maxH=bY;
                    bY=(minH+bY)/2;
                    break;
                case "D":
                    minH=bY;
                    bY=(maxH+bY)/2;
                    break;
                case "L":
                    maxW=bX;
                    bX=(minW+bX)/2;
                    break;
                case "R":
                    minW=bX;
                    bX=(maxW+bX)/2;
                    break;
            }
            System.err.println("MinW: "+minW+"  MaxW:"+maxW);
            System.err.println("MinH: "+minH+"  MaxH:"+maxH);
            output = bX+" "+bY;

            System.out.println(output);
        }
    }
}