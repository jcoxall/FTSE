package de.ostfalia.ftse.kennzeichen.boundary;

import de.ostfalia.ftse.kennzeichen.entity.Kennzeichen;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class KennzeichenView implements Serializable {

    Kennzeichen kennzeichen;

    public Kennzeichen getKennzeichen() {
        return kennzeichen;
    }

    public void setKennzeichen(Kennzeichen kennzeichen) {
        this.kennzeichen = kennzeichen;
    }
}
