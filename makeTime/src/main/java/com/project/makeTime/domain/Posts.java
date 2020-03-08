package com.project.makeTime.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@Entity
public class Posts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate date;

    private String title;

    private Boolean progress;

    private String content;

    //image

    @Builder
    public Posts(LocalDate date, String title, Boolean progress, String content) {
        this.date = date;
        this.title = title;
        this.progress = progress;
        this.content = content;
    }
}
