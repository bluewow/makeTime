package com.project.makeTime.web.dto;

import com.project.makeTime.domain.Posts;
import lombok.Getter;

import java.time.LocalDate;

@Getter
public class PostsResponseDto {

    private Long id;
    private LocalDate date;
    private String title;
    private Boolean progress;
    private String content;

    public PostsResponseDto(Posts entity) {
        id = entity.getId();
        date = entity.getDate();
        title = entity.getTitle();
        progress = entity.getProgress();
        content = entity.getContent();
    }
}
