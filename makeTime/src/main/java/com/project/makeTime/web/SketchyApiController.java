package com.project.makeTime.web;

import com.project.makeTime.service.SketchyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class SketchyApiController {

    private final SketchyService sketchyService;

    @PostMapping("/post")
    public Long insert(@RequestBody Object requestDto) {
        System.out.println("dto :" + requestDto);
        return new Long(9);
    }
}
