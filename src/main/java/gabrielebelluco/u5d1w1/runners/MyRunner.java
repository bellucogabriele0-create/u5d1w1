package gabrielebelluco.u5d1w1.runners;

import com.github.javafaker.Faker;
import gabrielebelluco.u5d1w1.entities.Menu;
import gabrielebelluco.u5d1w1.entities.Tavolo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
    @Qualifier("Tavolo1")
    private Tavolo tavolo1;

    @Autowired
    @Qualifier("Tavolo2")
    private Tavolo tavolo2;

    @Autowired
    @Qualifier("Tavolo3")
    private Tavolo tavolo3;
    @Autowired
    private Menu menu;

    @Autowired
    private Faker faker;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(tavolo1);
        System.out.println(tavolo2);
        System.out.println(tavolo3);


    }
}
