public class Constractor {
    String runner;
    String country;
    int distance;
    int timeLimit;
    String place;
    int timeToPrepare;

    Constractor(String runner, String country, int distance, String place, int timeLimit, int timeToPrepare) {
        System.out.println(" Attention... This is our marathon runners information!!!");
        System.out.println(getValues());
    }

    public void setValue(String runner, String country, int distance, String place, int timeLimit, int timeToPrepare) {
        this.runner = runner;
        this.country = country;
        this.distance = distance;
        this.place = place;
        this.timeLimit = timeLimit;
        this.timeToPrepare = timeToPrepare;

    }

    public String getValues() {
        System.out.println("You are uniqe");
        System.out.println("Our amazing runner");
        return "Our runner " + runner + " is from " + country + " did run " + distance + " miles in "
                + place + " in " + timeLimit + " hours  and it took " + timeToPrepare + " to prepare!";
    }
    public void FullMarathon(){
    System.out.println("Our amazing runner");
    System.out.println("Our runner " + runner + " is from " + country + " did run " + distance + " miles in "
    + place + " in " + timeLimit + " hours  and it took " + timeToPrepare + " to prepare!" );
    System.out.println("We are truly proud of you");
    }
    public void HalfMarathon() {
        System.out.println("We also have our young future professional runner!");
        System.out.println(runner + "from our city " + country + " did run first ever marathon " + " he distance is "
                + "since there was no limit");
    }
}

