public class Expression {
    Inconnue x;
    Nombre n;
    String o;
    Nombre multx;

    /**
     * Contruit une expression
     * @param x
     * @param n
     * @param o
     */
    public Expression(Inconnue x, Nombre n, String o) {
        this.x = x;
        this.n = n;
        this.o=o;
        this.multx=null;
    }

    /**
     * Construir une expression avec un coefficient
     * @param i
     * @param x
     * @param n
     * @param o
     */
    public Expression(Nombre i, Inconnue x, Nombre n, String o){
        this.x = x;
        this.n = n;
        this.o=o;
        this.multx=i;
    }

    public Nombre subt (Nombre a){
            switch (o){
                case "+":
                    if(multx!=null)
                        return n.plus(multx.fois(a));
                    return n.plus(a);
                case "-":
                    if(multx!=null)
                        return n.moins(multx.fois(a));
                    return n.moins(a);
                case "*":
                    if(multx!=null)
                        return n.fois(multx.fois(a));
                    return n.fois(a);
                case "/":
                    if(multx!=null)
                        return n.quotient(multx.fois(a));
                    return n.quotient(a);
        }
        return null;
    }

    @Override
    public String toString() {
        if(multx==null)
            return "("+x+o+n+")";
        return "("+multx+x+o+n+")";
    }
}
