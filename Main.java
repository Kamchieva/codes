package DataS;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public class rows{

    }

    public static void main(String[] args) {


        String[][] array = {{"l", "l", "l","l","l","l","l","l","l"},
                           {"l", "l", "l","l","l","l","l","l","l"},
                           {"l", "l", "l","l","l","l","l","l","l"},
                           {"l", "l", "l","l","l","l","l","l","l"},
                           {"l", "l", "l","l","l","l","l","l","l"},
                           {"l", "l", "l","l","l","l","l","l","l"} };

       for(int i = 0; i < array.length; i++){

           System.out.println(" ");

           for(int j = 0; j < array[i].length;  j++) {


               System.out.print(array[i][j] + " ");


           }
       }


    }
}
