package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies(){
        //Given
        User john = new Millenials("John Malkovic");
        User mark = new YGeneration("Mark Ross");
        User katrina = new ZGeneration("Katrina Smith");

        //When
        String johnShare = john.sharePost();
        System.out.println("John: " +johnShare);
        String markShare = mark.sharePost();
        System.out.println("Mark: " +markShare);
        String katrinaShare = katrina.sharePost();
        System.out.println("Katrina: " +katrinaShare);

        //Then
        Assert.assertEquals("Facebook User", johnShare);
        Assert.assertEquals("Twitter User", markShare);
        Assert.assertEquals("Snapchat User", katrinaShare);
    }

    @Test
    public void testIndividualSharingStrategy(){
        //Given
        User john = new Millenials("John Malkovic");

        //When
        String johnShare = john.sharePost();
        System.out.println("John: " +johnShare);
        john.setSocialPublisher(new TwitterPublisher());
        johnShare = john.sharePost();
        System.out.println("John: " +johnShare);

        //Then
        Assert.assertEquals("Twitter User", johnShare);
    }
}
