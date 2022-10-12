package de.ostfalia.ftse.kreditkarte.boundary;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Named
@ViewScoped
public class KreditkartenHandler implements Serializable {

    static final Pattern KREDITKARTEREGEX = Pattern.compile("^\\d{4}[ -]\\d{4}[ -]\\d{4}[ -]\\d{4}$");
    String input;

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public void validateKreditkartenNummer(FacesContext context, UIComponent component, Object value)
            throws ValidatorException {
        System.out.println("Validate:" + value);
        if (!KREDITKARTEREGEX.matcher((String) value).matches()) {
            throw new ValidatorException(new FacesMessage("Ungültige Kreditkartennummer!"));
        }
    }
}
