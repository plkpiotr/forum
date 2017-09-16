package com.plkpiotr.forum.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false, length = 10)
    private String nick;

    @Column(nullable = false, length = 32)
    private String password;



}
