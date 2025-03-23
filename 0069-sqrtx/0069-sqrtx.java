class Solution {
    public int mySqrt(int x) {
       if(x == 0){
        return 0;
      }if(x == 1){
        return 1; 
      }


      int left  = 1;
      int right = x / 2; 

     while(left <= right){

        int MiddlePoint = left + (right - left)/2;
         long square = (long) MiddlePoint * MiddlePoint;
        if(square == x){
            return MiddlePoint;

        } else if(square <  x){
            left = MiddlePoint + 1; 
        }
        else{
            right = MiddlePoint - 1;
        }

     } 
     return right;  
    }
}