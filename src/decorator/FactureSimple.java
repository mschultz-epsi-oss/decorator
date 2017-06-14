package decorator;

import java.util.Date;

/**
 * Created by melvin on 14/06/17.
 */
public class FactureSimple extends Facture {
    public FactureSimple(String n, Date d) {
        super(n, d);
    }

    @Override
    public void imprimeToi() {
        System.out.println("Facture Simple " + getNom() + " à la date de " + getDate());
    }
}
