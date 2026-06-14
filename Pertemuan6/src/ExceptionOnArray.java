/**
 * File      : ExceptionOnArray.java
 * Deskripsi : Program penggunaan eksepsi menggunakan class library Java
 */
public class ExceptionOnArray {
    public static void main(String[] args) {
        // instansiasi object array integer
        Integer[] arrayInteger = new Integer[4];
        
        try {
            arrayInteger[2] = 11;
            // Perbaikan: Array dibaca agar tidak memunculkan peringatan
            System.out.println("Elemen indeks ke-2 adalah: " + arrayInteger[2]); 
            
            arrayInteger[4] = 10; // Ini akan memicu exception karena batas indeks array [4] adalah 3
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        } finally {
            System.out.println("clean up code...");
        }
    }
}