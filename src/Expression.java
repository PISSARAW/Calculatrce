import java.util.LinkedList;

public class Expression {
    private LinkedList<Object> expr;

    public Expression(LinkedList<Object> expr) {
        this.expr = expr;
    }

    public LinkedList<Object> getExpr() {
        return expr;
    }

    public Expression() {
        this.expr = new LinkedList<>();
    }

    @Override
    public String toString() {
        String s="(";
        for (Object e:this.expr
             ) {
                s+=e.toString();
        }
        s+=")";
        return s;
    }
}
