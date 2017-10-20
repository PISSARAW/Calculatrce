public final class Entier implements Nombre{
    private final Long x;

    private Entier (long y){
        x=y;
    }

    public static Entier faire(long y){
        Entier en =null;
        en= new Entier(y);
        return en;
    }

    @Override
    public String toString() {
        return ""+x;
    }

    public Long getX() {
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
        try {
            if ((n instanceof Entier)||( n instanceof Flottant)) {
                if(n instanceof Entier)
                    return Entier.faire((this.x + ((Entier) n).getX()));
                else {
                    return Flottant.faire(this.getX().doubleValue()).plus(n);
                }
            }
            throw new Exception();
        }
        catch (Exception e){
            System.out.print("Operation incompatible");
        }
        return null;
    }

    /**
     * Soustrait deux nombres
     *
     * @param n
     * @return
     */
    @Override
    public Nombre moins(Nombre n) {
            try {
                if ((n instanceof Entier)||( n instanceof Flottant)) {
                    if(n instanceof Entier)
                        return Entier.faire((this.x - ((Entier) n).getX()));
                    else {
                        return Flottant.faire(this.getX().doubleValue()).moins(n);
                    }
                }
                throw new Exception();
            }
            catch (Exception e){
                System.out.print("Operation incompatible");
            }
        return null;
    }

    /**
     * Multiplie deux nombres
     *
     * @param n
     * @return
     */
    @Override
    public Nombre fois(Nombre n) {
        try {
            if ((n instanceof Entier)||( n instanceof Flottant)) {
                if(n instanceof Entier)
                    return Entier.faire((this.x * ((Entier) n).getX()));
                else {
                    return Flottant.faire(this.getX().doubleValue()).fois(n);
                }
            }
            throw new Exception();
        }
        catch (Exception e){
            System.out.print("Operation incompatible");
        }
        return null;
    }

    /**
     * Divise deux nombres
     *
     * @param n
     * @return
     */
    @Override
    public Nombre quotient(Nombre n) {
        try {
            if ((n instanceof Entier)||( n instanceof Flottant)) {
                if(n instanceof Entier)
                    return Entier.faire((this.x / ((Entier) n).getX()));
                else {
                    return Flottant.faire(this.getX().doubleValue()).quotient(n);
                }
            }
            throw new Exception();
        }
        catch (Exception e){
            System.out.print("Operation incompatible");
        }
        return null;
    }

    /**
     * Inverse in nombre
     *
     * @return
     */
    @Override
    public Nombre inverse() {
        Rationnel e=null;
        return Rationnel.faire((long)1,(long)this.getX());
    }

    /**
     * Renvoie l'opposé d'un nombre
     *
     * @return
     */
    @Override
    public Nombre oppose() {
        Entier e = null;
        return (e.faire(-x));
    }
}
