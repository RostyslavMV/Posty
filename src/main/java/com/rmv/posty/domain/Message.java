package com.rmv.posty.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Message {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String text;
    private String tag;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User author;

    public Message(String text, String tag, User userAuthor) {
        this.text = text;
        this.tag = tag;
        this.author = userAuthor;
    }

    public String getAuthorName(){
       return author != null ? author.getUsername() : "<none>";
    }
}
