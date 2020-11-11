package com.challenge.domain.challenge.values;

import co.com.sofka.domain.generic.ValueObject;
import com.challenge.domain.clan.values.ClanId;

import java.util.List;

public class ClanIds implements ValueObject {
    private final List<ClanId> clanIds;

    public ClanIds(List<ClanId> clanIds) {
        this.clanIds = clanIds;
    }

    @Override
    public List<ClanId>  value() {
        return clanIds;
    }
}
