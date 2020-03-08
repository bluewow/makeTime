package com.project.makeTime.web.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.project.makeTime.domain.Posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;

@ToString
@Getter
@NoArgsConstructor
public class PostsInsertDto {

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate date;

    private String title;
    private Boolean progress;
    private String content;

    @Builder
    public PostsInsertDto(LocalDate date, String title, Boolean progress, String content) {
        this.date = date;
        this.title = title;
        this.progress = progress;
        this.content = content;
    }

    public Posts toEntity() {
        return Posts.builder()
                .date(date)
                .progress(progress)
                .title(title)
                .content(content)
                .build();
    }
}
