package gabrielebelluco.u5d1w1.entities;

import lombok.Getter;

import java.util.List;


@Getter
public class Pizze extends Item {
    private String nome;
    private List<Toppings> toppings;
    private boolean isXl = false;

    public Pizze(String nome, List<Toppings> ToppingList, Boolean isXl) {
        super(1012, 4.3);
        this.nome = nome;
        this.toppings = ToppingList;
        this.isXl = isXl;

    }

    @Override
    public int getCalorie() {
        return super.getCalorie() + this.getToppings().stream().mapToInt(Toppings::getCalorie).sum();
    }

    @Override
    public double getPrezzo() {
        return super.getPrezzo() + this.getToppings().stream().mapToDouble(Toppings::getPrezzo).sum();
    }

    @Override
    public String getNome() {
        return "pizza " + nome;
    }

    @Override
    public String toString() {
        return "Pizze{" +
                "nome='" + nome + '\'' +
                ", toppings=" + toppings +
                ", isXl=" + isXl +
                ", prezzo=" + prezzo +
                ", calorie=" + calorie +
                '}';
    }
}
