package com.SpringbootProject.quickstart.topic;

import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Arrays;

import org.springframework.web.bind.annotation.RequestMapping;



@RestController
public class TopicController {

    @RequestMapping(path="/topics")
    public List<Topic> getallTopics(){
        return Arrays.asList(
            new Topic("Spring","Spring Framework","Spring desc"),
            new Topic("Java","Java core","Java desc")
        );
    }
    
}
