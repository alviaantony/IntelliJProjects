package com.spring.basic.controller;

import com.spring.basic.repository.MediaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MediaController {

    private MediaRepository mediaRepository;

    //Setter injection
    @Autowired
    public void setMediaRepository(MediaRepository mediaRepository){
        this.mediaRepository = mediaRepository;
    }

    public String getData(){
        return mediaRepository.getMediaData();
    }
}
