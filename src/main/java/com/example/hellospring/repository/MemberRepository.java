package com.example.hellospring.repository;

import com.example.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id); //null처리 방법중 optional사용
    Optional<Member> findByName(String name);
    List<Member> findAll();//회원 전체 찾아줌

}
