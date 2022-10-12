package de.ostfalia.ftse.navigation;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class FarbenView implements Serializable {

    String target;

    public String nav(){
        switch (target){
            case "ROT": return "red";
            case "GRUEN": return "green";
            case "BLAU": return "blue";
            default: target = "bitte nochmal versuchen.";
        }
        return "error";

    }

    public String goToStart(){
        return "hauptseite";
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }
}
