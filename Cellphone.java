import java.util.regex.*;

public class Cellphone {
    // Campos
    // 4 Campos privados tel, marca, empresa, minutos
    private int empresa, minutos;
    private String telefono, marca; 

    String tigo = "[Tt][Ii][Gg][Oo]";
    String claro = "[Cc][Ll][Aa][Rr][Oo]";
    String movistar = "[Mm][Oo][Vv][Ii][Ss][Tt][Aa][Rr]";

    // Constructores
    /* 1 Const. parámetros: el telefono (String), la empresa
    (Tigo,  Claro o Movistar) y la marca.  Los minutos siempre
    se inicializan con 500 minutos.*/
    public Cellphone(String telefono, String empres, String marca) {
        minutos = 500;
        this.telefono = telefono;
        this.marca = marca;
        //if empresa //regex tigo, claro, movistar
        if (Pattern.matches(tigo, empres)) {
            empresa = 1;
        } else if (Pattern.matches(claro, empres)) {
            empresa = 2;
        } else if (Pattern.matches(movistar, empres)) {
            empresa = 3;  
        } else {empresa = 0;}

    }
    // Metodos
    public String getEmpresa() {
        if (empresa == 1) {return "Tigo";} 
        else if (empresa == 2) {return "Claro";}
        else if (empresa == 3) {return "Movistar";}
        else {return "Indefinida";}
         
    }
    public void changeEmpresa(String nuevaEmpresa) {
        if (Pattern.matches(tigo, nuevaEmpresa)) {
            empresa = 1;
        } else if (Pattern.matches(claro, nuevaEmpresa)) {
            empresa = 2;
        } else if (Pattern.matches(movistar, nuevaEmpresa)) {
            empresa = 3;  
        } else {empresa = 0;}
    }
    public String getNumero() {
        return telefono;
    }
    public int saldoMinutos() {
        return minutos;
    }
    public void resetMinutos() {
        minutos = 500;
    }
    public void consumirMinutos(int x) {
        if (x>=minutos) {minutos = 0;} else {minutos -= x;}      
    }
    public String getMarca() {
        return marca;
    }
    public String toString() {
        String result = telefono + this.getEmpresa() + marca;
        return result;
    }
}

