package org.example;

import java.util.HashMap;

public class Nicknames {
    private HashMap<String, String> nicknames;

    // Constructor initializes the HashMap and adds some nicknames
    public Nicknames() {
        nicknames = new HashMap<>();
        nicknames.put("matthew", "matt");
        nicknames.put("michael", "mix");
        nicknames.put("arthur", "artie");
    }

    // Method to retrieve a nickname for a given name
    public String getNickname(String name) {
        return nicknames.get(name);
    }

    // Main method is only for demonstration, not for testing
    public static void main(String[] args) {
        Nicknames nicknames = new Nicknames();
        String matthewsNickname = nicknames.getNickname("matthew");
        System.out.println("Matthew's nickname is: " + matthewsNickname);
    }
}

