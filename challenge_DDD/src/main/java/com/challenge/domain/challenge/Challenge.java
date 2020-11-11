package com.challenge.domain.challenge;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.challenge.domain.challenge.values.Assesment;
import com.challenge.domain.challenge.values.ChallengeId;
import com.challenge.domain.challenge.values.ClanIds;
import com.challenge.domain.challenge.values.KataId;
import com.challenge.domain.clan.values.ClanId;
import com.challenge.domain.dojo.Dojo;
import com.challenge.domain.dojo.DojoState;
import com.challenge.domain.dojo.values.DojoId;
import com.challenge.domain.externalValues.Name;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Challenge extends AggregateEvent<ChallengeId> {
    protected Name name;
    protected ClanIds clanIds;
    protected DojoId dojoId;
    protected List<Kata> katas;
    protected Assesment assesment;
    protected boolean isRevoked;
    protected boolean isVisible;
    protected Integer durationDays;

    public Challenge(ChallengeId entityId) {
        super(entityId);
        subscribe(new ChallengeState(this));
    }

    public Challenge(ChallengeId entityId, Name name,
                     ClanIds clanIds, DojoId dojoId,Assesment assesment,
                     boolean isRevoked, boolean isVisible,
                     Integer durationDays) {
        super(entityId);
        this.name = name;
        this.clanIds = clanIds;
        this.dojoId = dojoId;
        this.katas = new ArrayList<>();
        this.assesment = assesment;
        this.isRevoked = isRevoked;
        this.isVisible = isVisible;
        this.durationDays = durationDays;
    }

    public static Challenge from(ChallengeId entityId, List<DomainEvent> eventList) {
        var challenge = new Challenge(entityId);
        eventList.forEach(challenge::applyEvent);
        return challenge;
    }

    public void addNewKata(KataId entityId, String purpose, String description, Integer limitOfTime) {

    }

    public void subscriberClan(ClanId clanId) {

    }

    public void unSubscriberClan(ClanId clanId) {

    }

    public void changeDurationDays(Integer durationDays) {

    }

    public void updateName(Name name) {

    }

    public void updateKata(KataId entityId, String purpose, String description, Integer limitOfTime) {

    }

    public void addExerciseOfKata(KataId entityId, int level, Map<Integer, String> metadata, String goal) {

    }

    public void assignAssessment(int degreeOfDifficulty, String repoUrl, String summary) {

    }

    public void revokeChallenge() {

    }
}
