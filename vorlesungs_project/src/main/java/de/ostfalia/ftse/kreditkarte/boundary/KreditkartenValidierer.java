package de.ostfalia.ftse.kreditkarte.boundary;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
import java.util.regex.Pattern;

@FacesValidator("kreditkartenNummer")
public class KreditkartenValidierer implements Validator<String> {

    static final Pattern KREDITKARTEREGEX = Pattern.compile("^\\d{4}[ -]\\d{4}[ -]\\d{4}[ -]\\d{4}$");

    @Override
    public void validate(FacesContext facesContext, UIComponent uiComponent, String s) throws ValidatorException {
        System.out.println("ValidateKlasse:" + s);
        if (!KREDITKARTEREGEX.matcher(s).matches()) {
            throw new ValidatorException(new FacesMessage("Ungültige Kreditkartennummer!"));
        }
    }
}
