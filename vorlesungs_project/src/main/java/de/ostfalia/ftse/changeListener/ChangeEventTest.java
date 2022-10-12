package de.ostfalia.ftse.changeListener;

import javax.faces.event.ValueChangeEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class ChangeEventTest implements Serializable {

    String test;

    public void changEvent(ValueChangeEvent vce){
        System.out.println(vce.getNewValue());
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }
}
