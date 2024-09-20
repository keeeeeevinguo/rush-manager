package com.example.Greek.controller;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Greek.model.Member;
import com.example.Greek.service.MemberService;

@RestController
@RequestMapping("/api/members")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @GetMapping("/api/members")
    public List<Member> getAllMembers() {
        return memberService.getAllMembers();
    }
    @PostMapping("/add")
    public Member addMember(@RequestBody Member member) {
        return memberService.saveMember(member);
    }
}
