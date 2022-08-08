public class Fraccion {
    // Campos
    private int numerador, denominador;
    
    // Constructores
    public Fraccion (int num, int den) {
        numerador = num;
        if (den != 0) {
            denominador = den;
        } else {
            denominador = 1;
        }
    }
    public Fraccion(int num) {
        this(num, 1);
    }
    
    // Metodos
    public int getNum() {
        return this.numerador;
    }
    public int getDen() {
        return this.denominador;
    }
    public void setNum(int num) {
        this.numerador = num;
    }
    public void setDen(int den) {
        if (den != 0) {
            this.denominador = den;
        }
    }
    private static int mfc(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return mfc(b, a%b);
        }
    }
    public void simplify() {
        int maxfc = mfc(this.getNum(), this.getDen());
        this.setNum(numerador/maxfc);
        this.setDen(denominador/maxfc);
    }
    public Fraccion add (Fraccion f) {
        int n = (this.getNum() * f.getDen()) + (f.getNum() * this.getDen());
        int d = this.getDen() * f.getDen();
        Fraccion result = new Fraccion(n, d);
        result.simplify();
        return result;
    }
    public Fraccion multiply (Fraccion f) {
        int n = this.getNum()*f.getNum();
        int d = this.getDen()*f.getDen();
        Fraccion resultado = new Fraccion(n, d);
        resultado.simplify();
        return resultado;
    }
    public Fraccion divide (Fraccion f) {
        int n = this.getNum()*f.getDen();
        int d = this.getDen()*f.getNum();
        Fraccion resultado = new Fraccion(n, d);
        resultado.simplify();
        return resultado;
    }
    public boolean equals(Fraccion f) {
        if ((this.getNum()==f.getNum()) && (this.getDen()==f.getDen())) {
            return true;
        } else {
            return false;
        }
    }
    public String toString() {
        String resultado = this.getNum()+"/"+this.getDen();
        return resultado;
    } 
}
