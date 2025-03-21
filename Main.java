package org.example;

public class Main{
    public static int binary(int[] numbers, int target){
        int low = 0;
        int high = numbers.length -1;

        while(low <= high ){
            int middlePosition = (low + high)/2;
            int middleValue = numbers[middlePosition];

      if(target ==  middleValue){
          return middlePosition;
      } if(target < middleValue ){
          high = middlePosition -1;
            }
      else{
          low = middlePosition + 1;
            }
        }

     return -1;
    }


    public static void main(String[] args) {
        int[] numbers = { 1, 3, 4, 6, 7, 8, 9, 11, 12};



        System.out.println(binary(numbers,11));

    }

}