package de.ostfalia.ftse.kunde.boundary;

import de.ostfalia.ftse.kunde.controller.KundenController;
import de.ostfalia.ftse.kunde.entity.Kunde;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

@Named
@SessionScoped
public class KundenView implements Serializable {

    @Inject
    KundenController kc;


    public List<Kunde> getKunden() {
        return new LinkedList<>(kc.getKunden().values());

    }


}
