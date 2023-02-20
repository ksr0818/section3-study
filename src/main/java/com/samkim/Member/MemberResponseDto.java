package com.samkim.Member;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class MemberResponseDto {
    private long MemberId;
    private String email;
    private String name;
    private String phone;
    private int height;
}
