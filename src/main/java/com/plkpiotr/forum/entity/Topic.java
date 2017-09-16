package com.plkpiotr.forum.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Topic {

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false, length = 16)
    private String title;

    @Column(nullable = false, length = 256)
    private String content;

}
