package com.beemail;

public class Main {
    public static void main(String[] args) {
        App app = App.getInstance();

        System.out.println(app);

        User sender = new User("123", "Simon");

        System.out.println(sender);

        User recipient = new User("456", "Charlie");

        sender.addUser(app);
        recipient.addUser(app);

        System.out.println(sender);
        System.out.println(app);

        sender.sendMessage("456", "Hello world!");
    }
}
