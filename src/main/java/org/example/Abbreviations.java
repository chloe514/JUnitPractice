package org.example;
import java.util.HashMap;
import java.util.Map;

public class Abbreviations {
    // A HashMap to store abbreviations and their explanations
    private Map<String, String> abbreviations;

    // Constructor
    public Abbreviations() {
        this.abbreviations = new HashMap<>();
    }

    // Method to add an abbreviation and its explanation
    public void addAbbreviation(String abbreviation, String explanation) {
        this.abbreviations.put(abbreviation, explanation);
    }

    // Method to check if an abbreviation has been added
    public boolean hasAbbreviation(String abbreviation) {
        return this.abbreviations.containsKey(abbreviation);
    }

    // Method to find the explanation for an abbreviation
    public String findExplanationFor(String abbreviation) {
        return this.abbreviations.getOrDefault(abbreviation, null);
    }

    // Main method to test the Abbreviations class
    public static void main(String[] args) {
        // Create a new Abbreviations object
        Abbreviations abbreviations = new Abbreviations();

        // Add some abbreviations
        abbreviations.addAbbreviation("LOL", "Laugh Out Loud");
        abbreviations.addAbbreviation("BRB", "Be Right Back");
        abbreviations.addAbbreviation("GTG", "Got To Go");

        // Check if abbreviations have been added
        System.out.println(abbreviations.hasAbbreviation("LOL")); // true
        System.out.println(abbreviations.hasAbbreviation("IDK")); // false

        // Find explanations for abbreviations
        System.out.println(abbreviations.findExplanationFor("LOL")); // Laugh Out Loud
        System.out.println(abbreviations.findExplanationFor("BRB")); // Be Right Back
        System.out.println(abbreviations.findExplanationFor("IDK")); // null
    }
}
