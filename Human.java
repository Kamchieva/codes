package OOP;

public class Human {

    String name;
    int age;
    double height;

public Human(String name, int age, double height){
    this.name = name;
    this.age = age;
    this.height = height;
}
void eat(){
    System.out.println(name + " is eating");
}

void drink(String name, int age){
    System.out.println(name + " is "+ age +" is drinking and Burp");
}
}
