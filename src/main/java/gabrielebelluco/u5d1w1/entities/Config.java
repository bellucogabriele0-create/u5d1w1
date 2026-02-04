package gabrielebelluco.u5d1w1.entities;

import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Configuration
@PropertySource("application.properties")
public class Config {


    @Bean(name = "formaggio")
    public Toppings formaggio() {
        return new Toppings("formaggio", 92, 0.69);
    }

    @Bean(name = "pomodoro")
    public Toppings pomodoro() {
        return new Toppings("pomodoro", 0, 0);
    }

    @Bean(name = "prosciutto")
    public Toppings prosciutto() {
        return new Toppings("prosciutto", 35, 0.99);
    }

    @Bean(name = "cipolla")
    public Toppings cipolla() {
        return new Toppings("cipolla", 22, 0.69);
    }

    @Bean(name = "funghi")
    public Toppings funghi() {
        return new Toppings("funghi", 24, 0.79);
    }

    @Bean(name = "salame")
    public Toppings salame() {
        return new Toppings("salame", 86, 0.99);
    }

    @Bean
    public Faker getFaker() {
        return new Faker(Locale.ITALIAN);
    }

    @Bean(name = "margherita")
    public Pizze margherita() {
        List<Toppings> tList = new ArrayList<>();
        tList.add(pomodoro());
        tList.add(formaggio());
        return new Pizze("margherita", tList, false);
    }

    @Bean(name = "quattroFormaggi")
    public Pizze quattroFormaggi() {
        List<Toppings> tList = new ArrayList<>();
        tList.add(formaggio());
        tList.add(formaggio());
        tList.add(formaggio());
        tList.add(formaggio());
        return new Pizze("quattroFormaggi", tList, false);
    }

    @Bean(name = "canadese")
    public Pizze canadese() {
        List<Toppings> tList = new ArrayList<>();
        tList.add(prosciutto());
        tList.add(funghi());
        return new Pizze("canadese", tList, false);
    }

    @Bean(name = "salame_xl")
    public Pizze salame_xl() {
        List<Toppings> tList = new ArrayList<>();
        tList.add(salame());
        return new Pizze("salame_xl", tList, true);
    }


    @Bean(name = "acqua")
    public Bevande acqua() {
        return new Bevande("acqua", 0, 0.90);
    }

    @Bean(name = "estathe")
    public Bevande estathe() {
        return new Bevande("estathe", 74, 1.00);
    }

    @Bean(name = "cocacola")
    public Bevande cocacola() {
        return new Bevande("cocacola", 100, 2.00);
    }

    @Bean(name = "menu")
    public Menu menuBean() {
        List<Pizze> pizzeList = new ArrayList<>();
        List<Bevande> bevandeList = new ArrayList<>();
        List<Toppings> toppingsList = new ArrayList<>();

        pizzeList.add(margherita());
        pizzeList.add(canadese());
        pizzeList.add(quattroFormaggi());
        pizzeList.add(salame_xl());

        bevandeList.add(acqua());
        bevandeList.add(cocacola());
        bevandeList.add(estathe());

        toppingsList.add(funghi());
        toppingsList.add(formaggio());
        toppingsList.add(pomodoro());
        toppingsList.add(prosciutto());
        toppingsList.add(salame());
        return new Menu(pizzeList, bevandeList, toppingsList);
    }

    @Bean("Tavolo1")
    Tavolo getTavolo1(@Value("${coperto}") double coperto) {
        return new Tavolo(1, 5, true, coperto);
    }

    @Bean("Tavolo2")
    Tavolo getTavolo2(@Value("${coperto}") double coperto) {
        return new Tavolo(2, 4, true, coperto);
    }

    @Bean("Tavolo3")
    Tavolo getTavolo3(@Value("${coperto}") double coperto) {
        return new Tavolo(3, 8, true, coperto);
    }

}
