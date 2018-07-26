package com.jttw.springbootstarter.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        return Arrays.asList(
                new Topic("1", "Biology", "bio 101"),
                new Topic("2", "Python Programming", "CS 101"),
                new Topic("3", "Geology", "GEO 392")
        );
    }
}
