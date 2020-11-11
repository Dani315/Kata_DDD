package com.challenge.domain.clan.commands;

import co.com.sofka.domain.generic.Command;
import com.challenge.domain.clan.values.ClanId;
import com.challenge.domain.clan.values.Email;
import com.challenge.domain.clan.values.Gender;
import com.challenge.domain.clan.values.MemberId;
import com.challenge.domain.externalValues.Cedula;
import com.challenge.domain.externalValues.MemberGit;
import com.challenge.domain.externalValues.Name;

public class AddNewMemberToClanCommand implements Command {
    private Name nameMember;
    private Gender gender;
    private Email email;
    private boolean isOwner;
    private Cedula cedula;
    private MemberGit memberGit;
    private MemberId memberId;
    private ClanId clanId;

    public AddNewMemberToClanCommand(
            Name nameMember, Gender gender,
            Email email, boolean isOwner,
            Cedula cedula, MemberGit memberGit,
            MemberId memberId, ClanId clanId) {
        this.nameMember = nameMember;
        this.gender = gender;
        this.email = email;
        this.isOwner = isOwner;
        this.cedula = cedula;
        this.memberGit = memberGit;
        this.memberId = memberId;
        this.clanId = clanId;
    }

    public Name getNameMember() {
        return nameMember;
    }

    public Gender getGender() {
        return gender;
    }

    public Email getEmail() {
        return email;
    }

    public boolean isOwner() {
        return isOwner;
    }

    public Cedula getCedula() {
        return cedula;
    }

    public MemberGit getMemberGit() {
        return memberGit;
    }

    public MemberId getMemberId() {
        return memberId;
    }

    public ClanId getClanId() {
        return clanId;
    }
}
