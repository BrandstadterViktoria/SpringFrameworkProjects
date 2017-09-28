package com.ppChat.demo.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.util.Random;

@Entity
@Table(name = "message")
public class Message {

    @Id
    @Column(name = "id", length = 7)
    private Long id;
    private String username;
    private String text;
    private Timestamp timestamp;

    public Message() {
        //this.id = generateIDNumber();
        this.timestamp = new Timestamp(System.currentTimeMillis());
    }

    public Message(String text) {
        this.text = text;
        this.id = generateIDNumber();
        this.timestamp = new Timestamp(System.currentTimeMillis());
    }

    public Message(Long id, String username, String text, Timestamp timestamp) {
        this.id = id;
        this.username = username;
        this.text = text;
        this.timestamp = timestamp;
    }

    public Long getId() {
        return id;

    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Long generateIDNumber() {
        Random rnd = new Random();
        long n = 100000 + rnd.nextInt(900000);
        return n;
    }
}


