package com.challenge.domain.clan.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.challenge.domain.clan.values.MemberId;
import com.challenge.domain.externalValues.Cedula;
import com.challenge.domain.externalValues.MemberGit;

public class AddedMember extends DomainEvent {
    private final MemberId memberId;
    private final Cedula cedula;
    private final MemberGit memberGit;
    private final boolean isOwner;

    public AddedMember(MemberId memberId, Cedula cedula, MemberGit memberGit, boolean isOwner) {
        super("com.challenge.domain.clan.AddedMember");
        this.memberId = memberId;
        this.cedula = cedula;
        this.memberGit = memberGit;
        this.isOwner = isOwner;
    }

    public MemberId getMemberId() {
        return memberId;
    }

    public Cedula getCedula() {
        return cedula;
    }

    public MemberGit getMemberGit() {
        return memberGit;
    }

    public boolean isOwner() {
        return isOwner;
    }
}
