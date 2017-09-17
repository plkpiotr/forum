package com.plkpiotr.forum.entity;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.List;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class Topic {

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false, length = 16)
    private String title;

    @Column(nullable = false, length = 256)
    private String content;

    @Column(nullable = false, length = 16)
    private String category;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;

    @OneToMany(mappedBy = "Topic")
    private List<Answer> answers;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }
}
