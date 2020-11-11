package com.challenge.domain.clan;


import co.com.sofka.domain.generic.Entity;
import com.challenge.domain.clan.values.Email;
import com.challenge.domain.clan.values.Gender;
import com.challenge.domain.clan.values.MemberId;
import com.challenge.domain.clan.values.Score;
import com.challenge.domain.externalValues.Cedula;
import com.challenge.domain.externalValues.MemberGit;
import com.challenge.domain.externalValues.Name;

import java.util.ArrayList;
import java.util.List;

public class Member extends Entity<MemberId> {
    private  Name name;
    private  Gender gender;
    private  Email email;
    private final boolean isOwner;
    private final Cedula cedula;
    private final MemberGit memberGit;
    private final List<Score> scoreList;

    public Member(MemberId memberId,
                  Cedula cedula,
                  MemberGit memberGit,
                  boolean isOwner) {
        super(memberId);
        this.isOwner = isOwner;
        this.cedula = cedula;
        this.memberGit = memberGit;
        this.scoreList = new ArrayList<>();
    }

    public void addScore(Score score) {
        this.scoreList.add(score);
    }

    public void updateEmail(Email email) {
        this.email = new Email(email.value());
    }

    public void updateName(Name name) {
        this.name = new Name(name.value());
    }

    public void updateGender(Gender gender) {
        this.gender =  new Gender((char)gender.value());
    }

    public Name Name() {
        return name;
    }

    public Gender Gender() {
        return gender;
    }

    public boolean isOwner() {
        return isOwner;
    }

    public Cedula Cedula() {
        return cedula;
    }

    public MemberGit MemberGit() {
        return memberGit;
    }

    public Email Email() {
        return email;
    }

    public List<Score> ScoreList() {
        return scoreList;
    }
}
