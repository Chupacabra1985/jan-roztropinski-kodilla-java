package com.kodilla.testing.forum.statistics;

public class ForumStatistics {
    Statistics statistics;

    public void ForumStatistics(Statistics statistics){
        this.statistics = statistics;
    }

    public int getUsersQuantity(Statistics statistics){
        return statistics.usersNames().size();
    }

    public int getPostsCountQuantity(Statistics statistics){
        return statistics.postsCount();
    }

    public int getCommentsCountQuantity(Statistics statistics){
        return statistics.commentsCount();
    }

    public double averagePostsToUser(Statistics statistics){
        return getPostsCountQuantity(statistics)/getUsersQuantity(statistics);
    }

    public double averageCommentsToUser(Statistics statistics){
        return getCommentsCountQuantity(statistics)/getUsersQuantity(statistics);
    }

    public double averageCommentsToPost(Statistics statistics){
        return getCommentsCountQuantity(statistics)/getPostsCountQuantity(statistics);
    }




}
