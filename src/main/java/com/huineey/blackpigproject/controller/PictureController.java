package com.huineey.blackpigproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class PictureController {
    @GetMapping("/gallery")
    public String show() {
        return "board/gallery";
    }
}
