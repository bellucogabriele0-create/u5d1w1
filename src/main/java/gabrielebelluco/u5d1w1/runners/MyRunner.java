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
@Order(1)
public class MyRunner implements CommandLineRunner {
    @Value("${coperto}")
    private double prezzoCoperto;

    @Autowired
    private Menu menu;

    @Autowired
    private Faker faker;

    @Override
    public void run(String... args) throws Exception {
        Tavolo ferrero = new Tavolo(1, 7, true);
        Ordine ordine = new Ordine(prezzoCoperto, 7, ferrero);
        ordine.aggiungiAllOrdine(menu.getPizzeList().get(0));
        ordine.aggiungiAllOrdine(menu.getBevandeList().get(1));


        ordine.printScontrino();
    }
}
