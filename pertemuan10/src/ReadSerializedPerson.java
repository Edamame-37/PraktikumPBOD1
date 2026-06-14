/*
 * File      : ReadSerializedPerson.java
 * Deskripsi : Program untuk membaca hasil serialisasi objek Person
 * Pembuat   : Rafa Azlan / 24060124140126
 * Tanggal   : 12 Mei 2026
 */

import java.io.*;

public class ReadSerializedPerson {
    public static void main(String[] args) {
        PersonSerializable person = null;

        try {
            FileInputStream f = new FileInputStream("person.ser");
            ObjectInputStream s = new ObjectInputStream(f);
            person = (PersonSerializable) s.readObject();
            s.close();
            System.out.println("Serialized person name = " + person.getName());
        } catch (Exception ioe) {
            ioe.printStackTrace();
        }
    }
}