package gabrielebelluco.u5d1w1.runners;

import com.github.javafaker.Faker;
import gabrielebelluco.u5d1w1.entities.Menu;
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
    }
}
