package com.project.makeTime.service;

import com.project.makeTime.domain.PostsRespository;
import com.project.makeTime.web.dto.PostsInsertDto;
import com.project.makeTime.web.dto.PostsResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class SketchyService {

    private final PostsRespository postsRespository;

    @Transactional  //등록
    public void insert(PostsInsertDto postsInsertDto) {

        System.out.println(postsInsertDto.toString());
        postsRespository.save(postsInsertDto.toEntity());
    }

    @Transactional(readOnly = true)
    public List<PostsResponseDto> getDataAll() {

        return postsRespository.findAll().stream()
                .map(PostsResponseDto::new)
                .collect(Collectors.toList());
    }
}
