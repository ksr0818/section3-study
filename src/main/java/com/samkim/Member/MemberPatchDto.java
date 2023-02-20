package com.samkim.Member;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Email;

import javax.validation.constraints.Pattern;

@Getter
@Setter
public class MemberPatchDto {
    private long memberId;

    @Email
    private String email;
    @Pattern(regexp = "^\\S+(\\s?\\S+)*$")
    private String name;

    @Pattern(regexp = "^010-\\d{4}-\\d{4}$")
    private String phone;


    @Range(min=50,max=250)
    private int height;
}
