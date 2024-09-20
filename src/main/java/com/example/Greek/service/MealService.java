package com.example.Greek.service;

import com.example.Greek.model.Brother;
import com.example.Greek.model.Member;
import com.example.Greek.repository.BrotherRepository;
import com.example.Greek.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MealService {

    @Autowired
    private BrotherRepository brotherRepository;

    @Autowired
    private MemberRepository memberRepository;

    public void assignBrotherToMember(Long brotherId, Long memberId) {
        Brother brother = brotherRepository.findById(brotherId).orElseThrow();
        Member member = memberRepository.findById(memberId).orElseThrow();
        brother.getMembers().add(member);
        member.getBrothers().add(brother);
        brotherRepository.save(brother);
        memberRepository.save(member);
    }
    public Member saveMember(Member member) {
        return memberRepository.save(member);
    }
}
