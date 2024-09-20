package com.example.Greek.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.Greek.model.Brother;
import com.example.Greek.repository.BrotherRepository;

public class BrotherService {
    @Autowired
    private BrotherRepository brotherRepository;
    
    public Brother saveMember(Brother member) {
        return brotherRepository.save(member);
    }
    
    public List<Brother> getAllMembers() {
        return brotherRepository.findAll();
    }
    
   
}
