public class Flottant implements Nombre {
    private final double x;

    private Flottant(double y) {
        x = y;
    }

    public static Flottant faire(double y) {
       Flottant  x =null ;
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
//*************************
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
<<<<<<< HEAD
                else{
                    return this.plus(Flottant.faire(((Entier)n).getX().doubleValue()));
                }
=======
                else
                {
                 	return this.plus(Flottant.faire(((Entier)n).getX().doubleValue()));
                 	
                 }
>>>>>>> origin/master
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
   
//*************************

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
<<<<<<< HEAD
                else{
                    return this.moins(Flottant.faire(((Entier)n).getX().doubleValue()));
                }
=======
                else
                {
                 	return this.moins(Flottant.faire(((Entier)n).getX().doubleValue()));
                 	
                 }
>>>>>>> origin/master
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
<<<<<<< HEAD
                else{
                    return this.fois(Flottant.faire(((Entier)n).getX().doubleValue()));
                }
=======
                else
                {
                 	return this.fois(Flottant.faire(((Entier)n).getX().doubleValue()));
                 	
                 }
>>>>>>> origin/master
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
<<<<<<< HEAD
                else{
                    return this.quotient(Flottant.faire(((Entier)n).getX().doubleValue()));
                }
=======
                else
                {
                 	return this.quotient(Flottant.faire(((Entier)n).getX().doubleValue()));
                 	
                 }
>>>>>>> origin/master
            }
            else
                throw new Exception();
        } catch (Exception e) {
            System.out.print("Opération incompatible");
        }
        return null;
    }
    /*
    @Override
    public Object invese() {
        return null;
    }

    @Override
    public Object factorielle() {
        return null;
    }

    @Override
    public Object oppose() {
        return null;
    }

    @Override
    public Object puissance2() {
        return null;
    }

    @Override
    public Object exponentielle() {
        return null;
    }

    @Override
    public Object racineCarre() {
        return null;
    }
    */
}
