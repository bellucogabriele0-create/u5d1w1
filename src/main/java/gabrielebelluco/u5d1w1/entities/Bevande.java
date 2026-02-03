package gabrielebelluco.u5d1w1.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Bevande extends Item {
    private String nome;

    public Bevande(String nome, int calorie, double prezzo) {
        super(calorie, prezzo);
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Bevande{" +
                "nome='" + nome + '\'' +
                ", calorie=" + calorie +
                ", prezzo=" + prezzo + '}';
    }

    @Override
    public String getNome() {
        return " benvanda : " + nome;
    }
}
