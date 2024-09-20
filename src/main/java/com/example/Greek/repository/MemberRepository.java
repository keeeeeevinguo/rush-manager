package com.example.Greek.repository;

import com.example.Greek.model.Member;

import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
    List<Member> findByStatus(String status);
}
