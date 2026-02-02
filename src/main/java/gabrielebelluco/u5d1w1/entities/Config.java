package gabrielebelluco.u5d1w1.entities;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {


    @Bean
    public Toppings formaggio() {
        return new Toppings("formaggio", 92, 0.69);
    }

    @Bean
    public Toppings prosciutto() {
        return new Toppings("prosciutto", 35, 0.99);
    }

    @Bean
    public Toppings cipolla() {
        return new Toppings("cipolla", 22, 0.69);
    }

    @Bean
    public Toppings funghi() {
        return new Toppings("funghi", 24, 0.79);
    }

    @Bean
    public Toppings salame() {
        return new Toppings("salame", 86, 0.99);
    }

    @Bean
    public Pizze quattroFormaggi() {
        Pizze pqf = new Pizze("quattroFormaggi");
        pqf.addTopping(formaggio());
        pqf.addTopping(formaggio());
        pqf.addTopping(formaggio());
        pqf.addTopping(formaggio());
        return pqf;

    }

    @Bean
    public Pizze margherita() {
        return new Pizze("Margherita");
    }

    @Bean
    public Bevande birra() {
        return new Bevande("Jchnusa 33cl", 139, 2.30);
    }

    @Bean
    public Bevande estathe() {
        return new Bevande("estathe alla pesca", 74, 1.00);
    }


}
