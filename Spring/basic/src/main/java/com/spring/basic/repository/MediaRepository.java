package com.spring.basic.repository;

import org.springframework.stereotype.Repository;

@Repository
public class MediaRepository {

    public String getMediaData(){
        return "Showing media data";
    }

}
