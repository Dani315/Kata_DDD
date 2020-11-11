package com.challenge.domain.dojo.commands;

import co.com.sofka.domain.generic.Command;
import com.challenge.domain.dojo.values.*;
import com.challenge.domain.externalValues.Cedula;
import com.challenge.domain.externalValues.GroupGit;
import com.challenge.domain.externalValues.MemberGit;
import com.challenge.domain.externalValues.Name;

import java.util.List;

public class CreateDojoCommand implements Command {
    private DojoId dojoId;
    private GroupGit groupGit;
    private Location location;
    private DataInfo dataInfo;
    private SenseiId senseiId;
    private Name name;
    private Cedula cedula;
    private Specialty specialty;
    private MemberGit memberGit;
    private List<Accomplishment> accomplishmentList;

    public CreateDojoCommand(
            DojoId dojoId,
            GroupGit groupGit,
            Location location,
            DataInfo dataInfo,
            SenseiId senseiId,
            Name name,
            Cedula cedula,
            Specialty specialty,
            MemberGit memberGit,
            List<Accomplishment> accomplishmentList) {
        this.dojoId = dojoId;
        this.groupGit = groupGit;
        this.location = location;
        this.dataInfo = dataInfo;
        this.senseiId = senseiId;
        this.name = name;
        this.cedula = cedula;
        this.specialty = specialty;
        this.memberGit = memberGit;
        this.accomplishmentList = accomplishmentList;
    }

    /*public AssignSenseiToDojoCommand(
            DojoId dojoId,
            SenseiId senseiId,
            Name name,
            Cedula cedula,
            Specialty specialty,
            MemberGit memberGit) {
        this.dojoId = dojoId;
        this.senseiId = senseiId;
        this.name = name;
        this.cedula = cedula;
        this.specialty = specialty;
        this.memberGit = memberGit;
    }*/

    public CreateDojoCommand() {
    }

    public DojoId getDojoId() {
        return dojoId;
    }

    public SenseiId getSenseiId() {
        return senseiId;
    }

    public Name getName() {
        return name;
    }

    public Cedula getCedula() {
        return cedula;
    }

    public Specialty getSpecialty() {
        return specialty;
    }

    public MemberGit getMemberGit() {
        return memberGit;
    }

    public GroupGit getGroupGit() {
        return groupGit;
    }

    public Location getLocation() {
        return location;
    }

    public DataInfo getDataInfo() {
        return dataInfo;
    }

    public List<Accomplishment> getAccomplishmentList() {
        return accomplishmentList;
    }
}
