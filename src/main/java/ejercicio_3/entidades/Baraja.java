/*

 */
package ejercicio_3.entidades;


public class Baraja {
    private int carta;
    private String palo;
    

    public Baraja() {
    }

    public Baraja(int carta, String palo) {
        this.carta = carta;
        this.palo = palo;
    }

    public int getCarta() {
        return carta;
    }

    public void setCarta(int carta) {
        this.carta = carta;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "{" + "carta=" + carta + ", palo=" + palo + "}";
    }

    
    
}
