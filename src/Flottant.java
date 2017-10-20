public final class Flottant implements Nombre{
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
        try {
            if (n instanceof Flottant || n instanceof Entier) {
                if (n instanceof Flottant)
                    return Flottant.faire((this.x + ((Flottant) n).getX()));
                else{
                    return this.plus(Flottant.faire(((Entier)n).getX().doubleValue()));
                }
            }
            else
                throw new Exception();
        } catch (Exception e) {
            System.out.print("Opération incompatible");
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
            if (n instanceof Flottant || n instanceof Entier) {
                if (n instanceof Flottant)
                    return Flottant.faire((this.x - ((Flottant) n).getX()));
                else{
                    return this.moins(Flottant.faire(((Entier)n).getX().doubleValue()));
                }
            }
            else
                throw new Exception();
        } catch (Exception e) {
            System.out.print("Opération incompatible");
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
            if (n instanceof Flottant || n instanceof Entier) {
                if (n instanceof Flottant)
                    return Flottant.faire((this.x * ((Flottant) n).getX()));
                else{
                    return this.fois(Flottant.faire(((Entier)n).getX().doubleValue()));
                }
            }
            else
                throw new Exception();
        } catch (Exception e) {
            System.out.print("Opération incompatible");
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
            if (n instanceof Flottant || n instanceof Entier) {
                if (n instanceof Flottant)
                    return Flottant.faire((this.x / ((Flottant) n).getX()));
                else{
                    return this.quotient(Flottant.faire(((Entier)n).getX().doubleValue()));
                }
            }
            else
                throw new Exception();
        } catch (Exception e) {
            System.out.print("Opération incompatible");
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
