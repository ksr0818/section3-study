package com.samkim.Member;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {
    public Member createMember(Member member) {
        Member createdMember = member;
        return createdMember;
    }

    public Member updateMember(Member member) {
        Member updatedMember = member;
        return updatedMember;
    }

    public Member findMember(long memberId) {
        Member member = new Member(memberId,"ksr940818@gamil.com","김상래","010-1234-5678",175);
        return member;
    }

    public void deleteMember(long memberId) {

    }

}
