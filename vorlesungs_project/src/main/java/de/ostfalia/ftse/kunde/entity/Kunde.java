package de.ostfalia.ftse.kunde.entity;




import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Kunde {

    String vorname;
    String nachname;
    String KdNr;
    LocalDate date;

}
