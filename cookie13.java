import java.util.Random;

public class cookie13 {

  static  String[] cookie = {" Hi, How are you?", "How is it going?", "Is your life going good?", "When are you planning to find a job", "if they are not responding just look for another job"};

    public static void main(String[] args) {
       Random rand = new Random();
       int r = rand.nextInt(cookie.length);
        System.out.println(cookie[r]);
    }
}
