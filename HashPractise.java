package Hashpractica;

import java.util.HashMap;

public interface HashPractise {
    public static void main(String[] args) {
        HashMap favorites = new HashMap(100);;
        favorites.put("movie", "shrek");
        favorites.put("band", "LOTL");
        favorites.put("car", "vibe");
        favorites.put("youtuber", "scrumptous");

        System.out.println(favorites);
        System.out.println(favorites.get("youtuber"));

        String handle = "cameronmcnz";

        System.out.println(handle.hashCode());

    }
}
