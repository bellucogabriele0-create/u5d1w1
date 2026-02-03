package gabrielebelluco.u5d1w1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Menu {
    private List<Pizze> pizzeList;
    private List<Bevande> bevandeList;
    private List<Toppings> toppingList;

    public void printMenu() {
        System.out.println("***MENU***");
        System.out.println("PIZZE");
        this.pizzeList.forEach(System.out::println);
        System.out.println("______________");

        System.out.println("TOPPINGS");
        this.toppingList.forEach(System.out::println);
        System.out.println("______________");

        System.out.println("BEVANDE");
        this.bevandeList.forEach(System.out::println);
        System.out.println("______________");
    }
}
