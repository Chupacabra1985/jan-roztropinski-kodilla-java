package com.kodilla.testing.forum.statistics;

public class ForumCalculator {
    Statistics statistics;
    double usersQuantity;
    double postsCountQuantity;
    double commentsCountQuantity;
    double commentsToUser;
    double postsToUser;
    double commentsToPost;


    public ForumCalculator(Statistics statistics){
        this.statistics = statistics;
    }

    public double getUsersQuantity(){
        return statistics.usersNames().size()*1.0;
    }

    public double getPostsCountQuantity(){
        return statistics.postsCount()*1.0;
    }

    public double getCommentsCountQuantity(){
        return statistics.commentsCount()*1.0;
    }

    public double averagePostsToUser(){
        return (getPostsCountQuantity()/getUsersQuantity());
    }

    public double averageCommentsToUser(){
        return (getCommentsCountQuantity()/getUsersQuantity());
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
