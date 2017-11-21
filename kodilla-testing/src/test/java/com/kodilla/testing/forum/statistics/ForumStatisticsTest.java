package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTest {

    private List<String> generateUsersList(int usersQuantity){
        List<String> resultList = new ArrayList<String>();
        for(int n=1; n<=usersQuantity; n++){
            String user = new String("abc"+n);
            resultList.add(user);
        }
        return resultList;
    }

    @Test
    public void testUsers0(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> resultList0Users = new ArrayList<String>();
        when(statisticsMock.usersNames()).thenReturn(resultList0Users);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(100);
        ForumCalculator forumCalculator = new ForumCalculator(statisticsMock);

        //When
        double commentsToPost = forumCalculator.averageCommentsToPost();
        int usersQuantity = forumCalculator.getUsersQuantity();

        //Then
        Assert.assertEquals(1.0, commentsToPost,0.01);
        Assert.assertEquals(0,usersQuantity);

    }

    @Test
    public void testUsers100(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> resultList100Users = generateUsersList(100);
        when(statisticsMock.usersNames()).thenReturn(resultList100Users);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(100);
        ForumCalculator forumCalculator = new ForumCalculator(statisticsMock);

        //When
        double commentsToPost = forumCalculator.averageCommentsToPost();
        double commentsToUser = forumCalculator.averageCommentsToUser();
        double postsToUser = forumCalculator.averagePostsToUser();

        //Then
        Assert.assertEquals(1.0, commentsToPost,0.1);
        Assert.assertEquals(1.0, commentsToUser,0.1);
        Assert.assertEquals(1.0, postsToUser,0.1);

    }

    @Test
    public void testMoreComments(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> resultList100Users = generateUsersList(100);
        when(statisticsMock.usersNames()).thenReturn(resultList100Users);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(500);
        ForumCalculator forumCalculator = new ForumCalculator(statisticsMock);

        //When
        double commentsToPost = forumCalculator.averageCommentsToPost();
        double commentsToUser = forumCalculator.averageCommentsToUser();
        double postsToUser = forumCalculator.averagePostsToUser();

        //Then
        Assert.assertEquals(5.0, commentsToPost,0.1);
        Assert.assertEquals(5.0, commentsToUser,0.1);
        Assert.assertEquals(1.0, postsToUser,0.1);

    }

    @Test
    public void testMorePosts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> resultList100Users = generateUsersList(100);
        when(statisticsMock.usersNames()).thenReturn(resultList100Users);
        when(statisticsMock.postsCount()).thenReturn(500);
        when(statisticsMock.commentsCount()).thenReturn(100);
        ForumCalculator forumCalculator = new ForumCalculator(statisticsMock);

        //When
        double commentsToPost = forumCalculator.averageCommentsToPost();
        double commentsToUser = forumCalculator.averageCommentsToUser();
        double postsToUser = forumCalculator.averagePostsToUser();

        //Then
        Assert.assertEquals(0.2, commentsToPost,0.2);
        Assert.assertEquals(1.0, commentsToUser,0.1);
        Assert.assertEquals(5.0, postsToUser,0.1);

    }

    @Test
    public void testComments0(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> resultList100Users = generateUsersList(100);
        when(statisticsMock.usersNames()).thenReturn(resultList100Users);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(0);
        ForumCalculator forumCalculator = new ForumCalculator(statisticsMock);

        //When
        int comments= forumCalculator.getCommentsCountQuantity();
        double commentsToUser = forumCalculator.averageCommentsToUser();
        double postsToUser = forumCalculator.averagePostsToUser();

        //Then
        Assert.assertEquals(0, comments);
        Assert.assertEquals(0, commentsToUser,0.1);
        Assert.assertEquals(1.0, postsToUser,0.1);

    }

    @Test
    public void testPosts1000(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> resultList100Users = generateUsersList(100);
        when(statisticsMock.usersNames()).thenReturn(resultList100Users);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(100);
        ForumCalculator forumCalculator = new ForumCalculator(statisticsMock);

        //When
        double commentsToPost = forumCalculator.averageCommentsToPost();
        double commentsToUser = forumCalculator.averageCommentsToUser();
        double postsToUser = forumCalculator.averagePostsToUser();

        //Then
        Assert.assertEquals(0.1, commentsToPost, 0.1);
        Assert.assertEquals(1.0, commentsToUser,0.1);
        Assert.assertEquals(10.0, postsToUser,0.1);

    }

    @Test
    public void testPosts0(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> resultList100Users = generateUsersList(100);
        when(statisticsMock.usersNames()).thenReturn(resultList100Users);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(100);
        ForumCalculator forumCalculator = new ForumCalculator(statisticsMock);

        //When
        int  post = forumCalculator.getPostsCountQuantity();
        double commentsToUser = forumCalculator.averageCommentsToUser();
        double postsToUser = forumCalculator.averagePostsToUser();

        //Then
        Assert.assertEquals(0, post);
        Assert.assertEquals(1.0, commentsToUser,0.1);
        Assert.assertEquals(0.0, postsToUser,0.1);

    }
}
