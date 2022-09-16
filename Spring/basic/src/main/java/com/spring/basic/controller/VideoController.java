package com.spring.basic.controller;

import com.spring.basic.repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class VideoController {

    //Field injection
    @Autowired
    private VideoRepository videoRepository;

    public String getData(){
        return videoRepository.getVideoData();
    }

}
