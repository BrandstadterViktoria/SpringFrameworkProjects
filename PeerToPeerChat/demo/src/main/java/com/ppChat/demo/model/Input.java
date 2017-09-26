package com.ppChat.demo.model;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Input {
    private Message message;
    @JsonProperty ("client")
    private User user;

    public Input() {
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
