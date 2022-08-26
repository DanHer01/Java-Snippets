public class test {
    public static int metodo(String v) {
        Scanner sc = new Scanner(v);
        int i = 0;
        while(sc.hasNext()) {
            sc.next();
             i++;
        }
        return i;
      }
}