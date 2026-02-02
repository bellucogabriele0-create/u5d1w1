package gabrielebelluco.u5d1w1.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Bevande extends Menu {
    public Bevande(String name, double calorie, double prezzo) {
        super(name, calorie, prezzo);
    }

    @Override
    public String toString() {
        return "Bevande{}";
    }
}
