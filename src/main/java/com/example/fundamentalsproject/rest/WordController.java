package com.example.fundamentalsproject.rest;

import com.example.fundamentalsproject.domain.UserWord;
import com.example.fundamentalsproject.dto.userWordDTO;
import com.example.fundamentalsproject.service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WordController {

    private final WordService wordService;

    @Autowired
    public WordController(WordService wordService) {
        this.wordService = wordService;
    }

    @GetMapping("/Word")
    public ResponseEntity<List<userWordDTO>> getAllWords(){
        return ResponseEntity.ok(this.wordService.readAllWords());
    }

    @PostMapping("/createWord")
    public ResponseEntity<userWordDTO> createWord(@RequestBody UserWord word){
        return new ResponseEntity<userWordDTO>(this.wordService.createWord(word), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteWord(@PathVariable Long id){
        return this.wordService.deleteWordById(id)
                ? ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build()
                : ResponseEntity.noContent().build();
    }

    @GetMapping("/getWordById/{id}")
    public ResponseEntity<userWordDTO> getWordById(@PathVariable Long id){
        return ResponseEntity.ok(this.wordService.findWordById(id));
    }

    @PutMapping("/updateWord/{id}")
    public ResponseEntity<userWordDTO> updateWord(@PathVariable Long id, @RequestBody UserWord word){
        return ResponseEntity.ok(this.wordService.updateWord(id, word));
    }

}
