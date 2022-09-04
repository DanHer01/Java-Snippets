public class ExtendedIntArray {
    // Campos
    private Integer[] arrayDeInts;
    // Construc.
    public ExtendedIntArray() {
        arrayDeInts = new Integer[15];
    }
    public ExtendedIntArray(int capacity) {
        arrayDeInts = new Integer[capacity];
    }
    // Metodos
    public int size() {
        int count = 0;
        for (int i = 0; i < arrayDeInts.length; i++) {
            if (arrayDeInts[i] != null) {
                count++;
            }
        }   
        return count; 
    }
    public int capacity() {
        return arrayDeInts.length;
    }
    public void add(int dato) {
        Integer[] copia = arrayDeInts;
        if (arrayDeInts[arrayDeInts.length - 1] != null ) {
            arrayDeInts = new Integer[arrayDeInts.length + (arrayDeInts.length/2)];
            for (int i = 0; i < copia.length; i++) {
                arrayDeInts[i] = copia[i];
            }
        }
        for (int i = 0; i < arrayDeInts.length; i++) {
            if (arrayDeInts[i] == null) {
                arrayDeInts[i] = dato;
                break;
            }
        }
    }
    public Integer remove() {
        Integer val = 0;
        for (int i = 0; i < arrayDeInts.length; i++) {
            if (arrayDeInts[i] != null) {
                val = arrayDeInts[i];
                arrayDeInts[i] = null;
                break;
            } 
        }
        if (val == 0) {return null;} else {return val;}
    }
    public String toString() {
        String res = "[ ";
        for (int i = 0; i < arrayDeInts.length; i++) {
            if (arrayDeInts[i] != null) {
                res += arrayDeInts[i] + "\s"; 
            }
        }
        return res += "]";
    }

}   
