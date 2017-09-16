package com.plkpiotr.forum.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Optional;

@Entity
public class User {

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false, length = 10)
    private String nick;

    @Column(nullable = false, length = 32)
    private String password;

    @Column(length = 64)
    private String introduction;

    @OneToMany(mappedBy = "User")
    private List<Topic> listOfTopics;

    @OneToMany(mappedBy = "User")
    private List<Answer> listOfAnswers;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Optional getIntroduction() {
        return Optional.ofNullable(introduction);
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public List<Topic> getListOfTopics() {
        return listOfTopics;
    }

    public void setListOfTopics(List<Topic> listOfTopics) {
        this.listOfTopics = listOfTopics;
    }

    public List<Answer> getListOfAnswers() {
        return listOfAnswers;
    }

    public void setListOfAnswers(List<Answer> listOfAnswers) {
        this.listOfAnswers = listOfAnswers;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", nick='" + nick + '\'' + ", password='" + password + '\'' + ", " +
                "introduction='" + Optional.ofNullable(introduction) + '\'' + '}';
    }
}
