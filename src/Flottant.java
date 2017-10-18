public final class Flottant implements Nombre{
    private final double x;

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
                    return Flottant.faire((this.x + ((Flottant) n).getX()));
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
            }
            else
                throw new Exception();
        } catch (Exception e) {
            System.out.print("Opération incompatible");
        }
        return null;
    }
}
