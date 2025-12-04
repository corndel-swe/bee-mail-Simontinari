package com.beemail;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String id;
    private String username;
    private final List<Message> inbox = new ArrayList<>();
    private App app;

    public User(String id, String username) {
        this.id = id;
        this.username = username;
    }

    public void addUser(App app) {
        app.addUser(this);
    }

    public void sendMessage(String recipientId, String content) {
        // TODO: IMPLEMENT THIS
        // How can you pass the relevant information to the App, which is the mediator and will be responsible for communicating with the recipient?
        System.out.println(id);
        System.out.println(recipientId);
        System.out.println(content);
    }

    public void setApp(App app) {
        this.app = app;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", inbox=" + inbox +
                '}';
    }
}
