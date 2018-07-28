package com.jttw.springbootstarter.topic;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topics = Arrays.asList(
            new Topic("1", "Biology", "bio 101"),
                new Topic("2", "Python Programming", "CS 101"),
                new Topic("3", "Geology", "GEO 392")
        );

    public List<Topic> getAllTopics() {
        return topics;
    }
}
