import java.util.*;
import java.io.*;
import java.math.*;


class Solution {
        // A-Z 65-90
        // a-z 97-122
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int L = in.nextInt();
        int H = in.nextInt();
        System.err.println("Length: "+L);
        System.err.println("Height: "+H);
        if (in.hasNextLine()) {
            in.nextLine();
        }

        String output = "";
        String T = in.nextLine();
        System.err.println("Given text:"+T);
        int[] asciis = convertToAscii(T);
        for(int i=0;i<asciis.length;i++){
            System.err.println(asciis[i]);
        }

        for (int i = 0; i < H; i++) {
            String ROW = in.nextLine();
            System.err.println(ROW);
            for(int j=0;j<asciis.length;j++){
                int startIndex =  L*(asciis[j]-65);
                int endIndex = L*(asciis[j]-65)+L;
                output+=ROW.substring(startIndex,endIndex);
            }
            output +="\n";
        }

        System.out.println(output);
    }

    public static int[] convertToAscii(String T){
        int[] asciis = new int[T.length()];

        for(int i =0;i<T.length();i++){
            int character = (int) T.charAt(i);
            if(character <65 || (character>90&&character<97)||character>122)
                character = 65+26;
            else if(character > 90)
                character = character - 32;
            asciis[i] = character;
        }

        return asciis;
    }
}