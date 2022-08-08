public class PruebaFraccion {
    public static void main(String[] args) {
        Fraccion frac1, frac2, frac3, frac4, frac5;
        frac1 = new Fraccion(5,4);
        frac2 = new Fraccion(12,5);
        frac3 = new Fraccion(33, 2);
        frac4 = new Fraccion(27, 13);
        frac5 = new Fraccion(27, 13);

        
        System.out.println(frac1.equals(frac4));
        System.out.println(frac5.equals(frac4));
        System.out.println(frac1.toString());
        System.out.println(frac5.toString());
        System.out.println(frac5.add(frac3));
        System.out.println(frac5.multiply(frac2));
        System.out.println(frac5.divide(frac2));
    }
}
