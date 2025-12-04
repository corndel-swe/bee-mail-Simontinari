package com.beemail;

import java.util.ArrayList;
import java.util.List;

public class App {
    private static App instance;
    private final List<User> users = new ArrayList<>();

    private App() {
    }

    public static App getInstance() {
        if (instance == null) {
            instance = new App();
        }

        return instance;
    }

    public void addUser(User user) {
        user.setApp(this);
        users.add(user);
    }

    public User findUser(String userID) {

        return null;
    }

    public void deliverMessage(String senderId, String recipientId, String content) {
        // TODO: IMPLEMENT THIS
        // How can you find both users (sender and recipient) by their given IDs?
        // How can you create a message?
        // How can the recipient receive a message?
    }

    @Override
    public String toString() {
        return "App{" +
                "users=" + users +
                '}';
    }
}
