/*
 * File      : Coercion.java
 * Deskripsi : Implementasi Polimorfisme Ad Hoc Coercion (Casting & Parsing)
 * Pembuat   : Rafa Azlan / 24060124140126
 * Tanggal   : 21 April 2026
 */

public class Coercion {
    public static void main(String[] args) {
        System.out.println("Bagian A: Ilustrasi Polimorfisme Coercion");
        int nilaiInt = 65;
        char nilaiChar = (char) nilaiInt;
        double nilaiDouble = (double) nilaiInt;
        System.out.println("Integer : " + nilaiInt);
        System.out.println("Char    : " + nilaiChar);
        System.out.println("Real    : " + nilaiDouble);

        System.out.println("\n Bagian B: Real kembali ke Integer");
        int kembaliKeInt = (int) nilaiDouble;
        System.out.println("Double ke Integer: " + kembaliKeInt);

        System.out.println("\n Bagian C: Konkatenasi & Penjumlahan Integer ");
        String X = "1234";
        String Y = "5678";
        String S = X + Y;
        Integer Z = Integer.parseInt(X) + Integer.parseInt(Y);
        System.out.println("String S (Konkatenasi X+Y) : " + S);
        System.out.println("Integer Z (Penjumlahan X+Y): " + Z);

        System.out.println("\n Bagian D: Konkatenasi & Penjumlahan Double");
        String P = "12.34";
        String Q = "56.78";
        String R = P + Q;
        Double D = Double.parseDouble(P) + Double.parseDouble(Q);
        System.out.println("String R (Konkatenasi P+Q) : " + R);
        System.out.println("Double D (Penjumlahan P+Q) : " + D);

        System.out.println("\nBagian E & F: Konversi S ke Integer (A) dan A ke String (T)");
        Integer A = Integer.parseInt(S);
        System.out.println("Integer A (dari S) : " + A);
        
        String T = A.toString();
        System.out.println("String T (dari A)  : " + T);
    }
}