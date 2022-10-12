package de.ostfalia.ftse.kennzeichen.entity;


public class Kennzeichen {


    String landkreis;

    String buchstaben;

    int zahl;

    char zusatz;

    public Kennzeichen(String landkreis, String buchstaben, int zahl) {
        this.landkreis = landkreis;
        this.buchstaben = buchstaben;
        this.zahl = zahl;
    }

    public Kennzeichen(String landkreis, String buchstaben, int zahl, char zusatz) {
        this.landkreis = landkreis;
        this.buchstaben = buchstaben;
        this.zahl = zahl;
        this.zusatz = zusatz;
    }


    public String getLandkreis() {
        return landkreis;
    }

    public void setLandkreis(String landkreis) {
        this.landkreis = landkreis;
    }

    public String getBuchstaben() {
        return buchstaben;
    }

    public void setBuchstaben(String buchstaben) {
        this.buchstaben = buchstaben;
    }

    public int getZahl() {
        return zahl;
    }

    public void setZahl(int zahl) {
        this.zahl = zahl;
    }

    public char getZusatz() {
        return zusatz;
    }

    public void setZusatz(char zusatz) {
        this.zusatz = zusatz;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d", landkreis, buchstaben, zahl) + ((zusatz != 0) ? " " + zusatz : "");
    }
}
