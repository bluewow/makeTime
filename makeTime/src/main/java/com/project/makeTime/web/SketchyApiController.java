package com.project.makeTime.web;

import com.project.makeTime.service.SketchyService;
import com.project.makeTime.web.dto.PostsInsertDto;
import com.project.makeTime.web.dto.PostsResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class SketchyApiController {

    private final SketchyService sketchyService;

    @GetMapping("/request")
    public List<PostsResponseDto> get() {

        return sketchyService.getDataAll();
    }

    @PostMapping("/insert")
    public void insert(@RequestBody PostsInsertDto postsInsertDto) {

        sketchyService.insert(postsInsertDto);
    }
}
