package Mapp;

import java.util.HashMap;

public class Mat {
    public static void main(String[] args) {
        HashMap<String, String> countries = new HashMap<String, String>();

        countries.put("USA", "Washington DC");
        countries.put("Canada", "Ottawa");
        countries.put("UK", "London");
        countries.replace("USA", "Detroit");
        System.out.println(countries);
        System.out.println(countries.containsValue("London"));

//     for(String i : countries.keySet()){
//         System.out.print(i + "\t"+"= ");
//         System.out.println(countries.get(i));
//
//     }



    }
}
