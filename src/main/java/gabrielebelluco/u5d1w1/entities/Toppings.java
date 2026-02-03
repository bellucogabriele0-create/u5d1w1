package gabrielebelluco.u5d1w1.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Toppings extends Item {
    private String nome;


    public Toppings(String nome, int calorie, double prezzo) {
        super(calorie, prezzo);
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Toppings{" +
                "nome='" + nome + '\'' +
                ", calorie=" + calorie +
                ", prezzo=" + prezzo +
                '}';
    }
}
