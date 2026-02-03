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
        this.calorie = setCalorie(toppings, isXl);
        this.prezzo = setPrezzo(toppings, isXl);

    }

    public int setCalorie(List<Toppings> toppingList, boolean isXl) {
        int tot = 1012;
        if (toppingList != null) {
            for (int i = 0; i < toppingList.size(); i++) {
                tot += toppingList.get(i).getCalorie();
            }
        }
        if (isXl) return (tot += (tot * 5) / 100);
        else return tot;
    }

    public double setPrezzo(List<Toppings> t, boolean isXl) {
        double tot = 4.30;
        if (t != null) {
            for (int i = 0; i < t.size(); i++) {
                tot += t.get(i).getPrezzo();
            }
        }

        if (isXl) return tot += (tot * 10) / 100;
        else return tot;
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
