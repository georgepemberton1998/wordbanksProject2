package com.example.fundamentalsproject.service;

import com.example.fundamentalsproject.domain.UserBank;
import com.example.fundamentalsproject.exceptions.WordNotFoundException;
import com.example.fundamentalsproject.repo.WordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WordService {

    private final WordRepository repo;

    @Autowired
    public WordService(WordRepository repo) {
        this.repo = repo;
    }

    public List<UserBank> readAllWords(){
        return this.repo.findAll();
    }

    public UserBank createWord(UserBank userBank){
        return this.repo.save(userBank);
    }

    public UserBank findWordById(Long id){
        return this.repo.findById(id).orElseThrow(WordNotFoundException::new);
    }

    public UserBank updateWord(Long id, UserBank userBank){
        UserBank update = findWordById(id);
        update.setWord(userBank.getWord());
        update.setDescription(userBank.getDescription());
        return this.repo.save(update);
    }

    public Boolean deleteWordById(Long id){
        if(!this.repo.existsById(id)){
            throw new WordNotFoundException();
        }
        this.repo.deleteById(id);
        return this.repo.existsById(id);
    }

}
