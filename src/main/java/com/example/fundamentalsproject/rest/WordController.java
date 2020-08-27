package com.example.fundamentalsproject.rest;

import com.example.fundamentalsproject.domain.UserBank;
import com.example.fundamentalsproject.service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WordController {

    private final WordService wordService;

    @Autowired
    public WordController(WordService wordService) {
        this.wordService = wordService;
    }

    @GetMapping("/")
    public List<UserBank> getAllWords(){
        return this.wordService.readAllWords();
    }

    @PostMapping("/createWord")
    public UserBank createWord(@RequestBody UserBank userBank){
        return this.wordService.createWord(userBank);
    }

    @DeleteMapping("/delete/{id}")
    public Boolean deleteWord(@PathVariable Long id){
        return this.wordService.deleteWordById(id);
    }

    @GetMapping("/getWordById/{id}")
    public UserBank getWordById(@PathVariable Long id){
        return this.wordService.findWordById(id);
    }

    @PutMapping("/updateWord/{id}")
    public UserBank updateWord(@PathVariable Long id, @RequestBody UserBank userBank){
        return this.wordService.updateWord(id, userBank);
    }

}
