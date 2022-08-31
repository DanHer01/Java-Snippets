import java.util.Random;

public class ParkingLot {
    // Campos
    static int[] parqueo;
    Random r = new Random();

    // Constr.
    public ParkingLot (int total) {
        parqueo = new int[total];
    }

    // Metodos
    public int size() {return parqueo.length;}
    public int parkInRandomSpace() {
        int parkingNumber = r.nextInt(parqueo.length);
        
        if (parqueo[parkingNumber] != 0) {
            this.parkInRandomSpace();
        }
        if (parqueo[parkingNumber] == 0) {
            parqueo[parkingNumber]=1;
            return parkingNumber;
        } 
        if (this.isFull()) {
            return -1;
        }
        return -1;
    }
    public boolean parkInLot(int parking) {
        if (parqueo[parking-1] == 0) {
            parqueo[parking-1] = 1; 
            return true;
        } else {return false;}
    }
    public void emptyLot(int parking) {
        if (parqueo[parking-1] != 0) {
            parqueo[parking-1] = 0;
        }
    }
    public boolean isFull() {
        for (int i = 0; i < parqueo.length; i++) {
            if (parqueo[i] == 0) {
                return false; 
            } 
        }
        return true;
    }
    public boolean isEmpty() {
        for (int i = 0; i < parqueo.length; i++) {
            if (parqueo[i] != 0) {
                return false;
            }
        }
        return true;
    }
    public boolean isValidParking(int parking) {
        if ((parking-1 >= 0) && (parking-1 <= parqueo.length)) {
            return true;
        } else {return false;}
    }
    public boolean isEmpty(int parking) {
        if (parqueo[parking-1] == 0) {
            return true;
        } else {return false;}
    }
    public String toString() {
        String result = "";
        for (int i = 0; i < parqueo.length; i++) {
            if (parqueo[i] != 0) {
                result += "| X ";
            } else {
                result += "| " + (i+1) + "\s";
            }
        }
        result += "|";
        return result;
    }
}
