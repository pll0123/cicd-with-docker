package com.example.cicd.member.api;

import com.example.cicd.member.domain.Member;
import com.example.cicd.member.domain.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MemberApi {

    private final MemberRepository memberRepository;

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/save")
    public String save() {
        memberRepository.save(new Member());
        return "save 200 ok";
    }

    @GetMapping("/all")
    public int count() {
        return (int) memberRepository.count();
    }

}
