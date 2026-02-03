package gabrielebelluco.u5d1w1.entities;

import java.util.ArrayList;
import java.util.List;

public class Ordine {
    private List<Item> items = new ArrayList<>();
    private Tavolo tavolo;
    private int coperti;
    private double prezzoCoperto;

    public Ordine(double prezzoCoperto, int coperti, Tavolo tavolo) {
        this.prezzoCoperto = prezzoCoperto;
        this.coperti = coperti;
        this.tavolo = tavolo;
    }

    public Ordine(Tavolo tavolo, int coperti, double costoCoperto) {
        if (!tavolo.isFree()) {
            throw new IllegalStateException("Tavolo già occupato");
        }

        if (coperti > tavolo.getNumeroCoperti()) {
            throw new IllegalArgumentException("Troppi coperti per questo tavolo");
        }

        this.tavolo = tavolo;
        this.coperti = coperti;
        this.prezzoCoperto = costoCoperto;
        tavolo.occupato();
    }

    public void aggiungiAllOrdine(Item item) {
        items.add(item);
    }

    public double getScontrino() {
        double scontrino = items.stream().mapToDouble(Item::getPrezzo).sum();
        return scontrino + (coperti * prezzoCoperto);
    }

    public void printScontrino() {
        System.out.println("al Tavolo " + tavolo.getNumeroTavolo());
        items.forEach(i -> System.out.println(i.getNome()));
        System.out.println("il totale è di " + getScontrino() + "$");


    }
}
