package decorator;

import java.util.Date;

/**
 * Created by melvin on 14/06/17.
 */
public class EnTete extends DecorateurDeFacture {
    private String entete;

    public EnTete(String e, Facture deco) {
        super(deco);
        entete = e;

    }

    @Override
    public void imprimeToi() {
        imprimeEnTete();
        super.imprimeToi();
    }

    public void imprimeEnTete() {
        System.out.println("Entete : " + entete);
    }
}
