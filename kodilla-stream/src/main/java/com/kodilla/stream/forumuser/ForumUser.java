package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int id;
    private final String name;
    private final char sex;
    private final LocalDate date;
    private final int postsQuantity;

    public ForumUser(final int id, final String name, final char sex, final LocalDate date, final int postsQuantity){
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.date = date;
        this.postsQuantity = postsQuantity;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", date=" + date +
                ", postsQuantity=" + postsQuantity +
                '}';
    }
}
