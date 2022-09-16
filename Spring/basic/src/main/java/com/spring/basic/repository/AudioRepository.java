package com.spring.basic.repository;

import org.springframework.stereotype.Repository;

@Repository
public class AudioRepository {

    public String getAudioData(){
        return "Showing audio data";
    }

}
