public class Inconnue extends Expression{
    private Character nom;
    private Nombre coef;

    public Inconnue(Character nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return ""+nom;
    }

    public Character getNom() {
        return nom;
    }

}
