package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class Works implements MentorObservable {
    private final List<MentorObserver> mentorObservers;
    private final List<String> tasks;
    private final String name;

    public Works(String name) {
        mentorObservers = new ArrayList<>();
        tasks = new ArrayList<>();
        this.name = name;
    }

    public void addTask(String task){
        tasks.add(task);
        notifyMentors();
    }

    @Override
    public void registerMentor(MentorObserver mentorObserver) {
        mentorObservers.add(mentorObserver);
    }

    @Override
    public void notifyMentors() {
        for( MentorObserver mentorObserver : mentorObservers){
            mentorObserver.update(this);
        }
    }

    @Override
    public void removeMentor(MentorObserver mentorObserver) {
        mentorObservers.remove(mentorObserver);
    }

    public List<String> getTasks() {
        return tasks;
    }

    public String getName() {
        return name;
    }
}
