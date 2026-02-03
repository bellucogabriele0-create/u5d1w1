package gabrielebelluco.u5d1w1.runners;

import com.github.javafaker.Faker;
import gabrielebelluco.u5d1w1.entities.Menu;
import gabrielebelluco.u5d1w1.entities.Ordine;
import gabrielebelluco.u5d1w1.entities.Tavolo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class MyRunner2 implements CommandLineRunner {
    @Value("${coperto}")
    private double prezzoCoperto;

    @Autowired
    private Menu menu;

    @Autowired
    private Faker faker;

    @Override
    public void run(String... args) throws Exception {
        Tavolo camorristi = new Tavolo(2, 8, false);
        Ordine ordine = new Ordine(prezzoCoperto, 7, camorristi);
        ordine.aggiungiAllOrdine(menu.getPizzeList().getFirst());
        ordine.aggiungiAllOrdine(menu.getPizzeList().get(1));
        ordine.aggiungiAllOrdine(menu.getPizzeList().get(2));
        ordine.aggiungiAllOrdine(menu.getPizzeList().get(3));
        ordine.aggiungiAllOrdine(menu.getPizzeList().get(3));
        ordine.aggiungiAllOrdine(menu.getPizzeList().get(3));
        ordine.aggiungiAllOrdine(menu.getPizzeList().get(3));
        ordine.aggiungiAllOrdine(menu.getPizzeList().getLast());
        ordine.aggiungiAllOrdine(menu.getBevandeList().getFirst());
        ordine.aggiungiAllOrdine(menu.getBevandeList().get(1));
        ordine.aggiungiAllOrdine(menu.getBevandeList().get(2));
        ordine.aggiungiAllOrdine(menu.getBevandeList().getFirst());
        ordine.aggiungiAllOrdine(menu.getBevandeList().getFirst());
        ordine.aggiungiAllOrdine(menu.getBevandeList().getFirst());


        ordine.printScontrino();
    }
}
