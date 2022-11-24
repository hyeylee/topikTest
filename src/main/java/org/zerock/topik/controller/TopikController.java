package org.zerock.topik.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.topik.dto.ReadingQuestionDto;
import org.zerock.topik.service.TopikService;

@Controller
@RequestMapping("/topik")
@Log4j2
public class TopikController {
    private final TopikService topikService;

    public TopikController(TopikService topikService) {
        this.topikService = topikService;
    }

    @GetMapping("/topik/Api/getRandom")
    public ReadingQuestionDto getRandomQuestion() {
        return topikService.getRandomQuestion();

    }
    //@GetMapping({"/","/list"})
    //public String list() {
        //log.info("list....................");
        //return "topik/list";
    //}
}
