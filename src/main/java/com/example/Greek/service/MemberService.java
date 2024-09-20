package com.example.Greek.service;
import com.example.Greek.repository.MemberRepository;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.Greek.model.Member;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MemberService {
    @Autowired
    private MemberRepository memberRepository;
    @Transactional
    public Member saveMember(Member member) {
        return memberRepository.save(member);
    }
    
    public List<Member> getAllMembers() {
        return memberRepository.findAll();
    }
    
    public List<Member> getMembersByStatus(String status) {
        return memberRepository.findByStatus(status);
    }
}

