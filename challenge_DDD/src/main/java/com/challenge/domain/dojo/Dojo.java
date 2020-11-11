package com.challenge.domain.dojo;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.challenge.domain.dojo.Enums.Status;
import com.challenge.domain.dojo.events.*;
import com.challenge.domain.dojo.values.*;
import com.challenge.domain.externalValues.Cedula;
import com.challenge.domain.externalValues.GroupGit;
import com.challenge.domain.externalValues.MemberGit;
import com.challenge.domain.externalValues.Name;

import java.util.Date;
import java.util.List;

public class Dojo extends AggregateEvent<DojoId> {
    protected Sensei sensei;
    protected DataInfo dataInfo;
    protected Status status;
    protected List<String> rules;
    protected GroupGit groupGit;
    protected Location location;

    public Dojo(DojoId entityId,GroupGit groupGit, Location location) {
        super(entityId);
        appendChange(new CreatedDojo(groupGit, location)).apply();
    }

    public Dojo(DojoId entityId) {
        super(entityId);
        subscribe(new DojoState(this));
    }

    public static Dojo from(DojoId entityId, List<DomainEvent> eventList) {
        var dojo = new Dojo(entityId);
        eventList.forEach(dojo::applyEvent);
        return dojo;
    }

    public void changeLocation(String urlMeet) {
        appendChange(new ChangedLocation(urlMeet)).apply();
    }

    public void addRule(String rule) {
        appendChange(new AddedRule(rule)).apply();
    }

    /*public void assignSensei(SenseiId senseiId,Name name, Cedula cedula, Specialty specialty, MemberGit memberGit) {
        appendChange(new AssignedSensei(senseiId,name, cedula,specialty, memberGit)).apply();
    }*/

    public void assignSensei(SenseiId senseiId,Cedula cedula, Specialty specialty) {
        appendChange(new AssignedSensei(senseiId,cedula,specialty)).apply();
    }

    public void removeRule(int rule) {

    }

    public void cancelDojo() {

    }

    public void openDojo() {

    }

    public void addAccomplishmentToSensei(Accomplishment accomplishment) {
        appendChange(new AddedAccomplishmentToSensei(accomplishment)).apply();
    }

    public void updateDataToSensei(Name name,MemberGit memberGit) {
        appendChange(new UpdatedDataSensei(name,memberGit)).apply();
    }

    public void closeDojo() {

    }

    public void changeDataInfo(String name, String legend) {
        appendChange(new ChangedDataInfo(name, legend)).apply();
    }

    public void evaluateClan() {

    }
}
