package org.example;

public class MyFriendIs {
    public static void main(String[] args) {
        String friendName = "Christina";
        System.out.println(generateGreeting(friendName));
    }

    public static String generateGreeting(String name) {
        return "Hi " + name + "!";
    }
}




