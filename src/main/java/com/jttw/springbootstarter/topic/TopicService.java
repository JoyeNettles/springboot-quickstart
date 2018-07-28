package com.jttw.springbootstarter.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("1", "Biology", "bio 101"),
                new Topic("2", "Python Programming", "CS 101"),
                new Topic("3", "Geology", "GEO 392")
        ));

    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopic(String id) {
        return topics.stream()
                .filter(topic -> topic.getId().equals(id))
                .findFirst()
                .get();
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    public void updateTopic(String id, Topic topic) {
        for(int i = 0; i < topics.size(); i++){
            Topic t = topics.get(i);
            if(t.getId().equals(id)){
                topics.set(i, topic);
            }
        }
    }

    public void deleteTopic(String id) {
       topics.removeIf(topic -> topic.getId().equals(id));
    }
}
