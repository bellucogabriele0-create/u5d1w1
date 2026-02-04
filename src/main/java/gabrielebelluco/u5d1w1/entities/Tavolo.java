package gabrielebelluco.u5d1w1.entities;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Tavolo {
    private int numeroTavolo;
    private int numeroCoperti;
    private boolean isFree = true;
    private double prezzoCoperto;


    public void occupato() {
        this.isFree = false;
    }

    public void liberato() {
        this.isFree = true;
    }

    public boolean CopMax(int coperti) {
        return isFree && coperti <= numeroCoperti;
    }


}
