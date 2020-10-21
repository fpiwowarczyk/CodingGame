// !!!!!!!!!!!!!!!!!
// These program cannot run on it's own it is answer for coding game puzzle called like Package.
// !!!!!!!!!!!!!!!!!
package Power_Of_Thor;

import java.util.*;
import java.io.*;
import java.math.*;


class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int initialTx = in.nextInt(); // Thor's starting X position
        int initialTy = in.nextInt(); // Thor's starting Y position
        String output ="";

        int Tx=initialTx;
        int Ty=initialTy;
        while (true) {
            int remainingTurns = in.nextInt(); // The remaining amount of turns Thor can move. Do not remove this line.
            output ="";

            if(lightY>Ty){
                output +="S";
            } else if (lightY <Ty){
                output +="N";
            }
            if(lightX>Tx){
                output += "E";
            } else if(lightX<Tx){
                output += "W";
            }
            switch(output){
                case "NE":
                    Ty--;
                    Tx++;
                    break;
                case "SE":
                    Ty++;
                    Tx++;
                    break;
                case "SW":
                    Ty++;
                    Tx--;
                    break;
                case "NW":
                    Ty--;
                    Tx--;
                    break;
                case "N":
                    Ty--;
                    break;
                case "E":
                    Tx++;
                    break;
                case "W":
                    Tx--;
                    break;
                case "S":
                    Ty++;
                    break;
            }
            System.out.println(output);
        }
    }
}