package com.spring.basic.controller;

import com.spring.basic.repository.AudioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class AudioController {

    private final AudioRepository audioRepository;

    //Constructor injection
    @Autowired//Not required since only a single constructor.
    public AudioController(AudioRepository audioRepository) {
        this.audioRepository = audioRepository;
    }

    public String getData(){
        return audioRepository.getAudioData();
    }



}
