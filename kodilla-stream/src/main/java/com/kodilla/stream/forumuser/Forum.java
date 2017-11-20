package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theUserList = new ArrayList<>();

    public Forum(){
        theUserList.add(new ForumUser(123,"Adam",'M', LocalDate.of(1985,12,5),6 ));
        theUserList.add(new ForumUser(050, "Kasia",'F', LocalDate.of(1970,5,15),47 ));
        theUserList.add(new ForumUser(001,"Wojtek", 'M', LocalDate.of(2001, 1,10), 182));
        theUserList.add(new ForumUser(562, "Ania", 'F', LocalDate.of(2009,9,1), 0));
        theUserList.add(new ForumUser(001, "Tomek", 'M', LocalDate.of(2010,3,15),26));
    }

    public List<ForumUser>getUserList(){
        return new ArrayList<>(theUserList);
    }


}
