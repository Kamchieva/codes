public class Boolean {
    public static  boolean lucky13(int[] nums) {
        int numbers = 0;

        for(int i = 0; i < nums.length; i++){
            numbers = nums[i];

            if(numbers == 1 && numbers == 3){
                return false;
            }
           else if(numbers != 1 && numbers != 3){
               return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] number = { 3, 6, 7};
        int[] number1 = { 4, 6, 8, 9, 1};
        System.out.println(lucky13(number1));
    }

}