package main;

import decorator.*;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // prof version
        Facture f = new FactureSimple("Etudiant", new Date());
        f = new EnTete("ESPI bla bla", f);
        f = new Pub("Chez Casto...", f);
        f = new Pub("Chez DELL...", f);
        f.imprimeToi();

        // my version (work also)
//        Facture fs = new FactureSimple("facture1", new Date());
//        fs = new EnTete("entete1", fs);
//        System.out.println("--");
//        fs.imprimeToi();
//
//        Facture fd = new FactureDetaillee("facture2", new Date());
//        fd = new Pub("pub1", fd);
//        System.out.println("--");
//        fd.imprimeToi();
//
//        Facture fdep = new FactureDetaillee("facture3", new Date());
//        fdep = new EnTete("entete3", fdep);
//        fdep = new Pub("pub2", fdep);
//        System.out.println("--");
//        fdep.imprimeToi();
    }
}
