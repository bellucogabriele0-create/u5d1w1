package gabrielebelluco.u5d1w1.entities;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@ToString
public abstract class Menu {
    private String nome;
    private double calorie;
    private double prezzo;


}
