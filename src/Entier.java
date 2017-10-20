public final class Entier implements Nombre{
    private final Long x;
<<<<<<< HEAD

    private Entier (long y){
        x=y;
    }

=======
    private Entier (long y){
        x=y;
    }
>>>>>>> origin/master
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

<<<<<<< HEAD
=======
    
   //************************ 
>>>>>>> origin/master
    /**
     * Additione deux nombres
     *
     * @param n
     * @return
     */
    @Override
    public Nombre plus(Nombre n) {
<<<<<<< HEAD
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
=======
    	 try {
             if ((n instanceof Entier)||( n instanceof Flottant)) {
                 if(n instanceof Entier)
                     return Entier.faire((this.x + ((Entier) n).getX()));
                 else
                 {
                 	return Flottant.faire(this.getX().doubleValue()).plus(n);
                 	
                 }
             }
             throw new Exception();
         }
         catch (Exception e){
             System.out.print("Operation incompatible");
         }
>>>>>>> origin/master
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
<<<<<<< HEAD
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
=======
        try {
             if ((n instanceof Entier)||( n instanceof Flottant)) {
                 if(n instanceof Entier)
                     return Entier.faire((this.x - ((Entier) n).getX()));
                 else
                 {
                 	return Flottant.faire(this.getX().doubleValue()).moins(n);
                 	
                 }
             }
             throw new Exception();
         }
         catch (Exception e){
             System.out.print("Operation incompatible");
         }
>>>>>>> origin/master
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
<<<<<<< HEAD
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
=======
             if ((n instanceof Entier)||( n instanceof Flottant)) {
                 if(n instanceof Entier)
                     return Entier.faire((this.x * ((Entier) n).getX()));
                 else
                 {
                 	return Flottant.faire(this.getX().doubleValue()).fois(n);
                 	
                 }
             }
             throw new Exception();
         }
         catch (Exception e){
             System.out.print("Operation incompatible");
         }
>>>>>>> origin/master
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
<<<<<<< HEAD
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
=======
             if ((n instanceof Entier)||( n instanceof Flottant)) {
                 if(n instanceof Entier)
                     return Entier.faire((this.x / ((Entier) n).getX()));
                 else
                 {
                 	return Flottant.faire(this.getX().doubleValue()).quotient(n);
                 	
                 }
             }
             throw new Exception();
         }
         catch (Exception e){
             System.out.print("Operation incompatible");
         }
>>>>>>> origin/master
        return null;
    }
    
	
}
