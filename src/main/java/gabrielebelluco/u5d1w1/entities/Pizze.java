package gabrielebelluco.u5d1w1.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Pizze extends Menu {
    private List<Toppings> toppings;


    public Pizze(String nome) {
        super(nome, 1104, 4.99);
        this.toppings = new ArrayList<>();

    }

    public void addTopping(Toppings topping) {
        toppings.add(topping);
        setPrezzo(getPrezzo() + topping.getPrezzo());
        setCalorie(getCalorie() + topping.getCalorie());
    }

    @Override
    public String toString() {
        return "Pizze{" +
                "toppings=" + toppings +
                '}' + super.toString();
    }
}
