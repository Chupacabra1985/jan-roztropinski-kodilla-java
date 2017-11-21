package com.kodilla.testing.forum.statistics;

public class ForumCalculator {
    Statistics statistics;
    int usersQuantity;
    int postsCountQuantity;
    int commentsCountQuantity;
    double commentsToUser;
    double postsToUser;
    double commentsToPost;


    public ForumCalculator(Statistics statistics){
        this.statistics = statistics;
    }

    public int getUsersQuantity(){
        return statistics.usersNames().size();
    }

    public int getPostsCountQuantity(){
        return statistics.postsCount();
    }

    public int getCommentsCountQuantity(){
        return statistics.commentsCount();
    }

    public double averagePostsToUser(){
        return getPostsCountQuantity()/getUsersQuantity();
    }

    public double averageCommentsToUser(){
        return getCommentsCountQuantity()/getUsersQuantity();
    }

    public double averageCommentsToPost(){
        return getCommentsCountQuantity()/getPostsCountQuantity();
    }

    public void calculateAdvStatistics(){
        usersQuantity = this.getUsersQuantity();
        postsCountQuantity = this.getPostsCountQuantity();
        commentsCountQuantity = this.getCommentsCountQuantity();
        postsToUser = this.averagePostsToUser();
        commentsToUser = this.averageCommentsToUser();
        commentsToPost = this.averageCommentsToPost();
    }

}
