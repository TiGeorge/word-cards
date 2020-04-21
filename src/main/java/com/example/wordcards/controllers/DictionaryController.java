package com.example.wordcards.controllers;

import com.example.wordcards.domain.Homograph;
import com.example.wordcards.repository.HomographRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/dictionary")
public class DictionaryController {

    @Autowired
    private HomographRepository homographRepository;

    @PostMapping(path = "/add")
    public @ResponseBody String addNewWord(@RequestParam String value) {
        Homograph homograph = new Homograph();
        homograph.setValue(value);
        homographRepository.save(homograph);
        return "Saved";
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Homograph> getAllHomograhs() {
        return homographRepository.findAll();
    }

}
