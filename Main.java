 abstract class Dog{

    public void bark(){
        System.out.println("Bark!");
    }
    public abstract void poop();
}

   class Chihuahua extends Dog{
       @Override
       public void poop() {
           System.out.println("Dog pooped!");
       }
   }



    public class Main{

    public static void main(String[] args) {

        Chihuahua d = new Chihuahua();
        d.bark();
        d.poop();


    }
    }
