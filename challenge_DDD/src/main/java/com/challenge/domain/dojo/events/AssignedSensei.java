package com.challenge.domain.dojo.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.challenge.domain.dojo.values.SenseiId;
import com.challenge.domain.dojo.values.Specialty;
import com.challenge.domain.externalValues.Cedula;
import com.challenge.domain.externalValues.MemberGit;
import com.challenge.domain.externalValues.Name;

public class AssignedSensei extends DomainEvent {
    private final SenseiId senseiId;
    private final Cedula cedula;
    private final Specialty specialty;


    public AssignedSensei(SenseiId senseiId, Cedula cedula, Specialty specialty) {
        super("com.challenge.domain.dojo.AssignedSensei");
        this.senseiId = senseiId;
        this.cedula = cedula;
        this.specialty = specialty;
    }

    public SenseiId getSenseiId() {
        return senseiId;
    }

    public Cedula getCedula() {
        return cedula;
    }

    public Specialty getSpecialty() {
        return specialty;
    }

}
