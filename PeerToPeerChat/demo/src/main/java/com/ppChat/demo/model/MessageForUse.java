package com.ppChat.demo.model;
import com.fasterxml.jackson.annotation.JsonProperty;

public class MessageForUse {
    private Message message;
    @JsonProperty ("client")
    private User user;

    public MessageForUse(Message message, String name) {
    }

    public MessageForUse(Message message, User user) {
        this.message = message;
        this.user = user;
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
