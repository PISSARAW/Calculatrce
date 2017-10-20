public class Inconnue{
    private Character nom;

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
