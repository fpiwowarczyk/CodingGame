import java.util.*;
import java.io.*;
import java.math.*;

// WORK IN PROGRESS
class Player {
    class Batman {
        public int x;
        public int y;
        public Batman(int x,int y){
            this.x = x;
            this.y = y;
        }
    }

    class Building {
        public int width;
        public int height;
        public Building (int width, int height){
            this.width = width;
            this.height = height;
        }
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int W = in.nextInt(); // width of the building.
        int H = in.nextInt(); // height of the building.
        int N = in.nextInt(); // maximum number of turns before game over.
        int X0 = in.nextInt();
        int Y0 = in.nextInt();
        Batman bat = new Batman(X0,Y0);
        Building building = new Building(W,H);

        while (true) {
            String bombDir = in.next();
            String output = "";
            if(bombDir=="UNKNOWN"){
                batX =
            }

            output = batX+" "+batY;
            System.out.println(output);
        }
    }
}