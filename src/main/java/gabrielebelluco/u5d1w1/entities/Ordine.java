package gabrielebelluco.u5d1w1.entities;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ordine {
    private int numeroOrdine;
    private StatoOrdine stato;
    private int numCoperti;
    private LocalTime orarioAcquisto;
    private List<Item> ordineProdotti;
    private Tavolo tavolo;

    public Ordine(int coperti, Tavolo tavolo) {
        Random rndm = new Random();
        if (tavolo.getNumeroCoperti() <= numCoperti)
            throw new RuntimeException("numero coperti più alto dei posti");
        this.numeroOrdine = rndm.nextInt(100, 10000);
        this.stato = StatoOrdine.IN_CORSO;
        this.numCoperti = numCoperti;
        this.orarioAcquisto = LocalTime.now();
        this.ordineProdotti = new ArrayList<>();
        this.tavolo = tavolo;

    }

    public Ordine(Tavolo tavolo, int coperti, double costoCoperto) {
        if (!tavolo.isFree()) {
            throw new IllegalStateException("Tavolo già occupato");
        }

        if (coperti > tavolo.getNumeroCoperti()) {
            throw new IllegalArgumentException("Troppi coperti per questo tavolo");
        }
    }

    public void aggiungiAllOrdine(Item item) {
        this.ordineProdotti.add(item);
    }

    public double getScontrino() {
        return this.ordineProdotti.stream().mapToDouble(Item::getPrezzo).sum() + (this.tavolo.getPrezzoCoperto() * this.numCoperti);

    }

    public void setPronto() {
        this.stato = StatoOrdine.PRONTO;
    }

    public void setServito() {
        this.stato = StatoOrdine.SERVITO;
    }

    public void printScontrino() {
        System.out.println("id ordine " + this.numeroOrdine);
        System.out.println("stato " + this.stato);
        System.out.println("numero coperti " + this.numCoperti);
        System.out.println("ora acquisizione " + this.orarioAcquisto);
        System.out.println("numero tavolo " + this.tavolo.getNumeroTavolo());
        System.out.println("Lista: ");
        this.ordineProdotti.forEach(System.out::println);
        System.out.println("totale " + this.getScontrino());

    }
}
