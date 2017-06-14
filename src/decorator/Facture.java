package decorator;

import java.util.Date;

/**
 * Created by melvin on 14/06/17.
 */
public abstract class Facture {
    private String nom;
    private Date date;

    public Facture () {}

    public Facture(String n, Date d) {
        this.setNom(n);
        this.setDate(d);
    }

    abstract public void imprimeToi();

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
