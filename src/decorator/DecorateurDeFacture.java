package decorator;

import java.util.Date;

/**
 * Created by melvin on 14/06/17.
 */
public abstract class DecorateurDeFacture extends Facture {
    private Facture decore;

    public DecorateurDeFacture(Facture deco) {
        super();
        decore = deco;
    }

    @Override
    public void imprimeToi() {
        decore.imprimeToi();
    }
}
