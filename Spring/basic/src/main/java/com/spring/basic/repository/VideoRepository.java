package com.spring.basic.repository;

import org.springframework.stereotype.Repository;

@Repository
public class VideoRepository {

    public String getVideoData(){
        return "Showing video data";
    }

}
