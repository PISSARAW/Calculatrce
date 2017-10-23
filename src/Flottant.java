public final class Flottant extends Expression implements Nombre{
    private final Double x;

    private Flottant(double y) {
        x = y;
    }

    public static Flottant faire(double y) {
        Flottant x=null;
        x = new Flottant(y);
        return x;
    }

    @Override
    public String toString() {
        return "" + x;
    }

    public double getX() {
        return x;
    }

    /**
     * Additione deux nombres
     *
     * @param n
     * @return
     */
    @Override
    public Nombre plus(Nombre n) {
        if (n instanceof Flottant)
            return Flottant.faire(this.x+((Flottant) n).getX());
        else if (n instanceof Entier)
            return Flottant.faire(this.x+(double)((Entier) n).getX());
        return n.plus(this);
    }

    /**
     * Soustrait deux nombres
     *
     * @param n
     * @return
     */
    @Override
    public Nombre moins(Nombre n) {
       return this.plus(n.oppose());
    }

    /**
     * Multiplie deux nombres
     *
     * @param n
     * @return
     */
    @Override
    public Nombre fois(Nombre n) {
        if (n instanceof Flottant)
            return Flottant.faire(this.x*((Flottant) n).getX());
        else if (n instanceof Entier)
            return Flottant.faire(this.x*(double)((Entier) n).getX());
        return n.fois(this);
    }

    /**
     * Divise deux nombres
     *
     * @param n
     * @return
     */
    @Override
    public Nombre quotient(Nombre n) {
        return this.fois(n.inverse());
    }

    /**
     * Inverse in nombre
     *
     * @return
     */
    @Override
    public Nombre inverse() {
        return Flottant.faire(1/this.getX());
    }

    /**
     * Renvoie l'opposé d'un nombre
     *
     * @return
     */
    @Override
    public Nombre oppose() {
        return Flottant.faire(-(this.getX()));
    }
}
