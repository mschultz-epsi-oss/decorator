package decorator;

/**
 * Created by melvin on 14/06/17.
 */
public class Pub extends DecorateurDeFacture {
    private String pub;

    public Pub(String p, Facture deco) {
        super(deco);
        pub = p;
    }

    @Override
    public void imprimeToi() {
        super.imprimeToi();
        imprimePub();
    }

    public void imprimePub() {
        System.out.println("Pub : " + pub);
    }
}
