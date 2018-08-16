package com.example.tdd.persistence.entity;

import com.example.tdd.model.Tweet;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tweets")
@NoArgsConstructor
public class TweetJPA extends Tweet {

    public TweetJPA(Tweet from) {
        super(from);
    }

    @Id
    @GeneratedValue
    @Override
    public Long getId() {
        return id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "author_id", nullable = false)
    public UserJPA getAuthor() {
        return new UserJPA(author);
    }
}
