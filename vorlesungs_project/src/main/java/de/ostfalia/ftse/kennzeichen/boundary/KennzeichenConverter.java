package de.ostfalia.ftse.kennzeichen.boundary;


import de.ostfalia.ftse.kennzeichen.entity.Kennzeichen;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@FacesConverter(forClass = Kennzeichen.class)
public class KennzeichenConverter implements Converter<Kennzeichen> {

    static Pattern p = Pattern.compile("^(\\w{1,2}) (\\w{1,2}) (\\d{1,4})( [HE])?$");


    @Override
    public Kennzeichen getAsObject(FacesContext facesContext, UIComponent uiComponent, String s) {
        //BS AB 1234
        //GG EE 123
        //EE DD 1234
        //BS SB 123 H
        System.out.println("Convert: " + s);

        Matcher m = p.matcher(s);

        if (m.matches()) {
            //der RegexMatcher erkennt eine Gruppe mehr als die Gruppen im Regex, da Gruppe 0 der ganze String ist.
            //Daher start bei 1.
            if (m.group(4) == null) {
                return new Kennzeichen(m.group(1), m.group(2), Integer.parseInt(m.group(3)));
            } else {
                return new Kennzeichen(m.group(1), m.group(2), Integer.parseInt(m.group(3)), m.group(4).charAt(1));
            }
        }

        FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Ungültiges Kennzeichen!", "Dieses kennzeichen entpsricht nicht dem Format.");
        throw new ConverterException(fm);

    }


    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Kennzeichen kennzeichen) {
        return kennzeichen.toString();
    }
}
